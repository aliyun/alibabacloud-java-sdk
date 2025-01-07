// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetInstanceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>92385FD2-624A-48C9-8FB5-753F2AFA***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setData(GetInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceResponseBodyDataTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetInstanceResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyDataTags self = new GetInstanceResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenewInstance")
        public Boolean autoRenewInstance;

        /**
         * <strong>example:</strong>
         * <p>amqp-cn-st21x7kv****.not-support</p>
         */
        @NameInMap("ClassicEndpoint")
        public String classicEndpoint;

        @NameInMap("EncryptedInstance")
        public Boolean encryptedInstance;

        /**
         * <strong>example:</strong>
         * <p>1651507200000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>amqp-cn-*********</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>yunQi-instance</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxEipTps")
        public Integer maxEipTps;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxQueue")
        public Integer maxQueue;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxTps")
        public Integer maxTps;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("MaxVhost")
        public Integer maxVhost;

        /**
         * <strong>example:</strong>
         * <p>1651507200000</p>
         */
        @NameInMap("OrderCreateTime")
        public Long orderCreateTime;

        /**
         * <strong>example:</strong>
         * <p>PRE_PAID</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <strong>example:</strong>
         * <p>amqp-cn-st21x7kv****.mq-amqp.cn-hangzhou-a.aliyuncs.com</p>
         */
        @NameInMap("PrivateEndpoint")
        public String privateEndpoint;

        /**
         * <strong>example:</strong>
         * <p>xxx.cn-hangzhou.xxx.net.mq.amqp.aliyuncs.com</p>
         */
        @NameInMap("PublicEndpoint")
        public String publicEndpoint;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>SERVING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StorageSize")
        public Integer storageSize;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportEIP")
        public Boolean supportEIP;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportTracing")
        public Boolean supportTracing;

        @NameInMap("Tags")
        public java.util.List<GetInstanceResponseBodyDataTags> tags;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TracingStorageTime")
        public Integer tracingStorageTime;

        public static GetInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyData self = new GetInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyData setAutoRenewInstance(Boolean autoRenewInstance) {
            this.autoRenewInstance = autoRenewInstance;
            return this;
        }
        public Boolean getAutoRenewInstance() {
            return this.autoRenewInstance;
        }

        public GetInstanceResponseBodyData setClassicEndpoint(String classicEndpoint) {
            this.classicEndpoint = classicEndpoint;
            return this;
        }
        public String getClassicEndpoint() {
            return this.classicEndpoint;
        }

        public GetInstanceResponseBodyData setEncryptedInstance(Boolean encryptedInstance) {
            this.encryptedInstance = encryptedInstance;
            return this;
        }
        public Boolean getEncryptedInstance() {
            return this.encryptedInstance;
        }

        public GetInstanceResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetInstanceResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetInstanceResponseBodyData setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public GetInstanceResponseBodyData setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public GetInstanceResponseBodyData setMaxEipTps(Integer maxEipTps) {
            this.maxEipTps = maxEipTps;
            return this;
        }
        public Integer getMaxEipTps() {
            return this.maxEipTps;
        }

        public GetInstanceResponseBodyData setMaxQueue(Integer maxQueue) {
            this.maxQueue = maxQueue;
            return this;
        }
        public Integer getMaxQueue() {
            return this.maxQueue;
        }

        public GetInstanceResponseBodyData setMaxTps(Integer maxTps) {
            this.maxTps = maxTps;
            return this;
        }
        public Integer getMaxTps() {
            return this.maxTps;
        }

        public GetInstanceResponseBodyData setMaxVhost(Integer maxVhost) {
            this.maxVhost = maxVhost;
            return this;
        }
        public Integer getMaxVhost() {
            return this.maxVhost;
        }

        public GetInstanceResponseBodyData setOrderCreateTime(Long orderCreateTime) {
            this.orderCreateTime = orderCreateTime;
            return this;
        }
        public Long getOrderCreateTime() {
            return this.orderCreateTime;
        }

        public GetInstanceResponseBodyData setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public GetInstanceResponseBodyData setPrivateEndpoint(String privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public String getPrivateEndpoint() {
            return this.privateEndpoint;
        }

        public GetInstanceResponseBodyData setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        public GetInstanceResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceResponseBodyData setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public GetInstanceResponseBodyData setSupportEIP(Boolean supportEIP) {
            this.supportEIP = supportEIP;
            return this;
        }
        public Boolean getSupportEIP() {
            return this.supportEIP;
        }

        public GetInstanceResponseBodyData setSupportTracing(Boolean supportTracing) {
            this.supportTracing = supportTracing;
            return this;
        }
        public Boolean getSupportTracing() {
            return this.supportTracing;
        }

        public GetInstanceResponseBodyData setTags(java.util.List<GetInstanceResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public GetInstanceResponseBodyData setTracingStorageTime(Integer tracingStorageTime) {
            this.tracingStorageTime = tracingStorageTime;
            return this;
        }
        public Integer getTracingStorageTime() {
            return this.tracingStorageTime;
        }

    }

}
