// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class InstancePreivewResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public InstancePreivewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static InstancePreivewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstancePreivewResponseBody self = new InstancePreivewResponseBody();
        return TeaModel.build(map, self);
    }

    public InstancePreivewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InstancePreivewResponseBody setData(InstancePreivewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InstancePreivewResponseBodyData getData() {
        return this.data;
    }

    public InstancePreivewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstancePreivewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstancePreivewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InstancePreivewResponseBodyDataInstancesInstancesVOTagsTagsVO extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static InstancePreivewResponseBodyDataInstancesInstancesVOTagsTagsVO build(java.util.Map<String, ?> map) throws Exception {
            InstancePreivewResponseBodyDataInstancesInstancesVOTagsTagsVO self = new InstancePreivewResponseBodyDataInstancesInstancesVOTagsTagsVO();
            return TeaModel.build(map, self);
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVOTagsTagsVO setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVOTagsTagsVO setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InstancePreivewResponseBodyDataInstancesInstancesVOTags extends TeaModel {
        @NameInMap("TagsVO")
        public java.util.List<InstancePreivewResponseBodyDataInstancesInstancesVOTagsTagsVO> tagsVO;

        public static InstancePreivewResponseBodyDataInstancesInstancesVOTags build(java.util.Map<String, ?> map) throws Exception {
            InstancePreivewResponseBodyDataInstancesInstancesVOTags self = new InstancePreivewResponseBodyDataInstancesInstancesVOTags();
            return TeaModel.build(map, self);
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVOTags setTagsVO(java.util.List<InstancePreivewResponseBodyDataInstancesInstancesVOTagsTagsVO> tagsVO) {
            this.tagsVO = tagsVO;
            return this;
        }
        public java.util.List<InstancePreivewResponseBodyDataInstancesInstancesVOTagsTagsVO> getTagsVO() {
            return this.tagsVO;
        }

    }

    public static class InstancePreivewResponseBodyDataInstancesInstancesVO extends TeaModel {
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("CeaseStatus")
        public Boolean ceaseStatus;

        @NameInMap("ClassicEndpoint")
        public String classicEndpoint;

        @NameInMap("EnableDlqTtl")
        public Boolean enableDlqTtl;

        @NameInMap("Encrypted")
        public Boolean encrypted;

        @NameInMap("Expire")
        public Long expire;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InvisibleTime")
        public Integer invisibleTime;

        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        @NameInMap("MaxBindingCount")
        public Integer maxBindingCount;

        @NameInMap("MaxConnectionChannelCount")
        public Integer maxConnectionChannelCount;

        @NameInMap("MaxConnectionCount")
        public Integer maxConnectionCount;

        @NameInMap("MaxConsumeRetryTime")
        public Integer maxConsumeRetryTime;

        @NameInMap("MaxEIPTPS")
        public Integer maxEIPTPS;

        @NameInMap("MaxExchangeCount")
        public Integer maxExchangeCount;

        @NameInMap("MaxMsgBodyByte")
        public Integer maxMsgBodyByte;

        @NameInMap("MaxMsgDelayHour")
        public Integer maxMsgDelayHour;

        @NameInMap("MaxMsgTraceTime")
        public Integer maxMsgTraceTime;

        @NameInMap("MaxQueue")
        public Integer maxQueue;

        @NameInMap("MaxQueueConsumerCount")
        public Integer maxQueueConsumerCount;

        @NameInMap("MaxRetryInterval")
        public Integer maxRetryInterval;

        @NameInMap("MaxRetryTimes")
        public Integer maxRetryTimes;

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

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ServerlessRate")
        public Double serverlessRate;

        @NameInMap("ServerlessSwitch")
        public Boolean serverlessSwitch;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageSize")
        public Integer storageSize;

        @NameInMap("SupportEIP")
        public Boolean supportEIP;

        @NameInMap("SupportMsgTrace")
        public Boolean supportMsgTrace;

        @NameInMap("SupportOpenSourceAuth")
        public Boolean supportOpenSourceAuth;

        @NameInMap("Tags")
        public InstancePreivewResponseBodyDataInstancesInstancesVOTags tags;

        @NameInMap("UsedQueue")
        public Integer usedQueue;

        @NameInMap("UsedVhost")
        public Integer usedVhost;

        @NameInMap("Version")
        public Integer version;

        public static InstancePreivewResponseBodyDataInstancesInstancesVO build(java.util.Map<String, ?> map) throws Exception {
            InstancePreivewResponseBodyDataInstancesInstancesVO self = new InstancePreivewResponseBodyDataInstancesInstancesVO();
            return TeaModel.build(map, self);
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setCeaseStatus(Boolean ceaseStatus) {
            this.ceaseStatus = ceaseStatus;
            return this;
        }
        public Boolean getCeaseStatus() {
            return this.ceaseStatus;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setClassicEndpoint(String classicEndpoint) {
            this.classicEndpoint = classicEndpoint;
            return this;
        }
        public String getClassicEndpoint() {
            return this.classicEndpoint;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setEnableDlqTtl(Boolean enableDlqTtl) {
            this.enableDlqTtl = enableDlqTtl;
            return this;
        }
        public Boolean getEnableDlqTtl() {
            return this.enableDlqTtl;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setInvisibleTime(Integer invisibleTime) {
            this.invisibleTime = invisibleTime;
            return this;
        }
        public Integer getInvisibleTime() {
            return this.invisibleTime;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxBindingCount(Integer maxBindingCount) {
            this.maxBindingCount = maxBindingCount;
            return this;
        }
        public Integer getMaxBindingCount() {
            return this.maxBindingCount;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxConnectionChannelCount(Integer maxConnectionChannelCount) {
            this.maxConnectionChannelCount = maxConnectionChannelCount;
            return this;
        }
        public Integer getMaxConnectionChannelCount() {
            return this.maxConnectionChannelCount;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxConnectionCount(Integer maxConnectionCount) {
            this.maxConnectionCount = maxConnectionCount;
            return this;
        }
        public Integer getMaxConnectionCount() {
            return this.maxConnectionCount;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxConsumeRetryTime(Integer maxConsumeRetryTime) {
            this.maxConsumeRetryTime = maxConsumeRetryTime;
            return this;
        }
        public Integer getMaxConsumeRetryTime() {
            return this.maxConsumeRetryTime;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxEIPTPS(Integer maxEIPTPS) {
            this.maxEIPTPS = maxEIPTPS;
            return this;
        }
        public Integer getMaxEIPTPS() {
            return this.maxEIPTPS;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxExchangeCount(Integer maxExchangeCount) {
            this.maxExchangeCount = maxExchangeCount;
            return this;
        }
        public Integer getMaxExchangeCount() {
            return this.maxExchangeCount;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxMsgBodyByte(Integer maxMsgBodyByte) {
            this.maxMsgBodyByte = maxMsgBodyByte;
            return this;
        }
        public Integer getMaxMsgBodyByte() {
            return this.maxMsgBodyByte;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxMsgDelayHour(Integer maxMsgDelayHour) {
            this.maxMsgDelayHour = maxMsgDelayHour;
            return this;
        }
        public Integer getMaxMsgDelayHour() {
            return this.maxMsgDelayHour;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxMsgTraceTime(Integer maxMsgTraceTime) {
            this.maxMsgTraceTime = maxMsgTraceTime;
            return this;
        }
        public Integer getMaxMsgTraceTime() {
            return this.maxMsgTraceTime;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxQueue(Integer maxQueue) {
            this.maxQueue = maxQueue;
            return this;
        }
        public Integer getMaxQueue() {
            return this.maxQueue;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxQueueConsumerCount(Integer maxQueueConsumerCount) {
            this.maxQueueConsumerCount = maxQueueConsumerCount;
            return this;
        }
        public Integer getMaxQueueConsumerCount() {
            return this.maxQueueConsumerCount;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxRetryInterval(Integer maxRetryInterval) {
            this.maxRetryInterval = maxRetryInterval;
            return this;
        }
        public Integer getMaxRetryInterval() {
            return this.maxRetryInterval;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxRetryTimes(Integer maxRetryTimes) {
            this.maxRetryTimes = maxRetryTimes;
            return this;
        }
        public Integer getMaxRetryTimes() {
            return this.maxRetryTimes;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxTPS(Integer maxTPS) {
            this.maxTPS = maxTPS;
            return this;
        }
        public Integer getMaxTPS() {
            return this.maxTPS;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setMaxVhost(Integer maxVhost) {
            this.maxVhost = maxVhost;
            return this;
        }
        public Integer getMaxVhost() {
            return this.maxVhost;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setOrderCreate(Long orderCreate) {
            this.orderCreate = orderCreate;
            return this;
        }
        public Long getOrderCreate() {
            return this.orderCreate;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setPrivateEndpoint(String privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public String getPrivateEndpoint() {
            return this.privateEndpoint;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setServerlessRate(Double serverlessRate) {
            this.serverlessRate = serverlessRate;
            return this;
        }
        public Double getServerlessRate() {
            return this.serverlessRate;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setServerlessSwitch(Boolean serverlessSwitch) {
            this.serverlessSwitch = serverlessSwitch;
            return this;
        }
        public Boolean getServerlessSwitch() {
            return this.serverlessSwitch;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setSupportEIP(Boolean supportEIP) {
            this.supportEIP = supportEIP;
            return this;
        }
        public Boolean getSupportEIP() {
            return this.supportEIP;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setSupportMsgTrace(Boolean supportMsgTrace) {
            this.supportMsgTrace = supportMsgTrace;
            return this;
        }
        public Boolean getSupportMsgTrace() {
            return this.supportMsgTrace;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setSupportOpenSourceAuth(Boolean supportOpenSourceAuth) {
            this.supportOpenSourceAuth = supportOpenSourceAuth;
            return this;
        }
        public Boolean getSupportOpenSourceAuth() {
            return this.supportOpenSourceAuth;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setTags(InstancePreivewResponseBodyDataInstancesInstancesVOTags tags) {
            this.tags = tags;
            return this;
        }
        public InstancePreivewResponseBodyDataInstancesInstancesVOTags getTags() {
            return this.tags;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setUsedQueue(Integer usedQueue) {
            this.usedQueue = usedQueue;
            return this;
        }
        public Integer getUsedQueue() {
            return this.usedQueue;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setUsedVhost(Integer usedVhost) {
            this.usedVhost = usedVhost;
            return this;
        }
        public Integer getUsedVhost() {
            return this.usedVhost;
        }

        public InstancePreivewResponseBodyDataInstancesInstancesVO setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class InstancePreivewResponseBodyDataInstances extends TeaModel {
        @NameInMap("InstancesVO")
        public java.util.List<InstancePreivewResponseBodyDataInstancesInstancesVO> instancesVO;

        public static InstancePreivewResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            InstancePreivewResponseBodyDataInstances self = new InstancePreivewResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public InstancePreivewResponseBodyDataInstances setInstancesVO(java.util.List<InstancePreivewResponseBodyDataInstancesInstancesVO> instancesVO) {
            this.instancesVO = instancesVO;
            return this;
        }
        public java.util.List<InstancePreivewResponseBodyDataInstancesInstancesVO> getInstancesVO() {
            return this.instancesVO;
        }

    }

    public static class InstancePreivewResponseBodyData extends TeaModel {
        @NameInMap("ExchangeNum")
        public Integer exchangeNum;

        @NameInMap("InstanceNum")
        public Integer instanceNum;

        @NameInMap("Instances")
        public InstancePreivewResponseBodyDataInstances instances;

        @NameInMap("QueueNum")
        public Integer queueNum;

        @NameInMap("VhostNum")
        public Integer vhostNum;

        public static InstancePreivewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InstancePreivewResponseBodyData self = new InstancePreivewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InstancePreivewResponseBodyData setExchangeNum(Integer exchangeNum) {
            this.exchangeNum = exchangeNum;
            return this;
        }
        public Integer getExchangeNum() {
            return this.exchangeNum;
        }

        public InstancePreivewResponseBodyData setInstanceNum(Integer instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        public InstancePreivewResponseBodyData setInstances(InstancePreivewResponseBodyDataInstances instances) {
            this.instances = instances;
            return this;
        }
        public InstancePreivewResponseBodyDataInstances getInstances() {
            return this.instances;
        }

        public InstancePreivewResponseBodyData setQueueNum(Integer queueNum) {
            this.queueNum = queueNum;
            return this;
        }
        public Integer getQueueNum() {
            return this.queueNum;
        }

        public InstancePreivewResponseBodyData setVhostNum(Integer vhostNum) {
            this.vhostNum = vhostNum;
            return this;
        }
        public Integer getVhostNum() {
            return this.vhostNum;
        }

    }

}
