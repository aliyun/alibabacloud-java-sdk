// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListLoadBalancersResponseBody extends TeaModel {
    /**
     * <p>The list of ALB instances.</p>
     */
    @NameInMap("LoadBalancers")
    public java.util.List<ListLoadBalancersResponseBodyLoadBalancers> loadBalancers;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, no next page exists.</p>
     * <p>*   If a value is returned for **NextToken**, the value is used to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         */
        @NameInMap("LogProject")
        public String logProject;

        /**
         * <p>The Logstore.</p>
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
         * <p>Indicates whether deletion protection is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The time when deletion protection is enabled.</p>
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
         * <br>
         * <p>Only **PostPay** may be returned, which indicates the pay-as-you-go billing method.</p>
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
         * <p>The reason why the ALB instance is locked. This parameter is available only when **LoadBalancerBussinessStatus** is set to **Abnormal**.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The lock type. Valid values:</p>
         * <br>
         * <p>*   **SecurityLocked**: The ALB instance is locked due to security reasons.</p>
         * <p>*   **RelatedResourceLocked**: The ALB instance is locked due to association issues.</p>
         * <p>*   **FinancialLocked**: The ALB instance is locked due to overdue payments.</p>
         * <p>*   **ResidualLocked**: The ALB instance is locked because the associated resources have overdue payments and the resources are released.</p>
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
         * <p>The reason why deletion protection is enabled.</p>
         * <br>
         * <p>It must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.</p>
         * <br>
         * <p>This parameter takes effect only when **ModificationProtectionStatus** is set to **ConsoleProtection**.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Indicates whether the configuration read-only mode is enabled for the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **NonProtection**: The configuration read-only mode is disabled. In this case, you cannot specify ModificationProtectionReason. If you specify ModificationProtectionReason, the value of the parameter is cleared.</p>
         * <p>*   **ConsoleProtection**: The configuration read-only mode is enabled. In this case, you can specify ModificationProtectionReason.</p>
         * <br>
         * <p>> If you set this parameter to **ConsoleProtection**, you cannot use the ALB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
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
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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

    public static class ListLoadBalancersResponseBodyLoadBalancers extends TeaModel {
        /**
         * <p>The configuration of the access log.</p>
         */
        @NameInMap("AccessLogConfig")
        public ListLoadBalancersResponseBodyLoadBalancersAccessLogConfig accessLogConfig;

        /**
         * <p>The mode in which IP addresses are allocated. Valid values:</p>
         * <br>
         * <p>*   **Fixed**: allocates a static IP address to the ALB instance.</p>
         * <p>*   **Dynamic**: dynamically allocates an IP address to each zone of the ALB instance.</p>
         */
        @NameInMap("AddressAllocatedMode")
        public String addressAllocatedMode;

        /**
         * <p>The IP version. Valid values:</p>
         * <br>
         * <p>*   **IPv4**</p>
         * <p>*   **DualStack**</p>
         */
        @NameInMap("AddressIpVersion")
        public String addressIpVersion;

        /**
         * <p>The type of IP address that the ALB instance uses to provide services. Valid values:</p>
         * <br>
         * <p>*   **Internet**: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.</p>
         * <p>*   **Intranet**: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. In this case, the ALB instance can be accessed over the VPC where the ALB instance is deployed.</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        /**
         * <p>The ID of the EIP bandwidth plan that is associated with the NLB instance if the NLB instance uses a public IP address.</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        /**
         * <p>The time when the resource was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The domain name of the ALB instance.</p>
         */
        @NameInMap("DNSName")
        public String DNSName;

        /**
         * <p>The configuration of deletion protection.</p>
         */
        @NameInMap("DeletionProtectionConfig")
        public ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig deletionProtectionConfig;

        /**
         * <p>The type of IPv6 address that is used by the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **Internet**: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.</p>
         * <p>*   **Intranet**: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. Therefore, the ALB instance can be accessed over the VPC in which the ALB instance is deployed.</p>
         */
        @NameInMap("Ipv6AddressType")
        public String ipv6AddressType;

        /**
         * <p>The configuration of the billing method.</p>
         */
        @NameInMap("LoadBalancerBillingConfig")
        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig loadBalancerBillingConfig;

        /**
         * <p>The business status of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **Abnormal**</p>
         * <p>*   **Normal**</p>
         */
        @NameInMap("LoadBalancerBussinessStatus")
        public String loadBalancerBussinessStatus;

        /**
         * <p>The edition of the ALB instance. Different editions have different limits and support different billing methods. Valid values:</p>
         * <br>
         * <p>*   **Basic**: basic</p>
         * <p>*   **Standard**: standard</p>
         * <p>*   **StandardWithWaf**: WAF-enabled</p>
         */
        @NameInMap("LoadBalancerEdition")
        public String loadBalancerEdition;

        /**
         * <p>The ID of the ALB instance.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The name of the NLB instance.</p>
         */
        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        /**
         * <p>The configuration of the operation lock.</p>
         */
        @NameInMap("LoadBalancerOperationLocks")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersLoadBalancerOperationLocks> loadBalancerOperationLocks;

        /**
         * <p>The status of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **Inactive**: The ALB instance is disabled. The listeners do not forward traffic.</p>
         * <p>*   **Active**: The ALB instance is running.</p>
         * <p>*   **Provisioning**: The ALB instance is being created.</p>
         * <p>*   **Configuring**: The ALB instance is being modified.</p>
         * <p>*   **CreateFailed**: The system failed to create the ALB instance.</p>
         */
        @NameInMap("LoadBalancerStatus")
        public String loadBalancerStatus;

        /**
         * <p>The configuration read-only mode.</p>
         */
        @NameInMap("ModificationProtectionConfig")
        public ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig modificationProtectionConfig;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags that are added to the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersTags> tags;

        /**
         * <p>The ID of the VPC to which the ALB instance belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

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

    }

}
