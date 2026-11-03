// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePolicyGroupsResponseBody extends TeaModel {
    /**
     * <p>The count.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The details of the cloud computer policies.</p>
     */
    @NameInMap("DescribePolicyGroups")
    public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroups> describePolicyGroups;

    /**
     * <p>The token for the next query. An empty NextToken indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the current page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries per page in a paging query.
     * Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsAppScreenshotBuckets extends TeaModel {
        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-bucket</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The region where the user\&quot;s OSS bucket is located. It must match the actual region of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("BucketRegionId")
        public String bucketRegionId;

        public static DescribePolicyGroupsResponseBodyDescribePolicyGroupsAppScreenshotBuckets build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyGroupsResponseBodyDescribePolicyGroupsAppScreenshotBuckets self = new DescribePolicyGroupsResponseBodyDescribePolicyGroupsAppScreenshotBuckets();
            return TeaModel.build(map, self);
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsAppScreenshotBuckets setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroupsAppScreenshotBuckets setBucketRegionId(String bucketRegionId) {
            this.bucketRegionId = bucketRegionId;
            return this;
        }
        public String getBucketRegionId() {
            return this.bucketRegionId;
        }

    }

    public static class DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules extends TeaModel {
        /**
         * <p>The client access IP address CIDR block. The value must be an IPv4 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the client access IP address CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>Corporate office network</p>
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
         * <p>The target of the security group control rule. The value must be an IPv4 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the security group control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow access to the internal R&amp;D environment</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The protocol type of the security group control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization policy of the security group control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range of the security group control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the security group control rule. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The direction of the security group control rule.</p>
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
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>Specifies whether to allow a specific type of client to connect to the cloud computer.</p>
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
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The redirection type. Valid values:</p>
         * <ul>
         * <li>usbRedirect: USB redirection.</li>
         * <li>deviceRedirect: Device redirection.</li>
         * <li>off: Disabled.</li>
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
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0x55b1</p>
         */
        @NameInMap("DevicePid")
        public String devicePid;

        /**
         * <p>The peripheral type.</p>
         * 
         * <strong>example:</strong>
         * <p>storage</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The vendor ID. For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>.</p>
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

        /**
         * <p>The platform types to which the device rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("Platforms")
        public String platforms;

        /**
         * <p>The redirection type.</p>
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
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test rule</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>*.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The resolution policy.</p>
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
         * <p>The policy content.</p>
         * 
         * <strong>example:</strong>
         * <p>*.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The policy type.</p>
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
         * <p>The event level.</p>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>StartApplication</p>
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
         * <p>Test rule</p>
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
         * <p>The device subclass. This parameter is required when <code>usbRuleType</code> is set to 1. For more information, see <a href="https://www.usb.org/defined-class-codes">Defined Class Codes</a>.</p>
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
         * <p>The USB redirection type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRedirectType")
        public Long usbRedirectType;

        /**
         * <p>The type of the USB redirection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsbRuleType")
        public Long usbRuleType;

        /**
         * <p>The vendor ID. For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>.</p>
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
        /**
         * <p>Specifies whether to enable the academic proxy feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AcademicProxy")
        public String academicProxy;

        /**
         * <p>Specifies whether users have administrator permissions after connecting to a cloud computer.</p>
         * <blockquote>
         * <p>This feature is in closed beta and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("AdminAccess")
        public String adminAccess;

        /**
         * <p>Specifies whether to enable administrator keyboard control in full-screen mode. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AdminKeyboardOnFullScreen")
        public String adminKeyboardOnFullScreen;

        /**
         * <p>Specifies whether to enable administrator keyboard control in Windows. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AdminKeyboardOnWindows")
        public String adminKeyboardOnWindows;

        /**
         * <p>Specifies whether to enable the screen capture prevention feature.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AppContentProtection")
        public String appContentProtection;

        /**
         * <p>The list of custom Object Storage Service (OSS) buckets for mobile screenshots with screen capture prevention.</p>
         */
        @NameInMap("AppScreenshotBuckets")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAppScreenshotBuckets> appScreenshotBuckets;

        /**
         * <p>The list of client IP address whitelists. Only IP addresses in the whitelisted CIDR blocks can access the cloud computer.</p>
         */
        @NameInMap("AuthorizeAccessPolicyRules")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        /**
         * <p>The list of security group control rules.</p>
         */
        @NameInMap("AuthorizeSecurityPolicyRules")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules;

        /**
         * <p>The client auto-reconnect configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AutoReconnect")
        public String autoReconnect;

        /**
         * <p>Specifies whether to automatically save mobile screenshots. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AutoSaveAppScreenshot")
        public String autoSaveAppScreenshot;

        /**
         * <p>Specifies whether to enable local camera redirection.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CameraRedirect")
        public String cameraRedirect;

        /**
         * <p>Specifies whether to display the client control menu. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("ClientControlMenu")
        public String clientControlMenu;

        /**
         * <p>Specifies whether to enable the feature that allows clients to create custom snapshots. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientCreateSnapshot")
        public String clientCreateSnapshot;

        /**
         * <p>Specifies whether to display the hibernate option in the client menu. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientHibernate")
        public String clientHibernate;

        /**
         * <p>Specifies whether to display the restart option in the client menu. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientRestart")
        public String clientRestart;

        /**
         * <p>Specifies whether to display the shutdown option in the client menu. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ClientShutdown")
        public String clientShutdown;

        /**
         * <p>The list of logon method control rules. This parameter specifies which clients can be used to access the cloud computer.</p>
         */
        @NameInMap("ClientTypes")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsClientTypes> clientTypes;

        /**
         * <p>The clipboard permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        /**
         * <p>Specifies whether color enhancement is enabled for design and 3D common scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ColorEnhancement")
        public String colorEnhancement;

        /**
         * <p>Specifies whether to enable the local drive clipboard feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("CpdDriveClipboard")
        public String cpdDriveClipboard;

        /**
         * <p>The CPU downclocking duration. Valid values: 30 to 120. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("CpuDownGradeDuration")
        public Integer cpuDownGradeDuration;

        /**
         * <p>Specifies whether to enable CPU load protection. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("CpuOverload")
        public String cpuOverload;

        /**
         * <p>The whitelist of processes that are not restricted by the CPU usage limit.</p>
         */
        @NameInMap("CpuProcessors")
        public java.util.List<String> cpuProcessors;

        /**
         * <p>Specifies whether to enable CPU protection mode.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CpuProtectedMode")
        public String cpuProtectedMode;

        /**
         * <p>The overall CPU usage percentage. Valid values: 70 to 90.</p>
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
         * <p>The single-core CPU usage percentage. Valid values: 70 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("CpuSingleRateLimit")
        public Integer cpuSingleRateLimit;

        /**
         * <p>The description of the NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>newDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of cloud computers associated with the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopCount")
        public Integer desktopCount;

        /**
         * <p>The number of cloud computer pools associated with the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopGroupCount")
        public Integer desktopGroupCount;

        /**
         * <p>The peripheral connection prompt settings.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("DeviceConnectHint")
        public String deviceConnectHint;

        /**
         * <p>The list of device redirection rules.</p>
         */
        @NameInMap("DeviceRedirects")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRedirects> deviceRedirects;

        /**
         * <p>The list of custom peripheral rules.</p>
         */
        @NameInMap("DeviceRules")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDeviceRules> deviceRules;

        /**
         * <p>The disk overload protection switch. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("DiskOverload")
        public String diskOverload;

        /**
         * <p>The display mode.</p>
         * 
         * <strong>example:</strong>
         * <p>adminCustom</p>
         */
        @NameInMap("DisplayMode")
        public String displayMode;

        /**
         * <p>The access control for domain names. Domain names support wildcards (\*). Separate multiple domain names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("DomainList")
        public String domainList;

        /**
         * <p>The list of domain name resolution policies.</p>
         */
        @NameInMap("DomainResolveRule")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsDomainResolveRule> domainResolveRule;

        /**
         * <p>The domain name resolution policy switch.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("DomainResolveRuleType")
        public String domainResolveRuleType;

        /**
         * <p>The total number of cloud computers and cloud computer pools associated with the policy. This parameter is returned only for custom policies.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EdsCount")
        public Integer edsCount;

        /**
         * <p>The switch for users to request administrator assistance.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("EndUserApplyAdminCoordinate")
        public String endUserApplyAdminCoordinate;

        /**
         * <p>The number of associated end users.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EndUserCount")
        public String endUserCount;

        /**
         * <p>The switch for stream collaboration between users.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("EndUserGroupCoordinate")
        public String endUserGroupCoordinate;

        /**
         * <p>The switch for using external storage devices. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ExternalDrive")
        public String externalDrive;

        /**
         * <p>The file migration settings.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FileMigrate")
        public String fileMigrate;

        /**
         * <p>The file transfer settings.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FileTransfer")
        public String fileTransfer;

        /**
         * <p>The service address for the file transfer feature.</p>
         * 
         * <strong>example:</strong>
         * <p>filetransfer.example.com</p>
         */
        @NameInMap("FileTransferAddress")
        public String fileTransferAddress;

        /**
         * <p>The file size limit for a single transfer to the cloud computer. This parameter must be used together with the transfer-in unit parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FileTransferInSize")
        public Integer fileTransferInSize;

        /**
         * <p>The unit for the file size limit of a single transfer to the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("FileTransferInUnit")
        public String fileTransferInUnit;

        /**
         * <p>The file size limit for a single transfer from the cloud computer. This parameter must be used together with the transfer-out unit parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FileTransferOutSize")
        public Integer fileTransferOutSize;

        /**
         * <p>The unit for the file size limit of a single transfer from the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>MB</p>
         */
        @NameInMap("FileTransferOutUnit")
        public String fileTransferOutUnit;

        /**
         * <p>The switch for the file transfer size limit. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FileTransferSizeLimit")
        public String fileTransferSizeLimit;

        /**
         * <p>The file transfer speed level.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("FileTransferSpeed")
        public String fileTransferSpeed;

        /**
         * <p>The effective location of the file transfer speed configured on the client.</p>
         * 
         * <strong>example:</strong>
         * <p>client</p>
         */
        @NameInMap("FileTransferSpeedLocation")
        public String fileTransferSpeedLocation;

        /**
         * <p>The file synchronization switch. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FolderSync")
        public String folderSync;

        /**
         * <p>Specifies whether to enable the image quality policy for cloud computers with graphics-optimized specifications. Enable this policy when high performance and user experience are required, such as in professional design scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("GpuAcceleration")
        public String gpuAcceleration;

        /**
         * <p>The switch for the floating ball configuration message prompt. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("HoverConfigMsg")
        public String hoverConfigMsg;

        /**
         * <p>The switch for the hibernate button on the floating ball. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("HoverHibernate")
        public String hoverHibernate;

        /**
         * <p>The switch for the restart button on the floating ball. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("HoverRestart")
        public String hoverRestart;

        /**
         * <p>The switch for the shutdown button on the floating ball. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("HoverShutdown")
        public String hoverShutdown;

        /**
         * <p>The web client access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Html5Access")
        public String html5Access;

        /**
         * <p>The web client file transfer policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Html5FileTransfer")
        public String html5FileTransfer;

        /**
         * <p>The network communication protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>BOTH</p>
         */
        @NameInMap("InternetCommunicationProtocol")
        public String internetCommunicationProtocol;

        /**
         * <p>Specifies whether to enable the network printer feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("InternetPrinter")
        public String internetPrinter;

        /**
         * <p>Specifies whether to enable the floating menu keyboard control. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("KeyboardControl")
        public String keyboardControl;

        /**
         * <p>The local drive mapping permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        @NameInMap("LocalDrive")
        public String localDrive;

        /**
         * <p>The maximum retry time for reconnecting a cloud desktop that is disconnected due to objective reasons. Valid values: 30 to 7200. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("MaxReconnectTime")
        public Integer maxReconnectTime;

        /**
         * <p>Specifies whether to enable the MCP service. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("McpService")
        public String mcpService;

        /**
         * <p>The memory downgrade duration for a single process. Valid values: 30 to 120. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MemoryDownGradeDuration")
        public Integer memoryDownGradeDuration;

        /**
         * <p>Specifies whether to enable memory load protection. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MemoryOverload")
        public String memoryOverload;

        /**
         * <p>The whitelist of processes that are not restricted by the memory usage limit.</p>
         */
        @NameInMap("MemoryProcessors")
        public java.util.List<String> memoryProcessors;

        /**
         * <p>Specifies whether to enable the memory protection mode.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("MemoryProtectedMode")
        public String memoryProtectedMode;

        /**
         * <p>The overall memory usage percentage. Valid values: 70 to 90.</p>
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
         * <p>The memory usage percentage for a single process. Valid values: 30 to 60.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MemorySingleRateLimit")
        public Integer memorySingleRateLimit;

        /**
         * <p>Specifies whether to provide a restart button in the floating menu of the cloud desktop when you connect to the cloud desktop from a mobile client, including Android and iOS clients.</p>
         * <blockquote>
         * <p>This feature is only applicable to mobile clients of V7.4 or later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileRestart")
        public String mobileRestart;

        /**
         * <p>Specifies whether to enable the Windows security control for mobile clients.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileSafeMenu")
        public String mobileSafeMenu;

        /**
         * <p>Specifies whether to provide a shutdown button in the floating menu of the cloud desktop when you connect to the cloud desktop from a mobile client, including Android and iOS clients.</p>
         * <blockquote>
         * <p>This feature is only applicable to mobile clients of V7.4 or later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileShutdown")
        public String mobileShutdown;

        /**
         * <p>Specifies whether to enable Wuying Keeper for mobile clients.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileWuyingKeeper")
        public String mobileWuyingKeeper;

        /**
         * <p>Specifies whether to enable Wuying Assistant for mobile clients.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileWyAssistant")
        public String mobileWyAssistant;

        /**
         * <p>Specifies whether to enable the model library feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ModelLibrary")
        public String modelLibrary;

        /**
         * <p>Specifies whether to enable the multi-screen display feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MultiScreen")
        public String multiScreen;

        /**
         * <p>The policy name of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>testPolicyGroupName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The network redirection feature.</p>
         * <blockquote>
         * <p>This feature is in targeted invitation-only beta testing and is not available to the public.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NetRedirect")
        public String netRedirect;

        /**
         * <p>The list of network redirection policies.</p>
         * <blockquote>
         * <p>This feature is in targeted invitation-only beta testing and is not available to the public.</p>
         * </blockquote>
         */
        @NameInMap("NetRedirectRule")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsNetRedirectRule> netRedirectRule;

        /**
         * <p>Specifies whether to enable the network printer feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NetworkPrinter")
        public String networkPrinter;

        /**
         * <p>The number of associated organizations.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OrganizationCount")
        public String organizationCount;

        /**
         * <p>The ID of the cloud desktop policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-gx2x1dhsmthe9****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The type of the cloud desktop policy.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("PolicyGroupType")
        public String policyGroupType;

        /**
         * <p>The status of the cloud desktop policy.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>Specifies whether to enable the port proxy feature. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("PortProxy")
        public String portProxy;

        /**
         * <p>The cloud desktop preemption policy.</p>
         * <blockquote>
         * <p>To ensure the user experience and data security of end users who are using the cloud desktop, mutual preemption among multiple users is not allowed. Therefore, this configuration defaults to <code>off</code> and cannot be modified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("PreemptLogin")
        public String preemptLogin;

        /**
         * <p>The usernames of the users who can preempt the cloud desktop.</p>
         */
        @NameInMap("PreemptLoginUsers")
        public java.util.List<String> preemptLoginUsers;

        /**
         * <p>The printer pop-up prompt. Valid values:</p>
         * <ul>
         * <li>default: Default value.</li>
         * <li>off: Disabled.</li>
         * <li>custom: Custom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("PrinterAlert")
        public String printerAlert;

        /**
         * <p>The content of the printer pop-up prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Print Content</p>
         */
        @NameInMap("PrinterAlertContent")
        public String printerAlertContent;

        /**
         * <p>The title of the printer pop-up prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Print Title</p>
         */
        @NameInMap("PrinterAlertTitle")
        public String printerAlertTitle;

        /**
         * <p>The printer redirection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("PrinterRedirection")
        public String printerRedirection;

        /**
         * <p>Specifies whether image quality enhancement is enabled for design and 3D common scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("QualityEnhancement")
        public String qualityEnhancement;

        /**
         * <p>Specifies whether to enable custom screen recording.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RecordContent")
        public String recordContent;

        /**
         * <p>The expiration time of custom screen recording files. Default value: 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RecordContentExpires")
        public Long recordContentExpires;

        /**
         * <p>The duration of screen recording after an event is detected in screen recording audit. Unit: minutes. Valid values: 10 to 60.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordEventDuration")
        public Integer recordEventDuration;

        /**
         * <p>The screen recording event file extension.</p>
         */
        @NameInMap("RecordEventFileExts")
        public java.util.List<String> recordEventFileExts;

        /**
         * <p>The list of absolute paths for file monitoring in screen recording audit.</p>
         */
        @NameInMap("RecordEventFilePaths")
        public java.util.List<String> recordEventFilePaths;

        /**
         * <p>The screen recording event level switch.</p>
         */
        @NameInMap("RecordEventLevels")
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsRecordEventLevels> recordEventLevels;

        /**
         * <p>The list of absolute paths for registry monitoring in screen recording audit.</p>
         */
        @NameInMap("RecordEventRegisters")
        public java.util.List<String> recordEventRegisters;

        /**
         * <p>Specifies whether screen recording is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        @NameInMap("Recording")
        public String recording;

        /**
         * <p>The option for recording cloud desktop audio.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RecordingAudio")
        public String recordingAudio;

        /**
         * <p>The playback duration of screen recording files. Unit: minutes. Recorded files are automatically split and uploaded to the storage space based on the specified duration. When a file reaches 300 MB, it is overwritten on a rolling basis.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordingDuration")
        public Integer recordingDuration;

        /**
         * <p>The end time of screen recording. Format: HH:MM:SS. This value is valid only when Recording is set to PERIOD.</p>
         * 
         * <strong>example:</strong>
         * <p>08:59:00</p>
         */
        @NameInMap("RecordingEndTime")
        public String recordingEndTime;

        /**
         * <p>The retention period of screen recording files. Valid values: 1 to 180 days.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("RecordingExpires")
        public Long recordingExpires;

        /**
         * <p>The frame rate of screen recording. Unit: FPS (frames per second).</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RecordingFps")
        public Long recordingFps;

        /**
         * <p>The start time of screen recording. Format: HH:MM:SS. This value is valid only when Recording is set to PERIOD.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00:00</p>
         */
        @NameInMap("RecordingStartTime")
        public String recordingStartTime;

        /**
         * <p>The screen recording notification feature on the client.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RecordingUserNotify")
        public String recordingUserNotify;

        /**
         * <p>The screen recording notification content on the client. By default, you do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Your cloud desktop is being recorded</p>
         */
        @NameInMap("RecordingUserNotifyMessage")
        public String recordingUserNotifyMessage;

        /**
         * <p>The keyboard and mouse control permissions for remote assistance.</p>
         * 
         * <strong>example:</strong>
         * <p>fullControl</p>
         */
        @NameInMap("RemoteCoordinate")
        public String remoteCoordinate;

        /**
         * <p>The cloud desktop reset configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ResetDesktop")
        public String resetDesktop;

        /**
         * <p>The DPI value of the screen resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("ResolutionDpi")
        public Integer resolutionDpi;

        /**
         * <p>The height of the resolution. Unit: pixels. Valid values for cloud applications: 500 to 50000. Valid values for cloud desktops: 480 to 4096.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

        /**
         * <p>The resolution type.</p>
         * 
         * <strong>example:</strong>
         * <p>adaptive</p>
         */
        @NameInMap("ResolutionModel")
        public String resolutionModel;

        /**
         * <p>The width of the resolution. Unit: pixels. Valid values for cloud applications: 500 to 50000. Valid values for cloud desktops: 640 to 4096.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        /**
         * <p>The number of resource groups associated with the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceGroupCount")
        public Integer resourceGroupCount;

        /**
         * <p>The region to which the cloud desktop policy belongs.</p>
         * <blockquote>
         * <p>If the policy is region-independent, this value is <code>center</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <p>The shortcut key switch for Security Center. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("SafeMenu")
        public String safeMenu;

        /**
         * <p>The effective scope of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>GLOBAL</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>Specify this parameter when <code>Scope</code> is set to <code>IP</code>. This parameter takes effect only when <code>Scope</code> is set to <code>IP</code>.</p>
         */
        @NameInMap("ScopeValue")
        public java.util.List<String> scopeValue;

        /**
         * <p>The screen display mode.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("ScreenDisplayMode")
        public String screenDisplayMode;

        /**
         * <p>Specifies whether to enable smoothness enhancement for daily office scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("SmoothEnhancement")
        public String smoothEnhancement;

        /**
         * <p>Specifies whether to provide the status monitoring feature entry in the floating ball of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("StatusMonitor")
        public String statusMonitor;

        /**
         * <p>The applicable scenario for the streaming mode.</p>
         * 
         * <strong>example:</strong>
         * <p>smooth</p>
         */
        @NameInMap("StreamingMode")
        public String streamingMode;

        /**
         * <p>The target frame rate. Valid values: 10 to 60.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TargetFps")
        public Integer targetFps;

        /**
         * <p>The triple-screen switch. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("ThreeScreen")
        public String threeScreen;

        /**
         * <p>The USB redirection setting.</p>
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

        /**
         * <p>Specifies whether to display the usage duration on the floating ball. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("UseTime")
        public String useTime;

        /**
         * <p>The average video encoding bitrate. Valid values: 1000 to 50000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("VideoEncAvgKbps")
        public Integer videoEncAvgKbps;

        /**
         * <p>The maximum quantization parameter (QP) for video encoding, which corresponds to the lowest image quality. Valid values: 0 to 51.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoEncMaxQP")
        public Integer videoEncMaxQP;

        /**
         * <p>The minimum quantization parameter (QP) for video encoding, which corresponds to the highest image quality. Valid values: 0 to 51.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoEncMinQP")
        public Integer videoEncMinQP;

        /**
         * <p>The peak video encoding bitrate. Valid values: 1000 to 50000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("VideoEncPeakKbps")
        public Integer videoEncPeakKbps;

        /**
         * <p>The video encoding policy.</p>
         * 
         * <strong>example:</strong>
         * <p>qualityFirst</p>
         */
        @NameInMap("VideoEncPolicy")
        public String videoEncPolicy;

        /**
         * <p>The multimedia redirection setting.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("VideoRedirect")
        public String videoRedirect;

        /**
         * <p>The image display quality policy.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("VisualQuality")
        public String visualQuality;

        /**
         * <p>The watermark setting.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Watermark")
        public String watermark;

        /**
         * <p>The anti-camera capture feature for blind watermarks.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("WatermarkAntiCam")
        public String watermarkAntiCam;

        /**
         * <p>The font color of the watermark. Valid values: 0 to 16777215.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WatermarkColor")
        public Integer watermarkColor;

        /**
         * <p>If the WatermarkType parameter is set to custom, you must specify the custom text by using the WatermarkCustomText parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-watermark</p>
         */
        @NameInMap("WatermarkCustomText")
        public String watermarkCustomText;

        /**
         * <p>The tilt angle of the watermark. Valid values: -10 to -30.</p>
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
         * <p>The font style of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>plain</p>
         */
        @NameInMap("WatermarkFontStyle")
        public String watermarkFontStyle;

        /**
         * <p>The blind watermark enhancement feature.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("WatermarkPower")
        public String watermarkPower;

        /**
         * <p>The number of watermark rows.</p>
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("WatermarkRowAmount")
        public Integer watermarkRowAmount;

        /**
         * <p>The security priority rule for blind watermarks.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("WatermarkSecurity")
        public String watermarkSecurity;

        /**
         * <p>Specifies whether to enable the shadow effect for the watermark. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("WatermarkShadow")
        public String watermarkShadow;

        /**
         * <p>The display depth of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>LIGHT</p>
         */
        @NameInMap("WatermarkTransparency")
        public String watermarkTransparency;

        /**
         * <p>The transparency of the watermark. A larger value indicates lower transparency. Valid values: 10 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WatermarkTransparencyValue")
        public Integer watermarkTransparencyValue;

        /**
         * <p>The watermark type.</p>
         * 
         * <strong>example:</strong>
         * <p>EndUserId</p>
         */
        @NameInMap("WatermarkType")
        public String watermarkType;

        /**
         * <p>Specifies whether to enable Wuying Keeper.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("WuyingKeeper")
        public String wuyingKeeper;

        /**
         * <p>Specifies whether to display the Wuying AI Assistant entry point in the floating ball of the cloud computer.</p>
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setAdminKeyboardOnFullScreen(String adminKeyboardOnFullScreen) {
            this.adminKeyboardOnFullScreen = adminKeyboardOnFullScreen;
            return this;
        }
        public String getAdminKeyboardOnFullScreen() {
            return this.adminKeyboardOnFullScreen;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setAdminKeyboardOnWindows(String adminKeyboardOnWindows) {
            this.adminKeyboardOnWindows = adminKeyboardOnWindows;
            return this;
        }
        public String getAdminKeyboardOnWindows() {
            return this.adminKeyboardOnWindows;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setAppContentProtection(String appContentProtection) {
            this.appContentProtection = appContentProtection;
            return this;
        }
        public String getAppContentProtection() {
            return this.appContentProtection;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setAppScreenshotBuckets(java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAppScreenshotBuckets> appScreenshotBuckets) {
            this.appScreenshotBuckets = appScreenshotBuckets;
            return this;
        }
        public java.util.List<DescribePolicyGroupsResponseBodyDescribePolicyGroupsAppScreenshotBuckets> getAppScreenshotBuckets() {
            return this.appScreenshotBuckets;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setAutoSaveAppScreenshot(String autoSaveAppScreenshot) {
            this.autoSaveAppScreenshot = autoSaveAppScreenshot;
            return this;
        }
        public String getAutoSaveAppScreenshot() {
            return this.autoSaveAppScreenshot;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setClientHibernate(String clientHibernate) {
            this.clientHibernate = clientHibernate;
            return this;
        }
        public String getClientHibernate() {
            return this.clientHibernate;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setClientRestart(String clientRestart) {
            this.clientRestart = clientRestart;
            return this;
        }
        public String getClientRestart() {
            return this.clientRestart;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setClientShutdown(String clientShutdown) {
            this.clientShutdown = clientShutdown;
            return this;
        }
        public String getClientShutdown() {
            return this.clientShutdown;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setEndUserCount(String endUserCount) {
            this.endUserCount = endUserCount;
            return this;
        }
        public String getEndUserCount() {
            return this.endUserCount;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setFileTransferInSize(Integer fileTransferInSize) {
            this.fileTransferInSize = fileTransferInSize;
            return this;
        }
        public Integer getFileTransferInSize() {
            return this.fileTransferInSize;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setFileTransferInUnit(String fileTransferInUnit) {
            this.fileTransferInUnit = fileTransferInUnit;
            return this;
        }
        public String getFileTransferInUnit() {
            return this.fileTransferInUnit;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setFileTransferOutSize(Integer fileTransferOutSize) {
            this.fileTransferOutSize = fileTransferOutSize;
            return this;
        }
        public Integer getFileTransferOutSize() {
            return this.fileTransferOutSize;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setFileTransferOutUnit(String fileTransferOutUnit) {
            this.fileTransferOutUnit = fileTransferOutUnit;
            return this;
        }
        public String getFileTransferOutUnit() {
            return this.fileTransferOutUnit;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setFileTransferSizeLimit(String fileTransferSizeLimit) {
            this.fileTransferSizeLimit = fileTransferSizeLimit;
            return this;
        }
        public String getFileTransferSizeLimit() {
            return this.fileTransferSizeLimit;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setFolderSync(String folderSync) {
            this.folderSync = folderSync;
            return this;
        }
        public String getFolderSync() {
            return this.folderSync;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setHoverHibernate(String hoverHibernate) {
            this.hoverHibernate = hoverHibernate;
            return this;
        }
        public String getHoverHibernate() {
            return this.hoverHibernate;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setHoverRestart(String hoverRestart) {
            this.hoverRestart = hoverRestart;
            return this;
        }
        public String getHoverRestart() {
            return this.hoverRestart;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setHoverShutdown(String hoverShutdown) {
            this.hoverShutdown = hoverShutdown;
            return this;
        }
        public String getHoverShutdown() {
            return this.hoverShutdown;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setKeyboardControl(String keyboardControl) {
            this.keyboardControl = keyboardControl;
            return this;
        }
        public String getKeyboardControl() {
            return this.keyboardControl;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setMcpService(String mcpService) {
            this.mcpService = mcpService;
            return this;
        }
        public String getMcpService() {
            return this.mcpService;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setNetworkPrinter(String networkPrinter) {
            this.networkPrinter = networkPrinter;
            return this;
        }
        public String getNetworkPrinter() {
            return this.networkPrinter;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setOrganizationCount(String organizationCount) {
            this.organizationCount = organizationCount;
            return this;
        }
        public String getOrganizationCount() {
            return this.organizationCount;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setPrinterAlert(String printerAlert) {
            this.printerAlert = printerAlert;
            return this;
        }
        public String getPrinterAlert() {
            return this.printerAlert;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setPrinterAlertContent(String printerAlertContent) {
            this.printerAlertContent = printerAlertContent;
            return this;
        }
        public String getPrinterAlertContent() {
            return this.printerAlertContent;
        }

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setPrinterAlertTitle(String printerAlertTitle) {
            this.printerAlertTitle = printerAlertTitle;
            return this;
        }
        public String getPrinterAlertTitle() {
            return this.printerAlertTitle;
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

        public DescribePolicyGroupsResponseBodyDescribePolicyGroups setThreeScreen(String threeScreen) {
            this.threeScreen = threeScreen;
            return this;
        }
        public String getThreeScreen() {
            return this.threeScreen;
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
