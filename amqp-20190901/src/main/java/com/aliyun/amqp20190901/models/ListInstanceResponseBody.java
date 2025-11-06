// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResponseBody self = new ListInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListInstanceResponseBody setData(ListInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstanceResponseBodyData getData() {
        return this.data;
    }

    public ListInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstanceResponseBodyDataInstancesTagsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListInstanceResponseBodyDataInstancesTagsTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyDataInstancesTagsTags self = new ListInstanceResponseBodyDataInstancesTagsTags();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyDataInstancesTagsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstanceResponseBodyDataInstancesTagsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstanceResponseBodyDataInstancesTags extends TeaModel {
        @NameInMap("tags")
        public java.util.List<ListInstanceResponseBodyDataInstancesTagsTags> tags;

        public static ListInstanceResponseBodyDataInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyDataInstancesTags self = new ListInstanceResponseBodyDataInstancesTags();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyDataInstancesTags setTags(java.util.List<ListInstanceResponseBodyDataInstancesTagsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstanceResponseBodyDataInstancesTagsTags> getTags() {
            return this.tags;
        }

    }

    public static class ListInstanceResponseBodyDataInstances extends TeaModel {
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("ClassicEndpoint")
        public String classicEndpoint;

        @NameInMap("Expire")
        public Long expire;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MaxEIPTPS")
        public Integer maxEIPTPS;

        @NameInMap("MaxQueue")
        public Integer maxQueue;

        @NameInMap("MaxTPS")
        public Integer maxTPS;

        @NameInMap("MaxVhost")
        public Integer maxVhost;

        @NameInMap("OrderCreate")
        public Long orderCreate;

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
        public ListInstanceResponseBodyDataInstancesTags tags;

        public static ListInstanceResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyDataInstances self = new ListInstanceResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyDataInstances setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public ListInstanceResponseBodyDataInstances setClassicEndpoint(String classicEndpoint) {
            this.classicEndpoint = classicEndpoint;
            return this;
        }
        public String getClassicEndpoint() {
            return this.classicEndpoint;
        }

        public ListInstanceResponseBodyDataInstances setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

        public ListInstanceResponseBodyDataInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceResponseBodyDataInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstanceResponseBodyDataInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListInstanceResponseBodyDataInstances setMaxEIPTPS(Integer maxEIPTPS) {
            this.maxEIPTPS = maxEIPTPS;
            return this;
        }
        public Integer getMaxEIPTPS() {
            return this.maxEIPTPS;
        }

        public ListInstanceResponseBodyDataInstances setMaxQueue(Integer maxQueue) {
            this.maxQueue = maxQueue;
            return this;
        }
        public Integer getMaxQueue() {
            return this.maxQueue;
        }

        public ListInstanceResponseBodyDataInstances setMaxTPS(Integer maxTPS) {
            this.maxTPS = maxTPS;
            return this;
        }
        public Integer getMaxTPS() {
            return this.maxTPS;
        }

        public ListInstanceResponseBodyDataInstances setMaxVhost(Integer maxVhost) {
            this.maxVhost = maxVhost;
            return this;
        }
        public Integer getMaxVhost() {
            return this.maxVhost;
        }

        public ListInstanceResponseBodyDataInstances setOrderCreate(Long orderCreate) {
            this.orderCreate = orderCreate;
            return this;
        }
        public Long getOrderCreate() {
            return this.orderCreate;
        }

        public ListInstanceResponseBodyDataInstances setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public ListInstanceResponseBodyDataInstances setPrivateEndpoint(String privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public String getPrivateEndpoint() {
            return this.privateEndpoint;
        }

        public ListInstanceResponseBodyDataInstances setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        public ListInstanceResponseBodyDataInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstanceResponseBodyDataInstances setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public ListInstanceResponseBodyDataInstances setSupportEIP(Boolean supportEIP) {
            this.supportEIP = supportEIP;
            return this;
        }
        public Boolean getSupportEIP() {
            return this.supportEIP;
        }

        public ListInstanceResponseBodyDataInstances setTags(ListInstanceResponseBodyDataInstancesTags tags) {
            this.tags = tags;
            return this;
        }
        public ListInstanceResponseBodyDataInstancesTags getTags() {
            return this.tags;
        }

    }

    public static class ListInstanceResponseBodyData extends TeaModel {
        @NameInMap("Instances")
        public java.util.List<ListInstanceResponseBodyDataInstances> instances;

        public static ListInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyData self = new ListInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyData setInstances(java.util.List<ListInstanceResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListInstanceResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

    }

}
