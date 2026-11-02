// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePrePayInstanceRequest extends TeaModel {
    /**
     * <p>The configurations of Confluent components.</p>
     * <blockquote>
     * <p>This parameter is required when you create a Confluent instance.</p>
     * </blockquote>
     */
    @NameInMap("ConfluentConfig")
    public CreatePrePayInstanceRequestConfluentConfig confluentConfig;

    /**
     * <p>The deployment type. Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong>: Internet- and VPC-connected instance</p>
     * </li>
     * <li><p><strong>5</strong>: VPC-connected instance</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a Confluent instance, you cannot select the deployment type. You can only set this parameter to 5. After the purchase, you can configure whether to expose each component to the Internet.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DeployType")
    public Integer deployType;

    /**
     * <p>The disk capacity. Unit: GB.</p>
     * <p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p>If you create a Confluent instance, you do not need to specify this parameter.</p>
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
     * <li><p><strong>0</strong>: Ultra disk</p>
     * </li>
     * <li><p><strong>1</strong>: SSD</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a Confluent instance, you do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The subscription duration. Unit: months. Default value: 1. Valid values:</p>
     * <ul>
     * <li><strong>Confluent instances: 1 or 12</strong></li>
     * <li><strong>ApsaraMQ for Kafka instances: 1</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The Internet traffic bandwidth.</p>
     * <ul>
     * <li><p>If <strong>DeployType</strong> is set to <strong>4</strong>, this parameter is required.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/72142.html">pay-as-you-go billing method</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a Confluent instance, you do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The traffic specification.</p>
     * <ul>
     * <li>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.<blockquote>
     * <p>If you create a Confluent instance, you do not need to specify this parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>alikafka.hw.2xlarge</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Subscription</p>
     * </li>
     * <li><p><strong>4</strong>: Subscription for Confluent instances</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions to purchase.</p>
     * <ul>
     * <li>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.<blockquote>
     * <p>If the instance is a Confluent instance, you do not need to specify this parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
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
     * <p>The resource group ID.</p>
     * <p>If you do not specify this parameter, the instance is added to the default resource group. You can view the resource group ID in the Resource Management console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ac***********7q</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The edition.</p>
     * <p>Valid values for ApsaraMQ for Kafka instances:</p>
     * <ul>
     * <li><p><strong>normal</strong>: Standard Edition (High Write)</p>
     * </li>
     * <li><p><strong>professional</strong>: Professional Edition (High Write)</p>
     * </li>
     * <li><p><strong>professionalForHighRead</strong>: Professional Edition (High Read)</p>
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
     * <p>The list of tags.</p>
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
        /**
         * <p>The identifier of the additional ksqlDB instance. It is used to distinguish multiple ksqlDB instances under the same Confluent instance and generate the corresponding service name. Each instance must use a different non-empty identifier, and the original identifier must be retained for subsequent specification changes. Example: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InternalId")
        public String internalId;

        /**
         * <p>The number of CPU cores per node in the ksqlDB instance. Valid values: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cu")
        public Integer cu;

        /**
         * <p>The number of nodes in the ksqlDB instance. Valid values: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <p>The disk capacity per node in the ksqlDB instance. Unit: GB. Valid values: 100 to 30000. The value must be a multiple of 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("storage")
        public Integer storage;

        /**
         * <p>The component type. Set the value to KSQLDB. Example: KSQLDB.</p>
         * 
         * <strong>example:</strong>
         * <p>KSQLDB</p>
         */
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
         * <p>The platform version of the Confluent instance. Valid values: 7.8.2 and 8.2.1. If you select 7.8.2, you must configure ZooKeeper. If you select 8.2.1, you must configure KRaft Controller. You can configure only one of the two metadata components in a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>7.8.2</p>
         */
        @NameInMap("ConfluentVersion")
        public String confluentVersion;

        /**
         * <p>The number of CPU cores for the Connect component.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ConnectCU")
        public Integer connectCU;

        /**
         * <p>The number of replicas for the Connect component.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ConnectReplica")
        public Integer connectReplica;

        /**
         * <p>The number of CPU cores for the Control Center component.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ControlCenterCU")
        public Integer controlCenterCU;

        /**
         * <p>The number of replicas for the Control Center component.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ControlCenterReplica")
        public Integer controlCenterReplica;

        /**
         * <p>The disk capacity of the Control Center component. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("ControlCenterStorage")
        public Integer controlCenterStorage;

        /**
         * <p>The number of CPU cores for Kafka brokers.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KafkaCU")
        public Integer kafkaCU;

        /**
         * <p>The number of replicas for Kafka brokers.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("KafkaReplica")
        public Integer kafkaReplica;

        /**
         * <p>The number of CPU cores for the Kafka REST Proxy component.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KafkaRestProxyCU")
        public Integer kafkaRestProxyCU;

        /**
         * <p>The number of replicas for the Kafka REST Proxy component.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("KafkaRestProxyReplica")
        public Integer kafkaRestProxyReplica;

        /**
         * <p>The disk capacity of Kafka brokers. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("KafkaStorage")
        public Integer kafkaStorage;

        /**
         * <p>The number of CPU cores per node in the KRaft controller. Valid values: 2 to 20. When you create an instance in KRaft mode, you must configure this parameter together with KraftControllerStorage.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("KraftControllerCU")
        public Integer kraftControllerCU;

        /**
         * <p>The number of nodes in the KRaft controller. The value is fixed to 3. If you configure the KRaft controller but do not specify this parameter, the default value 3 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("KraftControllerReplica")
        public Integer kraftControllerReplica;

        /**
         * <p>The disk capacity per node in the KRaft controller. Unit: GB. Valid values: 100 to 30000. The value must be a multiple of 100. When you create an instance in KRaft mode, you must configure this parameter together with KraftControllerCU.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("KraftControllerStorage")
        public Integer kraftControllerStorage;

        /**
         * <p>The number of CPU cores for the ksqlDB component.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KsqlCU")
        public Integer ksqlCU;

        /**
         * <p>The list of additional ksqlDB instance configurations, excluding the default ksqlDB instance. Each element configures an independent ksqlDB instance. When you use this parameter, you must also configure KsqlCU, KsqlStorage, and KsqlReplica for the default instance. Each instance in the list is configured with node resources and the number of nodes separately.</p>
         * <p>Example (list content):
         * ```json</p>
         */
        @NameInMap("KsqlList")
        public java.util.List<CreatePrePayInstanceRequestConfluentConfigKsqlList> ksqlList;

        /**
         * <p>The number of replicas for the ksqlDB component.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("KsqlReplica")
        public Integer ksqlReplica;

        /**
         * <p>The disk capacity of the ksqlDB component. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("KsqlStorage")
        public Integer ksqlStorage;

        /**
         * <p>The number of CPU cores for the Schema Registry component.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SchemaRegistryCU")
        public Integer schemaRegistryCU;

        /**
         * <p>The number of replicas for the Schema Registry component.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SchemaRegistryReplica")
        public Integer schemaRegistryReplica;

        /**
         * <p>The number of CPU cores for the ZooKeeper component.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ZooKeeperCU")
        public Integer zooKeeperCU;

        /**
         * <p>The number of replicas for the ZooKeeper component.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ZooKeeperReplica")
        public Integer zooKeeperReplica;

        /**
         * <p>The disk capacity of the ZooKeeper component. Unit: GB.</p>
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

        public CreatePrePayInstanceRequestConfluentConfig setConfluentVersion(String confluentVersion) {
            this.confluentVersion = confluentVersion;
            return this;
        }
        public String getConfluentVersion() {
            return this.confluentVersion;
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

        public CreatePrePayInstanceRequestConfluentConfig setKraftControllerCU(Integer kraftControllerCU) {
            this.kraftControllerCU = kraftControllerCU;
            return this;
        }
        public Integer getKraftControllerCU() {
            return this.kraftControllerCU;
        }

        public CreatePrePayInstanceRequestConfluentConfig setKraftControllerReplica(Integer kraftControllerReplica) {
            this.kraftControllerReplica = kraftControllerReplica;
            return this;
        }
        public Integer getKraftControllerReplica() {
            return this.kraftControllerReplica;
        }

        public CreatePrePayInstanceRequestConfluentConfig setKraftControllerStorage(Integer kraftControllerStorage) {
            this.kraftControllerStorage = kraftControllerStorage;
            return this;
        }
        public Integer getKraftControllerStorage() {
            return this.kraftControllerStorage;
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
         * <p>The tag key of the resource.</p>
         * <ul>
         * <li><p>N ranges from 1 to 20.</p>
         * </li>
         * <li><p>If this parameter is left empty, all tag keys are matched.</p>
         * </li>
         * <li><p>The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
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
         * <p>The tag value of the resource.</p>
         * <ul>
         * <li><p>N ranges from 1 to 20.</p>
         * </li>
         * <li><p>The tag value can be empty.</p>
         * </li>
         * <li><p>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
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
