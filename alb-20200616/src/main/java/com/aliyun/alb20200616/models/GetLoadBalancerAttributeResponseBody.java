// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetLoadBalancerAttributeResponseBody extends TeaModel {
    /**
     * <p>The configuration of the access log feature.</p>
     */
    @NameInMap("AccessLogConfig")
    public GetLoadBalancerAttributeResponseBodyAccessLogConfig accessLogConfig;

    /**
     * <p>The mode in which IP addresses are allocated. Valid values:</p>
     * <ul>
     * <li><strong>Fixed</strong>: allocates a static IP address to the ALB instance.</li>
     * <li><strong>Dynamic</strong>: dynamically allocates an IP address to each zone of the ALB instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Dynamic</p>
     */
    @NameInMap("AddressAllocatedMode")
    public String addressAllocatedMode;

    /**
     * <p>The IP version. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong></li>
     * <li><strong>DualStack</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DualStack</p>
     */
    @NameInMap("AddressIpVersion")
    public String addressIpVersion;

    /**
     * <p>The network type of the ALB instance. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.</li>
     * <li><strong>Intranet</strong>: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. In this case, the ALB instance can be accessed over the virtual private cloud (VPC) where the ALB instance is deployed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the elastic IP address (EIP) bandwidth plan that is associated with the Internet-facing ALB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cbwp-bp1vevu8h3ieh****</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The time when the resource was created. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-02T02:49:05Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The domain name of the ALB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-95qnr2itwu9orb****.cn-hangzhou.alb.aliyuncs.com</p>
     */
    @NameInMap("DNSName")
    public String DNSName;

    /**
     * <p>The configuration of deletion protection.</p>
     */
    @NameInMap("DeletionProtectionConfig")
    public GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig deletionProtectionConfig;

    /**
     * <p>The type of IPv6 address that is used by the ALB instance. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.</li>
     * <li><strong>Intranet</strong>: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. Therefore, the ALB instance can be accessed over the VPC in which the ALB instance is deployed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("Ipv6AddressType")
    public String ipv6AddressType;

    /**
     * <p>The billing method of the ALB instance.</p>
     */
    @NameInMap("LoadBalancerBillingConfig")
    public GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig loadBalancerBillingConfig;

    /**
     * <p>The service status of the ALB instance. Valid values:</p>
     * <ul>
     * <li><strong>Abnormal</strong></li>
     * <li><strong>Normal</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("LoadBalancerBussinessStatus")
    public String loadBalancerBussinessStatus;

    /**
     * <p>The edition of the ALB instance. The features and billing rules vary based on the edition of the ALB instance. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong></li>
     * <li><strong>Standard</strong></li>
     * <li><strong>StandardWithWaf</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("LoadBalancerEdition")
    public String loadBalancerEdition;

    /**
     * <p>The ALB instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-o9ulmq5hgn68jk****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the ALB instance.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>alb1</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The type of the lock. Valid values:</p>
     * <ul>
     * <li><strong>SecurityLocked</strong>: The ALB instance is locked due to security reasons.</li>
     * <li><strong>RelatedResourceLocked</strong>: The ALB instance is locked due to association issues.</li>
     * <li><strong>FinancialLocked</strong>: The ALB instance is locked due to overdue payments.</li>
     * <li><strong>ResidualLocked</strong>: The ALB instance is locked because the associated resources have overdue payments and the resources are released.</li>
     * </ul>
     */
    @NameInMap("LoadBalancerOperationLocks")
    public java.util.List<GetLoadBalancerAttributeResponseBodyLoadBalancerOperationLocks> loadBalancerOperationLocks;

    /**
     * <p>The status of the ALB instance. Valid values:</p>
     * <ul>
     * <li><strong>Inactive</strong>: The ALB instance is disabled. ALB instances in the Inactive state do not forward traffic.</li>
     * <li><strong>Active</strong>: The ALB instance is running.</li>
     * <li><strong>Provisioning</strong>: The ALB instance is being created.</li>
     * <li><strong>Configuring</strong>: The ALB instance is being modified.</li>
     * <li><strong>CreateFailed</strong>: The system failed to create the ALB instance. In this case, you are not charged for the ALB instance. You can only delete the ALB instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    /**
     * <p>The configuration of the configuration read-only mode.</p>
     */
    @NameInMap("ModificationProtectionConfig")
    public GetLoadBalancerAttributeResponseBodyModificationProtectionConfig modificationProtectionConfig;

    /**
     * <p>The region ID of the ALB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The tag value.</p>
     * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetLoadBalancerAttributeResponseBodyTags> tags;

    /**
     * <p>The ID of the VPC in which the ALB instance is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1b49rqrybk45nio****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the ALB instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/189196.html">DescribeZones</a> operation to query the zones of the ALB instance.</p>
     */
    @NameInMap("ZoneMappings")
    public java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappings> zoneMappings;

    public static GetLoadBalancerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoadBalancerAttributeResponseBody self = new GetLoadBalancerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoadBalancerAttributeResponseBody setAccessLogConfig(GetLoadBalancerAttributeResponseBodyAccessLogConfig accessLogConfig) {
        this.accessLogConfig = accessLogConfig;
        return this;
    }
    public GetLoadBalancerAttributeResponseBodyAccessLogConfig getAccessLogConfig() {
        return this.accessLogConfig;
    }

    public GetLoadBalancerAttributeResponseBody setAddressAllocatedMode(String addressAllocatedMode) {
        this.addressAllocatedMode = addressAllocatedMode;
        return this;
    }
    public String getAddressAllocatedMode() {
        return this.addressAllocatedMode;
    }

    public GetLoadBalancerAttributeResponseBody setAddressIpVersion(String addressIpVersion) {
        this.addressIpVersion = addressIpVersion;
        return this;
    }
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    public GetLoadBalancerAttributeResponseBody setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public GetLoadBalancerAttributeResponseBody setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public GetLoadBalancerAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetLoadBalancerAttributeResponseBody setDNSName(String DNSName) {
        this.DNSName = DNSName;
        return this;
    }
    public String getDNSName() {
        return this.DNSName;
    }

    public GetLoadBalancerAttributeResponseBody setDeletionProtectionConfig(GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig deletionProtectionConfig) {
        this.deletionProtectionConfig = deletionProtectionConfig;
        return this;
    }
    public GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig getDeletionProtectionConfig() {
        return this.deletionProtectionConfig;
    }

    public GetLoadBalancerAttributeResponseBody setIpv6AddressType(String ipv6AddressType) {
        this.ipv6AddressType = ipv6AddressType;
        return this;
    }
    public String getIpv6AddressType() {
        return this.ipv6AddressType;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerBillingConfig(GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig loadBalancerBillingConfig) {
        this.loadBalancerBillingConfig = loadBalancerBillingConfig;
        return this;
    }
    public GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig getLoadBalancerBillingConfig() {
        return this.loadBalancerBillingConfig;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
        this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
        return this;
    }
    public String getLoadBalancerBussinessStatus() {
        return this.loadBalancerBussinessStatus;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerEdition(String loadBalancerEdition) {
        this.loadBalancerEdition = loadBalancerEdition;
        return this;
    }
    public String getLoadBalancerEdition() {
        return this.loadBalancerEdition;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerOperationLocks(java.util.List<GetLoadBalancerAttributeResponseBodyLoadBalancerOperationLocks> loadBalancerOperationLocks) {
        this.loadBalancerOperationLocks = loadBalancerOperationLocks;
        return this;
    }
    public java.util.List<GetLoadBalancerAttributeResponseBodyLoadBalancerOperationLocks> getLoadBalancerOperationLocks() {
        return this.loadBalancerOperationLocks;
    }

    public GetLoadBalancerAttributeResponseBody setLoadBalancerStatus(String loadBalancerStatus) {
        this.loadBalancerStatus = loadBalancerStatus;
        return this;
    }
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    public GetLoadBalancerAttributeResponseBody setModificationProtectionConfig(GetLoadBalancerAttributeResponseBodyModificationProtectionConfig modificationProtectionConfig) {
        this.modificationProtectionConfig = modificationProtectionConfig;
        return this;
    }
    public GetLoadBalancerAttributeResponseBodyModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
    }

    public GetLoadBalancerAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLoadBalancerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoadBalancerAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetLoadBalancerAttributeResponseBody setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public GetLoadBalancerAttributeResponseBody setTags(java.util.List<GetLoadBalancerAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetLoadBalancerAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetLoadBalancerAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetLoadBalancerAttributeResponseBody setZoneMappings(java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappings> zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static class GetLoadBalancerAttributeResponseBodyAccessLogConfig extends TeaModel {
        /**
         * <p>The Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>sls-setter</p>
         */
        @NameInMap("LogProject")
        public String logProject;

        /**
         * <p>The Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        public static GetLoadBalancerAttributeResponseBodyAccessLogConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyAccessLogConfig self = new GetLoadBalancerAttributeResponseBodyAccessLogConfig();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyAccessLogConfig setLogProject(String logProject) {
            this.logProject = logProject;
            return this;
        }
        public String getLogProject() {
            return this.logProject;
        }

        public GetLoadBalancerAttributeResponseBodyAccessLogConfig setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig extends TeaModel {
        /**
         * <p>Indicates whether the deletion protection feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The time when the deletion protection feature was enabled. The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-02T02:49:05Z</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        public static GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig self = new GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetLoadBalancerAttributeResponseBodyDeletionProtectionConfig setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig extends TeaModel {
        /**
         * <p>The billing method.</p>
         * <p>Set the value to <strong>PostPay</strong>, which indicates the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPay</p>
         */
        @NameInMap("PayType")
        public String payType;

        public static GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig self = new GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyLoadBalancerBillingConfig setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyLoadBalancerOperationLocks extends TeaModel {
        /**
         * <p>The reason why the ALB instance is locked. This parameter is valid only if <strong>LoadBalancerBussinessStatus</strong> is set to <strong>Abnormal</strong>.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The type of the lock. Valid values:</p>
         * <ul>
         * <li><strong>SecurityLocked</strong>: The ALB instance is locked due to security reasons.</li>
         * <li><strong>RelatedResourceLocked</strong>: The ALB instance is locked due to other resources that are associated with the ALB instance.</li>
         * <li><strong>FinancialLocked</strong>: The ALB instance is locked due to overdue payments.</li>
         * <li><strong>ResidualLocked</strong>: The ALB instance is locked because the associated resources have overdue payments and the resources are released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FinancialLocked</p>
         */
        @NameInMap("LockType")
        public String lockType;

        public static GetLoadBalancerAttributeResponseBodyLoadBalancerOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyLoadBalancerOperationLocks self = new GetLoadBalancerAttributeResponseBodyLoadBalancerOperationLocks();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyLoadBalancerOperationLocks setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public GetLoadBalancerAttributeResponseBodyLoadBalancerOperationLocks setLockType(String lockType) {
            this.lockType = lockType;
            return this;
        }
        public String getLockType() {
            return this.lockType;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyModificationProtectionConfig extends TeaModel {
        /**
         * <p>The reason for enabling the configuration read-only mode. The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The reason must start with a letter.</p>
         * <p>This parameter is valid only if <strong>ModificationProtectionStatus</strong> is set to <strong>ConsoleProtection</strong>.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The status of the configuration read-only mode. Valid values:</p>
         * <ul>
         * <li><strong>NonProtection</strong>: The configuration read-only mode is disabled. In this case, you cannot specify ModificationProtectionReason. If you specify ModificationProtectionReason, the value of the parameter is cleared.</li>
         * <li><strong>ConsoleProtection</strong>: The configuration read-only mode is enabled. In this case, you can specify ModificationProtectionReason.</li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to <strong>ConsoleProtection</strong>, you cannot use the ALB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetLoadBalancerAttributeResponseBodyModificationProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyModificationProtectionConfig self = new GetLoadBalancerAttributeResponseBodyModificationProtectionConfig();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyModificationProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetLoadBalancerAttributeResponseBodyModificationProtectionConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>The tag key can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetLoadBalancerAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyTags self = new GetLoadBalancerAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLoadBalancerAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses extends TeaModel {
        /**
         * <p>An IPv4 address.</p>
         * <p>This parameter takes effect when <strong>AddressIPVersion</strong> is set to <strong>IPv4</strong> or <strong>DualStack</strong>. The network type is determined by the value of <strong>AddressType</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.1</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The elastic IP address (EIP).</p>
         * 
         * <strong>example:</strong>
         * <p>eip-uf6wm****1zj9</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The type of EIP. Valid values:</p>
         * <ul>
         * <li><strong>Common</strong>: an EIP.</li>
         * <li><strong>Anycast</strong>: an Anycast EIP.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about the regions in which ALB supports Anycast EIPs, see <a href="https://help.aliyun.com/document_detail/460727.html">Limits</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("EipType")
        public String eipType;

        /**
         * <p>The private IPv4 address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.1.181</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>An IPv6 address.</p>
         * <p>This parameter takes effect only when <strong>AddressIPVersion</strong> is set to <strong>DualStack</strong>. The network type is determined by the value of <strong>Ipv6AddressType</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:XXXX:39d:eb00::/56</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        public static GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses self = new GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setEipType(String eipType) {
            this.eipType = eipType;
            return this;
        }
        public String getEipType() {
            return this.eipType;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

    }

    public static class GetLoadBalancerAttributeResponseBodyZoneMappings extends TeaModel {
        /**
         * <p>The IP address of the ALB instance.</p>
         */
        @NameInMap("LoadBalancerAddresses")
        public java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses> loadBalancerAddresses;

        /**
         * <p>The vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of an ALB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp12mw1f8k3jgy****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID of the ALB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/189196.html">DescribeZones</a> operation to query the most recent zone list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetLoadBalancerAttributeResponseBodyZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerAttributeResponseBodyZoneMappings self = new GetLoadBalancerAttributeResponseBodyZoneMappings();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappings setLoadBalancerAddresses(java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses> loadBalancerAddresses) {
            this.loadBalancerAddresses = loadBalancerAddresses;
            return this;
        }
        public java.util.List<GetLoadBalancerAttributeResponseBodyZoneMappingsLoadBalancerAddresses> getLoadBalancerAddresses() {
            return this.loadBalancerAddresses;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetLoadBalancerAttributeResponseBodyZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
