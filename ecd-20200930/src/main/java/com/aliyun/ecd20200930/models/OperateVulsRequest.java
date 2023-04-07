// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class OperateVulsRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud desktops.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The action that you want to perform on the vulnerability. Valid values:</p>
     * <br>
     * <p>*   vul_fix: fixes the vulnerability.</p>
     * <p>*   vul_verify: verifies whether the vulnerability is fixed. You must perform this action after the vulnerability is fixed and the cloud desktop is restarted.</p>
     * <p>*   vul_ignore: ignores the vulnerability. After the vulnerability is ignored, the system provides no more prompts about the vulnerability.</p>
     * <p>*   vul_undo_ignore: cancels the ignore action on the vulnerability. After you cancel the ignore action on the vulnerability, the system provides prompts about the vulnerability again.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>Specifies whether to record the previous state of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   0: records the previous state of the vulnerability.</p>
     * <p>*   1: does not record the previous state of the vulnerability.</p>
     */
    @NameInMap("Precondition")
    public Integer precondition;

    /**
     * <p>The reason why the vulnerability is ignored.\</p>
     * <p>This parameter is required only when `OperateType` is set to `vul_ignore`.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the detected vulnerability. Valid values:</p>
     * <br>
     * <p>*   cve: the Linux software vulnerability</p>
     * <p>*   sys: the Windows system vulnerability</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The names of the vulnerabilities.</p>
     */
    @NameInMap("VulName")
    public java.util.List<String> vulName;

    public static OperateVulsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateVulsRequest self = new OperateVulsRequest();
        return TeaModel.build(map, self);
    }

    public OperateVulsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public OperateVulsRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateVulsRequest setPrecondition(Integer precondition) {
        this.precondition = precondition;
        return this;
    }
    public Integer getPrecondition() {
        return this.precondition;
    }

    public OperateVulsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public OperateVulsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OperateVulsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OperateVulsRequest setVulName(java.util.List<String> vulName) {
        this.vulName = vulName;
        return this;
    }
    public java.util.List<String> getVulName() {
        return this.vulName;
    }

}
