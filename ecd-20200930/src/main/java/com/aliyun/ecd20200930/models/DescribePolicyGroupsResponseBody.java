// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePolicyGroupsResponseBody extends TeaModel {
    /**
     * <p>Details of the policies.</p>
     */
    @NameInMap("DescribePolicyGroups")
    public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroups> describePolicyGroups;

    /**
     * <p>The token that is used to start the next query. If this parameter is empty, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolicyGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyGroupsResponseBody self = new DescribePolicyGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyGroupsResponseBody setDescribePolicyGroups(java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroups> describePolicyGroups) {
        this.describePolicyGroups = describePolicyGroups;
        return this;
    }
    public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroups> getDescribePolicyGroups() {
        return this.describePolicyGroups;
    }

    public DescribePolicyGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePolicyGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules extends TeaModel {
        /**
         * <p>The IPv4 CIDR block that can be accessed from the client.</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the IPv4 CIDR block.</p>
         */
        @NameInMap("Description")
        public String description;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules self = new DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules extends TeaModel {
        /**
         * <p>The IPv4 CIDR block of the security group rule.</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the security group rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The protocol type of the security group rule.</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization policy of the security group rule.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range of the security group rule.</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group rule. A smaller value indicates a higher priority.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The direction of the security group rule.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules self = new DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsClientTypes extends TeaModel {
        /**
         * <p>The type of the client.</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>Indicates whether a specific client type is allowed to connect to the cloud desktop.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroupsClientTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroupsClientTypes self = new DescribePolicyGroupsResponseBodyDescribePolicyGroupsClientTypes();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsClientTypes setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsClientTypes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Policy")
        public String policy;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule self = new DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("RuleType")
        public String ruleType;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule self = new DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule extends TeaModel {
        /**
         * <p>The description of the rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The class of the device. This parameter is required when you set the `usbRuleType` parameter to 1. For more information, see [Defined Class Codes](https://www.usb.org/defined-class-codes).</p>
         */
        @NameInMap("DeviceClass")
        public String deviceClass;

        /**
         * <p>The subclass of the device. This parameter is required when you set the `usbRuleType` parameter to 1. For more information, see [Defined Class Codes](https://www.usb.org/defined-class-codes).</p>
         */
        @NameInMap("DeviceSubclass")
        public String deviceSubclass;

        /**
         * <p>The ID of the service.</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The type of USB redirection.</p>
         */
        @NameInMap("UsbRedirectType")
        public Long usbRedirectType;

        /**
         * <p>The type of the USB redirection rule.</p>
         */
        @NameInMap("UsbRuleType")
        public Long usbRuleType;

        /**
         * <p>The ID of the vendor. For more information, visit [Valid USB Vendor IDs (VIDs)](https://www.usb.org/sites/default/files/vendor_ids032322.pdf\_1.pdf).</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule self = new DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setDeviceClass(String deviceClass) {
            this.deviceClass = deviceClass;
            return this;
        }
        public String getDeviceClass() {
            return this.deviceClass;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setDeviceSubclass(String deviceSubclass) {
            this.deviceSubclass = deviceSubclass;
            return this;
        }
        public String getDeviceSubclass() {
            return this.deviceSubclass;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setUsbRedirectType(Long usbRedirectType) {
            this.usbRedirectType = usbRedirectType;
            return this;
        }
        public Long getUsbRedirectType() {
            return this.usbRedirectType;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setUsbRuleType(Long usbRuleType) {
            this.usbRuleType = usbRuleType;
            return this;
        }
        public Long getUsbRuleType() {
            return this.usbRuleType;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroups extends TeaModel {
        /**
         * <p>Indicates whether the anti-screenshot feature is enabled. Valid values:</p>
         * <br>
         * <p>on off Default value: off.</p>
         */
        @NameInMap("AppContentProtection")
        public String appContentProtection;

        /**
         * <p>The client CIDR blocks in the whitelist.</p>
         */
        @NameInMap("AuthorizeAccessPolicyRules")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        /**
         * <p>The security group rules.</p>
         */
        @NameInMap("AuthorizeSecurityPolicyRules")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules;

        /**
         * <p>Indicates whether the webcam redirection feature is enabled.</p>
         */
        @NameInMap("CameraRedirect")
        public String cameraRedirect;

        /**
         * <p>The logon methods.</p>
         */
        @NameInMap("ClientTypes")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsClientTypes> clientTypes;

        /**
         * <p>The permissions on the clipboard.</p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        /**
         * <p>The blacklist or whitelist of domain names. Domain names support the asterisk (\*) wildcard. Multiple domain names are separated by commas (,). Valid values:</p>
         * <br>
         * <p>*   \[black:],example.com,example.org: the domain name blacklist. The cloud desktop cannot access the domain names specified in the blacklist.</p>
         * <p>*   \[white:],example.com,example.org: the domain name whitelist. The cloud desktop can access only the domain names specified in the whitelist.</p>
         */
        @NameInMap("DomainList")
        public String domainList;

        @NameInMap("DomainResolveRule")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule> domainResolveRule;

        @NameInMap("DomainResolveRuleType")
        public String domainResolveRuleType;

        /**
         * <p>The number of cloud desktops that are associated with the policy.\</p>
         * <p>This parameter is returned only for custom policies.</p>
         */
        @NameInMap("EdsCount")
        public Integer edsCount;

        @NameInMap("EndUserApplyAdminCoordinate")
        public String endUserApplyAdminCoordinate;

        @NameInMap("EndUserGroupCoordinate")
        public String endUserGroupCoordinate;

        /**
         * <p>Indicates whether the image quality policy is enabled for Graphics cloud desktops. If your business requires high desktop performance and optimal user experience, we recommend that you enable this policy. For example, you can enable this policy in professional design scenarios.</p>
         */
        @NameInMap("GpuAcceleration")
        public String gpuAcceleration;

        /**
         * <p>The access policy on the HTML5 client.</p>
         */
        @NameInMap("Html5Access")
        public String html5Access;

        /**
         * <p>The file transfer policy for the HTML5 client.</p>
         */
        @NameInMap("Html5FileTransfer")
        public String html5FileTransfer;

        /**
         * <p>The protocol that is used for network communication. Valid values: TCP: Only TCP is allowed. BOTH: Automatic switch between TCP and UDP is allowed. Default value: TCP.</p>
         */
        @NameInMap("InternetCommunicationProtocol")
        public String internetCommunicationProtocol;

        /**
         * <p>The permissions on local disk mapping.</p>
         */
        @NameInMap("LocalDrive")
        public String localDrive;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the network redirection feature is enabled. Valid values: on off Default value: off.</p>
         */
        @NameInMap("NetRedirect")
        public String netRedirect;

        @NameInMap("NetRedirectRule")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule> netRedirectRule;

        /**
         * <p>The ID of the policy.</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The type of the policy.</p>
         */
        @NameInMap("PolicyGroupType")
        public String policyGroupType;

        /**
         * <p>The state of the policy.</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>Indicates whether user preemption is allowed. User preemption is not allowed. The value of this parameter is `off`.</p>
         */
        @NameInMap("PreemptLogin")
        public String preemptLogin;

        /**
         * <p>The names of the users that are allowed to connect to the cloud desktop at the same time.</p>
         */
        @NameInMap("PreemptLoginUsers")
        public java.util.List<String> preemptLoginUsers;

        /**
         * <p>The policy for printer redirection.</p>
         */
        @NameInMap("PrinterRedirection")
        public String printerRedirection;

        /**
         * <p>Indicates whether the custom screen recording feature is enabled. Valid values:</p>
         * <br>
         * <p>on off Default value: off.</p>
         */
        @NameInMap("RecordContent")
        public String recordContent;

        /**
         * <p>The period in which the custom screen recording is valid. Default value: 30. Unit: days.</p>
         */
        @NameInMap("RecordContentExpires")
        public Long recordContentExpires;

        /**
         * <p>Indicates whether screen recording is enabled.</p>
         */
        @NameInMap("Recording")
        public String recording;

        /**
         * <p>Indicates whether the sound that is generated on the cloud desktop is recorded during screen recording. Valid values: on off</p>
         */
        @NameInMap("RecordingAudio")
        public String recordingAudio;

        /**
         * <p>This parameter is used together with Recording. After the recording reaches the end of the validity period, a screen recording file is generated.</p>
         */
        @NameInMap("RecordingDuration")
        public Integer recordingDuration;

        /**
         * <p>The time when the screen recording ended. The value is in the HH:MM:SS format. The value is valid only when you set the Recording parameter to PERIOD.</p>
         */
        @NameInMap("RecordingEndTime")
        public String recordingEndTime;

        /**
         * <p>The period in which the screen recording audit is valid. Valid values: 15 to 180. Unit: days.</p>
         */
        @NameInMap("RecordingExpires")
        public Long recordingExpires;

        /**
         * <p>The frame rate of screen recording. Valid values:</p>
         * <br>
         * <p>*   2</p>
         * <p>*   5</p>
         * <p>*   10</p>
         * <p>*   15</p>
         */
        @NameInMap("RecordingFps")
        public Long recordingFps;

        /**
         * <p>The time when the screen recording was started. The value is in the HH:MM:SS format. The value is valid only when you set the Recording parameter to PERIOD.</p>
         */
        @NameInMap("RecordingStartTime")
        public String recordingStartTime;

        /**
         * <p>The permissions on the keyboard and mouse to control the cloud desktop during remote assistance. fullControl: The keyboard and mouse can be fully controlled. optionalControl: By default, the keyboard and mouse are disabled during remote assistance. You can apply for permissions on the keyboard and mouse. disableControl: The keyboard and mouse cannot be controlled.</p>
         */
        @NameInMap("RemoteCoordinate")
        public String remoteCoordinate;

        /**
         * <p>The effective scope of the policy. Valid values:</p>
         * <br>
         * <p>*   GLOBAL: takes effect globally.</p>
         * <p>*   IP: takes effect based on the IP address.</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>This parameter is specified when the Scope parameter is set to IP.</p>
         */
        @NameInMap("ScopeValue")
        public java.util.List<String> scopeValue;

        /**
         * <p>Indicates whether USB redirection is enabled.</p>
         */
        @NameInMap("UsbRedirect")
        public String usbRedirect;

        /**
         * <p>The USB redirection rules.</p>
         */
        @NameInMap("UsbSupplyRedirectRule")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule> usbSupplyRedirectRule;

        @NameInMap("VideoRedirect")
        public String videoRedirect;

        /**
         * <p>The policy of image display quality.</p>
         */
        @NameInMap("VisualQuality")
        public String visualQuality;

        /**
         * <p>Indicates whether watermarking is enabled.</p>
         */
        @NameInMap("Watermark")
        public String watermark;

        @NameInMap("WatermarkColor")
        public Integer watermarkColor;

        /**
         * <p>This parameter is unavailable.</p>
         */
        @NameInMap("WatermarkCustomText")
        public String watermarkCustomText;

        @NameInMap("WatermarkDegree")
        public Double watermarkDegree;

        @NameInMap("WatermarkFontSize")
        public Integer watermarkFontSize;

        @NameInMap("WatermarkFontStyle")
        public String watermarkFontStyle;

        @NameInMap("WatermarkRowAmount")
        public Integer watermarkRowAmount;

        /**
         * <p>The transparency of the watermark.</p>
         */
        @NameInMap("WatermarkTransparency")
        public String watermarkTransparency;

        @NameInMap("WatermarkTransparencyValue")
        public Integer watermarkTransparencyValue;

        /**
         * <p>The type of the watermark.</p>
         */
        @NameInMap("WatermarkType")
        public String watermarkType;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroups self = new DescribePolicyGroupsResponseBodyDescribePolicyGroups();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setAppContentProtection(String appContentProtection) {
            this.appContentProtection = appContentProtection;
            return this;
        }
        public String getAppContentProtection() {
            return this.appContentProtection;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setAuthorizeAccessPolicyRules(java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules> authorizeAccessPolicyRules) {
            this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
            return this;
        }
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules> getAuthorizeAccessPolicyRules() {
            return this.authorizeAccessPolicyRules;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setAuthorizeSecurityPolicyRules(java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules) {
            this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;
            return this;
        }
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules> getAuthorizeSecurityPolicyRules() {
            return this.authorizeSecurityPolicyRules;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setCameraRedirect(String cameraRedirect) {
            this.cameraRedirect = cameraRedirect;
            return this;
        }
        public String getCameraRedirect() {
            return this.cameraRedirect;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setClientTypes(java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsClientTypes> clientTypes) {
            this.clientTypes = clientTypes;
            return this;
        }
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsClientTypes> getClientTypes() {
            return this.clientTypes;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setDomainResolveRule(java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule> domainResolveRule) {
            this.domainResolveRule = domainResolveRule;
            return this;
        }
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule> getDomainResolveRule() {
            return this.domainResolveRule;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setDomainResolveRuleType(String domainResolveRuleType) {
            this.domainResolveRuleType = domainResolveRuleType;
            return this;
        }
        public String getDomainResolveRuleType() {
            return this.domainResolveRuleType;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setEdsCount(Integer edsCount) {
            this.edsCount = edsCount;
            return this;
        }
        public Integer getEdsCount() {
            return this.edsCount;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setEndUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
            this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
            return this;
        }
        public String getEndUserApplyAdminCoordinate() {
            return this.endUserApplyAdminCoordinate;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setEndUserGroupCoordinate(String endUserGroupCoordinate) {
            this.endUserGroupCoordinate = endUserGroupCoordinate;
            return this;
        }
        public String getEndUserGroupCoordinate() {
            return this.endUserGroupCoordinate;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setGpuAcceleration(String gpuAcceleration) {
            this.gpuAcceleration = gpuAcceleration;
            return this;
        }
        public String getGpuAcceleration() {
            return this.gpuAcceleration;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setHtml5Access(String html5Access) {
            this.html5Access = html5Access;
            return this;
        }
        public String getHtml5Access() {
            return this.html5Access;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setHtml5FileTransfer(String html5FileTransfer) {
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }
        public String getHtml5FileTransfer() {
            return this.html5FileTransfer;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setInternetCommunicationProtocol(String internetCommunicationProtocol) {
            this.internetCommunicationProtocol = internetCommunicationProtocol;
            return this;
        }
        public String getInternetCommunicationProtocol() {
            return this.internetCommunicationProtocol;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setLocalDrive(String localDrive) {
            this.localDrive = localDrive;
            return this;
        }
        public String getLocalDrive() {
            return this.localDrive;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setNetRedirect(String netRedirect) {
            this.netRedirect = netRedirect;
            return this;
        }
        public String getNetRedirect() {
            return this.netRedirect;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setNetRedirectRule(java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule> netRedirectRule) {
            this.netRedirectRule = netRedirectRule;
            return this;
        }
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule> getNetRedirectRule() {
            return this.netRedirectRule;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setPolicyGroupType(String policyGroupType) {
            this.policyGroupType = policyGroupType;
            return this;
        }
        public String getPolicyGroupType() {
            return this.policyGroupType;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setPolicyStatus(String policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setPreemptLogin(String preemptLogin) {
            this.preemptLogin = preemptLogin;
            return this;
        }
        public String getPreemptLogin() {
            return this.preemptLogin;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setPreemptLoginUsers(java.util.List<String> preemptLoginUsers) {
            this.preemptLoginUsers = preemptLoginUsers;
            return this;
        }
        public java.util.List<String> getPreemptLoginUsers() {
            return this.preemptLoginUsers;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setPrinterRedirection(String printerRedirection) {
            this.printerRedirection = printerRedirection;
            return this;
        }
        public String getPrinterRedirection() {
            return this.printerRedirection;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordContent(String recordContent) {
            this.recordContent = recordContent;
            return this;
        }
        public String getRecordContent() {
            return this.recordContent;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordContentExpires(Long recordContentExpires) {
            this.recordContentExpires = recordContentExpires;
            return this;
        }
        public Long getRecordContentExpires() {
            return this.recordContentExpires;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecording(String recording) {
            this.recording = recording;
            return this;
        }
        public String getRecording() {
            return this.recording;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordingAudio(String recordingAudio) {
            this.recordingAudio = recordingAudio;
            return this;
        }
        public String getRecordingAudio() {
            return this.recordingAudio;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordingDuration(Integer recordingDuration) {
            this.recordingDuration = recordingDuration;
            return this;
        }
        public Integer getRecordingDuration() {
            return this.recordingDuration;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordingEndTime(String recordingEndTime) {
            this.recordingEndTime = recordingEndTime;
            return this;
        }
        public String getRecordingEndTime() {
            return this.recordingEndTime;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordingExpires(Long recordingExpires) {
            this.recordingExpires = recordingExpires;
            return this;
        }
        public Long getRecordingExpires() {
            return this.recordingExpires;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordingFps(Long recordingFps) {
            this.recordingFps = recordingFps;
            return this;
        }
        public Long getRecordingFps() {
            return this.recordingFps;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordingStartTime(String recordingStartTime) {
            this.recordingStartTime = recordingStartTime;
            return this;
        }
        public String getRecordingStartTime() {
            return this.recordingStartTime;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRemoteCoordinate(String remoteCoordinate) {
            this.remoteCoordinate = remoteCoordinate;
            return this;
        }
        public String getRemoteCoordinate() {
            return this.remoteCoordinate;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setScopeValue(java.util.List<String> scopeValue) {
            this.scopeValue = scopeValue;
            return this;
        }
        public java.util.List<String> getScopeValue() {
            return this.scopeValue;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setUsbRedirect(String usbRedirect) {
            this.usbRedirect = usbRedirect;
            return this;
        }
        public String getUsbRedirect() {
            return this.usbRedirect;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setUsbSupplyRedirectRule(java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule> usbSupplyRedirectRule) {
            this.usbSupplyRedirectRule = usbSupplyRedirectRule;
            return this;
        }
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule> getUsbSupplyRedirectRule() {
            return this.usbSupplyRedirectRule;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setVideoRedirect(String videoRedirect) {
            this.videoRedirect = videoRedirect;
            return this;
        }
        public String getVideoRedirect() {
            return this.videoRedirect;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setVisualQuality(String visualQuality) {
            this.visualQuality = visualQuality;
            return this;
        }
        public String getVisualQuality() {
            return this.visualQuality;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermark(String watermark) {
            this.watermark = watermark;
            return this;
        }
        public String getWatermark() {
            return this.watermark;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkColor(Integer watermarkColor) {
            this.watermarkColor = watermarkColor;
            return this;
        }
        public Integer getWatermarkColor() {
            return this.watermarkColor;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkCustomText(String watermarkCustomText) {
            this.watermarkCustomText = watermarkCustomText;
            return this;
        }
        public String getWatermarkCustomText() {
            return this.watermarkCustomText;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkDegree(Double watermarkDegree) {
            this.watermarkDegree = watermarkDegree;
            return this;
        }
        public Double getWatermarkDegree() {
            return this.watermarkDegree;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkFontSize(Integer watermarkFontSize) {
            this.watermarkFontSize = watermarkFontSize;
            return this;
        }
        public Integer getWatermarkFontSize() {
            return this.watermarkFontSize;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkFontStyle(String watermarkFontStyle) {
            this.watermarkFontStyle = watermarkFontStyle;
            return this;
        }
        public String getWatermarkFontStyle() {
            return this.watermarkFontStyle;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkRowAmount(Integer watermarkRowAmount) {
            this.watermarkRowAmount = watermarkRowAmount;
            return this;
        }
        public Integer getWatermarkRowAmount() {
            return this.watermarkRowAmount;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkTransparency(String watermarkTransparency) {
            this.watermarkTransparency = watermarkTransparency;
            return this;
        }
        public String getWatermarkTransparency() {
            return this.watermarkTransparency;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
            this.watermarkTransparencyValue = watermarkTransparencyValue;
            return this;
        }
        public Integer getWatermarkTransparencyValue() {
            return this.watermarkTransparencyValue;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkType(String watermarkType) {
            this.watermarkType = watermarkType;
            return this;
        }
        public String getWatermarkType() {
            return this.watermarkType;
        }

    }

}
