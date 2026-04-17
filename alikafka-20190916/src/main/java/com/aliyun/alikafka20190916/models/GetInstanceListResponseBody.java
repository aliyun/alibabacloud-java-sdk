// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetInstanceListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The HTTP status code 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("InstanceList")
    public GetInstanceListResponseBodyInstanceList instanceList;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>4B6D821D-7F67-4CAA-9E13-A5A997C3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListResponseBody self = new GetInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetInstanceListResponseBody setInstanceList(GetInstanceListResponseBodyInstanceList instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public GetInstanceListResponseBodyInstanceList getInstanceList() {
        return this.instanceList;
    }

    public GetInstanceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlListConfluentInstanceComponentResourceVO extends TeaModel {
        @NameInMap("Cu")
        public Integer cu;

        @NameInMap("InternalId")
        public String internalId;

        @NameInMap("Replica")
        public Integer replica;

        @NameInMap("Storage")
        public Integer storage;

        @NameInMap("Type")
        public String type;

        public static GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlListConfluentInstanceComponentResourceVO build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlListConfluentInstanceComponentResourceVO self = new GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlListConfluentInstanceComponentResourceVO();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlListConfluentInstanceComponentResourceVO setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlListConfluentInstanceComponentResourceVO setInternalId(String internalId) {
            this.internalId = internalId;
            return this;
        }
        public String getInternalId() {
            return this.internalId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlListConfluentInstanceComponentResourceVO setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlListConfluentInstanceComponentResourceVO setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlListConfluentInstanceComponentResourceVO setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlList extends TeaModel {
        @NameInMap("ConfluentInstanceComponentResourceVO")
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlListConfluentInstanceComponentResourceVO> confluentInstanceComponentResourceVO;

        public static GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlList self = new GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlList();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlList setConfluentInstanceComponentResourceVO(java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlListConfluentInstanceComponentResourceVO> confluentInstanceComponentResourceVO) {
            this.confluentInstanceComponentResourceVO = confluentInstanceComponentResourceVO;
            return this;
        }
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlListConfluentInstanceComponentResourceVO> getConfluentInstanceComponentResourceVO() {
            return this.confluentInstanceComponentResourceVO;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig extends TeaModel {
        @NameInMap("ConnectCU")
        public Integer connectCU;

        @NameInMap("ConnectReplica")
        public Integer connectReplica;

        @NameInMap("ControlCenterCU")
        public Integer controlCenterCU;

        @NameInMap("ControlCenterReplica")
        public Integer controlCenterReplica;

        @NameInMap("ControlCenterStorage")
        public Integer controlCenterStorage;

        @NameInMap("KafkaCU")
        public Integer kafkaCU;

        @NameInMap("KafkaReplica")
        public Integer kafkaReplica;

        @NameInMap("KafkaRestProxyCU")
        public Integer kafkaRestProxyCU;

        @NameInMap("KafkaRestProxyReplica")
        public Integer kafkaRestProxyReplica;

        @NameInMap("KafkaStorage")
        public Integer kafkaStorage;

        @NameInMap("KsqlCU")
        public Integer ksqlCU;

        @NameInMap("KsqlList")
        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlList ksqlList;

        @NameInMap("KsqlReplica")
        public Integer ksqlReplica;

        @NameInMap("KsqlStorage")
        public Integer ksqlStorage;

        @NameInMap("SchemaRegistryCU")
        public Integer schemaRegistryCU;

        @NameInMap("SchemaRegistryReplica")
        public Integer schemaRegistryReplica;

        @NameInMap("ZooKeeperCU")
        public Integer zooKeeperCU;

        @NameInMap("ZooKeeperReplica")
        public Integer zooKeeperReplica;

        @NameInMap("ZooKeeperStorage")
        public Integer zooKeeperStorage;

        public static GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig self = new GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setConnectCU(Integer connectCU) {
            this.connectCU = connectCU;
            return this;
        }
        public Integer getConnectCU() {
            return this.connectCU;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setConnectReplica(Integer connectReplica) {
            this.connectReplica = connectReplica;
            return this;
        }
        public Integer getConnectReplica() {
            return this.connectReplica;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setControlCenterCU(Integer controlCenterCU) {
            this.controlCenterCU = controlCenterCU;
            return this;
        }
        public Integer getControlCenterCU() {
            return this.controlCenterCU;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setControlCenterReplica(Integer controlCenterReplica) {
            this.controlCenterReplica = controlCenterReplica;
            return this;
        }
        public Integer getControlCenterReplica() {
            return this.controlCenterReplica;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setControlCenterStorage(Integer controlCenterStorage) {
            this.controlCenterStorage = controlCenterStorage;
            return this;
        }
        public Integer getControlCenterStorage() {
            return this.controlCenterStorage;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setKafkaCU(Integer kafkaCU) {
            this.kafkaCU = kafkaCU;
            return this;
        }
        public Integer getKafkaCU() {
            return this.kafkaCU;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setKafkaReplica(Integer kafkaReplica) {
            this.kafkaReplica = kafkaReplica;
            return this;
        }
        public Integer getKafkaReplica() {
            return this.kafkaReplica;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setKafkaRestProxyCU(Integer kafkaRestProxyCU) {
            this.kafkaRestProxyCU = kafkaRestProxyCU;
            return this;
        }
        public Integer getKafkaRestProxyCU() {
            return this.kafkaRestProxyCU;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setKafkaRestProxyReplica(Integer kafkaRestProxyReplica) {
            this.kafkaRestProxyReplica = kafkaRestProxyReplica;
            return this;
        }
        public Integer getKafkaRestProxyReplica() {
            return this.kafkaRestProxyReplica;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setKafkaStorage(Integer kafkaStorage) {
            this.kafkaStorage = kafkaStorage;
            return this;
        }
        public Integer getKafkaStorage() {
            return this.kafkaStorage;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setKsqlCU(Integer ksqlCU) {
            this.ksqlCU = ksqlCU;
            return this;
        }
        public Integer getKsqlCU() {
            return this.ksqlCU;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setKsqlList(GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlList ksqlList) {
            this.ksqlList = ksqlList;
            return this;
        }
        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfigKsqlList getKsqlList() {
            return this.ksqlList;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setKsqlReplica(Integer ksqlReplica) {
            this.ksqlReplica = ksqlReplica;
            return this;
        }
        public Integer getKsqlReplica() {
            return this.ksqlReplica;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setKsqlStorage(Integer ksqlStorage) {
            this.ksqlStorage = ksqlStorage;
            return this;
        }
        public Integer getKsqlStorage() {
            return this.ksqlStorage;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setSchemaRegistryCU(Integer schemaRegistryCU) {
            this.schemaRegistryCU = schemaRegistryCU;
            return this;
        }
        public Integer getSchemaRegistryCU() {
            return this.schemaRegistryCU;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setSchemaRegistryReplica(Integer schemaRegistryReplica) {
            this.schemaRegistryReplica = schemaRegistryReplica;
            return this;
        }
        public Integer getSchemaRegistryReplica() {
            return this.schemaRegistryReplica;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setZooKeeperCU(Integer zooKeeperCU) {
            this.zooKeeperCU = zooKeeperCU;
            return this;
        }
        public Integer getZooKeeperCU() {
            return this.zooKeeperCU;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setZooKeeperReplica(Integer zooKeeperReplica) {
            this.zooKeeperReplica = zooKeeperReplica;
            return this;
        }
        public Integer getZooKeeperReplica() {
            return this.zooKeeperReplica;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig setZooKeeperStorage(Integer zooKeeperStorage) {
            this.zooKeeperStorage = zooKeeperStorage;
            return this;
        }
        public Integer getZooKeeperStorage() {
            return this.zooKeeperStorage;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponentsConfluentInstanceComponentVO extends TeaModel {
        @NameInMap("ComponentType")
        public String componentType;

        @NameInMap("DeployModule")
        public String deployModule;

        @NameInMap("PubEndpoint")
        public String pubEndpoint;

        @NameInMap("VpcEndpoint")
        public String vpcEndpoint;

        @NameInMap("internalId")
        public String internalId;

        public static GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponentsConfluentInstanceComponentVO build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponentsConfluentInstanceComponentVO self = new GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponentsConfluentInstanceComponentVO();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponentsConfluentInstanceComponentVO setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponentsConfluentInstanceComponentVO setDeployModule(String deployModule) {
            this.deployModule = deployModule;
            return this;
        }
        public String getDeployModule() {
            return this.deployModule;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponentsConfluentInstanceComponentVO setPubEndpoint(String pubEndpoint) {
            this.pubEndpoint = pubEndpoint;
            return this;
        }
        public String getPubEndpoint() {
            return this.pubEndpoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponentsConfluentInstanceComponentVO setVpcEndpoint(String vpcEndpoint) {
            this.vpcEndpoint = vpcEndpoint;
            return this;
        }
        public String getVpcEndpoint() {
            return this.vpcEndpoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponentsConfluentInstanceComponentVO setInternalId(String internalId) {
            this.internalId = internalId;
            return this;
        }
        public String getInternalId() {
            return this.internalId;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponents extends TeaModel {
        @NameInMap("ConfluentInstanceComponentVO")
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponentsConfluentInstanceComponentVO> confluentInstanceComponentVO;

        public static GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponents build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponents self = new GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponents();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponents setConfluentInstanceComponentVO(java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponentsConfluentInstanceComponentVO> confluentInstanceComponentVO) {
            this.confluentInstanceComponentVO = confluentInstanceComponentVO;
            return this;
        }
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponentsConfluentInstanceComponentVO> getConfluentInstanceComponentVO() {
            return this.confluentInstanceComponentVO;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO self = new GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOTags extends TeaModel {
        @NameInMap("TagVO")
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO> tagVO;

        public static GetInstanceListResponseBodyInstanceListInstanceVOTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOTags self = new GetInstanceListResponseBodyInstanceListInstanceVOTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOTags setTagVO(java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO> tagVO) {
            this.tagVO = tagVO;
            return this;
        }
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO> getTagVO() {
            return this.tagVO;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo extends TeaModel {
        @NameInMap("Current2OpenSourceVersion")
        public String current2OpenSourceVersion;

        public static GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo self = new GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo setCurrent2OpenSourceVersion(String current2OpenSourceVersion) {
            this.current2OpenSourceVersion = current2OpenSourceVersion;
            return this;
        }
        public String getCurrent2OpenSourceVersion() {
            return this.current2OpenSourceVersion;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVOVSwitchIds extends TeaModel {
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static GetInstanceListResponseBodyInstanceListInstanceVOVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVOVSwitchIds self = new GetInstanceListResponseBodyInstanceListInstanceVOVSwitchIds();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVOVSwitchIds setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class GetInstanceListResponseBodyInstanceListInstanceVO extends TeaModel {
        @NameInMap("AllConfig")
        public String allConfig;

        @NameInMap("AutoCreateGroupEnable")
        public Boolean autoCreateGroupEnable;

        @NameInMap("AutoCreateTopicEnable")
        public Boolean autoCreateTopicEnable;

        @NameInMap("BackupZoneId")
        public String backupZoneId;

        @NameInMap("ConfluentConfig")
        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig confluentConfig;

        @NameInMap("ConfluentInstanceComponents")
        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponents confluentInstanceComponents;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DefaultPartitionNum")
        public Integer defaultPartitionNum;

        @NameInMap("DeployType")
        public Integer deployType;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("DiskType")
        public Integer diskType;

        @NameInMap("DomainEndpoint")
        public String domainEndpoint;

        @NameInMap("EipMax")
        public Integer eipMax;

        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IoMax")
        public Integer ioMax;

        @NameInMap("IoMaxRead")
        public Integer ioMaxRead;

        @NameInMap("IoMaxSpec")
        public String ioMaxSpec;

        @NameInMap("IoMaxWrite")
        public Integer ioMaxWrite;

        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        @NameInMap("MsgRetain")
        public Integer msgRetain;

        @NameInMap("Name")
        public String name;

        @NameInMap("PaidType")
        public Integer paidType;

        @NameInMap("RecommendedPartitionCount")
        public Integer recommendedPartitionCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ReservedPublishCapacity")
        public Integer reservedPublishCapacity;

        @NameInMap("ReservedSubscribeCapacity")
        public Integer reservedSubscribeCapacity;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SaslDomainEndpoint")
        public String saslDomainEndpoint;

        @NameInMap("SaslEndPoint")
        public String saslEndPoint;

        @NameInMap("ScheduledRetirement")
        public Boolean scheduledRetirement;

        @NameInMap("SecurityGroup")
        public String securityGroup;

        @NameInMap("Series")
        public String series;

        @NameInMap("ServiceStatus")
        public Integer serviceStatus;

        @NameInMap("SpecType")
        public String specType;

        @NameInMap("SslDomainEndpoint")
        public String sslDomainEndpoint;

        @NameInMap("SslEndPoint")
        public String sslEndPoint;

        @NameInMap("StandardZoneId")
        public String standardZoneId;

        @NameInMap("Tags")
        public GetInstanceListResponseBodyInstanceListInstanceVOTags tags;

        @NameInMap("TopicNumLimit")
        public Integer topicNumLimit;

        @NameInMap("UpgradeServiceDetailInfo")
        public GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo upgradeServiceDetailInfo;

        @NameInMap("UsedGroupCount")
        public Integer usedGroupCount;

        @NameInMap("UsedPartitionCount")
        public Integer usedPartitionCount;

        @NameInMap("UsedTopicCount")
        public Integer usedTopicCount;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VSwitchIds")
        public GetInstanceListResponseBodyInstanceListInstanceVOVSwitchIds vSwitchIds;

        @NameInMap("ViewInstanceStatusCode")
        public Integer viewInstanceStatusCode;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcSaslDomainEndpoint")
        public String vpcSaslDomainEndpoint;

        @NameInMap("VpcSaslEndPoint")
        public String vpcSaslEndPoint;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetInstanceListResponseBodyInstanceListInstanceVO build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceListInstanceVO self = new GetInstanceListResponseBodyInstanceListInstanceVO();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setAllConfig(String allConfig) {
            this.allConfig = allConfig;
            return this;
        }
        public String getAllConfig() {
            return this.allConfig;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setAutoCreateGroupEnable(Boolean autoCreateGroupEnable) {
            this.autoCreateGroupEnable = autoCreateGroupEnable;
            return this;
        }
        public Boolean getAutoCreateGroupEnable() {
            return this.autoCreateGroupEnable;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setAutoCreateTopicEnable(Boolean autoCreateTopicEnable) {
            this.autoCreateTopicEnable = autoCreateTopicEnable;
            return this;
        }
        public Boolean getAutoCreateTopicEnable() {
            return this.autoCreateTopicEnable;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setBackupZoneId(String backupZoneId) {
            this.backupZoneId = backupZoneId;
            return this;
        }
        public String getBackupZoneId() {
            return this.backupZoneId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setConfluentConfig(GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig confluentConfig) {
            this.confluentConfig = confluentConfig;
            return this;
        }
        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig getConfluentConfig() {
            return this.confluentConfig;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setConfluentInstanceComponents(GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponents confluentInstanceComponents) {
            this.confluentInstanceComponents = confluentInstanceComponents;
            return this;
        }
        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentInstanceComponents getConfluentInstanceComponents() {
            return this.confluentInstanceComponents;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setDefaultPartitionNum(Integer defaultPartitionNum) {
            this.defaultPartitionNum = defaultPartitionNum;
            return this;
        }
        public Integer getDefaultPartitionNum() {
            return this.defaultPartitionNum;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setDeployType(Integer deployType) {
            this.deployType = deployType;
            return this;
        }
        public Integer getDeployType() {
            return this.deployType;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setDiskType(Integer diskType) {
            this.diskType = diskType;
            return this;
        }
        public Integer getDiskType() {
            return this.diskType;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setDomainEndpoint(String domainEndpoint) {
            this.domainEndpoint = domainEndpoint;
            return this;
        }
        public String getDomainEndpoint() {
            return this.domainEndpoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setEipMax(Integer eipMax) {
            this.eipMax = eipMax;
            return this;
        }
        public Integer getEipMax() {
            return this.eipMax;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setIoMax(Integer ioMax) {
            this.ioMax = ioMax;
            return this;
        }
        public Integer getIoMax() {
            return this.ioMax;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setIoMaxRead(Integer ioMaxRead) {
            this.ioMaxRead = ioMaxRead;
            return this;
        }
        public Integer getIoMaxRead() {
            return this.ioMaxRead;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setIoMaxSpec(String ioMaxSpec) {
            this.ioMaxSpec = ioMaxSpec;
            return this;
        }
        public String getIoMaxSpec() {
            return this.ioMaxSpec;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setIoMaxWrite(Integer ioMaxWrite) {
            this.ioMaxWrite = ioMaxWrite;
            return this;
        }
        public Integer getIoMaxWrite() {
            return this.ioMaxWrite;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setMsgRetain(Integer msgRetain) {
            this.msgRetain = msgRetain;
            return this;
        }
        public Integer getMsgRetain() {
            return this.msgRetain;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setPaidType(Integer paidType) {
            this.paidType = paidType;
            return this;
        }
        public Integer getPaidType() {
            return this.paidType;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setRecommendedPartitionCount(Integer recommendedPartitionCount) {
            this.recommendedPartitionCount = recommendedPartitionCount;
            return this;
        }
        public Integer getRecommendedPartitionCount() {
            return this.recommendedPartitionCount;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setReservedPublishCapacity(Integer reservedPublishCapacity) {
            this.reservedPublishCapacity = reservedPublishCapacity;
            return this;
        }
        public Integer getReservedPublishCapacity() {
            return this.reservedPublishCapacity;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setReservedSubscribeCapacity(Integer reservedSubscribeCapacity) {
            this.reservedSubscribeCapacity = reservedSubscribeCapacity;
            return this;
        }
        public Integer getReservedSubscribeCapacity() {
            return this.reservedSubscribeCapacity;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setSaslDomainEndpoint(String saslDomainEndpoint) {
            this.saslDomainEndpoint = saslDomainEndpoint;
            return this;
        }
        public String getSaslDomainEndpoint() {
            return this.saslDomainEndpoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setSaslEndPoint(String saslEndPoint) {
            this.saslEndPoint = saslEndPoint;
            return this;
        }
        public String getSaslEndPoint() {
            return this.saslEndPoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setScheduledRetirement(Boolean scheduledRetirement) {
            this.scheduledRetirement = scheduledRetirement;
            return this;
        }
        public Boolean getScheduledRetirement() {
            return this.scheduledRetirement;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setServiceStatus(Integer serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setSslDomainEndpoint(String sslDomainEndpoint) {
            this.sslDomainEndpoint = sslDomainEndpoint;
            return this;
        }
        public String getSslDomainEndpoint() {
            return this.sslDomainEndpoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setSslEndPoint(String sslEndPoint) {
            this.sslEndPoint = sslEndPoint;
            return this;
        }
        public String getSslEndPoint() {
            return this.sslEndPoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setStandardZoneId(String standardZoneId) {
            this.standardZoneId = standardZoneId;
            return this;
        }
        public String getStandardZoneId() {
            return this.standardZoneId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setTags(GetInstanceListResponseBodyInstanceListInstanceVOTags tags) {
            this.tags = tags;
            return this;
        }
        public GetInstanceListResponseBodyInstanceListInstanceVOTags getTags() {
            return this.tags;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setTopicNumLimit(Integer topicNumLimit) {
            this.topicNumLimit = topicNumLimit;
            return this;
        }
        public Integer getTopicNumLimit() {
            return this.topicNumLimit;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setUpgradeServiceDetailInfo(GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo upgradeServiceDetailInfo) {
            this.upgradeServiceDetailInfo = upgradeServiceDetailInfo;
            return this;
        }
        public GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo getUpgradeServiceDetailInfo() {
            return this.upgradeServiceDetailInfo;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setUsedGroupCount(Integer usedGroupCount) {
            this.usedGroupCount = usedGroupCount;
            return this;
        }
        public Integer getUsedGroupCount() {
            return this.usedGroupCount;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setUsedPartitionCount(Integer usedPartitionCount) {
            this.usedPartitionCount = usedPartitionCount;
            return this;
        }
        public Integer getUsedPartitionCount() {
            return this.usedPartitionCount;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setUsedTopicCount(Integer usedTopicCount) {
            this.usedTopicCount = usedTopicCount;
            return this;
        }
        public Integer getUsedTopicCount() {
            return this.usedTopicCount;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setVSwitchIds(GetInstanceListResponseBodyInstanceListInstanceVOVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public GetInstanceListResponseBodyInstanceListInstanceVOVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setViewInstanceStatusCode(Integer viewInstanceStatusCode) {
            this.viewInstanceStatusCode = viewInstanceStatusCode;
            return this;
        }
        public Integer getViewInstanceStatusCode() {
            return this.viewInstanceStatusCode;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setVpcSaslDomainEndpoint(String vpcSaslDomainEndpoint) {
            this.vpcSaslDomainEndpoint = vpcSaslDomainEndpoint;
            return this;
        }
        public String getVpcSaslDomainEndpoint() {
            return this.vpcSaslDomainEndpoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setVpcSaslEndPoint(String vpcSaslEndPoint) {
            this.vpcSaslEndPoint = vpcSaslEndPoint;
            return this;
        }
        public String getVpcSaslEndPoint() {
            return this.vpcSaslEndPoint;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetInstanceListResponseBodyInstanceList extends TeaModel {
        @NameInMap("InstanceVO")
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVO> instanceVO;

        public static GetInstanceListResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyInstanceList self = new GetInstanceListResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyInstanceList setInstanceVO(java.util.List<GetInstanceListResponseBodyInstanceListInstanceVO> instanceVO) {
            this.instanceVO = instanceVO;
            return this;
        }
        public java.util.List<GetInstanceListResponseBodyInstanceListInstanceVO> getInstanceVO() {
            return this.instanceVO;
        }

    }

}
