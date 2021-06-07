// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePolicyGroupsResponse extends TeaModel {
    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DescribePolicyGroups")
    @Validation(required = true)
    public java.util.List<DescribePolicyGroupsResponseDescribePolicyGroups> describePolicyGroups;

    public static DescribePolicyGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyGroupsResponse self = new DescribePolicyGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolicyGroupsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePolicyGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolicyGroupsResponse setDescribePolicyGroups(java.util.List<DescribePolicyGroupsResponseDescribePolicyGroups> describePolicyGroups) {
        this.describePolicyGroups = describePolicyGroups;
        return this;
    }
    public java.util.List<DescribePolicyGroupsResponseDescribePolicyGroups> getDescribePolicyGroups() {
        return this.describePolicyGroups;
    }

    public static class DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("IpProtocol")
        @Validation(required = true)
        public String ipProtocol;

        @NameInMap("PortRange")
        @Validation(required = true)
        public String portRange;

        @NameInMap("CidrIp")
        @Validation(required = true)
        public String cidrIp;

        @NameInMap("Policy")
        @Validation(required = true)
        public String policy;

        @NameInMap("Priority")
        @Validation(required = true)
        public String priority;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules self = new DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribePolicyGroupsResponseDescribePolicyGroups extends TeaModel {
        @NameInMap("PolicyGroupId")
        @Validation(required = true)
        public String policyGroupId;

        @NameInMap("PolicyGroupType")
        @Validation(required = true)
        public String policyGroupType;

        @NameInMap("Clipboard")
        @Validation(required = true)
        public String clipboard;

        @NameInMap("LocalDrive")
        @Validation(required = true)
        public String localDrive;

        @NameInMap("UsbRedirect")
        @Validation(required = true)
        public String usbRedirect;

        @NameInMap("VisualQuality")
        @Validation(required = true)
        public String visualQuality;

        @NameInMap("Watermark")
        @Validation(required = true)
        public String watermark;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("WatermarkType")
        @Validation(required = true)
        public String watermarkType;

        @NameInMap("WatermarkCustomText")
        @Validation(required = true)
        public String watermarkCustomText;

        @NameInMap("WatermarkTransparency")
        @Validation(required = true)
        public String watermarkTransparency;

        @NameInMap("PolicyStatus")
        @Validation(required = true)
        public String policyStatus;

        @NameInMap("EdsCount")
        @Validation(required = true)
        public Integer edsCount;

        @NameInMap("PreemptLogin")
        @Validation(required = true)
        public String preemptLogin;

        @NameInMap("AuthorizeSecurityPolicyRules")
        @Validation(required = true)
        public java.util.List<DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules;

        @NameInMap("PreemptLoginUsers")
        @Validation(required = true)
        public java.util.List<String> preemptLoginUsers;

        public static DescribePolicyGroupsResponseDescribePolicyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseDescribePolicyGroups self = new DescribePolicyGroupsResponseDescribePolicyGroups();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setPolicyGroupType(String policyGroupType) {
            this.policyGroupType = policyGroupType;
            return this;
        }
        public String getPolicyGroupType() {
            return this.policyGroupType;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setLocalDrive(String localDrive) {
            this.localDrive = localDrive;
            return this;
        }
        public String getLocalDrive() {
            return this.localDrive;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setUsbRedirect(String usbRedirect) {
            this.usbRedirect = usbRedirect;
            return this;
        }
        public String getUsbRedirect() {
            return this.usbRedirect;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setVisualQuality(String visualQuality) {
            this.visualQuality = visualQuality;
            return this;
        }
        public String getVisualQuality() {
            return this.visualQuality;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setWatermark(String watermark) {
            this.watermark = watermark;
            return this;
        }
        public String getWatermark() {
            return this.watermark;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setWatermarkType(String watermarkType) {
            this.watermarkType = watermarkType;
            return this;
        }
        public String getWatermarkType() {
            return this.watermarkType;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setWatermarkCustomText(String watermarkCustomText) {
            this.watermarkCustomText = watermarkCustomText;
            return this;
        }
        public String getWatermarkCustomText() {
            return this.watermarkCustomText;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setWatermarkTransparency(String watermarkTransparency) {
            this.watermarkTransparency = watermarkTransparency;
            return this;
        }
        public String getWatermarkTransparency() {
            return this.watermarkTransparency;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setPolicyStatus(String policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setEdsCount(Integer edsCount) {
            this.edsCount = edsCount;
            return this;
        }
        public Integer getEdsCount() {
            return this.edsCount;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setPreemptLogin(String preemptLogin) {
            this.preemptLogin = preemptLogin;
            return this;
        }
        public String getPreemptLogin() {
            return this.preemptLogin;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setAuthorizeSecurityPolicyRules(java.util.List<DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules) {
            this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;
            return this;
        }
        public java.util.List<DescribePolicyGroupsResponseDescribePolicyGroupsAuthorizeSecurityPolicyRules> getAuthorizeSecurityPolicyRules() {
            return this.authorizeSecurityPolicyRules;
        }

        public DescribePolicyGroupsResponseDescribePolicyGroups setPreemptLoginUsers(java.util.List<String> preemptLoginUsers) {
            this.preemptLoginUsers = preemptLoginUsers;
            return this;
        }
        public java.util.List<String> getPreemptLoginUsers() {
            return this.preemptLoginUsers;
        }

    }

}
