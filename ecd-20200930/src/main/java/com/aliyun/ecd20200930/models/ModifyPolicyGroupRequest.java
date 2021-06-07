// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyPolicyGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PolicyGroupId")
    @Validation(required = true)
    public String policyGroupId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Clipboard")
    public String clipboard;

    @NameInMap("LocalDrive")
    public String localDrive;

    @NameInMap("UsbRedirect")
    public String usbRedirect;

    @NameInMap("VisualQuality")
    public String visualQuality;

    @NameInMap("Watermark")
    public String watermark;

    @NameInMap("WatermarkType")
    public String watermarkType;

    @NameInMap("WatermarkCustomText")
    public String watermarkCustomText;

    @NameInMap("WatermarkTransparency")
    public String watermarkTransparency;

    @NameInMap("PreemptLogin")
    public String preemptLogin;

    @NameInMap("PreemptLoginUser")
    public java.util.List<String> preemptLoginUser;

    @NameInMap("AuthorizeSecurityPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule;

    @NameInMap("RevokeSecurityPolicyRule")
    public java.util.List<ModifyPolicyGroupRequestRevokeSecurityPolicyRule> revokeSecurityPolicyRule;

    public static ModifyPolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyGroupRequest self = new ModifyPolicyGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPolicyGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ModifyPolicyGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyPolicyGroupRequest setClipboard(String clipboard) {
        this.clipboard = clipboard;
        return this;
    }
    public String getClipboard() {
        return this.clipboard;
    }

    public ModifyPolicyGroupRequest setLocalDrive(String localDrive) {
        this.localDrive = localDrive;
        return this;
    }
    public String getLocalDrive() {
        return this.localDrive;
    }

    public ModifyPolicyGroupRequest setUsbRedirect(String usbRedirect) {
        this.usbRedirect = usbRedirect;
        return this;
    }
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    public ModifyPolicyGroupRequest setVisualQuality(String visualQuality) {
        this.visualQuality = visualQuality;
        return this;
    }
    public String getVisualQuality() {
        return this.visualQuality;
    }

    public ModifyPolicyGroupRequest setWatermark(String watermark) {
        this.watermark = watermark;
        return this;
    }
    public String getWatermark() {
        return this.watermark;
    }

    public ModifyPolicyGroupRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public ModifyPolicyGroupRequest setWatermarkCustomText(String watermarkCustomText) {
        this.watermarkCustomText = watermarkCustomText;
        return this;
    }
    public String getWatermarkCustomText() {
        return this.watermarkCustomText;
    }

    public ModifyPolicyGroupRequest setWatermarkTransparency(String watermarkTransparency) {
        this.watermarkTransparency = watermarkTransparency;
        return this;
    }
    public String getWatermarkTransparency() {
        return this.watermarkTransparency;
    }

    public ModifyPolicyGroupRequest setPreemptLogin(String preemptLogin) {
        this.preemptLogin = preemptLogin;
        return this;
    }
    public String getPreemptLogin() {
        return this.preemptLogin;
    }

    public ModifyPolicyGroupRequest setPreemptLoginUser(java.util.List<String> preemptLoginUser) {
        this.preemptLoginUser = preemptLoginUser;
        return this;
    }
    public java.util.List<String> getPreemptLoginUser() {
        return this.preemptLoginUser;
    }

    public ModifyPolicyGroupRequest setAuthorizeSecurityPolicyRule(java.util.List<ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule> authorizeSecurityPolicyRule) {
        this.authorizeSecurityPolicyRule = authorizeSecurityPolicyRule;
        return this;
    }
    public java.util.List<ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule> getAuthorizeSecurityPolicyRule() {
        return this.authorizeSecurityPolicyRule;
    }

    public ModifyPolicyGroupRequest setRevokeSecurityPolicyRule(java.util.List<ModifyPolicyGroupRequestRevokeSecurityPolicyRule> revokeSecurityPolicyRule) {
        this.revokeSecurityPolicyRule = revokeSecurityPolicyRule;
        return this;
    }
    public java.util.List<ModifyPolicyGroupRequestRevokeSecurityPolicyRule> getRevokeSecurityPolicyRule() {
        return this.revokeSecurityPolicyRule;
    }

    public static class ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("CidrIp")
        public String cidrIp;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Description")
        public String description;

        public static ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule self = new ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ModifyPolicyGroupRequestAuthorizeSecurityPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ModifyPolicyGroupRequestRevokeSecurityPolicyRule extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("CidrIp")
        public String cidrIp;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Description")
        public String description;

        public static ModifyPolicyGroupRequestRevokeSecurityPolicyRule build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyGroupRequestRevokeSecurityPolicyRule self = new ModifyPolicyGroupRequestRevokeSecurityPolicyRule();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ModifyPolicyGroupRequestRevokeSecurityPolicyRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
