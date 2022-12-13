// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class OperateVulsRequest extends TeaModel {
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    // The operation to perform on the vulnerability. Valid values:
    // 
    // *   vul_fix: fixes the vulnerability. The system fixes the vulnerability.
    // *   vul_verify: verifies whether the vulnerability is fixed. Perform this operation after the vulnerability is fixed and the cloud desktop is restarted.
    // *   vul_ignore: ignores the vulnerability. After you ignore the vulnerability, the system gives no more prompts about the vulnerability.
    // *   vul_undo_ignore: cancels the ignore operation on the vulnerability. After you cancel the ignore operation on the vulnerability, the system gives prompts about the vulnerability again.
    @NameInMap("OperateType")
    public String operateType;

    // Specifies whether to record the previous state of the vulnerability. Valid values:
    // 
    // *   0: The previous state of the vulnerability is not recorded.
    // *   1: The previous state of the vulnerability is recorded.
    @NameInMap("Precondition")
    public Integer precondition;

    // The reason why the vulnerability is fixed.
    @NameInMap("Reason")
    public String reason;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The type of the vulnerability. Valid values:
    // 
    // *   cve: Linux software vulnerability
    // *   sys: Windows system vulnerability
    @NameInMap("Type")
    public String type;

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
