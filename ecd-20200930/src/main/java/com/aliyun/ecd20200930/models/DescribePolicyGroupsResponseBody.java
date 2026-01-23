// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePolicyGroupsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The details of the cloud computer policies.</p>
     */
    @NameInMap("DescribePolicyGroups")
    public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroups> describePolicyGroups;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolicyGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyGroupsResponseBody self = new DescribePolicyGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyGroupsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
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

    public DescribePolicyGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolicyGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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
         * <p>The CIDR block that is allowed to access the client. The value is an IPv4 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The remarks on the CIDR block that is allowed to access the client.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>The object to which the security group rule applies. The value is an IPv4 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the security group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The protocol type of the security group rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>tcp: Transmission Control Protocol (TCP)</li>
         * <li>udp: User Datagram Protocol (UDP)</li>
         * <li>all: all protocols</li>
         * <li>gre: Generic Routing Encapsulation (GRE)</li>
         * <li>icmp: Internet Control Message Protocol (ICMP) for IPv4</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization of the security group rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>drop: denies all access requests.</li>
         * <li>accept: accepts all requests.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range of the security group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group rule. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The direction of the security group rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>outflow: outbound</li>
         * <li>inflow: inbound</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>inflow</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>html5: web client</li>
         * <li>android: Android client</li>
         * <li>windows: Windows client</li>
         * <li>ios: iOS client</li>
         * <li>macos: macOS client</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>Indicates whether end users are allowed to use a specific type of the client to connect to cloud computers.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>OFF</li>
         * <li>ON</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
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

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRedirects extends TeaModel {
        /**
         * <p>The peripheral type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>printer</li>
         * <li>scanner</li>
         * <li>camera</li>
         * <li>adb: the Android Debug Bridge (ADB) device.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The redirection type. Valid values:</p>
         * <ul>
         * <li>usbRedirect</li>
         * <li>deviceRedirect</li>
         * <li>off: direction disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>usbRedirect</p>
         */
        @NameInMap("RedirectType")
        public String redirectType;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRedirects build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRedirects self = new DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRedirects();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRedirects setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRedirects setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

    }

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules extends TeaModel {
        /**
         * <p>The device name.</p>
         * 
         * <strong>example:</strong>
         * <p>sandisk</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The product ID (PID).</p>
         * 
         * <strong>example:</strong>
         * <p>0x55b1</p>
         */
        @NameInMap("DevicePid")
        public String devicePid;

        /**
         * <p>The peripheral type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>usbKey</li>
         * <li>other</li>
         * <li>graphicsTablet</li>
         * <li>printer</li>
         * <li>cardReader</li>
         * <li>scanner</li>
         * <li>storage</li>
         * <li>camera</li>
         * <li>adb</li>
         * <li>networkInterfaceCard: the NIC device.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB VIDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0x0781</p>
         */
        @NameInMap("DeviceVid")
        public String deviceVid;

        /**
         * <p>The link optimization command.</p>
         * 
         * <strong>example:</strong>
         * <p>2:0</p>
         */
        @NameInMap("OptCommand")
        public String optCommand;

        @NameInMap("Platforms")
        public String platforms;

        /**
         * <p>The redirection type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>deviceRedirect</li>
         * <li>usbRedirect</li>
         * <li>off: redirection disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>usbRedirect</p>
         */
        @NameInMap("RedirectType")
        public String redirectType;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules self = new DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules setDevicePid(String devicePid) {
            this.devicePid = devicePid;
            return this;
        }
        public String getDevicePid() {
            return this.devicePid;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules setDeviceVid(String deviceVid) {
            this.deviceVid = deviceVid;
            return this;
        }
        public String getDeviceVid() {
            return this.deviceVid;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules setOptCommand(String optCommand) {
            this.optCommand = optCommand;
            return this;
        }
        public String getOptCommand() {
            return this.optCommand;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules setPlatforms(String platforms) {
            this.platforms = platforms;
            return this;
        }
        public String getPlatforms() {
            return this.platforms;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

    }

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule extends TeaModel {
        /**
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>*.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether the domain name resolution rule is allowed.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>allow</li>
         * <li>block</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
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
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>*.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether the rule is allowed.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>allow</li>
         * <li>block</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The rule type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>prc: process</li>
         * <li>domain: domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
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

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsRecordEventLevels extends TeaModel {
        /**
         * <p>The event severity.</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The event type.</p>
         */
        @NameInMap("EventType")
        public String eventType;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroupsRecordEventLevels build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroupsRecordEventLevels self = new DescribePolicyGroupsResponseBodyDescribePolicyGroupsRecordEventLevels();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsRecordEventLevels setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsRecordEventLevels setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule extends TeaModel {
        /**
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The device class. This parameter is required when <code>usbRuleType</code> is set to 1. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0Eh</p>
         */
        @NameInMap("DeviceClass")
        public String deviceClass;

        /**
         * <p>The subclass of the device. This parameter is required when <code>usbRuleType</code> is set to 1. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>xxh</p>
         */
        @NameInMap("DeviceSubclass")
        public String deviceSubclass;

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08**</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>Indicates whether USB redirection is allowed.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: allowed</li>
         * <li>2: not allowed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRedirectType")
        public Long usbRedirectType;

        /**
         * <p>The type of the USB redirection rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: by device class</li>
         * <li>2: by device vendor</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRuleType")
        public Long usbRuleType;

        /**
         * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB VIDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>04**</p>
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
        @NameInMap("AcademicProxy")
        public String academicProxy;

        /**
         * <p>Indicates whether end users are granted the administrator permissions.</p>
         * <blockquote>
         * <p> This parameter is in invitational preview for specific users and not available to the public.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("AdminAccess")
        public String adminAccess;

        /**
         * <p>Indicates whether the anti-screenshot feature is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off (default)</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AppContentProtection")
        public String appContentProtection;

        /**
         * <p>The client IP address whitelist. End users can access cloud computers only from the IP addresses in the whitelist.</p>
         */
        @NameInMap("AuthorizeAccessPolicyRules")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        /**
         * <p>The security group rules.</p>
         */
        @NameInMap("AuthorizeSecurityPolicyRules")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules;

        /**
         * <p>The automatic client connection recovery configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AutoReconnect")
        public String autoReconnect;

        /**
         * <p>Indicates whether the webcam redirection feature is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CameraRedirect")
        public String cameraRedirect;

        @NameInMap("ClientControlMenu")
        public String clientControlMenu;

        @NameInMap("ClientCreateSnapshot")
        public String clientCreateSnapshot;

        /**
         * <p>The logon method control rules to limit the type of the Alibaba Cloud Workspace client used by end users to connect to cloud computers.</p>
         */
        @NameInMap("ClientTypes")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsClientTypes> clientTypes;

        /**
         * <p>The permissions on the clipboard.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>read: specifies one-way transfer. You can copy files only from local devices to cloud computers.</li>
         * <li>readwrite: specifies two-way transfer. You can copy files between local devices and cloud computers.</li>
         * <li>write: specifies one-way transfer. You can only copy files from cloud computers to local devices.</li>
         * <li>off: disables both one-way and two-way transfer. Files cannot be copied between local devices and cloud computers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        /**
         * <p>Indicates whether the Color Enhancement switch is turned on in design and 3D scenarios.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ColorEnhancement")
        public String colorEnhancement;

        @NameInMap("CpdDriveClipboard")
        public String cpdDriveClipboard;

        /**
         * <p>The CPU underclocking duration. Valid values: 30 to 120. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("CpuDownGradeDuration")
        public Integer cpuDownGradeDuration;

        @NameInMap("CpuOverload")
        public String cpuOverload;

        /**
         * <p>The process whitelist that is not restricted by the CPU usage limit.</p>
         */
        @NameInMap("CpuProcessors")
        public java.util.List<String> cpuProcessors;

        /**
         * <p>Indicates whether the CPU spike protection switch is turned on.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CpuProtectedMode")
        public String cpuProtectedMode;

        /**
         * <p>The overall CPU usage. Valid values: 70 to 90. Unit: percentage (%).</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("CpuRateLimit")
        public Integer cpuRateLimit;

        /**
         * <p>The overall CPU sampling duration. Valid values: 10 to 60. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CpuSampleDuration")
        public Integer cpuSampleDuration;

        /**
         * <p>The single-CPU usage. Valid values: 70 to 100. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("CpuSingleRateLimit")
        public Integer cpuSingleRateLimit;

        /**
         * <p>The number of cloud computers bound with this policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopCount")
        public Integer desktopCount;

        /**
         * <p>The number of shared cloud computers bound with this policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopGroupCount")
        public Integer desktopGroupCount;

        @NameInMap("DeviceConnectHint")
        public String deviceConnectHint;

        /**
         * <p>The device redirection rules.</p>
         */
        @NameInMap("DeviceRedirects")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRedirects> deviceRedirects;

        /**
         * <p>The custom peripheral rules.</p>
         */
        @NameInMap("DeviceRules")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules> deviceRules;

        @NameInMap("DiskOverload")
        public String diskOverload;

        /**
         * <p>The display mode.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>clientCustom: suitable for user-defined scenarios.</li>
         * <li>adminOffice: suitable for daily office scenarios.</li>
         * <li>adminDesign: suitable for 3D application scenarios.</li>
         * <li>adminCustom: administrator-customized scenarios</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>adminCustom</p>
         */
        @NameInMap("DisplayMode")
        public String displayMode;

        /**
         * <p>Specifies whether to enable the access control for domain names. Domain names support wildcards (\*). Separate multiple domain names with commas (,).</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("DomainList")
        public String domainList;

        /**
         * <p>The domain name resolution rules.</p>
         */
        @NameInMap("DomainResolveRule")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule> domainResolveRule;

        /**
         * <p>Indicates whether the switch for domain name resolution is turned on.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("DomainResolveRuleType")
        public String domainResolveRuleType;

        /**
         * <p>The number of cloud computers that are associated with the policy. The number of cloud computers that are associated only with custom policies is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EdsCount")
        public Integer edsCount;

        /**
         * <p>Indicates whether the Contact Administrator for Help switch is turned on.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("EndUserApplyAdminCoordinate")
        public String endUserApplyAdminCoordinate;

        /**
         * <p>Indicates whether the User Stream Collaboration switch is turned on.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("EndUserGroupCoordinate")
        public String endUserGroupCoordinate;

        @NameInMap("ExternalDrive")
        public String externalDrive;

        @NameInMap("FileMigrate")
        public String fileMigrate;

        /**
         * <p>Transfers files.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("FileTransfer")
        public String fileTransfer;

        @NameInMap("FileTransferAddress")
        public String fileTransferAddress;

        @NameInMap("FileTransferSpeed")
        public String fileTransferSpeed;

        @NameInMap("FileTransferSpeedLocation")
        public String fileTransferSpeedLocation;

        /**
         * <p>Indicates whether the Image Quality Control feature is enabled. If you have high requirements on the performance and user experience in scenarios such as professional design, we recommend that you enable this feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("GpuAcceleration")
        public String gpuAcceleration;

        @NameInMap("HoverConfigMsg")
        public String hoverConfigMsg;

        /**
         * <p>Specifies whether to allow web client access.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off (default)</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Html5Access")
        public String html5Access;

        /**
         * <p>The file transfer feature on the web client.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>all: Files can be uploaded and downloaded between local computers and the web client.</li>
         * <li>download: Files on the web client can be downloaded to local computers.</li>
         * <li>upload: Files on local computers can be uploaded to the web client.</li>
         * <li>off (default): Files cannot be transferred between the web client and local computers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Html5FileTransfer")
        public String html5FileTransfer;

        /**
         * <p>The protocol for network communication.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>TCP (default): TCP.</li>
         * <li>BOTH: TCP and UDP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BOTH</p>
         */
        @NameInMap("InternetCommunicationProtocol")
        public String internetCommunicationProtocol;

        @NameInMap("InternetPrinter")
        public String internetPrinter;

        /**
         * <p>The permissions on local disk mapping.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>read: read-only. Local disk mapping is available on cloud computers. However, you can only read (copy) local files but cannot modify the files.</li>
         * <li>readwrite: read and write. Local disk mapping is available on cloud computers. You can read (copy) and write (modify) local files.</li>
         * <li>off (default): none.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        @NameInMap("LocalDrive")
        public String localDrive;

        /**
         * <p>The maximum retry period for reconnecting to cloud computers when the cloud computers are disconnected due to none-human reasons. Valid values: 30 to 7200. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("MaxReconnectTime")
        public Integer maxReconnectTime;

        /**
         * <p>The memory underclocking duration for a single process. Valid values: 30 to 120. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MemoryDownGradeDuration")
        public Integer memoryDownGradeDuration;

        @NameInMap("MemoryOverload")
        public String memoryOverload;

        /**
         * <p>The whitelist of processes that are not restricted by the memory usage limit.</p>
         */
        @NameInMap("MemoryProcessors")
        public java.util.List<String> memoryProcessors;

        /**
         * <p>Indicates whether the memory spike protection switch is turned on.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("MemoryProtectedMode")
        public String memoryProtectedMode;

        /**
         * <p>The overall memory usage. Valid values: 70 to 90. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("MemoryRateLimit")
        public Integer memoryRateLimit;

        /**
         * <p>The overall memory sampling duration. Valid values: 30 to 60. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MemorySampleDuration")
        public Integer memorySampleDuration;

        /**
         * <p>The memory usage of a single process. Valid values: 30 to 60. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MemorySingleRateLimit")
        public Integer memorySingleRateLimit;

        /**
         * <p>Specifies whether to display the restart button in the DesktopAssistant when the cloud computer is accessed from the Alibaba Cloud Workspace mobile clients (including the Android client and the iOS client).</p>
         * <blockquote>
         * <p>Mobile clients of V7.4 and higher versions required.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: not provided.</li>
         * <li>on: provided.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileRestart")
        public String mobileRestart;

        /**
         * <p>Indicates whether the Windows security control is enabled for mobile clients.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileSafeMenu")
        public String mobileSafeMenu;

        /**
         * <p>Specifies whether to display the shut down button in the DesktopAssistant when the cloud computer is accessed from the Alibaba Cloud Workspace mobile clients (including the Android client and the iOS client).</p>
         * <blockquote>
         * <p>Mobile clients of V7.4 and higher versions required.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: not provided.</li>
         * <li>on: provided.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileShutdown")
        public String mobileShutdown;

        /**
         * <p>Indicates whether the Cloud Computer Manager is enabled for mobile clients.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileWuyingKeeper")
        public String mobileWuyingKeeper;

        /**
         * <p>Indicates whether the Xiaoying AI Assistant is enabled for mobile clients.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileWyAssistant")
        public String mobileWyAssistant;

        @NameInMap("ModelLibrary")
        public String modelLibrary;

        @NameInMap("MultiScreen")
        public String multiScreen;

        /**
         * <p>The name of the cloud computer policy.</p>
         * 
         * <strong>example:</strong>
         * <p>testPolicyGroupName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the network redirection feature is enabled.</p>
         * <blockquote>
         * <p> This parameter is in invitational preview for specific users and not available to the public.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off (default)</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NetRedirect")
        public String netRedirect;

        /**
         * <p>The network redirection rule.</p>
         * <blockquote>
         * <p> This parameter is in invitational preview for specific users and not available to the public.</p>
         * </blockquote>
         */
        @NameInMap("NetRedirectRule")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule> netRedirectRule;

        /**
         * <p>The ID of the cloud computer policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-gx2x1dhsmthe9****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The type of the cloud computer policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SYSTEM</li>
         * <li>CUSTOM</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("PolicyGroupType")
        public String policyGroupType;

        /**
         * <p>The status of the cloud computer policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AVAILABLE</li>
         * <li>CREATING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        @NameInMap("PortProxy")
        public String portProxy;

        /**
         * <p>The cloud computer preemption feature.</p>
         * <blockquote>
         * <p> To ensure user experience and data security, when a cloud computer is used by an end user, other end users cannot connect to the cloud computer. By default, this parameter is set to <code>off</code>, which cannot be modified.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: Preemption is not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("PreemptLogin")
        public String preemptLogin;

        /**
         * <p>The usernames that can preempt to connect to the cloud computer.</p>
         */
        @NameInMap("PreemptLoginUsers")
        public java.util.List<String> preemptLoginUsers;

        /**
         * <p>Indicates whether the printer redirection feature is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("PrinterRedirection")
        public String printerRedirection;

        /**
         * <p>Indicates whether the Image Quality Enhancement switch is turned on for design and 3D scenarios.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("QualityEnhancement")
        public String qualityEnhancement;

        /**
         * <p>Indicates whether the custom screen recording feature is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off (default)</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RecordContent")
        public String recordContent;

        /**
         * <p>The period when the custom screen recording can be retained before expiration. Default value: 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RecordContentExpires")
        public Long recordContentExpires;

        /**
         * <p>The recording duration since a target event is detected by the screen recording audit policy. Unit: Minute. Valid values: 10-60.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordEventDuration")
        public Integer recordEventDuration;

        /**
         * <p>The screen recording file suffix.</p>
         */
        @NameInMap("RecordEventFileExts")
        public java.util.List<String> recordEventFileExts;

        /**
         * <p>The array of absolute paths of the monitored files in the screen recording audit policy.</p>
         */
        @NameInMap("RecordEventFilePaths")
        public java.util.List<String> recordEventFilePaths;

        /**
         * <p>Indicates whether the screen recording event severity is enabled.</p>
         */
        @NameInMap("RecordEventLevels")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsRecordEventLevels> recordEventLevels;

        /**
         * <p>The array of absolute paths of the monitored registry entries in the screen recording audit policy.</p>
         */
        @NameInMap("RecordEventRegisters")
        public java.util.List<String> recordEventRegisters;

        /**
         * <p>Indicates whether the screen recording feature is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>byaction_cmd_ft: enables the operation-triggered screen recording upon command execution and file transfer.</li>
         * <li>ALLTIME: enables the whole-process screen recording. That is, the recording starts when cloud computers are connected and ends when the cloud computers are disconnected.</li>
         * <li>PERIOD: enables the interval-based screen recording. You must specify an interval between the start time and end time of this type of recording.</li>
         * <li>byaction_commands: enables the operation-triggered screen recording upon command execution.</li>
         * <li>OFF: disables the screen recording feature.</li>
         * <li>byaction_file_transfer: enables the operation-triggered screen recording upon file transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        @NameInMap("Recording")
        public String recording;

        /**
         * <p>Indicates whether audio files generated from cloud computers are recorded.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off (default): records only video files.</li>
         * <li>on: records video and audio files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RecordingAudio")
        public String recordingAudio;

        /**
         * <p>The file length of the screen recording. Unit: minutes. Screen recording files are split based on the specified file length and uploaded to Object Storage Service (OSS) buckets. When a screen recording file reaches 300 MB in size, the system preferentially performs rolling update for the file.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>10</li>
         * <li>20</li>
         * <li>30</li>
         * <li>60</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordingDuration")
        public Integer recordingDuration;

        /**
         * <p>The time when the screen recording ended. The value is in the HH:MM:SS format. The value takes effect only when Recording is set to PERIOD.</p>
         * 
         * <strong>example:</strong>
         * <p>08:59:00</p>
         */
        @NameInMap("RecordingEndTime")
        public String recordingEndTime;

        /**
         * <p>The retention period of the screen recording file. Valid values: 1 to 180. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("RecordingExpires")
        public Long recordingExpires;

        /**
         * <p>The frame rate of screen recording. Unit: fps.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>2</li>
         * <li>5</li>
         * <li>10</li>
         * <li>15</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RecordingFps")
        public Long recordingFps;

        /**
         * <p>The time when the screen recording was started. The value is in the HH:MM:SS format. The value takes effect only when Recording is set to PERIOD.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00:00</p>
         */
        @NameInMap("RecordingStartTime")
        public String recordingStartTime;

        /**
         * <p>Indicates whether the screen recording notification feature is enabled after end users log on to the Alibaba Cloud Workspace client.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RecordingUserNotify")
        public String recordingUserNotify;

        /**
         * <p>The notification content of screen recording. By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Your desktop is being recorded</p>
         */
        @NameInMap("RecordingUserNotifyMessage")
        public String recordingUserNotifyMessage;

        /**
         * <p>The permissions on keyboard and mouse control during remote assistance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>optionalControl: By default, you are not granted the permissions. You can apply for the permissions.</li>
         * <li>fullControl: You are granted the full permissions.</li>
         * <li>disableControl: You are not granted the permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fullControl</p>
         */
        @NameInMap("RemoteCoordinate")
        public String remoteCoordinate;

        /**
         * <p>Resets the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ResetDesktop")
        public String resetDesktop;

        @NameInMap("ResolutionDpi")
        public Integer resolutionDpi;

        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

        @NameInMap("ResolutionModel")
        public String resolutionModel;

        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        /**
         * <p>The number of resource groups bound with this policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceGroupCount")
        public Integer resourceGroupCount;

        /**
         * <p>The region of the cloud computer policy.</p>
         * <blockquote>
         * <p>The value of a region-less policy is <code>center</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        @NameInMap("SafeMenu")
        public String safeMenu;

        /**
         * <p>The effective scope of the policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>IP: The policy takes effect based on the IP address.</li>
         * <li>GLOBAL: The policy takes effect globally.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GLOBAL</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>This parameter is required when the <code>Scope</code> parameter is set to <code>IP</code>.````</p>
         */
        @NameInMap("ScopeValue")
        public java.util.List<String> scopeValue;

        @NameInMap("ScreenDisplayMode")
        public String screenDisplayMode;

        /**
         * <p>Indicates whether the Smooth Enhancement switch is turned on.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("SmoothEnhancement")
        public String smoothEnhancement;

        /**
         * <p>Specifies whether to provide the Metrics function in the DesktopAssistant. Valid values:</p>
         * <ul>
         * <li>off: not provided.</li>
         * <li>on: provided.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("StatusMonitor")
        public String statusMonitor;

        /**
         * <p>The streaming mode.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>intelligent: suitable for daily office scenarios (Intelligent Mode).</li>
         * <li>smooth: suitable for design and 3D application scenarios (Smooth Mode).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>smooth</p>
         */
        @NameInMap("StreamingMode")
        public String streamingMode;

        /**
         * <p>The destination frame rate. Valid values: 10 to 60. Unit: fps.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TargetFps")
        public Integer targetFps;

        /**
         * <p>Indicates whether the USB redirection feature is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("UsbRedirect")
        public String usbRedirect;

        /**
         * <p>The USB redirection rule.</p>
         */
        @NameInMap("UsbSupplyRedirectRule")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule> usbSupplyRedirectRule;

        @NameInMap("UseTime")
        public String useTime;

        /**
         * <p>The average bitrate for video encoding. Valid values: 1000 to 50000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("VideoEncAvgKbps")
        public Integer videoEncAvgKbps;

        /**
         * <p>The maximum quantizer parameter (QP) of video files. A larger QP value indicates worse video quality. Valid values: 0 to 51.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoEncMaxQP")
        public Integer videoEncMaxQP;

        /**
         * <p>The minimum quantizer parameter (QP) of video files. A smaller QP value indicates higher video quality. Valid values: 0 to 51.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoEncMinQP")
        public Integer videoEncMinQP;

        /**
         * <p>The peak bitrate for video encoding. Valid values: 1000 to 50000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("VideoEncPeakKbps")
        public Integer videoEncPeakKbps;

        /**
         * <p>The video encoding feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>qualityFirst: The priority given to the image quality.</li>
         * <li>bandwidthFirst: The priority given to the bitrate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>qualityFirst</p>
         */
        @NameInMap("VideoEncPolicy")
        public String videoEncPolicy;

        /**
         * <p>Indicates whether the multimedia redirection feature is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("VideoRedirect")
        public String videoRedirect;

        /**
         * <p>The image display quality.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>high: high-definition (HD)</li>
         * <li>low: fluent</li>
         * <li>medium (default): adaptive</li>
         * <li>lossless: no quality loss</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("VisualQuality")
        public String visualQuality;

        /**
         * <p>The watermarking feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>blind: Invisible watermarks are applied.</li>
         * <li>off: The watermarking feature is disabled.</li>
         * <li>on: Visible watermarks are applied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Watermark")
        public String watermark;

        /**
         * <p>Indicates whether the anti-screen photo feature is enabled for invisible watermarks.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("WatermarkAntiCam")
        public String watermarkAntiCam;

        /**
         * <p>The font color in red, green, and blue (RGB) of the watermark. Valid values: 0 to 16777215.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WatermarkColor")
        public Integer watermarkColor;

        /**
         * <p>If you set <code>WatermarkType</code> to <code>custom</code>, you must also specify <code>WatermarkCustomText</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WatermarkCustomText")
        public String watermarkCustomText;

        /**
         * <p>The slope of the watermark. Valid values: -10 to -30.</p>
         * 
         * <strong>example:</strong>
         * <p>-10</p>
         */
        @NameInMap("WatermarkDegree")
        public Double watermarkDegree;

        /**
         * <p>The font size of the watermark. Valid values: 10 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WatermarkFontSize")
        public Integer watermarkFontSize;

        /**
         * <p>The watermark font style.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>plain</li>
         * <li>bold</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>plain</p>
         */
        @NameInMap("WatermarkFontStyle")
        public String watermarkFontStyle;

        /**
         * <p>The watermark enhancement feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>high</li>
         * <li>low</li>
         * <li>medium</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("WatermarkPower")
        public String watermarkPower;

        /**
         * <p>The number of watermark rows.</p>
         * <blockquote>
         * <p> This parameter is not available for public use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("WatermarkRowAmount")
        public Integer watermarkRowAmount;

        /**
         * <p>Indicates whether the security priority feature is enabled for invisible watermarks.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("WatermarkSecurity")
        public String watermarkSecurity;

        @NameInMap("WatermarkShadow")
        public String watermarkShadow;

        /**
         * <p>The watermark transparency.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>LIGHT</li>
         * <li>DARK</li>
         * <li>MIDDLE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LIGHT</p>
         */
        @NameInMap("WatermarkTransparency")
        public String watermarkTransparency;

        /**
         * <p>The watermark transparency. A greater value indicates that the watermark is less transparent. Valid values: 10 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WatermarkTransparencyValue")
        public Integer watermarkTransparencyValue;

        /**
         * <p>The watermark content.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>EndUserId: the username.</li>
         * <li>Custom</li>
         * <li>DesktopIp: the IP address of the cloud computer.</li>
         * <li>ClientIp: the IP address of the Alibaba Cloud Workspace client.</li>
         * <li>HostName: the rightmost 15 digits of the cloud computer ID.</li>
         * <li>ClientTime: the current time displayed on the cloud computer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EndUserId</p>
         */
        @NameInMap("WatermarkType")
        public String watermarkType;

        @NameInMap("WuyingKeeper")
        public String wuyingKeeper;

        /**
         * <p>Specifies whether to provide the AI Assistant function in the DesktopAssistant when the cloud computer is accessed from the Alibaba Cloud Workspace desktop clients (including the Windows client and the macOS client).</p>
         * <blockquote>
         * <p>Desktop clients of V7.7 and higher versions required.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>off: the AI Aisstant function is not provided.</li>
         * <li>on: the AI Aisstant function is provided.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("WyAssistant")
        public String wyAssistant;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroups self = new DescribePolicyGroupsResponseBodyDescribePolicyGroups();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setAcademicProxy(String academicProxy) {
            this.academicProxy = academicProxy;
            return this;
        }
        public String getAcademicProxy() {
            return this.academicProxy;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setAutoReconnect(String autoReconnect) {
            this.autoReconnect = autoReconnect;
            return this;
        }
        public String getAutoReconnect() {
            return this.autoReconnect;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setCameraRedirect(String cameraRedirect) {
            this.cameraRedirect = cameraRedirect;
            return this;
        }
        public String getCameraRedirect() {
            return this.cameraRedirect;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setClientControlMenu(String clientControlMenu) {
            this.clientControlMenu = clientControlMenu;
            return this;
        }
        public String getClientControlMenu() {
            return this.clientControlMenu;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setClientCreateSnapshot(String clientCreateSnapshot) {
            this.clientCreateSnapshot = clientCreateSnapshot;
            return this;
        }
        public String getClientCreateSnapshot() {
            return this.clientCreateSnapshot;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setColorEnhancement(String colorEnhancement) {
            this.colorEnhancement = colorEnhancement;
            return this;
        }
        public String getColorEnhancement() {
            return this.colorEnhancement;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setCpdDriveClipboard(String cpdDriveClipboard) {
            this.cpdDriveClipboard = cpdDriveClipboard;
            return this;
        }
        public String getCpdDriveClipboard() {
            return this.cpdDriveClipboard;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setCpuDownGradeDuration(Integer cpuDownGradeDuration) {
            this.cpuDownGradeDuration = cpuDownGradeDuration;
            return this;
        }
        public Integer getCpuDownGradeDuration() {
            return this.cpuDownGradeDuration;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setCpuOverload(String cpuOverload) {
            this.cpuOverload = cpuOverload;
            return this;
        }
        public String getCpuOverload() {
            return this.cpuOverload;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setDesktopCount(Integer desktopCount) {
            this.desktopCount = desktopCount;
            return this;
        }
        public Integer getDesktopCount() {
            return this.desktopCount;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setDesktopGroupCount(Integer desktopGroupCount) {
            this.desktopGroupCount = desktopGroupCount;
            return this;
        }
        public Integer getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setDeviceConnectHint(String deviceConnectHint) {
            this.deviceConnectHint = deviceConnectHint;
            return this;
        }
        public String getDeviceConnectHint() {
            return this.deviceConnectHint;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setDeviceRedirects(java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRedirects> deviceRedirects) {
            this.deviceRedirects = deviceRedirects;
            return this;
        }
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRedirects> getDeviceRedirects() {
            return this.deviceRedirects;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setDeviceRules(java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules> deviceRules) {
            this.deviceRules = deviceRules;
            return this;
        }
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules> getDeviceRules() {
            return this.deviceRules;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setDiskOverload(String diskOverload) {
            this.diskOverload = diskOverload;
            return this;
        }
        public String getDiskOverload() {
            return this.diskOverload;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setDisplayMode(String displayMode) {
            this.displayMode = displayMode;
            return this;
        }
        public String getDisplayMode() {
            return this.displayMode;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setExternalDrive(String externalDrive) {
            this.externalDrive = externalDrive;
            return this;
        }
        public String getExternalDrive() {
            return this.externalDrive;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setFileMigrate(String fileMigrate) {
            this.fileMigrate = fileMigrate;
            return this;
        }
        public String getFileMigrate() {
            return this.fileMigrate;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setFileTransfer(String fileTransfer) {
            this.fileTransfer = fileTransfer;
            return this;
        }
        public String getFileTransfer() {
            return this.fileTransfer;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setFileTransferAddress(String fileTransferAddress) {
            this.fileTransferAddress = fileTransferAddress;
            return this;
        }
        public String getFileTransferAddress() {
            return this.fileTransferAddress;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setFileTransferSpeed(String fileTransferSpeed) {
            this.fileTransferSpeed = fileTransferSpeed;
            return this;
        }
        public String getFileTransferSpeed() {
            return this.fileTransferSpeed;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setFileTransferSpeedLocation(String fileTransferSpeedLocation) {
            this.fileTransferSpeedLocation = fileTransferSpeedLocation;
            return this;
        }
        public String getFileTransferSpeedLocation() {
            return this.fileTransferSpeedLocation;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setGpuAcceleration(String gpuAcceleration) {
            this.gpuAcceleration = gpuAcceleration;
            return this;
        }
        public String getGpuAcceleration() {
            return this.gpuAcceleration;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setHoverConfigMsg(String hoverConfigMsg) {
            this.hoverConfigMsg = hoverConfigMsg;
            return this;
        }
        public String getHoverConfigMsg() {
            return this.hoverConfigMsg;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setInternetPrinter(String internetPrinter) {
            this.internetPrinter = internetPrinter;
            return this;
        }
        public String getInternetPrinter() {
            return this.internetPrinter;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setLocalDrive(String localDrive) {
            this.localDrive = localDrive;
            return this;
        }
        public String getLocalDrive() {
            return this.localDrive;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMaxReconnectTime(Integer maxReconnectTime) {
            this.maxReconnectTime = maxReconnectTime;
            return this;
        }
        public Integer getMaxReconnectTime() {
            return this.maxReconnectTime;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMemoryDownGradeDuration(Integer memoryDownGradeDuration) {
            this.memoryDownGradeDuration = memoryDownGradeDuration;
            return this;
        }
        public Integer getMemoryDownGradeDuration() {
            return this.memoryDownGradeDuration;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMemoryOverload(String memoryOverload) {
            this.memoryOverload = memoryOverload;
            return this;
        }
        public String getMemoryOverload() {
            return this.memoryOverload;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMobileRestart(String mobileRestart) {
            this.mobileRestart = mobileRestart;
            return this;
        }
        public String getMobileRestart() {
            return this.mobileRestart;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMobileSafeMenu(String mobileSafeMenu) {
            this.mobileSafeMenu = mobileSafeMenu;
            return this;
        }
        public String getMobileSafeMenu() {
            return this.mobileSafeMenu;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMobileShutdown(String mobileShutdown) {
            this.mobileShutdown = mobileShutdown;
            return this;
        }
        public String getMobileShutdown() {
            return this.mobileShutdown;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMobileWuyingKeeper(String mobileWuyingKeeper) {
            this.mobileWuyingKeeper = mobileWuyingKeeper;
            return this;
        }
        public String getMobileWuyingKeeper() {
            return this.mobileWuyingKeeper;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMobileWyAssistant(String mobileWyAssistant) {
            this.mobileWyAssistant = mobileWyAssistant;
            return this;
        }
        public String getMobileWyAssistant() {
            return this.mobileWyAssistant;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setModelLibrary(String modelLibrary) {
            this.modelLibrary = modelLibrary;
            return this;
        }
        public String getModelLibrary() {
            return this.modelLibrary;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMultiScreen(String multiScreen) {
            this.multiScreen = multiScreen;
            return this;
        }
        public String getMultiScreen() {
            return this.multiScreen;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setPortProxy(String portProxy) {
            this.portProxy = portProxy;
            return this;
        }
        public String getPortProxy() {
            return this.portProxy;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setQualityEnhancement(String qualityEnhancement) {
            this.qualityEnhancement = qualityEnhancement;
            return this;
        }
        public String getQualityEnhancement() {
            return this.qualityEnhancement;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordEventDuration(Integer recordEventDuration) {
            this.recordEventDuration = recordEventDuration;
            return this;
        }
        public Integer getRecordEventDuration() {
            return this.recordEventDuration;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordEventFileExts(java.util.List<String> recordEventFileExts) {
            this.recordEventFileExts = recordEventFileExts;
            return this;
        }
        public java.util.List<String> getRecordEventFileExts() {
            return this.recordEventFileExts;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordEventFilePaths(java.util.List<String> recordEventFilePaths) {
            this.recordEventFilePaths = recordEventFilePaths;
            return this;
        }
        public java.util.List<String> getRecordEventFilePaths() {
            return this.recordEventFilePaths;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordEventLevels(java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsRecordEventLevels> recordEventLevels) {
            this.recordEventLevels = recordEventLevels;
            return this;
        }
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsRecordEventLevels> getRecordEventLevels() {
            return this.recordEventLevels;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordEventRegisters(java.util.List<String> recordEventRegisters) {
            this.recordEventRegisters = recordEventRegisters;
            return this;
        }
        public java.util.List<String> getRecordEventRegisters() {
            return this.recordEventRegisters;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordingUserNotify(String recordingUserNotify) {
            this.recordingUserNotify = recordingUserNotify;
            return this;
        }
        public String getRecordingUserNotify() {
            return this.recordingUserNotify;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRecordingUserNotifyMessage(String recordingUserNotifyMessage) {
            this.recordingUserNotifyMessage = recordingUserNotifyMessage;
            return this;
        }
        public String getRecordingUserNotifyMessage() {
            return this.recordingUserNotifyMessage;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setRemoteCoordinate(String remoteCoordinate) {
            this.remoteCoordinate = remoteCoordinate;
            return this;
        }
        public String getRemoteCoordinate() {
            return this.remoteCoordinate;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setResetDesktop(String resetDesktop) {
            this.resetDesktop = resetDesktop;
            return this;
        }
        public String getResetDesktop() {
            return this.resetDesktop;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setResolutionDpi(Integer resolutionDpi) {
            this.resolutionDpi = resolutionDpi;
            return this;
        }
        public Integer getResolutionDpi() {
            return this.resolutionDpi;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setResolutionHeight(Integer resolutionHeight) {
            this.resolutionHeight = resolutionHeight;
            return this;
        }
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setResolutionModel(String resolutionModel) {
            this.resolutionModel = resolutionModel;
            return this;
        }
        public String getResolutionModel() {
            return this.resolutionModel;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setResolutionWidth(Integer resolutionWidth) {
            this.resolutionWidth = resolutionWidth;
            return this;
        }
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setResourceGroupCount(Integer resourceGroupCount) {
            this.resourceGroupCount = resourceGroupCount;
            return this;
        }
        public Integer getResourceGroupCount() {
            return this.resourceGroupCount;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setSafeMenu(String safeMenu) {
            this.safeMenu = safeMenu;
            return this;
        }
        public String getSafeMenu() {
            return this.safeMenu;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setScreenDisplayMode(String screenDisplayMode) {
            this.screenDisplayMode = screenDisplayMode;
            return this;
        }
        public String getScreenDisplayMode() {
            return this.screenDisplayMode;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setSmoothEnhancement(String smoothEnhancement) {
            this.smoothEnhancement = smoothEnhancement;
            return this;
        }
        public String getSmoothEnhancement() {
            return this.smoothEnhancement;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setStatusMonitor(String statusMonitor) {
            this.statusMonitor = statusMonitor;
            return this;
        }
        public String getStatusMonitor() {
            return this.statusMonitor;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setStreamingMode(String streamingMode) {
            this.streamingMode = streamingMode;
            return this;
        }
        public String getStreamingMode() {
            return this.streamingMode;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setTargetFps(Integer targetFps) {
            this.targetFps = targetFps;
            return this;
        }
        public Integer getTargetFps() {
            return this.targetFps;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setUseTime(String useTime) {
            this.useTime = useTime;
            return this;
        }
        public String getUseTime() {
            return this.useTime;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setVideoEncAvgKbps(Integer videoEncAvgKbps) {
            this.videoEncAvgKbps = videoEncAvgKbps;
            return this;
        }
        public Integer getVideoEncAvgKbps() {
            return this.videoEncAvgKbps;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setVideoEncMaxQP(Integer videoEncMaxQP) {
            this.videoEncMaxQP = videoEncMaxQP;
            return this;
        }
        public Integer getVideoEncMaxQP() {
            return this.videoEncMaxQP;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setVideoEncMinQP(Integer videoEncMinQP) {
            this.videoEncMinQP = videoEncMinQP;
            return this;
        }
        public Integer getVideoEncMinQP() {
            return this.videoEncMinQP;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setVideoEncPeakKbps(Integer videoEncPeakKbps) {
            this.videoEncPeakKbps = videoEncPeakKbps;
            return this;
        }
        public Integer getVideoEncPeakKbps() {
            return this.videoEncPeakKbps;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setVideoEncPolicy(String videoEncPolicy) {
            this.videoEncPolicy = videoEncPolicy;
            return this;
        }
        public String getVideoEncPolicy() {
            return this.videoEncPolicy;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkAntiCam(String watermarkAntiCam) {
            this.watermarkAntiCam = watermarkAntiCam;
            return this;
        }
        public String getWatermarkAntiCam() {
            return this.watermarkAntiCam;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkPower(String watermarkPower) {
            this.watermarkPower = watermarkPower;
            return this;
        }
        public String getWatermarkPower() {
            return this.watermarkPower;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWatermarkShadow(String watermarkShadow) {
            this.watermarkShadow = watermarkShadow;
            return this;
        }
        public String getWatermarkShadow() {
            return this.watermarkShadow;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWuyingKeeper(String wuyingKeeper) {
            this.wuyingKeeper = wuyingKeeper;
            return this;
        }
        public String getWuyingKeeper() {
            return this.wuyingKeeper;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setWyAssistant(String wyAssistant) {
            this.wyAssistant = wyAssistant;
            return this;
        }
        public String getWyAssistant() {
            return this.wyAssistant;
        }

    }

}
