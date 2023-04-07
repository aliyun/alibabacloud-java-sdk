// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOperateVulRequest extends TeaModel {
    /**
     * <p>The action that you want to perform on the vulnerability. Valid values:</p>
     * <br>
     * <p>*   vul_fix: fixes the vulnerability. The system fixes the vulnerability.</p>
     * <p>*   vul_verify: verifies whether the vulnerability is fixed. You must perform this action after the vulnerability is fixed, and the cloud desktop is restarted.</p>
     * <p>*   vul_ignore: ignores the vulnerability. After the vulnerability is ignored, the system provides no more prompts about the vulnerability.</p>
     * <p>*   vul_undo_ignore: cancels the ignore action on the vulnerability. After you cancel the ignore action on the vulnerability, the system provides prompts about the vulnerability again.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

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
     * <p>The type of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   cve: the Linux software vulnerability</p>
     * <p>*   sys: the Windows system vulnerability</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Details of the vulnerabilities.</p>
     */
    @NameInMap("VulInfo")
    public java.util.List<ModifyOperateVulRequestVulInfo> vulInfo;

    public static ModifyOperateVulRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperateVulRequest self = new ModifyOperateVulRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOperateVulRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public ModifyOperateVulRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyOperateVulRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyOperateVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ModifyOperateVulRequest setVulInfo(java.util.List<ModifyOperateVulRequestVulInfo> vulInfo) {
        this.vulInfo = vulInfo;
        return this;
    }
    public java.util.List<ModifyOperateVulRequestVulInfo> getVulInfo() {
        return this.vulInfo;
    }

    public static class ModifyOperateVulRequestVulInfo extends TeaModel {
        /**
         * <p>The ID of cloud desktop in which the vulnerability is detected.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tag that you want to add to the vulnerability.</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static ModifyOperateVulRequestVulInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyOperateVulRequestVulInfo self = new ModifyOperateVulRequestVulInfo();
            return TeaModel.build(map, self);
        }

        public ModifyOperateVulRequestVulInfo setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public ModifyOperateVulRequestVulInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyOperateVulRequestVulInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
