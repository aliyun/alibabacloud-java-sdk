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
     * 
     * <strong>example:</strong>
     * <p>CCBB1225-C392-480E-8C7F-D09AB2CD2***</p>
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
         * 
         * <strong>example:</strong>
         * <p>region</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值。</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
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
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenewInstance")
        public Boolean autoRenewInstance;

        /**
         * <p>The endpoint that is used to access the instance over the classic network. This parameter is no longer available.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-st21x7kv****.not-support</p>
         */
        @NameInMap("ClassicEndpoint")
        public String classicEndpoint;

        /**
         * <p>The timestamp that indicates when the instance expires. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1651507200000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-st21x7kv****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-st21x7kv****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance type.</p>
         * <ul>
         * <li>PROFESSIONAL: Professional Edition</li>
         * <li>ENTERPRISE: Enterprise Edition</li>
         * <li>VIP: Enterprise Platinum Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>professional</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum number of Internet-based transactions per second (TPS) for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>24832</p>
         */
        @NameInMap("MaxEipTps")
        public Integer maxEipTps;

        /**
         * <p>The maximum number of queues on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("MaxQueue")
        public Integer maxQueue;

        /**
         * <p>The maximum number of VPC-based TPS for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("MaxTps")
        public Integer maxTps;

        /**
         * <p>The maximum number of vhosts on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("MaxVhost")
        public Integer maxVhost;

        /**
         * <p>The timestamp that indicates when the order was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1572441939000</p>
         */
        @NameInMap("OrderCreateTime")
        public Long orderCreateTime;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PrePaid: the subscription billing method.</li>
         * <li>POST_PAID: the pay-as-you-go billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRE_PAID</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The virtual private cloud (VPC) endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-st21x7kv****.mq-amqp.cn-hangzhou-a.aliyuncs.com</p>
         */
        @NameInMap("PrivateEndpoint")
        public String privateEndpoint;

        /**
         * <p>The public endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-st21x7kv****.mq-amqp.cn-hangzhou-a.aliyuncs.com</p>
         */
        @NameInMap("PublicEndpoint")
        public String publicEndpoint;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li>DEPLOYING: The instance is being deployed.</li>
         * <li>EXPIRED: The instance is expired.</li>
         * <li>SERVING: The instance is running.</li>
         * <li>RELEASED: The instance is released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SERVING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The disk size. Unit: GB.</p>
         * <blockquote>
         * <p> For Professional Edition instances and Enterprise Edition instances, this parameter is unavailable and \<em>\</em>-1\<em>\</em> is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StorageSize")
        public Integer storageSize;

        /**
         * <p>Indicates whether the instance supports elastic IP addresses (EIPs).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that marks the end of the current returned page. If this parameter is empty, all data is retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>caebacccb2be03f84eb48b699f0a****</p>
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
