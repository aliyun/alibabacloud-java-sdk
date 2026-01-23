// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCenterPolicyListResponseBody extends TeaModel {
    /**
     * <p>The details about the cloud computer policies.</p>
     */
    @NameInMap("DescribePolicyGroups")
    public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroups> describePolicyGroups;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCenterPolicyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenterPolicyListResponseBody self = new DescribeCenterPolicyListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenterPolicyListResponseBody setDescribePolicyGroups(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroups> describePolicyGroups) {
        this.describePolicyGroups = describePolicyGroups;
        return this;
    }
    public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroups> getDescribePolicyGroups() {
        return this.describePolicyGroups;
    }

    public DescribeCenterPolicyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenterPolicyListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules extends TeaModel {
        /**
         * <p>The client CIDR block from which end users can connect to cloud computers. The value is an IPv4 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX/16</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The remarks on the client CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The authorization policy of the security group rule.</p>
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
         * 
         * <strong>example:</strong>
         * <p>inflow</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes extends TeaModel {
        /**
         * <p>The client type.</p>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>Indicates whether a specific client type can connect to cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects extends TeaModel {
        /**
         * <p>The peripheral type.</p>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The redirection type.</p>
         * 
         * <strong>example:</strong>
         * <p>usbRedirect</p>
         */
        @NameInMap("RedirectType")
        public String redirectType;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>usbRedirect</p>
         */
        @NameInMap("RedirectType")
        public String redirectType;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setDevicePid(String devicePid) {
            this.devicePid = devicePid;
            return this;
        }
        public String getDevicePid() {
            return this.devicePid;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setDeviceVid(String deviceVid) {
            this.deviceVid = deviceVid;
            return this;
        }
        public String getDeviceVid() {
            return this.deviceVid;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setOptCommand(String optCommand) {
            this.optCommand = optCommand;
            return this;
        }
        public String getOptCommand() {
            return this.optCommand;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setPlatforms(String platforms) {
            this.platforms = platforms;
            return this;
        }
        public String getPlatforms() {
            return this.platforms;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules setRedirectType(String redirectType) {
            this.redirectType = redirectType;
            return this;
        }
        public String getRedirectType() {
            return this.redirectType;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule extends TeaModel {
        /**
         * <p>The policy description.</p>
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

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>*.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The redirection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule extends TeaModel {
        /**
         * <p>The rule description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The product ID (PID).</p>
         * 
         * <strong>example:</strong>
         * <p>08**</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>Indicates whether USB redirection is allowed.</p>
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
         * <p>The vendor ID (VID). For more information, see <a href="https://www.usb.org/sites/default/files/vendor_ids032322.pdf_1.pdf">Valid USB Vendor IDs (VIDs)</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>04**</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setUsbRedirectType(Long usbRedirectType) {
            this.usbRedirectType = usbRedirectType;
            return this;
        }
        public Long getUsbRedirectType() {
            return this.usbRedirectType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setUsbRuleType(Long usbRuleType) {
            this.usbRuleType = usbRuleType;
            return this;
        }
        public Long getUsbRuleType() {
            return this.usbRuleType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

    public static class DescribeCenterPolicyListResponseBodyDescribePolicyGroups extends TeaModel {
        /**
         * <p>Indicates whether the admin permissions are granted to end users.</p>
         * <blockquote>
         * <p> This parameter is in private preview and only available to specific users.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("AdminAccess")
        public String adminAccess;

        /**
         * <p>Indicates whether anti-screenshot is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AppContentProtection")
        public String appContentProtection;

        /**
         * <p>The client IP address whitelists.</p>
         */
        @NameInMap("AuthorizeAccessPolicyRules")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        /**
         * <p>The security group rules.</p>
         */
        @NameInMap("AuthorizeSecurityPolicyRules")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules;

        /**
         * <p>Indicates whether on-premises webcam redirection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("CameraRedirect")
        public String cameraRedirect;

        @NameInMap("ClientControlMenu")
        public String clientControlMenu;

        /**
         * <p>The logon method control rules.</p>
         */
        @NameInMap("ClientTypes")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes> clientTypes;

        /**
         * <p>The read/write permissions on the clipboard.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        /**
         * <p>Indicates whether color enhancement is enabled for design and 3D applications.</p>
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

        /**
         * <p>The CPU processors.</p>
         */
        @NameInMap("CpuProcessors")
        public java.util.List<String> cpuProcessors;

        /**
         * <p>The CPU spike protection policy.</p>
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
         * <p>The number of cloud computers that are associated with the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopCount")
        public Integer desktopCount;

        /**
         * <p>The number of cloud computer shares that are associated with the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopGroupCount")
        public Integer desktopGroupCount;

        /**
         * <p>The device redirection rules.</p>
         */
        @NameInMap("DeviceRedirects")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects> deviceRedirects;

        /**
         * <p>The custom peripheral rules.</p>
         */
        @NameInMap("DeviceRules")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules> deviceRules;

        /**
         * <p>Indicates whether the session is retained after disconnection.</p>
         * <blockquote>
         * <p> This parameter applies only to cloud application policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>persistent</p>
         */
        @NameInMap("DisconnectKeepSession")
        public String disconnectKeepSession;

        /**
         * <p>The retention period of the session after disconnection. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter applies only to cloud application policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("DisconnectKeepSessionTime")
        public Integer disconnectKeepSessionTime;

        /**
         * <p>The display mode.</p>
         * 
         * <strong>example:</strong>
         * <p>adminCustom</p>
         */
        @NameInMap("DisplayMode")
        public String displayMode;

        /**
         * <p>The field where the domain resolution policy is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("DomainRegisterValue")
        public String domainRegisterValue;

        /**
         * <p>The domain resolution policies.</p>
         */
        @NameInMap("DomainResolveRule")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule> domainResolveRule;

        /**
         * <p>Indicates whether domain name resolution is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("DomainResolveRuleType")
        public String domainResolveRuleType;

        /**
         * <p>Indicates whether end users are allowed to request administrator help.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("EndUserApplyAdminCoordinate")
        public String endUserApplyAdminCoordinate;

        /**
         * <p>Indicates whether end users in the same office network can share cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("EndUserGroupCoordinate")
        public String endUserGroupCoordinate;

        @NameInMap("FileTransferAddress")
        public String fileTransferAddress;

        @NameInMap("FileTransferSpeed")
        public String fileTransferSpeed;

        @NameInMap("FileTransferSpeedLocation")
        public String fileTransferSpeedLocation;

        /**
         * <p>Indicates whether image quality control is enabled. For optimal computer performance and user experience in professional design scenarios, we recommend enabling this feature.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("GpuAcceleration")
        public String gpuAcceleration;

        @NameInMap("HoverConfigMsg")
        public String hoverConfigMsg;

        /**
         * <p>The web client access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Html5Access")
        public String html5Access;

        /**
         * <p>The file transfer feature on the web client.</p>
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
         * <p>tcp</p>
         */
        @NameInMap("InternetCommunicationProtocol")
        public String internetCommunicationProtocol;

        @NameInMap("InternetPrinter")
        public String internetPrinter;

        /**
         * <p>The read/write permissions on the on-premises drive.</p>
         * 
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        @NameInMap("LocalDrive")
        public String localDrive;

        /**
         * <p>The maximum duration to retry reconnecting to cloud computers after an unexpected disconnection (non-human causes). Valid values: 30 to 7200. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("MaxReconnectTime")
        public Integer maxReconnectTime;

        /**
         * <p>The memory underclocking duration per process. Valid values: 30 to 120. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MemoryDownGradeDuration")
        public Integer memoryDownGradeDuration;

        /**
         * <p>The memory processors.</p>
         */
        @NameInMap("MemoryProcessors")
        public java.util.List<String> memoryProcessors;

        /**
         * <p>The memory spike protection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
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
         * <p>The memory usage per process. Valid values: 30 to 60. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MemorySingleRateLimit")
        public Integer memorySingleRateLimit;

        /**
         * <p>Indicates whether the Restart button is displayed in the DesktopAssistant menu when end users connect to cloud computers from Android clients.</p>
         * <blockquote>
         * <p> This feature applies to only mobile clients of version 7.4.0 or later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileRestart")
        public String mobileRestart;

        /**
         * <p>Indicates whether the Stop button is displayed in the DesktopAssistant menu when end users connect to cloud computers from Android clients.</p>
         * <blockquote>
         * <p> This feature applies to only mobile clients of version 7.4.0 or later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MobileShutdown")
        public String mobileShutdown;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>testPolicyGroupName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The network redirection policy.</p>
         * <blockquote>
         * <p> This parameter is in private preview and only available to specific users.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NetRedirect")
        public String netRedirect;

        /**
         * <p>The network redirection policies.</p>
         * <blockquote>
         * <p> This parameter is in private preview and only available to specific users.</p>
         * </blockquote>
         */
        @NameInMap("NetRedirectRule")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule> netRedirectRule;

        /**
         * <p>Indicates whether a disconnection is enforced upon inactivity.</p>
         * <blockquote>
         * <p> This parameter applies only to cloud application policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NoOperationDisconnect")
        public String noOperationDisconnect;

        /**
         * <p>The duration of disconnection after inactivity. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter applies only to cloud application policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("NoOperationDisconnectTime")
        public Integer noOperationDisconnectTime;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-gx2x1dhsmthe9****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The type of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("PolicyGroupType")
        public String policyGroupType;

        /**
         * <p>The status of the cloud computer policy.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>The printer redirection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("PrinterRedirection")
        public String printerRedirection;

        /**
         * <p>Indicates whether image quality enhancement is enabled for design and 3D applications.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("QualityEnhancement")
        public String qualityEnhancement;

        /**
         * <p>Indicates whether custom screen recording is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RecordContent")
        public String recordContent;

        /**
         * <p>The duration for which custom screen recordings are kept before they expire. Default value: 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RecordContentExpires")
        public Long recordContentExpires;

        /**
         * <p>The duration of screen recording after the specified event is detected. Unit: minutes. Valid values: 10 to 60.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordEventDuration")
        public Integer recordEventDuration;

        /**
         * <p>The absolute paths to screen recording files.</p>
         */
        @NameInMap("RecordEventFilePaths")
        public java.util.List<String> recordEventFilePaths;

        /**
         * <p>The absolute paths to screen recording registries.</p>
         */
        @NameInMap("RecordEventRegisters")
        public java.util.List<String> recordEventRegisters;

        /**
         * <p>Indicates whether screen recording is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Recording")
        public String recording;

        /**
         * <p>Indicates whether audio files generated on cloud computers are recorded.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RecordingAudio")
        public String recordingAudio;

        /**
         * <p>The length of the screen recording file. Unit: minutes. Screen recording files are split by the specified length and uploaded to OSS buckets. Once a file reaches 300 MB, the system prioritizes rolling updates for that file.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordingDuration")
        public Integer recordingDuration;

        /**
         * <p>The end time of screen recording. The value is in the HH:MM:SS format. The value is meaningful only when you set Recording to period.</p>
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
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RecordingFps")
        public Long recordingFps;

        /**
         * <p>The start time of screen recording. The value is in the HH:MM:SS format. The value is meaningful only when you set Recording to period.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00:00</p>
         */
        @NameInMap("RecordingStartTime")
        public String recordingStartTime;

        /**
         * <p>Indicates whether to notify end users when screen recording is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RecordingUserNotify")
        public String recordingUserNotify;

        /**
         * <p>The notification sent to end users when screen recording is enabled.</p>
         */
        @NameInMap("RecordingUserNotifyMessage")
        public String recordingUserNotifyMessage;

        /**
         * <p>The keyboard and mouse control permissions during remote assistance.</p>
         * 
         * <strong>example:</strong>
         * <p>fullControl</p>
         */
        @NameInMap("RemoteCoordinate")
        public String remoteCoordinate;

        @NameInMap("ResolutionDpi")
        public Integer resolutionDpi;

        /**
         * <p>The height of the resolution. Unit: pixel.</p>
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
         * <p>The width of the resolution. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        /**
         * <p>The number of resource groups that are associated with the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceGroupCount")
        public Integer resourceGroupCount;

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
         * <p>The effective scopes specified by CIDR blocks.</p>
         */
        @NameInMap("ScopeValue")
        public java.util.List<String> scopeValue;

        @NameInMap("ScreenDisplayMode")
        public String screenDisplayMode;

        /**
         * <p>Indicates whether smoothness enhancement is enabled for daily office use.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("SmoothEnhancement")
        public String smoothEnhancement;

        /**
         * <p>Indicates whether the metric status entry is displayed in the DesktopAssistant menu.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("StatusMonitor")
        public String statusMonitor;

        /**
         * <p>The streaming mode.</p>
         * 
         * <strong>example:</strong>
         * <p>smooth</p>
         */
        @NameInMap("StreamingMode")
        public String streamingMode;

        /**
         * <p>The target frame rate. Valid values: 10 to 60. Unit: fps.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TargetFps")
        public Integer targetFps;

        /**
         * <p>Indicates whether the application taskbar is displayed.</p>
         * <blockquote>
         * <p> This parameter applies only to cloud application policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Taskbar")
        public String taskbar;

        /**
         * <p>The USB redirection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("UsbRedirect")
        public String usbRedirect;

        /**
         * <p>The USB redirection rules.</p>
         */
        @NameInMap("UsbSupplyRedirectRule")
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule> usbSupplyRedirectRule;

        @NameInMap("UseTime")
        public String useTime;

        /**
         * <p>The average bitrate for video encoding. Unit: Kbit/s. Valid values: 1000 to 50000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("VideoEncAvgKbps")
        public Integer videoEncAvgKbps;

        /**
         * <p>The maximum QP for video files. Higher QP values result in lower video quality. Valid values: 0 to 51.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoEncMaxQP")
        public Integer videoEncMaxQP;

        /**
         * <p>The minimum quantizer parameter (QP) for video files. A lower QP means better video quality. Valid values: 0 to 51.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("VideoEncMinQP")
        public Integer videoEncMinQP;

        /**
         * <p>The peak bitrate for video encoding. Unit: Kbit/s. Valid values: 1000 to 50000.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
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
         * <p>Indicates whether multimedia redirection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("VideoRedirect")
        public String videoRedirect;

        /**
         * <p>The image quality policy.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("VisualQuality")
        public String visualQuality;

        /**
         * <p>The watermark policy.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Watermark")
        public String watermark;

        /**
         * <p>Indicates whether anti-screen capture is enabled for invisible watermarks.</p>
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
         * <p>If you set <code>WatermarkType</code> to <code>custom</code>, you must also specify <code>WatermarkCustomText</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-watermark</p>
         */
        @NameInMap("WatermarkCustomText")
        public String watermarkCustomText;

        /**
         * <p>The watermark rotation. Valid values: -10 to -30.</p>
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
         * <p>The enhancement level for invisible watermarks.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("WatermarkPower")
        public String watermarkPower;

        /**
         * <p>The number of watermark rows.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("WatermarkRowAmount")
        public Integer watermarkRowAmount;

        /**
         * <p>Indicates whether security priority is enabled for invisible watermarks.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("WatermarkSecurity")
        public String watermarkSecurity;

        /**
         * <p>The watermark transparency. A higher value means the watermark is less transparent. Valid values: 10 to 100.</p>
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
         * <p>Indicates whether the Xiaoying AI Assistant entry is displayed in the DesktopAssistant menu.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("WyAssistant")
        public String wyAssistant;

        public static DescribeCenterPolicyListResponseBodyDescribePolicyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenterPolicyListResponseBodyDescribePolicyGroups self = new DescribeCenterPolicyListResponseBodyDescribePolicyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAdminAccess(String adminAccess) {
            this.adminAccess = adminAccess;
            return this;
        }
        public String getAdminAccess() {
            return this.adminAccess;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAppContentProtection(String appContentProtection) {
            this.appContentProtection = appContentProtection;
            return this;
        }
        public String getAppContentProtection() {
            return this.appContentProtection;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAuthorizeAccessPolicyRules(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules> authorizeAccessPolicyRules) {
            this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeAccessPolicyRules> getAuthorizeAccessPolicyRules() {
            return this.authorizeAccessPolicyRules;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setAuthorizeSecurityPolicyRules(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules> authorizeSecurityPolicyRules) {
            this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsAuthorizeSecurityPolicyRules> getAuthorizeSecurityPolicyRules() {
            return this.authorizeSecurityPolicyRules;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCameraRedirect(String cameraRedirect) {
            this.cameraRedirect = cameraRedirect;
            return this;
        }
        public String getCameraRedirect() {
            return this.cameraRedirect;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setClientControlMenu(String clientControlMenu) {
            this.clientControlMenu = clientControlMenu;
            return this;
        }
        public String getClientControlMenu() {
            return this.clientControlMenu;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setClientTypes(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes> clientTypes) {
            this.clientTypes = clientTypes;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsClientTypes> getClientTypes() {
            return this.clientTypes;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setColorEnhancement(String colorEnhancement) {
            this.colorEnhancement = colorEnhancement;
            return this;
        }
        public String getColorEnhancement() {
            return this.colorEnhancement;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpdDriveClipboard(String cpdDriveClipboard) {
            this.cpdDriveClipboard = cpdDriveClipboard;
            return this;
        }
        public String getCpdDriveClipboard() {
            return this.cpdDriveClipboard;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuDownGradeDuration(Integer cpuDownGradeDuration) {
            this.cpuDownGradeDuration = cpuDownGradeDuration;
            return this;
        }
        public Integer getCpuDownGradeDuration() {
            return this.cpuDownGradeDuration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuProcessors(java.util.List<String> cpuProcessors) {
            this.cpuProcessors = cpuProcessors;
            return this;
        }
        public java.util.List<String> getCpuProcessors() {
            return this.cpuProcessors;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuProtectedMode(String cpuProtectedMode) {
            this.cpuProtectedMode = cpuProtectedMode;
            return this;
        }
        public String getCpuProtectedMode() {
            return this.cpuProtectedMode;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuRateLimit(Integer cpuRateLimit) {
            this.cpuRateLimit = cpuRateLimit;
            return this;
        }
        public Integer getCpuRateLimit() {
            return this.cpuRateLimit;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuSampleDuration(Integer cpuSampleDuration) {
            this.cpuSampleDuration = cpuSampleDuration;
            return this;
        }
        public Integer getCpuSampleDuration() {
            return this.cpuSampleDuration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setCpuSingleRateLimit(Integer cpuSingleRateLimit) {
            this.cpuSingleRateLimit = cpuSingleRateLimit;
            return this;
        }
        public Integer getCpuSingleRateLimit() {
            return this.cpuSingleRateLimit;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDesktopCount(Integer desktopCount) {
            this.desktopCount = desktopCount;
            return this;
        }
        public Integer getDesktopCount() {
            return this.desktopCount;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDesktopGroupCount(Integer desktopGroupCount) {
            this.desktopGroupCount = desktopGroupCount;
            return this;
        }
        public Integer getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDeviceRedirects(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects> deviceRedirects) {
            this.deviceRedirects = deviceRedirects;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRedirects> getDeviceRedirects() {
            return this.deviceRedirects;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDeviceRules(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules> deviceRules) {
            this.deviceRules = deviceRules;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDeviceRules> getDeviceRules() {
            return this.deviceRules;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDisconnectKeepSession(String disconnectKeepSession) {
            this.disconnectKeepSession = disconnectKeepSession;
            return this;
        }
        public String getDisconnectKeepSession() {
            return this.disconnectKeepSession;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDisconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
            this.disconnectKeepSessionTime = disconnectKeepSessionTime;
            return this;
        }
        public Integer getDisconnectKeepSessionTime() {
            return this.disconnectKeepSessionTime;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDisplayMode(String displayMode) {
            this.displayMode = displayMode;
            return this;
        }
        public String getDisplayMode() {
            return this.displayMode;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDomainRegisterValue(String domainRegisterValue) {
            this.domainRegisterValue = domainRegisterValue;
            return this;
        }
        public String getDomainRegisterValue() {
            return this.domainRegisterValue;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDomainResolveRule(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule> domainResolveRule) {
            this.domainResolveRule = domainResolveRule;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsDomainResolveRule> getDomainResolveRule() {
            return this.domainResolveRule;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setDomainResolveRuleType(String domainResolveRuleType) {
            this.domainResolveRuleType = domainResolveRuleType;
            return this;
        }
        public String getDomainResolveRuleType() {
            return this.domainResolveRuleType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setEndUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
            this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
            return this;
        }
        public String getEndUserApplyAdminCoordinate() {
            return this.endUserApplyAdminCoordinate;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setEndUserGroupCoordinate(String endUserGroupCoordinate) {
            this.endUserGroupCoordinate = endUserGroupCoordinate;
            return this;
        }
        public String getEndUserGroupCoordinate() {
            return this.endUserGroupCoordinate;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFileTransferAddress(String fileTransferAddress) {
            this.fileTransferAddress = fileTransferAddress;
            return this;
        }
        public String getFileTransferAddress() {
            return this.fileTransferAddress;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFileTransferSpeed(String fileTransferSpeed) {
            this.fileTransferSpeed = fileTransferSpeed;
            return this;
        }
        public String getFileTransferSpeed() {
            return this.fileTransferSpeed;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setFileTransferSpeedLocation(String fileTransferSpeedLocation) {
            this.fileTransferSpeedLocation = fileTransferSpeedLocation;
            return this;
        }
        public String getFileTransferSpeedLocation() {
            return this.fileTransferSpeedLocation;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setGpuAcceleration(String gpuAcceleration) {
            this.gpuAcceleration = gpuAcceleration;
            return this;
        }
        public String getGpuAcceleration() {
            return this.gpuAcceleration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setHoverConfigMsg(String hoverConfigMsg) {
            this.hoverConfigMsg = hoverConfigMsg;
            return this;
        }
        public String getHoverConfigMsg() {
            return this.hoverConfigMsg;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setHtml5Access(String html5Access) {
            this.html5Access = html5Access;
            return this;
        }
        public String getHtml5Access() {
            return this.html5Access;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setHtml5FileTransfer(String html5FileTransfer) {
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }
        public String getHtml5FileTransfer() {
            return this.html5FileTransfer;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setInternetCommunicationProtocol(String internetCommunicationProtocol) {
            this.internetCommunicationProtocol = internetCommunicationProtocol;
            return this;
        }
        public String getInternetCommunicationProtocol() {
            return this.internetCommunicationProtocol;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setInternetPrinter(String internetPrinter) {
            this.internetPrinter = internetPrinter;
            return this;
        }
        public String getInternetPrinter() {
            return this.internetPrinter;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setLocalDrive(String localDrive) {
            this.localDrive = localDrive;
            return this;
        }
        public String getLocalDrive() {
            return this.localDrive;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMaxReconnectTime(Integer maxReconnectTime) {
            this.maxReconnectTime = maxReconnectTime;
            return this;
        }
        public Integer getMaxReconnectTime() {
            return this.maxReconnectTime;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemoryDownGradeDuration(Integer memoryDownGradeDuration) {
            this.memoryDownGradeDuration = memoryDownGradeDuration;
            return this;
        }
        public Integer getMemoryDownGradeDuration() {
            return this.memoryDownGradeDuration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemoryProcessors(java.util.List<String> memoryProcessors) {
            this.memoryProcessors = memoryProcessors;
            return this;
        }
        public java.util.List<String> getMemoryProcessors() {
            return this.memoryProcessors;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemoryProtectedMode(String memoryProtectedMode) {
            this.memoryProtectedMode = memoryProtectedMode;
            return this;
        }
        public String getMemoryProtectedMode() {
            return this.memoryProtectedMode;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemoryRateLimit(Integer memoryRateLimit) {
            this.memoryRateLimit = memoryRateLimit;
            return this;
        }
        public Integer getMemoryRateLimit() {
            return this.memoryRateLimit;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemorySampleDuration(Integer memorySampleDuration) {
            this.memorySampleDuration = memorySampleDuration;
            return this;
        }
        public Integer getMemorySampleDuration() {
            return this.memorySampleDuration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMemorySingleRateLimit(Integer memorySingleRateLimit) {
            this.memorySingleRateLimit = memorySingleRateLimit;
            return this;
        }
        public Integer getMemorySingleRateLimit() {
            return this.memorySingleRateLimit;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMobileRestart(String mobileRestart) {
            this.mobileRestart = mobileRestart;
            return this;
        }
        public String getMobileRestart() {
            return this.mobileRestart;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setMobileShutdown(String mobileShutdown) {
            this.mobileShutdown = mobileShutdown;
            return this;
        }
        public String getMobileShutdown() {
            return this.mobileShutdown;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setNetRedirect(String netRedirect) {
            this.netRedirect = netRedirect;
            return this;
        }
        public String getNetRedirect() {
            return this.netRedirect;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setNetRedirectRule(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule> netRedirectRule) {
            this.netRedirectRule = netRedirectRule;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsNetRedirectRule> getNetRedirectRule() {
            return this.netRedirectRule;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setNoOperationDisconnect(String noOperationDisconnect) {
            this.noOperationDisconnect = noOperationDisconnect;
            return this;
        }
        public String getNoOperationDisconnect() {
            return this.noOperationDisconnect;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setNoOperationDisconnectTime(Integer noOperationDisconnectTime) {
            this.noOperationDisconnectTime = noOperationDisconnectTime;
            return this;
        }
        public Integer getNoOperationDisconnectTime() {
            return this.noOperationDisconnectTime;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setPolicyGroupType(String policyGroupType) {
            this.policyGroupType = policyGroupType;
            return this;
        }
        public String getPolicyGroupType() {
            return this.policyGroupType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setPolicyStatus(String policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setPrinterRedirection(String printerRedirection) {
            this.printerRedirection = printerRedirection;
            return this;
        }
        public String getPrinterRedirection() {
            return this.printerRedirection;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setQualityEnhancement(String qualityEnhancement) {
            this.qualityEnhancement = qualityEnhancement;
            return this;
        }
        public String getQualityEnhancement() {
            return this.qualityEnhancement;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordContent(String recordContent) {
            this.recordContent = recordContent;
            return this;
        }
        public String getRecordContent() {
            return this.recordContent;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordContentExpires(Long recordContentExpires) {
            this.recordContentExpires = recordContentExpires;
            return this;
        }
        public Long getRecordContentExpires() {
            return this.recordContentExpires;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordEventDuration(Integer recordEventDuration) {
            this.recordEventDuration = recordEventDuration;
            return this;
        }
        public Integer getRecordEventDuration() {
            return this.recordEventDuration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordEventFilePaths(java.util.List<String> recordEventFilePaths) {
            this.recordEventFilePaths = recordEventFilePaths;
            return this;
        }
        public java.util.List<String> getRecordEventFilePaths() {
            return this.recordEventFilePaths;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordEventRegisters(java.util.List<String> recordEventRegisters) {
            this.recordEventRegisters = recordEventRegisters;
            return this;
        }
        public java.util.List<String> getRecordEventRegisters() {
            return this.recordEventRegisters;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecording(String recording) {
            this.recording = recording;
            return this;
        }
        public String getRecording() {
            return this.recording;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingAudio(String recordingAudio) {
            this.recordingAudio = recordingAudio;
            return this;
        }
        public String getRecordingAudio() {
            return this.recordingAudio;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingDuration(Integer recordingDuration) {
            this.recordingDuration = recordingDuration;
            return this;
        }
        public Integer getRecordingDuration() {
            return this.recordingDuration;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingEndTime(String recordingEndTime) {
            this.recordingEndTime = recordingEndTime;
            return this;
        }
        public String getRecordingEndTime() {
            return this.recordingEndTime;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingExpires(Long recordingExpires) {
            this.recordingExpires = recordingExpires;
            return this;
        }
        public Long getRecordingExpires() {
            return this.recordingExpires;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingFps(Long recordingFps) {
            this.recordingFps = recordingFps;
            return this;
        }
        public Long getRecordingFps() {
            return this.recordingFps;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingStartTime(String recordingStartTime) {
            this.recordingStartTime = recordingStartTime;
            return this;
        }
        public String getRecordingStartTime() {
            return this.recordingStartTime;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingUserNotify(String recordingUserNotify) {
            this.recordingUserNotify = recordingUserNotify;
            return this;
        }
        public String getRecordingUserNotify() {
            return this.recordingUserNotify;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRecordingUserNotifyMessage(String recordingUserNotifyMessage) {
            this.recordingUserNotifyMessage = recordingUserNotifyMessage;
            return this;
        }
        public String getRecordingUserNotifyMessage() {
            return this.recordingUserNotifyMessage;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setRemoteCoordinate(String remoteCoordinate) {
            this.remoteCoordinate = remoteCoordinate;
            return this;
        }
        public String getRemoteCoordinate() {
            return this.remoteCoordinate;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setResolutionDpi(Integer resolutionDpi) {
            this.resolutionDpi = resolutionDpi;
            return this;
        }
        public Integer getResolutionDpi() {
            return this.resolutionDpi;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setResolutionHeight(Integer resolutionHeight) {
            this.resolutionHeight = resolutionHeight;
            return this;
        }
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setResolutionModel(String resolutionModel) {
            this.resolutionModel = resolutionModel;
            return this;
        }
        public String getResolutionModel() {
            return this.resolutionModel;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setResolutionWidth(Integer resolutionWidth) {
            this.resolutionWidth = resolutionWidth;
            return this;
        }
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setResourceGroupCount(Integer resourceGroupCount) {
            this.resourceGroupCount = resourceGroupCount;
            return this;
        }
        public Integer getResourceGroupCount() {
            return this.resourceGroupCount;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setSafeMenu(String safeMenu) {
            this.safeMenu = safeMenu;
            return this;
        }
        public String getSafeMenu() {
            return this.safeMenu;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setScopeValue(java.util.List<String> scopeValue) {
            this.scopeValue = scopeValue;
            return this;
        }
        public java.util.List<String> getScopeValue() {
            return this.scopeValue;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setScreenDisplayMode(String screenDisplayMode) {
            this.screenDisplayMode = screenDisplayMode;
            return this;
        }
        public String getScreenDisplayMode() {
            return this.screenDisplayMode;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setSmoothEnhancement(String smoothEnhancement) {
            this.smoothEnhancement = smoothEnhancement;
            return this;
        }
        public String getSmoothEnhancement() {
            return this.smoothEnhancement;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setStatusMonitor(String statusMonitor) {
            this.statusMonitor = statusMonitor;
            return this;
        }
        public String getStatusMonitor() {
            return this.statusMonitor;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setStreamingMode(String streamingMode) {
            this.streamingMode = streamingMode;
            return this;
        }
        public String getStreamingMode() {
            return this.streamingMode;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setTargetFps(Integer targetFps) {
            this.targetFps = targetFps;
            return this;
        }
        public Integer getTargetFps() {
            return this.targetFps;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setTaskbar(String taskbar) {
            this.taskbar = taskbar;
            return this;
        }
        public String getTaskbar() {
            return this.taskbar;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setUsbRedirect(String usbRedirect) {
            this.usbRedirect = usbRedirect;
            return this;
        }
        public String getUsbRedirect() {
            return this.usbRedirect;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setUsbSupplyRedirectRule(java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule> usbSupplyRedirectRule) {
            this.usbSupplyRedirectRule = usbSupplyRedirectRule;
            return this;
        }
        public java.util.List<DescribeCenterPolicyListResponseBodyDescribePolicyGroupsUsbSupplyRedirectRule> getUsbSupplyRedirectRule() {
            return this.usbSupplyRedirectRule;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setUseTime(String useTime) {
            this.useTime = useTime;
            return this;
        }
        public String getUseTime() {
            return this.useTime;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVideoEncAvgKbps(Integer videoEncAvgKbps) {
            this.videoEncAvgKbps = videoEncAvgKbps;
            return this;
        }
        public Integer getVideoEncAvgKbps() {
            return this.videoEncAvgKbps;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVideoEncMaxQP(Integer videoEncMaxQP) {
            this.videoEncMaxQP = videoEncMaxQP;
            return this;
        }
        public Integer getVideoEncMaxQP() {
            return this.videoEncMaxQP;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVideoEncMinQP(Integer videoEncMinQP) {
            this.videoEncMinQP = videoEncMinQP;
            return this;
        }
        public Integer getVideoEncMinQP() {
            return this.videoEncMinQP;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVideoEncPeakKbps(Integer videoEncPeakKbps) {
            this.videoEncPeakKbps = videoEncPeakKbps;
            return this;
        }
        public Integer getVideoEncPeakKbps() {
            return this.videoEncPeakKbps;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVideoEncPolicy(String videoEncPolicy) {
            this.videoEncPolicy = videoEncPolicy;
            return this;
        }
        public String getVideoEncPolicy() {
            return this.videoEncPolicy;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVideoRedirect(String videoRedirect) {
            this.videoRedirect = videoRedirect;
            return this;
        }
        public String getVideoRedirect() {
            return this.videoRedirect;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setVisualQuality(String visualQuality) {
            this.visualQuality = visualQuality;
            return this;
        }
        public String getVisualQuality() {
            return this.visualQuality;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermark(String watermark) {
            this.watermark = watermark;
            return this;
        }
        public String getWatermark() {
            return this.watermark;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkAntiCam(String watermarkAntiCam) {
            this.watermarkAntiCam = watermarkAntiCam;
            return this;
        }
        public String getWatermarkAntiCam() {
            return this.watermarkAntiCam;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkColor(Integer watermarkColor) {
            this.watermarkColor = watermarkColor;
            return this;
        }
        public Integer getWatermarkColor() {
            return this.watermarkColor;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkCustomText(String watermarkCustomText) {
            this.watermarkCustomText = watermarkCustomText;
            return this;
        }
        public String getWatermarkCustomText() {
            return this.watermarkCustomText;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkDegree(Double watermarkDegree) {
            this.watermarkDegree = watermarkDegree;
            return this;
        }
        public Double getWatermarkDegree() {
            return this.watermarkDegree;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkFontSize(Integer watermarkFontSize) {
            this.watermarkFontSize = watermarkFontSize;
            return this;
        }
        public Integer getWatermarkFontSize() {
            return this.watermarkFontSize;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkFontStyle(String watermarkFontStyle) {
            this.watermarkFontStyle = watermarkFontStyle;
            return this;
        }
        public String getWatermarkFontStyle() {
            return this.watermarkFontStyle;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkPower(String watermarkPower) {
            this.watermarkPower = watermarkPower;
            return this;
        }
        public String getWatermarkPower() {
            return this.watermarkPower;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkRowAmount(Integer watermarkRowAmount) {
            this.watermarkRowAmount = watermarkRowAmount;
            return this;
        }
        public Integer getWatermarkRowAmount() {
            return this.watermarkRowAmount;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkSecurity(String watermarkSecurity) {
            this.watermarkSecurity = watermarkSecurity;
            return this;
        }
        public String getWatermarkSecurity() {
            return this.watermarkSecurity;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
            this.watermarkTransparencyValue = watermarkTransparencyValue;
            return this;
        }
        public Integer getWatermarkTransparencyValue() {
            return this.watermarkTransparencyValue;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWatermarkType(String watermarkType) {
            this.watermarkType = watermarkType;
            return this;
        }
        public String getWatermarkType() {
            return this.watermarkType;
        }

        public DescribeCenterPolicyListResponseBodyDescribePolicyGroups setWyAssistant(String wyAssistant) {
            this.wyAssistant = wyAssistant;
            return this;
        }
        public String getWyAssistant() {
            return this.wyAssistant;
        }

    }

}
