// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetInstanceListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The HTTP status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The instances.</p>
     */
    @NameInMap("InstanceList")
    public GetInstanceListResponseBodyInstanceList instanceList;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
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

    public static class GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig extends TeaModel {
        /**
         * <p>The number of CPU cores of Connect.</p>
         */
        @NameInMap("ConnectCU")
        public Integer connectCU;

        /**
         * <p>The number of replicas of Connect.</p>
         */
        @NameInMap("ConnectReplica")
        public Integer connectReplica;

        /**
         * <p>The number of CPU cores of Control Center.</p>
         */
        @NameInMap("ControlCenterCU")
        public Integer controlCenterCU;

        /**
         * <p>The number of replicas of Control Center.</p>
         */
        @NameInMap("ControlCenterReplica")
        public Integer controlCenterReplica;

        /**
         * <p>The disk capacity of Control Center. Unit: GB.</p>
         */
        @NameInMap("ControlCenterStorage")
        public Integer controlCenterStorage;

        /**
         * <p>The number of CPU cores of the Kafka broker.</p>
         */
        @NameInMap("KafkaCU")
        public Integer kafkaCU;

        /**
         * <p>The number of replicas of the Kafka broker.</p>
         */
        @NameInMap("KafkaReplica")
        public Integer kafkaReplica;

        /**
         * <p>The number of CPU cores of Kafka Rest Proxy.</p>
         */
        @NameInMap("KafkaRestProxyCU")
        public Integer kafkaRestProxyCU;

        /**
         * <p>The number of replicas of Kafka Rest Proxy.</p>
         */
        @NameInMap("KafkaRestProxyReplica")
        public Integer kafkaRestProxyReplica;

        /**
         * <p>The disk capacity of the Kafka broker. Unit: GB.</p>
         */
        @NameInMap("KafkaStorage")
        public Integer kafkaStorage;

        /**
         * <p>The number of CPU cores of ksqlDB.</p>
         */
        @NameInMap("KsqlCU")
        public Integer ksqlCU;

        /**
         * <p>The number of replicas of ksqlDB.</p>
         */
        @NameInMap("KsqlReplica")
        public Integer ksqlReplica;

        /**
         * <p>The disk capacity of ksqlDB. Unit: GB.</p>
         */
        @NameInMap("KsqlStorage")
        public Integer ksqlStorage;

        /**
         * <p>The number of CPU cores of Schema Registry.</p>
         */
        @NameInMap("SchemaRegistryCU")
        public Integer schemaRegistryCU;

        /**
         * <p>The number of replicas of Schema Registry.</p>
         */
        @NameInMap("SchemaRegistryReplica")
        public Integer schemaRegistryReplica;

        /**
         * <p>The number of CPU cores of ZooKeeper.</p>
         */
        @NameInMap("ZooKeeperCU")
        public Integer zooKeeperCU;

        /**
         * <p>The number of replicas of ZooKeeper.</p>
         */
        @NameInMap("ZooKeeperReplica")
        public Integer zooKeeperReplica;

        /**
         * <p>The disk capacity of ZooKeeper. Unit: GB.</p>
         */
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

    public static class GetInstanceListResponseBodyInstanceListInstanceVOTagsTagVO extends TeaModel {
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
        /**
         * <p>The open source Apache Kafka version that corresponds to the instance.</p>
         */
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

    public static class GetInstanceListResponseBodyInstanceListInstanceVO extends TeaModel {
        /**
         * <p>The configurations of the deployed ApsaraMQ for Kafka instance.</p>
         */
        @NameInMap("AllConfig")
        public String allConfig;

        /**
         * <p>The parameters that are returned for the ApsaraMQ for Confluent instance.</p>
         */
        @NameInMap("ConfluentConfig")
        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig confluentConfig;

        /**
         * <p>The time when the instance was created. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The type of the network in which the instance is deployed. Valid values:</p>
         * <br>
         * <p>*   **4**: Internet and VPC</p>
         * <p>*   **5**: VPC</p>
         */
        @NameInMap("DeployType")
        public Integer deployType;

        /**
         * <p>The disk size. Unit: GB</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The disk type. Valid values:</p>
         * <br>
         * <p>*   **0**: ultra disk</p>
         * <p>*   **1**: standard SSD</p>
         */
        @NameInMap("DiskType")
        public Integer diskType;

        /**
         * <p>The default endpoint of the instance in domain name mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
         * <br>
         * <p>*   Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is `{Instance domain name}:{Port number}`.</p>
         * <p>*   Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is `{Broker IP address}:{Port number}`.</p>
         */
        @NameInMap("DomainEndpoint")
        public String domainEndpoint;

        /**
         * <p>The maximum Internet traffic in the instance.</p>
         */
        @NameInMap("EipMax")
        public Integer eipMax;

        /**
         * <p>The default endpoint of the instance in IP address mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
         * <br>
         * <p>*   Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is `{Instance domain name}:{Port number}`.</p>
         * <p>*   Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is `{Broker IP address}:{Port number}`.</p>
         */
        @NameInMap("EndPoint")
        public String endPoint;

        /**
         * <p>The time when the instance expires. Unit: milliseconds.</p>
         */
        @NameInMap("ExpiredTime")
        public Long expiredTime;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The maximum traffic in the instance.</p>
         */
        @NameInMap("IoMax")
        public Integer ioMax;

        /**
         * <p>The maximum read traffic in the instance. Unit: Mbit/s.</p>
         */
        @NameInMap("IoMaxRead")
        public Integer ioMaxRead;

        /**
         * <p>The traffic specification.</p>
         */
        @NameInMap("IoMaxSpec")
        public String ioMaxSpec;

        /**
         * <p>The maximum write traffic. Unit: Mbit/s.</p>
         */
        @NameInMap("IoMaxWrite")
        public Integer ioMaxWrite;

        /**
         * <p>The ID of the key that is used for disk encryption in the region where the instance is deployed.</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The retention period of messages in the instance. Unit: hours.</p>
         */
        @NameInMap("MsgRetain")
        public Integer msgRetain;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   **0**: the subscription billing method</p>
         * <p>*   **1**: the pay-as-you-go billing method</p>
         * <p>*   **3**: the pay-as-you-go billing method for serverless ApsaraMQ for Kafka V3 instances</p>
         * <p>*   **4**: the pay-as-you-go billing method for ApsaraMQ for Confluent instances</p>
         */
        @NameInMap("PaidType")
        public Integer paidType;

        /**
         * <p>The ID of the region where the instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The traffic reserved for message publishing. Unit: MB/s.</p>
         * <br>
         * <p>>  This parameter is returned only if the instance is a serverless ApsaraMQ for Kafka V3 instance.</p>
         */
        @NameInMap("ReservedPublishCapacity")
        public Integer reservedPublishCapacity;

        /**
         * <p>The traffic reserved for message subscription. Unit: MB/s.</p>
         * <br>
         * <p>>  This parameter is returned only if the instance is a serverless ApsaraMQ for Kafka V3 instance.</p>
         */
        @NameInMap("ReservedSubscribeCapacity")
        public Integer reservedSubscribeCapacity;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The Simple Authentication and Security Layer (SASL) endpoint of the instance in domain name mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
         * <br>
         * <p>*   Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is `{Instance domain name}:{Port number}`.</p>
         * <p>*   Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is `{Broker IP address}:{Port number}`.</p>
         */
        @NameInMap("SaslDomainEndpoint")
        public String saslDomainEndpoint;

        /**
         * <p>The security group to which the instance belongs.</p>
         * <br>
         * <p>*   If the instance is deployed in the ApsaraMQ for Kafka console or by calling the [StartInstance](https://help.aliyun.com/document_detail/157786.html) operation without a security group configured, no value is returned.</p>
         * <p>*   If the instance is deployed by calling the [StartInstance](https://help.aliyun.com/document_detail/157786.html) operation with a security group configured, the returned value is the configured security group.</p>
         */
        @NameInMap("SecurityGroup")
        public String securityGroup;

        /**
         * <p>实例系列标识。返回值有 v2 ，v3，confluent。</p>
         */
        @NameInMap("Series")
        public String series;

        /**
         * <p>>  This parameter is out of date. We recommend that you refer to the ViewInstanceStatusCode parameter.</p>
         * <br>
         * <p>The instance status. Valid values:</p>
         * <br>
         * <p>*   **0**: pending</p>
         * <p>*   **1**: preparing hardware resources</p>
         * <p>*   **2**: initializing</p>
         * <p>*   **3**: starting</p>
         * <p>*   **5**: running</p>
         * <p>*   **6**: migrating</p>
         * <p>*   **7**: ready for upgrade</p>
         * <p>*   **8**: upgrading</p>
         * <p>*   **9**: ready for change</p>
         * <p>*   **10**: released</p>
         * <p>*   **11**: changing</p>
         * <p>*   **15**: expired</p>
         * <p>*   **30**: scaling</p>
         */
        @NameInMap("ServiceStatus")
        public Integer serviceStatus;

        /**
         * <p>The instance edition. Valid values:</p>
         * <br>
         * <p>*   **professional**: Professional Edition (High Write)</p>
         * <p>*   **professionalForHighRead**: Professional Edition (High Read)</p>
         * <p>*   **normal**: Standard Edition</p>
         */
        @NameInMap("SpecType")
        public String specType;

        /**
         * <p>The SSL endpoint of the instance in domain name mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
         * <br>
         * <p>*   Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is `{Instance domain name}:{Port number}`.</p>
         * <p>*   Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is `{Broker IP address}:{Port number}`.</p>
         */
        @NameInMap("SslDomainEndpoint")
        public String sslDomainEndpoint;

        /**
         * <p>The Secure Sockets Layer (SSL) endpoint of the instance in IP address mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
         * <br>
         * <p>*   Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is `{Instance domain name}:{Port number}`.</p>
         * <p>*   Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is `{Broker IP address}:{Port number}`.</p>
         */
        @NameInMap("SslEndPoint")
        public String sslEndPoint;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("StandardZoneId")
        public String standardZoneId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public GetInstanceListResponseBodyInstanceListInstanceVOTags tags;

        /**
         * <p>The maximum number of topics on the instance.</p>
         */
        @NameInMap("TopicNumLimit")
        public Integer topicNumLimit;

        /**
         * <p>The upgrade information about the instance.</p>
         */
        @NameInMap("UpgradeServiceDetailInfo")
        public GetInstanceListResponseBodyInstanceListInstanceVOUpgradeServiceDetailInfo upgradeServiceDetailInfo;

        /**
         * <p>The number of used groups.</p>
         */
        @NameInMap("UsedGroupCount")
        public Integer usedGroupCount;

        /**
         * <p>The number of used partitions.</p>
         */
        @NameInMap("UsedPartitionCount")
        public Integer usedPartitionCount;

        /**
         * <p>The number of used topics.</p>
         */
        @NameInMap("UsedTopicCount")
        public Integer usedTopicCount;

        /**
         * <p>The ID of the vSwitch to which the instance belongs.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The instance status. The valid values are consistent with the values displayed in the ApsaraMQ for Kafka console. This parameter is used in the new version of ApsaraMQ for Kafka.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   **0**: pending</p>
         * <p>*   **1**: deploying</p>
         * <p>*   **2**: running</p>
         * <p>*   **3**: stopped</p>
         * <p>*   **4**: expiring</p>
         * <p>*   **5**: expired</p>
         * <p>*   **6**: released</p>
         * <p>*   **7**: upgrading</p>
         * <p>*   **8**: migrating</p>
         * <p>*   **21**: stopping</p>
         * <p>*   **22**: starting</p>
         * <p>*   **23**: releasing</p>
         * <p>*   **30**: auto scaling</p>
         * <p>*   **101**: deployment failed</p>
         * <p>*   **102**: upgrade failed</p>
         * <p>*   **103**: migration failed</p>
         */
        @NameInMap("ViewInstanceStatusCode")
        public Integer viewInstanceStatusCode;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         */
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

        public GetInstanceListResponseBodyInstanceListInstanceVO setConfluentConfig(GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig confluentConfig) {
            this.confluentConfig = confluentConfig;
            return this;
        }
        public GetInstanceListResponseBodyInstanceListInstanceVOConfluentConfig getConfluentConfig() {
            return this.confluentConfig;
        }

        public GetInstanceListResponseBodyInstanceListInstanceVO setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
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
