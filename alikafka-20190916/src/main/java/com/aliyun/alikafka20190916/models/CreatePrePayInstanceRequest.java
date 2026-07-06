// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePrePayInstanceRequest extends TeaModel {
    /**
     * <p>The configurations of the Confluent components.</p>
     * <blockquote>
     * <p>This parameter is required if you create a Confluent instance.</p>
     * </blockquote>
     */
    @NameInMap("ConfluentConfig")
    public CreatePrePayInstanceRequestConfluentConfig confluentConfig;

    /**
     * <p>The deployment type. Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong>: an instance accessible from the internet and a VPC</p>
     * </li>
     * <li><p><strong>5</strong>: an instance accessible from a VPC only</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a Confluent instance, you cannot specify the deployment type and must set this parameter to 5. After the instance is created, you can configure internet access for each component.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DeployType")
    public Integer deployType;

    /**
     * <p>The disk capacity, in GB.</p>
     * <p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p>This parameter is not required if you create a Confluent instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The disk type. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: ultra disk</p>
     * </li>
     * <li><p><strong>1</strong>: SSD</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not required if you create a Confluent instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The subscription duration, in months. Default value: 1. Valid values:</p>
     * <ul>
     * <li><p>Confluent instances: <strong>1</strong> and <strong>12</strong></p>
     * </li>
     * <li><p>Kafka instances: <strong>1</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The peak internet bandwidth.</p>
     * <ul>
     * <li><p>This parameter is required if you set <strong>DeployType</strong> to <strong>4</strong>.</p>
     * </li>
     * <li><p>For the value range, see <a href="https://help.aliyun.com/document_detail/72142.html">pay-as-you-go</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not required if you create a Confluent instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The I/O specification.</p>
     * <ul>
     * <li>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not required if you create a Confluent instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>alikafka.hw.2xlarge</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: subscription</p>
     * </li>
     * <li><p><strong>4</strong>: subscription for Confluent instances</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions.</p>
     * <ul>
     * <li>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not required if you create a Confluent instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("PartitionNum")
    public Integer partitionNum;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <p>If you do not specify this parameter, the instance is placed in the default resource group. You can find the resource group ID in the Resource Group console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ac***********7q</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The specification type.</p>
     * <p>Valid values for Kafka instances:</p>
     * <ul>
     * <li><p><strong>normal</strong>: Standard Edition (High-write)</p>
     * </li>
     * <li><p><strong>professional</strong>: Professional Edition (High-write)</p>
     * </li>
     * <li><p><strong>professionalForHighRead</strong>: Professional Edition (High-read)</p>
     * </li>
     * </ul>
     * <p>Valid values for Confluent instances:</p>
     * <ul>
     * <li><p><strong>professional</strong>: Professional Edition</p>
     * </li>
     * <li><p><strong>enterprise</strong>: Enterprise Edition</p>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The tags to attach to the instance. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePrePayInstanceRequestTag> tag;

    public static CreatePrePayInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrePayInstanceRequest self = new CreatePrePayInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrePayInstanceRequest setConfluentConfig(CreatePrePayInstanceRequestConfluentConfig confluentConfig) {
        this.confluentConfig = confluentConfig;
        return this;
    }
    public CreatePrePayInstanceRequestConfluentConfig getConfluentConfig() {
        return this.confluentConfig;
    }

    public CreatePrePayInstanceRequest setDeployType(Integer deployType) {
        this.deployType = deployType;
        return this;
    }
    public Integer getDeployType() {
        return this.deployType;
    }

    public CreatePrePayInstanceRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreatePrePayInstanceRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreatePrePayInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreatePrePayInstanceRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public CreatePrePayInstanceRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public CreatePrePayInstanceRequest setPaidType(Integer paidType) {
        this.paidType = paidType;
        return this;
    }
    public Integer getPaidType() {
        return this.paidType;
    }

    public CreatePrePayInstanceRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public CreatePrePayInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePrePayInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePrePayInstanceRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreatePrePayInstanceRequest setTag(java.util.List<CreatePrePayInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePrePayInstanceRequestTag> getTag() {
        return this.tag;
    }

    public static class CreatePrePayInstanceRequestConfluentConfigKsqlList extends TeaModel {
        @NameInMap("InternalId")
        public String internalId;

        @NameInMap("cu")
        public Integer cu;

        @NameInMap("replica")
        public Integer replica;

        @NameInMap("storage")
        public Integer storage;

        @NameInMap("type")
        public String type;

        public static CreatePrePayInstanceRequestConfluentConfigKsqlList build(java.util.Map<String, ?> map) throws Exception {
            CreatePrePayInstanceRequestConfluentConfigKsqlList self = new CreatePrePayInstanceRequestConfluentConfigKsqlList();
            return TeaModel.build(map, self);
        }

        public CreatePrePayInstanceRequestConfluentConfigKsqlList setInternalId(String internalId) {
            this.internalId = internalId;
            return this;
        }
        public String getInternalId() {
            return this.internalId;
        }

        public CreatePrePayInstanceRequestConfluentConfigKsqlList setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public CreatePrePayInstanceRequestConfluentConfigKsqlList setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public CreatePrePayInstanceRequestConfluentConfigKsqlList setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public CreatePrePayInstanceRequestConfluentConfigKsqlList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreatePrePayInstanceRequestConfluentConfig extends TeaModel {
        /**
         * <p>The number of CPU cores for Connect.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ConnectCU")
        public Integer connectCU;

        /**
         * <p>The number of replicas for Connect.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ConnectReplica")
        public Integer connectReplica;

        /**
         * <p>The number of CPU cores for Control Center.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ControlCenterCU")
        public Integer controlCenterCU;

        /**
         * <p>The number of replicas for Control Center.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ControlCenterReplica")
        public Integer controlCenterReplica;

        /**
         * <p>The disk capacity for Control Center, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("ControlCenterStorage")
        public Integer controlCenterStorage;

        /**
         * <p>The number of CPU cores for the Kafka broker.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KafkaCU")
        public Integer kafkaCU;

        /**
         * <p>The number of replicas for the Kafka broker.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("KafkaReplica")
        public Integer kafkaReplica;

        /**
         * <p>The number of CPU cores for Kafka REST Proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KafkaRestProxyCU")
        public Integer kafkaRestProxyCU;

        /**
         * <p>The number of replicas for Kafka REST Proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("KafkaRestProxyReplica")
        public Integer kafkaRestProxyReplica;

        /**
         * <p>The disk capacity for the Kafka broker, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("KafkaStorage")
        public Integer kafkaStorage;

        /**
         * <p>The number of CPU cores for ksqlDB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KsqlCU")
        public Integer ksqlCU;

        @NameInMap("KsqlList")
        public java.util.List<CreatePrePayInstanceRequestConfluentConfigKsqlList> ksqlList;

        /**
         * <p>The number of replicas for ksqlDB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("KsqlReplica")
        public Integer ksqlReplica;

        /**
         * <p>The disk capacity for ksqlDB, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("KsqlStorage")
        public Integer ksqlStorage;

        /**
         * <p>The number of CPU cores for Schema Registry.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SchemaRegistryCU")
        public Integer schemaRegistryCU;

        /**
         * <p>The number of replicas for Schema Registry.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SchemaRegistryReplica")
        public Integer schemaRegistryReplica;

        /**
         * <p>The number of CPU cores for ZooKeeper.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ZooKeeperCU")
        public Integer zooKeeperCU;

        /**
         * <p>The number of replicas for ZooKeeper.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ZooKeeperReplica")
        public Integer zooKeeperReplica;

        /**
         * <p>The disk capacity for ZooKeeper, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ZooKeeperStorage")
        public Integer zooKeeperStorage;

        public static CreatePrePayInstanceRequestConfluentConfig build(java.util.Map<String, ?> map) throws Exception {
            CreatePrePayInstanceRequestConfluentConfig self = new CreatePrePayInstanceRequestConfluentConfig();
            return TeaModel.build(map, self);
        }

        public CreatePrePayInstanceRequestConfluentConfig setConnectCU(Integer connectCU) {
            this.connectCU = connectCU;
            return this;
        }
        public Integer getConnectCU() {
            return this.connectCU;
        }

        public CreatePrePayInstanceRequestConfluentConfig setConnectReplica(Integer connectReplica) {
            this.connectReplica = connectReplica;
            return this;
        }
        public Integer getConnectReplica() {
            return this.connectReplica;
        }

        public CreatePrePayInstanceRequestConfluentConfig setControlCenterCU(Integer controlCenterCU) {
            this.controlCenterCU = controlCenterCU;
            return this;
        }
        public Integer getControlCenterCU() {
            return this.controlCenterCU;
        }

        public CreatePrePayInstanceRequestConfluentConfig setControlCenterReplica(Integer controlCenterReplica) {
            this.controlCenterReplica = controlCenterReplica;
            return this;
        }
        public Integer getControlCenterReplica() {
            return this.controlCenterReplica;
        }

        public CreatePrePayInstanceRequestConfluentConfig setControlCenterStorage(Integer controlCenterStorage) {
            this.controlCenterStorage = controlCenterStorage;
            return this;
        }
        public Integer getControlCenterStorage() {
            return this.controlCenterStorage;
        }

        public CreatePrePayInstanceRequestConfluentConfig setKafkaCU(Integer kafkaCU) {
            this.kafkaCU = kafkaCU;
            return this;
        }
        public Integer getKafkaCU() {
            return this.kafkaCU;
        }

        public CreatePrePayInstanceRequestConfluentConfig setKafkaReplica(Integer kafkaReplica) {
            this.kafkaReplica = kafkaReplica;
            return this;
        }
        public Integer getKafkaReplica() {
            return this.kafkaReplica;
        }

        public CreatePrePayInstanceRequestConfluentConfig setKafkaRestProxyCU(Integer kafkaRestProxyCU) {
            this.kafkaRestProxyCU = kafkaRestProxyCU;
            return this;
        }
        public Integer getKafkaRestProxyCU() {
            return this.kafkaRestProxyCU;
        }

        public CreatePrePayInstanceRequestConfluentConfig setKafkaRestProxyReplica(Integer kafkaRestProxyReplica) {
            this.kafkaRestProxyReplica = kafkaRestProxyReplica;
            return this;
        }
        public Integer getKafkaRestProxyReplica() {
            return this.kafkaRestProxyReplica;
        }

        public CreatePrePayInstanceRequestConfluentConfig setKafkaStorage(Integer kafkaStorage) {
            this.kafkaStorage = kafkaStorage;
            return this;
        }
        public Integer getKafkaStorage() {
            return this.kafkaStorage;
        }

        public CreatePrePayInstanceRequestConfluentConfig setKsqlCU(Integer ksqlCU) {
            this.ksqlCU = ksqlCU;
            return this;
        }
        public Integer getKsqlCU() {
            return this.ksqlCU;
        }

        public CreatePrePayInstanceRequestConfluentConfig setKsqlList(java.util.List<CreatePrePayInstanceRequestConfluentConfigKsqlList> ksqlList) {
            this.ksqlList = ksqlList;
            return this;
        }
        public java.util.List<CreatePrePayInstanceRequestConfluentConfigKsqlList> getKsqlList() {
            return this.ksqlList;
        }

        public CreatePrePayInstanceRequestConfluentConfig setKsqlReplica(Integer ksqlReplica) {
            this.ksqlReplica = ksqlReplica;
            return this;
        }
        public Integer getKsqlReplica() {
            return this.ksqlReplica;
        }

        public CreatePrePayInstanceRequestConfluentConfig setKsqlStorage(Integer ksqlStorage) {
            this.ksqlStorage = ksqlStorage;
            return this;
        }
        public Integer getKsqlStorage() {
            return this.ksqlStorage;
        }

        public CreatePrePayInstanceRequestConfluentConfig setSchemaRegistryCU(Integer schemaRegistryCU) {
            this.schemaRegistryCU = schemaRegistryCU;
            return this;
        }
        public Integer getSchemaRegistryCU() {
            return this.schemaRegistryCU;
        }

        public CreatePrePayInstanceRequestConfluentConfig setSchemaRegistryReplica(Integer schemaRegistryReplica) {
            this.schemaRegistryReplica = schemaRegistryReplica;
            return this;
        }
        public Integer getSchemaRegistryReplica() {
            return this.schemaRegistryReplica;
        }

        public CreatePrePayInstanceRequestConfluentConfig setZooKeeperCU(Integer zooKeeperCU) {
            this.zooKeeperCU = zooKeeperCU;
            return this;
        }
        public Integer getZooKeeperCU() {
            return this.zooKeeperCU;
        }

        public CreatePrePayInstanceRequestConfluentConfig setZooKeeperReplica(Integer zooKeeperReplica) {
            this.zooKeeperReplica = zooKeeperReplica;
            return this;
        }
        public Integer getZooKeeperReplica() {
            return this.zooKeeperReplica;
        }

        public CreatePrePayInstanceRequestConfluentConfig setZooKeeperStorage(Integer zooKeeperStorage) {
            this.zooKeeperStorage = zooKeeperStorage;
            return this;
        }
        public Integer getZooKeeperStorage() {
            return this.zooKeeperStorage;
        }

    }

    public static class CreatePrePayInstanceRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <ul>
         * <li></li>
         * <li></li>
         * <li><p>The key must be 1 to 128 characters long. It cannot start with aliyun or acs:, nor can it contain http\:// or https\://.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <ul>
         * <li></li>
         * <li></li>
         * <li><p>The value can be 0 to 128 characters long. It cannot start with aliyun or acs:, nor can it contain http\:// or https\://.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePrePayInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePrePayInstanceRequestTag self = new CreatePrePayInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePrePayInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePrePayInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
