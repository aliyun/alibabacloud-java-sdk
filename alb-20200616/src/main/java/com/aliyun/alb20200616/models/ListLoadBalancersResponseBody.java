// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListLoadBalancersResponseBody extends TeaModel {
    @NameInMap("LoadBalancers")
    public java.util.List<ListLoadBalancersResponseBodyLoadBalancers> loadBalancers;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("LogProject")
        public String logProject;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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
        @NameInMap("LockReason")
        public String lockReason;

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
        @NameInMap("Reason")
        public String reason;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AccessLogConfig")
        public ListLoadBalancersResponseBodyLoadBalancersAccessLogConfig accessLogConfig;

        @NameInMap("AddressAllocatedMode")
        public String addressAllocatedMode;

        @NameInMap("AddressIpVersion")
        public String addressIpVersion;

        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DNSName")
        public String DNSName;

        @NameInMap("DeletionProtectionConfig")
        public ListLoadBalancersResponseBodyLoadBalancersDeletionProtectionConfig deletionProtectionConfig;

        @NameInMap("Ipv6AddressType")
        public String ipv6AddressType;

        @NameInMap("LoadBalancerBillingConfig")
        public ListLoadBalancersResponseBodyLoadBalancersLoadBalancerBillingConfig loadBalancerBillingConfig;

        @NameInMap("LoadBalancerBussinessStatus")
        public String loadBalancerBussinessStatus;

        @NameInMap("LoadBalancerEdition")
        public String loadBalancerEdition;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        @NameInMap("LoadBalancerOperationLocks")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersLoadBalancerOperationLocks> loadBalancerOperationLocks;

        @NameInMap("LoadBalancerStatus")
        public String loadBalancerStatus;

        @NameInMap("ModificationProtectionConfig")
        public ListLoadBalancersResponseBodyLoadBalancersModificationProtectionConfig modificationProtectionConfig;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersTags> tags;

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
