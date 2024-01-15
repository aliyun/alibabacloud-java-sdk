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
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
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
         * <p>The CIDR block that you access from the client. The value is an IPv4 CIDR block.</p>
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
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   tcp: Transmission Control Protocol (TCP)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   udp: User Datagram Protocol (UDP)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   all: all protocols</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   gre: Generic Routing Encapsulation (GRE)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   icmp: ICMP (IPv4)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization policy of the security group rule.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   drop: denies all access requests.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   accept: accepts all access requests.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
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
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   outflow: outbound</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   inflow: inbound</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
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
         * <p>The client type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   html5: web client</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   linux</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    WUYING hardware client</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   android</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    Android client</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   windows</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    Windows client</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   ios</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    iOS client</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   macos</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    macOS client</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>Indicates whether a specific type of client is allowed to connect to the cloud desktop.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   OFF</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    not allowed</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   ON</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    allowed</p>
         * <br>
         * <p>    <!-- --></p>
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
        /**
         * <p>The policy description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether the resolution feature is allowed.</p>
         * <br>
         * <p>*   allow: The feature is allowed.</p>
         * <p>*   block: The feature is not allowed.</p>
         */
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
        /**
         * <p>The content of the rule.</p>
         */
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The rule type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   prc</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    process</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   domain</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    domain name</p>
         * <br>
         * <p>    <!-- --></p>
         */
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
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
         * <p>The rule description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The device class. If you set `UsbRuleType` to 1, you must specify this parameter. For more information, see [Defined Class Codes](https://www.usb.org/defined-class-codes).</p>
         */
        @NameInMap("DeviceClass")
        public String deviceClass;

        /**
         * <p>The device subclass. This parameter is required if `UsbRuleType` is set to 1. For more information, see [Defined Class Codes](https://www.usb.org/defined-class-codes).</p>
         */
        @NameInMap("DeviceSubclass")
        public String deviceSubclass;

        /**
         * <p>The product ID.</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The USB redirection type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   1: allows USB redirection.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   2: forbids USB redirection.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("UsbRedirectType")
        public Long usbRedirectType;

        /**
         * <p>The type of the USB redirection rule.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   1: by device class</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   2: by device vendor</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("UsbRuleType")
        public Long usbRuleType;

        /**
         * <p>The vendor ID. For more information, see [Valid USB Vendor IDs (VIDs)](https://www.usb.org/sites/default/files/vendor_ids032322.pdf\_1.pdf).</p>
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
        @NameInMap("AdminAccess")
        public String adminAccess;

        /**
         * <p>Indicates whether the anti-screenshot feature is enabled. Valid values:</p>
         * <br>
         * <p>*   on: This feature is enabled.</p>
         * <p>*   off: This feature is disabled.</p>
         * <br>
         * <p>Default value: off.</p>
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
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   off: The feature is disabled.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   on (default): The feature is enabled.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
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
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   read: One-way transfer is allowed.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   readwrite: Two-way transfer is allowed.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   off: Two-way transfer is not allowed.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        @NameInMap("CpuDownGradeDuration")
        public Integer cpuDownGradeDuration;

        @NameInMap("CpuProcessors")
        public java.util.List<String> cpuProcessors;

        @NameInMap("CpuProtectedMode")
        public String cpuProtectedMode;

        @NameInMap("CpuRateLimit")
        public Integer cpuRateLimit;

        @NameInMap("CpuSampleDuration")
        public Integer cpuSampleDuration;

        @NameInMap("CpuSingleRateLimit")
        public Integer cpuSingleRateLimit;

        /**
         * <p>The access control for domain names. The domain names can contain the wildcard character (\*). Multiple domain names are separated by commas (,). Valid values:</p>
         * <br>
         * <p>*   off: This feature is disabled.</p>
         * <p>*   on: This feature is enabled.</p>
         */
        @NameInMap("DomainList")
        public String domainList;

        /**
         * <p>The resolution of domain names.</p>
         */
        @NameInMap("DomainResolveRule")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule> domainResolveRule;

        /**
         * <p>Indicates whether the switch for domain name resolution is turned on.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   off</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   on</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("DomainResolveRuleType")
        public String domainResolveRuleType;

        /**
         * <p>The number of cloud desktops that are associated with the policy.\</p>
         * <p>This parameter is returned only if PolicyGroupType is set to CUSTOM.</p>
         */
        @NameInMap("EdsCount")
        public Integer edsCount;

        /**
         * <p>Indicates whether the switch for end users to ask for assistance from the administrator is turned on. Valid values: on off</p>
         */
        @NameInMap("EndUserApplyAdminCoordinate")
        public String endUserApplyAdminCoordinate;

        /**
         * <p>The switch for stream collaboration between end users. Valid values: on off</p>
         */
        @NameInMap("EndUserGroupCoordinate")
        public String endUserGroupCoordinate;

        /**
         * <p>Indicates whether the image quality policy is enabled for Graphics cloud desktops. If you have high requirements for desktop performance and user experience, we recommend that you enable this feature. For example, you can enable this feature in professional design scenarios.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   off: The feature is disabled.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   on: This feature is enabled.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("GpuAcceleration")
        public String gpuAcceleration;

        /**
         * <p>The HTML5 client access feature.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   off (default)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    disabled</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   on</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    enabled</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Html5Access")
        public String html5Access;

        /**
         * <p>The file transfer feature for the HTML5 client.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   all: Files can be uploaded and downloaded between your computer and HTML5 clients.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   download: Files on HTML5 clients can be downloaded to your computer.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   upload: Files on your computer can be uploaded to HTML5 clients.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   off (default): File transfer between HTML5 clients and your computer is disabled.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Html5FileTransfer")
        public String html5FileTransfer;

        /**
         * <p>The protocol that is used for network communication. Valid values:</p>
         * <br>
         * <p>*   TCP: Only the TCP protocol is used.</p>
         * <p>*   BOTH: The automatic switchover between the TCP protocol and the UDP protocol is supported.</p>
         * <br>
         * <p>Default value: TCP.</p>
         */
        @NameInMap("InternetCommunicationProtocol")
        public String internetCommunicationProtocol;

        /**
         * <p>The permissions on local disk mapping.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   read: read-only</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   readwrite: read and write</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   off: no permissions</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("LocalDrive")
        public String localDrive;

        @NameInMap("MemoryDownGradeDuration")
        public Integer memoryDownGradeDuration;

        @NameInMap("MemoryProcessors")
        public java.util.List<String> memoryProcessors;

        @NameInMap("MemoryProtectedMode")
        public String memoryProtectedMode;

        @NameInMap("MemoryRateLimit")
        public Integer memoryRateLimit;

        @NameInMap("MemorySampleDuration")
        public Integer memorySampleDuration;

        @NameInMap("MemorySingleRateLimit")
        public Integer memorySingleRateLimit;

        /**
         * <p>The policy name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the network redirection feature is enabled. Valid values:</p>
         * <br>
         * <p>*   on: This feature is enabled.</p>
         * <p>*   off: The feature is disabled.</p>
         * <br>
         * <p>Default value: off.</p>
         */
        @NameInMap("NetRedirect")
        public String netRedirect;

        /**
         * <p>The network redirection rules.</p>
         */
        @NameInMap("NetRedirectRule")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule> netRedirectRule;

        /**
         * <p>The policy ID.</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The rule type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   SYSTEM</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   CUSTOM</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("PolicyGroupType")
        public String policyGroupType;

        /**
         * <p>The state of the policy.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   AVAILABLE</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   CREATING</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>Indicates whether user preemption is allowed. The value is fixed to `off`, which indicates that user preemption is not allowed.</p>
         */
        @NameInMap("PreemptLogin")
        public String preemptLogin;

        /**
         * <p>The names of the users that are allowed to connect to the cloud desktop to which another user is logged on.</p>
         */
        @NameInMap("PreemptLoginUsers")
        public java.util.List<String> preemptLoginUsers;

        /**
         * <p>The printer redirection feature.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   off</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    The feature is disabled</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   on</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    The feature is enabled</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("PrinterRedirection")
        public String printerRedirection;

        /**
         * <p>Indicates whether the custom screen recording feature is enabled. Valid values:</p>
         * <br>
         * <p>*   on: This feature is enabled.</p>
         * <p>*   off: This feature is disabled.</p>
         * <br>
         * <p>Default value: off.</p>
         */
        @NameInMap("RecordContent")
        public String recordContent;

        /**
         * <p>The duration in which the custom screen recording is valid. Default value: 30. Unit: days.</p>
         */
        @NameInMap("RecordContentExpires")
        public Long recordContentExpires;

        /**
         * <p>Indicates whether screen recording is enabled.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   ALLTIME: All operations that are performed by end users on cloud desktops are recorded. The recording starts immediately when end users connect to cloud desktops and ends after the end users disconnect from the cloud desktops.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   PERIOD: The operations that are performed by end users on cloud desktops during a specified period of time are recorded. You must specify the start time and the end time of the recording.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   OFF: Screen recording is disabled.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Recording")
        public String recording;

        /**
         * <p>Indicates whether the sound that is generated on the cloud desktop is recorded during screen recording. Valid values:</p>
         * <br>
         * <p>*   on: records audio and video data.</p>
         * <p>*   off: records only video data.</p>
         */
        @NameInMap("RecordingAudio")
        public String recordingAudio;

        /**
         * <p>This parameter is used together with Recording. After the specified period of the recording reaches, a screen recording file is generated.</p>
         */
        @NameInMap("RecordingDuration")
        public Integer recordingDuration;

        /**
         * <p>The time when the screen recording ended. The value is in the HH:MM:SS format. The value of this parameter is valid only if Recording is set to PERIOD.</p>
         */
        @NameInMap("RecordingEndTime")
        public String recordingEndTime;

        /**
         * <p>The period in which the screen recording audit is valid. Valid values: 15 to 180. Unit: days.</p>
         */
        @NameInMap("RecordingExpires")
        public Long recordingExpires;

        /**
         * <p>The frame rate of screen recording. Unit: fps. Valid values:</p>
         * <br>
         * <p>*   2</p>
         * <p>*   5</p>
         * <p>*   10</p>
         * <p>*   15</p>
         */
        @NameInMap("RecordingFps")
        public Long recordingFps;

        /**
         * <p>The time when the screen recording was started. The value is in the HH:MM:SS format. The value of this parameter is valid only if Recording is set to PERIOD.</p>
         */
        @NameInMap("RecordingStartTime")
        public String recordingStartTime;

        /**
         * <p>The permissions on the keyboard and mouse to control the cloud desktop during remote assistance. Valid values:</p>
         * <br>
         * <p>*   fullControl: The keyboard and mouse are fully controlled.</p>
         * <p>*   optionalControl: By default, you do not have the permissions on the keyboard or mouse to control the cloud desktop during remote assistance. You can apply for the permissions.</p>
         * <p>*   disableControl: The keyboard and mouse are not controlled.</p>
         */
        @NameInMap("RemoteCoordinate")
        public String remoteCoordinate;

        /**
         * <p>The effective scope of the policy. Valid values:</p>
         * <br>
         * <p>*   GLOBAL: The policy takes effect globally.</p>
         * <p>*   IP: The policy takes effect based on the IP address.</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>This parameter is specified if Scope is set to IP.</p>
         */
        @NameInMap("ScopeValue")
        public java.util.List<String> scopeValue;

        /**
         * <p>Indicates whether the USB redirection feature is enabled.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   off: The feature is disabled.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   on: This feature is enabled.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("UsbRedirect")
        public String usbRedirect;

        /**
         * <p>The USB redirection rules.</p>
         */
        @NameInMap("UsbSupplyRedirectRule")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule> usbSupplyRedirectRule;

        /**
         * <p>Indicates whether the multimedia redirection feature is enabled. Valid values: on: The feature is enabled. off: The feature is disabled.</p>
         */
        @NameInMap("VideoRedirect")
        public String videoRedirect;

        /**
         * <p>The image display quality feature.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   high</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    high-definition (HD)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   low</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    fluent</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   medium (default)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    adaptive</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   lossless</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    no quality loss</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("VisualQuality")
        public String visualQuality;

        /**
         * <p>Indicates whether the watermark feature is enabled.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   off: The feature is disabled.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   on: This feature is enabled.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Watermark")
        public String watermark;

        /**
         * <p>The font color of the watermark. Valid values: 0 to 16777215.</p>
         */
        @NameInMap("WatermarkColor")
        public Integer watermarkColor;

        /**
         * <p>This parameter is unavailable for public use.</p>
         */
        @NameInMap("WatermarkCustomText")
        public String watermarkCustomText;

        /**
         * <p>The inclination angle of the watermark. Valid values: -10 to -30.</p>
         */
        @NameInMap("WatermarkDegree")
        public Double watermarkDegree;

        /**
         * <p>The font size of the watermark. Valid values: 10 to 20.</p>
         */
        @NameInMap("WatermarkFontSize")
        public Integer watermarkFontSize;

        /**
         * <p>The font style of the watermark. Valid values:</p>
         * <br>
         * <p>*   plain</p>
         * <p>*   bold</p>
         */
        @NameInMap("WatermarkFontStyle")
        public String watermarkFontStyle;

        /**
         * <p>The number of watermark rows. This parameter is now invalid.</p>
         */
        @NameInMap("WatermarkRowAmount")
        public Integer watermarkRowAmount;

        @NameInMap("WatermarkSecurity")
        public String watermarkSecurity;

        /**
         * <p>The watermark transparency.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   LIGHT</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   DARK</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   MIDDLE</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("WatermarkTransparency")
        public String watermarkTransparency;

        /**
         * <p>The watermark transparency. A larger value indicates that the watermark is less transparent. Valid values: 10 to 100.</p>
         */
        @NameInMap("WatermarkTransparencyValue")
        public Integer watermarkTransparencyValue;

        /**
         * <p>The watermark type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   HostName,EndUserId: The watermark is displayed in the following format: Rightmost 15 characters of the cloud desktop ID,Username.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   EndUserId: The username is displayed.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   EndUserId,HostName: The watermark is displayed in the following format: Username,Rightmost 15 characters of the cloud desktop ID.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   HostName: The rightmost 15 characters of the cloud desktop ID are displayed.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("WatermarkType")
        public String watermarkType;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroups self = new DescribePolicyGroupsResponseBodyDescribePolicyGroups();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setAdminAccess(String adminAccess) {
            this.adminAccess = adminAccess;
            return this;
        }
        public String getAdminAccess() {
            return this.adminAccess;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setCpuDownGradeDuration(Integer cpuDownGradeDuration) {
            this.cpuDownGradeDuration = cpuDownGradeDuration;
            return this;
        }
        public Integer getCpuDownGradeDuration() {
            return this.cpuDownGradeDuration;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setCpuProcessors(java.util.List<String> cpuProcessors) {
            this.cpuProcessors = cpuProcessors;
            return this;
        }
        public java.util.List<String> getCpuProcessors() {
            return this.cpuProcessors;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setCpuProtectedMode(String cpuProtectedMode) {
            this.cpuProtectedMode = cpuProtectedMode;
            return this;
        }
        public String getCpuProtectedMode() {
            return this.cpuProtectedMode;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setCpuRateLimit(Integer cpuRateLimit) {
            this.cpuRateLimit = cpuRateLimit;
            return this;
        }
        public Integer getCpuRateLimit() {
            return this.cpuRateLimit;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setCpuSampleDuration(Integer cpuSampleDuration) {
            this.cpuSampleDuration = cpuSampleDuration;
            return this;
        }
        public Integer getCpuSampleDuration() {
            return this.cpuSampleDuration;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setCpuSingleRateLimit(Integer cpuSingleRateLimit) {
            this.cpuSingleRateLimit = cpuSingleRateLimit;
            return this;
        }
        public Integer getCpuSingleRateLimit() {
            return this.cpuSingleRateLimit;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMemoryDownGradeDuration(Integer memoryDownGradeDuration) {
            this.memoryDownGradeDuration = memoryDownGradeDuration;
            return this;
        }
        public Integer getMemoryDownGradeDuration() {
            return this.memoryDownGradeDuration;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMemoryProcessors(java.util.List<String> memoryProcessors) {
            this.memoryProcessors = memoryProcessors;
            return this;
        }
        public java.util.List<String> getMemoryProcessors() {
            return this.memoryProcessors;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMemoryProtectedMode(String memoryProtectedMode) {
            this.memoryProtectedMode = memoryProtectedMode;
            return this;
        }
        public String getMemoryProtectedMode() {
            return this.memoryProtectedMode;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMemoryRateLimit(Integer memoryRateLimit) {
            this.memoryRateLimit = memoryRateLimit;
            return this;
        }
        public Integer getMemoryRateLimit() {
            return this.memoryRateLimit;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMemorySampleDuration(Integer memorySampleDuration) {
            this.memorySampleDuration = memorySampleDuration;
            return this;
        }
        public Integer getMemorySampleDuration() {
            return this.memorySampleDuration;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMemorySingleRateLimit(Integer memorySingleRateLimit) {
            this.memorySingleRateLimit = memorySingleRateLimit;
            return this;
        }
        public Integer getMemorySingleRateLimit() {
            return this.memorySingleRateLimit;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkSecurity(String watermarkSecurity) {
            this.watermarkSecurity = watermarkSecurity;
            return this;
        }
        public String getWatermarkSecurity() {
            return this.watermarkSecurity;
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
