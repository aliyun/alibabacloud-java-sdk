// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListInstancesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setData(ListInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstancesResponseBodyData getData() {
        return this.data;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstancesResponseBodyDataInstancesTags extends TeaModel {
        /**
         * <p>标签键。</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值。</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListInstancesResponseBodyDataInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataInstancesTags self = new ListInstancesResponseBodyDataInstancesTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseBodyDataInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseBodyDataInstances extends TeaModel {
        /**
         * <p>Indicates whether the instance is automatically renewed.</p>
         */
        @NameInMap("AutoRenewInstance")
        public Boolean autoRenewInstance;

        /**
         * <p>The endpoint that is used to access the instance over the classic network. This parameter is no longer available.</p>
         */
        @NameInMap("ClassicEndpoint")
        public String classicEndpoint;

        /**
         * <p>The timestamp that indicates when the instance expires. Unit: milliseconds.</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The instance ID</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance type.</p>
         * <br>
         * <p>*   PROFESSIONAL: Professional Edition</p>
         * <p>*   ENTERPRISE: Enterprise Edition</p>
         * <p>*   VIP: Enterprise Platinum Edition</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum number of Internet-based transactions per second (TPS) for the instance.</p>
         */
        @NameInMap("MaxEipTps")
        public Integer maxEipTps;

        /**
         * <p>The maximum number of queues on the instance.</p>
         */
        @NameInMap("MaxQueue")
        public Integer maxQueue;

        /**
         * <p>The maximum number of VPC-based TPS for the instance.</p>
         */
        @NameInMap("MaxTps")
        public Integer maxTps;

        /**
         * <p>The maximum number of vhosts on the instance.</p>
         */
        @NameInMap("MaxVhost")
        public Integer maxVhost;

        /**
         * <p>The timestamp that indicates when the order was created. Unit: milliseconds.</p>
         */
        @NameInMap("OrderCreateTime")
        public Long orderCreateTime;

        /**
         * <p>The billing method. Valid values:</p>
         * <br>
         * <p>*   PrePaid: the subscription billing method.</p>
         * <p>*   POST_PAID: the pay-as-you-go billing method.</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The virtual private cloud (VPC) endpoint of the instance.</p>
         */
        @NameInMap("PrivateEndpoint")
        public String privateEndpoint;

        /**
         * <p>The public endpoint of the instance.</p>
         */
        @NameInMap("PublicEndpoint")
        public String publicEndpoint;

        /**
         * <p>The instance status. Valid values:</p>
         * <br>
         * <p>*   DEPLOYING: The instance is being deployed.</p>
         * <p>*   EXPIRED: The instance is expired.</p>
         * <p>*   SERVING: The instance is running.</p>
         * <p>*   RELEASED: The instance is released.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The disk size. Unit: GB.</p>
         * <br>
         * <p>>  For Professional Edition instances and Enterprise Edition instances, this parameter is unavailable and \*\*-1\*\* is returned.</p>
         */
        @NameInMap("StorageSize")
        public Integer storageSize;

        /**
         * <p>Indicates whether the instance supports elastic IP addresses (EIPs).</p>
         */
        @NameInMap("SupportEIP")
        public Boolean supportEIP;

        /**
         * <p>标签列表。</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListInstancesResponseBodyDataInstancesTags> tags;

        public static ListInstancesResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyDataInstances self = new ListInstancesResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyDataInstances setAutoRenewInstance(Boolean autoRenewInstance) {
            this.autoRenewInstance = autoRenewInstance;
            return this;
        }
        public Boolean getAutoRenewInstance() {
            return this.autoRenewInstance;
        }

        public ListInstancesResponseBodyDataInstances setClassicEndpoint(String classicEndpoint) {
            this.classicEndpoint = classicEndpoint;
            return this;
        }
        public String getClassicEndpoint() {
            return this.classicEndpoint;
        }

        public ListInstancesResponseBodyDataInstances setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListInstancesResponseBodyDataInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyDataInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyDataInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListInstancesResponseBodyDataInstances setMaxEipTps(Integer maxEipTps) {
            this.maxEipTps = maxEipTps;
            return this;
        }
        public Integer getMaxEipTps() {
            return this.maxEipTps;
        }

        public ListInstancesResponseBodyDataInstances setMaxQueue(Integer maxQueue) {
            this.maxQueue = maxQueue;
            return this;
        }
        public Integer getMaxQueue() {
            return this.maxQueue;
        }

        public ListInstancesResponseBodyDataInstances setMaxTps(Integer maxTps) {
            this.maxTps = maxTps;
            return this;
        }
        public Integer getMaxTps() {
            return this.maxTps;
        }

        public ListInstancesResponseBodyDataInstances setMaxVhost(Integer maxVhost) {
            this.maxVhost = maxVhost;
            return this;
        }
        public Integer getMaxVhost() {
            return this.maxVhost;
        }

        public ListInstancesResponseBodyDataInstances setOrderCreateTime(Long orderCreateTime) {
            this.orderCreateTime = orderCreateTime;
            return this;
        }
        public Long getOrderCreateTime() {
            return this.orderCreateTime;
        }

        public ListInstancesResponseBodyDataInstances setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public ListInstancesResponseBodyDataInstances setPrivateEndpoint(String privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public String getPrivateEndpoint() {
            return this.privateEndpoint;
        }

        public ListInstancesResponseBodyDataInstances setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        public ListInstancesResponseBodyDataInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyDataInstances setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public ListInstancesResponseBodyDataInstances setSupportEIP(Boolean supportEIP) {
            this.supportEIP = supportEIP;
            return this;
        }
        public Boolean getSupportEIP() {
            return this.supportEIP;
        }

        public ListInstancesResponseBodyDataInstances setTags(java.util.List<ListInstancesResponseBodyDataInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataInstancesTags> getTags() {
            return this.tags;
        }

    }

    public static class ListInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The instances.</p>
         */
        @NameInMap("Instances")
        public java.util.List<ListInstancesResponseBodyDataInstances> instances;

        /**
         * <p>The maximum number of entries returned.</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that marks the end of the current returned page. If this parameter is empty, all data is retrieved.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyData self = new ListInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyData setInstances(java.util.List<ListInstancesResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

        public ListInstancesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListInstancesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
