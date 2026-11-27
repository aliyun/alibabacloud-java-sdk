// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListLoadBalancersResponseBody extends TeaModel {
    /**
     * <p>The list of Application Load Balancing instances.</p>
     */
    @NameInMap("LoadBalancers")
    public java.util.List<ListLoadBalancersResponseBodyLoadBalancers> loadBalancers;

    /**
     * <p>The maximum number of entries returned per request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Indicates whether a next token is returned for subsequent queries. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no subsequent query is available.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token used to start the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancersResponseBody self = new ListLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancersResponseBody setLoadBalancers(java.util.List<ListLoadBalancersResponseBodyLoadBalancers> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public java.util.List<ListLoadBalancersResponseBodyLoadBalancers> getLoadBalancers() {
        return this.loadBalancers;
    }

    public ListLoadBalancersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLoadBalancersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLoadBalancersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLoadBalancersResponseBodyLoadBalancersAccessLogConfig extends TeaModel {
        /**
         * <p>The log project.</p>
         * 
         * <strong>example:</strong>
         * <p>sls-setter</p>
         */
        @NameInMap("LogProject")
        public String logProject;

        /**
         * <p>The log store.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        public static ListLoadBalancersResponseBodyLoadBalancersAccessLogConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersAccessLogConfig self = new ListLoadBalancersResponseBodyLoadBalancersAccessLogConfig();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersAccessLogConfig setLogProject(String logProject) {
            this.logProject = logProject;
            return this;
        }
        public String getLogProject() {
            return this.logProject;
        }

        public ListLoadBalancersResponseBodyLoadBalancersAccessLogConfig setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig extends TeaModel {
        /**
         * <p>The deletion protection status. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The time when deletion protection was enabled. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-02T02:49:05Z</p>
         */
        @NameInMap("EnabledTime")
        public String enabledTime;

        public static ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig self = new ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig extends TeaModel {
        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>PostPay</strong>: pay-as-you-go billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPay</p>
         */
        @NameInMap("PayType")
        public String payType;

        public static ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig self = new ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersLoadBalancerOperationLocks extends TeaModel {
        /**
         * <p>The reason for the lock. This parameter is valid only when <strong>LoadBalancerBussinessStatus</strong> is set to <strong>Abnormal</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Overdue payment</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The type of the lock. Valid values:</p>
         * <ul>
         * <li><p><strong>SecurityLocked</strong>: Security lock.</p>
         * </li>
         * <li><p><strong>RelatedResourceLocked</strong>: Associated resource lock.</p>
         * </li>
         * <li><p><strong>FinancialLocked</strong>: Financial lock.</p>
         * </li>
         * <li><p><strong>ResidualLocked</strong>: Residual lock.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FinancialLocked</p>
         */
        @NameInMap("LockType")
        public String lockType;

        public static ListLoadBalancersResponseBodyLoadBalancersLoadBalancerOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersLoadBalancerOperationLocks self = new ListLoadBalancersResponseBodyLoadBalancersLoadBalancerOperationLocks();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerOperationLocks setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerOperationLocks setLockType(String lockType) {
            this.lockType = lockType;
            return this;
        }
        public String getLockType() {
            return this.lockType;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig extends TeaModel {
        /**
         * <p>The reason for enabling modification protection.</p>
         * <p>The value must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * <p>This parameter is returned only when <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed Instance</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The modification protection status of the Application Load Balancing instance. Valid values:</p>
         * <ul>
         * <li><p><strong>NonProtection</strong>: Modification protection is disabled. If <strong>Reason</strong> is configured, <strong>Reason</strong> is forcibly cleared.</p>
         * </li>
         * <li><p><strong>ConsoleProtection</strong>: Console modification protection is enabled. If <strong>Reason</strong> is configured, <strong>Reason</strong> takes effect.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When this parameter is set to <strong>ConsoleProtection</strong>, modification protection is enabled. Users cannot modify the instance configuration in the load balancing console, but can invoke API operations to modify the instance configuration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig self = new ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersTags extends TeaModel {
        /**
         * <p>The tag key of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>alueTest</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListLoadBalancersResponseBodyLoadBalancersTags build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersTags self = new ListLoadBalancersResponseBodyLoadBalancersTags();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLoadBalancersResponseBodyLoadBalancersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses extends TeaModel {
        /**
         * <p>The IPv4 address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.0.61</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The allocation ID of the elastic IP address (EIP).</p>
         * 
         * <strong>example:</strong>
         * <p>eip-uf6wm****1zj9</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The type of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("EipType")
        public String eipType;

        /**
         * <p>The IPv4 private network address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.0.61</p>
         */
        @NameInMap("IntranetAddress")
        public String intranetAddress;

        /**
         * <p>The health check status of the private network IPv4 address for the Application Load Balancer instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Healthy</p>
         */
        @NameInMap("IntranetAddressHcStatus")
        public String intranetAddressHcStatus;

        /**
         * <p>The IPv6 address.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:xxxx:249:dd01:6f4:750f:xxxx:bcd9</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        /**
         * <p>The health check status of the IPv6 address for the Application Load Balancer instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Healthy</p>
         */
        @NameInMap("Ipv6AddressHcStatus")
        public String ipv6AddressHcStatus;

        public static ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses self = new ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setEipType(String eipType) {
            this.eipType = eipType;
            return this;
        }
        public String getEipType() {
            return this.eipType;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setIntranetAddressHcStatus(String intranetAddressHcStatus) {
            this.intranetAddressHcStatus = intranetAddressHcStatus;
            return this;
        }
        public String getIntranetAddressHcStatus() {
            return this.intranetAddressHcStatus;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses setIpv6AddressHcStatus(String ipv6AddressHcStatus) {
            this.ipv6AddressHcStatus = ipv6AddressHcStatus;
            return this;
        }
        public String getIpv6AddressHcStatus() {
            return this.ipv6AddressHcStatus;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersZoneMappings extends TeaModel {
        /**
         * <p>The instance addresses.</p>
         */
        @NameInMap("LoadBalancerAddresses")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses> loadBalancerAddresses;

        /**
         * <p>The status of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the vSwitch in the zone. Each zone supports only one vSwitch and one subnet.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp12mw1f8k3jgy****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID of the Application Load Balancer instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListLoadBalancersResponseBodyLoadBalancersZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersZoneMappings self = new ListLoadBalancersResponseBodyLoadBalancersZoneMappings();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappings setLoadBalancerAddresses(java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses> loadBalancerAddresses) {
            this.loadBalancerAddresses = loadBalancerAddresses;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappingsLoadBalancerAddresses> getLoadBalancerAddresses() {
            return this.loadBalancerAddresses;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappings setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListLoadBalancersResponseBodyLoadBalancersZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancers extends TeaModel {
        /**
         * <p>The access log configuration structure.</p>
         */
        @NameInMap("AccessLogConfig")
        public ListLoadBalancersResponseBodyLoadBalancersAccessLogConfig accessLogConfig;

        /**
         * <p>The address mode. Valid values:</p>
         * <ul>
         * <li><p><strong>Fixed</strong>: Fixed IP mode. Indicates that a fixed IP address is used.</p>
         * </li>
         * <li><p><strong>Dynamic</strong>: Dynamic IP mode. Indicates that an IP address is dynamically allocated to each zone.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fixed</p>
         */
        @NameInMap("AddressAllocatedMode")
        public String addressAllocatedMode;

        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li><p><strong>IPv4</strong>: IPv4.</p>
         * </li>
         * <li><p><strong>DualStack</strong>: Dual-stack.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DualStack</p>
         */
        @NameInMap("AddressIpVersion")
        public String addressIpVersion;

        /**
         * <p>The address type of the load balancing instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Internet</strong>: The load balancing instance has a public IP address. The DNS domain name is parsed to the public IP address, so it can be accessed in the public network environment.</p>
         * </li>
         * <li><p><strong>Intranet</strong>: The load balancing instance has only a private IP address. The DNS domain name is parsed to the private IP address, so it can only be accessed in the internal network environment of the VPC where the load balancing instance is deployed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        /**
         * <p>The ID of the Internet Shared Bandwidth plan associated with the Internet-facing instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-bp1vevu8h3ieh****</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        /**
         * <p>The time when the resource was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-02T02:49:05Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The DNS domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-95qnr2itwu9orb****.cn-hangzhou.alb.aliyuncs.com</p>
         */
        @NameInMap("DNSName")
        public String DNSName;

        /**
         * <p>The deletion protection configuration.</p>
         */
        @NameInMap("DeletionProtectionConfig")
        public ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig deletionProtectionConfig;

        /**
         * <p>The IPv6 network address type of the Application Load Balancing instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Internet</strong>: Internet. The load balancing instance has a public IP address. The DNS domain name is parsed to the public IP address, so it can be accessed in the public network environment.</p>
         * </li>
         * <li><p><strong>Intranet</strong>: Private network. The load balancing instance has only a private IP address. The DNS domain name is parsed to the private IP address, so it can only be accessed in the internal network environment of the VPC where the load balancing instance is deployed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        @NameInMap("Ipv6AddressType")
        public String ipv6AddressType;

        /**
         * <p>The billing configuration of the load balancing instance.</p>
         */
        @NameInMap("LoadBalancerBillingConfig")
        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig loadBalancerBillingConfig;

        /**
         * <p>The business status of the load balancing instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Abnormal</strong>: Abnormal.</p>
         * </li>
         * <li><p><strong>Normal</strong>: Normal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("LoadBalancerBussinessStatus")
        public String loadBalancerBussinessStatus;

        /**
         * <p>The edition of the load balancing instance. Different editions have different feature limits and billing policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Basic</strong>: Basic Edition.</p>
         * </li>
         * <li><p><strong>Standard</strong>: Standard Edition.</p>
         * </li>
         * <li><p><strong>StandardWithWaf</strong>: WAF-enhanced Edition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("LoadBalancerEdition")
        public String loadBalancerEdition;

        /**
         * <p>The instance ID of the Application Load Balancing instance.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-o9ulmq5hgn68jk****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the load balancing instance.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-instance-test</p>
         */
        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        /**
         * <p>The operation lock configuration of the load balancing instance.</p>
         */
        @NameInMap("LoadBalancerOperationLocks")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersLoadBalancerOperationLocks> loadBalancerOperationLocks;

        /**
         * <p>The instance status of the Application Load Balancing instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Inactive</strong>: Stopped. Indicates that the listeners of the instance no longer forward traffic.</p>
         * </li>
         * <li><p><strong>Active</strong>: Running.</p>
         * </li>
         * <li><p><strong>Provisioning</strong>: Creating.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: Upgrade/Downgrade.</p>
         * </li>
         * <li><p><strong>CreateFailed</strong>: Creation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("LoadBalancerStatus")
        public String loadBalancerStatus;

        /**
         * <p>The modification protection configuration.</p>
         */
        @NameInMap("ModificationProtectionConfig")
        public ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig modificationProtectionConfig;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The security groups to which the Application Load Balancing instance is added.</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersTags> tags;

        /**
         * <p>The ID of the virtual private cloud (VPC) where the Application Load Balancing instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1b49rqryhk45nio****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The list of zone and vSwitch mappings. A maximum of 10 zones can be returned. If the current region supports two or more zones, at least two zones are returned.</p>
         */
        @NameInMap("ZoneMappings")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappings> zoneMappings;

        public static ListLoadBalancersResponseBodyLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancers self = new ListLoadBalancersResponseBodyLoadBalancers();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancers setAccessLogConfig(ListLoadBalancersResponseBodyLoadBalancersAccessLogConfig accessLogConfig) {
            this.accessLogConfig = accessLogConfig;
            return this;
        }
        public ListLoadBalancersResponseBodyLoadBalancersAccessLogConfig getAccessLogConfig() {
            return this.accessLogConfig;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setAddressAllocatedMode(String addressAllocatedMode) {
            this.addressAllocatedMode = addressAllocatedMode;
            return this;
        }
        public String getAddressAllocatedMode() {
            return this.addressAllocatedMode;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setAddressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        public String getAddressIpVersion() {
            return this.addressIpVersion;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setDNSName(String DNSName) {
            this.DNSName = DNSName;
            return this;
        }
        public String getDNSName() {
            return this.DNSName;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setDeletionProtectionConfig(ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig deletionProtectionConfig) {
            this.deletionProtectionConfig = deletionProtectionConfig;
            return this;
        }
        public ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig getDeletionProtectionConfig() {
            return this.deletionProtectionConfig;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setIpv6AddressType(String ipv6AddressType) {
            this.ipv6AddressType = ipv6AddressType;
            return this;
        }
        public String getIpv6AddressType() {
            return this.ipv6AddressType;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerBillingConfig(ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig loadBalancerBillingConfig) {
            this.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }
        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig getLoadBalancerBillingConfig() {
            return this.loadBalancerBillingConfig;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
            this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
            return this;
        }
        public String getLoadBalancerBussinessStatus() {
            return this.loadBalancerBussinessStatus;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerEdition(String loadBalancerEdition) {
            this.loadBalancerEdition = loadBalancerEdition;
            return this;
        }
        public String getLoadBalancerEdition() {
            return this.loadBalancerEdition;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerOperationLocks(java.util.List<ListLoadBalancersResponseBodyLoadBalancersLoadBalancerOperationLocks> loadBalancerOperationLocks) {
            this.loadBalancerOperationLocks = loadBalancerOperationLocks;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersLoadBalancerOperationLocks> getLoadBalancerOperationLocks() {
            return this.loadBalancerOperationLocks;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setLoadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setModificationProtectionConfig(ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig modificationProtectionConfig) {
            this.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }
        public ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig getModificationProtectionConfig() {
            return this.modificationProtectionConfig;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setTags(java.util.List<ListLoadBalancersResponseBodyLoadBalancersTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersTags> getTags() {
            return this.tags;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setZoneMappings(java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappings> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersZoneMappings> getZoneMappings() {
            return this.zoneMappings;
        }

    }

}
