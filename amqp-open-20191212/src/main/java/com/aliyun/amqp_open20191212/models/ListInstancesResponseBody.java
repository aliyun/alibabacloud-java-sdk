// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListInstancesResponseBodyData data;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AutoRenewInstance")
        public Boolean autoRenewInstance;

        @NameInMap("ClassicEndpoint")
        public String classicEndpoint;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MaxEipTps")
        public Integer maxEipTps;

        @NameInMap("MaxQueue")
        public Integer maxQueue;

        @NameInMap("MaxTps")
        public Integer maxTps;

        @NameInMap("MaxVhost")
        public Integer maxVhost;

        @NameInMap("OrderCreateTime")
        public Long orderCreateTime;

        @NameInMap("OrderType")
        public String orderType;

        @NameInMap("PrivateEndpoint")
        public String privateEndpoint;

        @NameInMap("PublicEndpoint")
        public String publicEndpoint;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageSize")
        public Integer storageSize;

        @NameInMap("SupportEIP")
        public Boolean supportEIP;

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
        @NameInMap("Instances")
        public java.util.List<ListInstancesResponseBodyDataInstances> instances;

        @NameInMap("MaxResults")
        public Integer maxResults;

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
