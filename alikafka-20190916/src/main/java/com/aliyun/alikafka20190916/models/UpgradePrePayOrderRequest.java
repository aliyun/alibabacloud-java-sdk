// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePrePayOrderRequest extends TeaModel {
    /**
     * <p>The Confluent component configurations.</p>
     */
    @NameInMap("ConfluentConfig")
    public UpgradePrePayOrderRequestConfluentConfig confluentConfig;

    /**
     * <p>The disk capacity.</p>
     * <ul>
     * <li><p>The disk capacity that you specify must be greater than or equal to the current disk capacity of the instance.</p>
     * </li>
     * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you upgrade a Confluent instance, you do not need to specify this parameter. This parameter is required for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The public network traffic.</p>
     * <ul>
     * <li><p>The public network traffic that you specify must be greater than or equal to the current public network traffic of the instance.</p>
     * </li>
     * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If <strong>EipModel</strong> is set to <strong>true</strong>, the value of <strong>EipMax</strong> must be greater than 0.</li>
     * <li>If <strong>EipModel</strong> is set to <strong>false</strong>, the value of <strong>EipMax</strong> must be <strong>0</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>Specifies whether public network access is required. Valid values:</p>
     * <ul>
     * <li><p>true: Public network access is required.</p>
     * </li>
     * <li><p>false: Public network access is not required.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you upgrade a Confluent instance, you do not need to specify this parameter. This parameter is required for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EipModel")
    public Boolean eipModel;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-mp919o4v****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The peak traffic (not recommended).</p>
     * <ul>
     * <li><p>The peak traffic that you specify must be greater than or equal to the current peak traffic of the instance.</p>
     * </li>
     * <li><p>You must specify one of peak traffic and traffic specification. If you specify both, the traffic specification takes precedence. Specify only the traffic specification.</p>
     * </li>
     * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification (recommended).</p>
     * <ul>
     * <li><p>The traffic specification that you specify must be greater than or equal to the current traffic specification of the instance.</p>
     * </li>
     * <li><p>You must specify one of peak traffic and traffic specification. If you specify both, the traffic specification takes precedence. Specify only the traffic specification.</p>
     * </li>
     * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you upgrade a Confluent instance, you do not need to specify this parameter. This parameter is required for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>alikafka.hw.2xlarge</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <p>The billing type. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: subscription.</p>
     * </li>
     * <li><p><strong>4</strong>: Confluent series subscription.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions (recommended).</p>
     * <ul>
     * <li><p>You must specify one of the number of partitions and the topic specification. Specify only the number of partitions.</p>
     * </li>
     * <li><p>If you specify both the number of partitions and the topic specification, the system validates whether the number of partitions and the topic specification are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the purchase is made based on the number of partitions.</p>
     * </li>
     * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you upgrade a Confluent instance, you do not need to specify this parameter. This parameter is required for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
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
     * <p>The specification type.</p>
     * <p>Valid values for ApsaraMQ for Kafka instances:</p>
     * <ul>
     * <li><p><strong>normal</strong>: Standard Edition (shared throughput)</p>
     * </li>
     * <li><p><strong>professional</strong>: Professional Edition (shared throughput)</p>
     * </li>
     * <li><p><strong>professionalForHighRead</strong>: Professional Edition (shared read)</p>
     * </li>
     * </ul>
     * <p>Valid values for Confluent instances:</p>
     * <ul>
     * <li><p><strong>professional</strong>: Professional Edition.</p>
     * </li>
     * <li><p><strong>enterprise</strong>: Enterprise Edition.</p>
     * </li>
     * </ul>
     * <p>Downgrading an instance from Professional Edition to Standard Edition is not supported. For more information about the specification types, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The number of topics (not recommended).</p>
     * <ul>
     * <li><p>You must specify one of the number of partitions and the topic specification. Specify only the number of partitions.</p>
     * </li>
     * <li><p>If you specify both the number of partitions and the topic specification, the system validates whether the number of partitions and the topic specification are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the purchase is made based on the number of partitions.</p>
     * </li>
     * <li><p>The default value varies based on the traffic specification. Additional fees are charged if the value exceeds the default value.</p>
     * </li>
     * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TopicQuota")
    public Integer topicQuota;

    public static UpgradePrePayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePrePayOrderRequest self = new UpgradePrePayOrderRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePrePayOrderRequest setConfluentConfig(UpgradePrePayOrderRequestConfluentConfig confluentConfig) {
        this.confluentConfig = confluentConfig;
        return this;
    }
    public UpgradePrePayOrderRequestConfluentConfig getConfluentConfig() {
        return this.confluentConfig;
    }

    public UpgradePrePayOrderRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public UpgradePrePayOrderRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public UpgradePrePayOrderRequest setEipModel(Boolean eipModel) {
        this.eipModel = eipModel;
        return this;
    }
    public Boolean getEipModel() {
        return this.eipModel;
    }

    public UpgradePrePayOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradePrePayOrderRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public UpgradePrePayOrderRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public UpgradePrePayOrderRequest setPaidType(Integer paidType) {
        this.paidType = paidType;
        return this;
    }
    public Integer getPaidType() {
        return this.paidType;
    }

    public UpgradePrePayOrderRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public UpgradePrePayOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradePrePayOrderRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public UpgradePrePayOrderRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static class UpgradePrePayOrderRequestConfluentConfigKsqlList extends TeaModel {
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

        public static UpgradePrePayOrderRequestConfluentConfigKsqlList build(java.util.Map<String, ?> map) throws Exception {
            UpgradePrePayOrderRequestConfluentConfigKsqlList self = new UpgradePrePayOrderRequestConfluentConfigKsqlList();
            return TeaModel.build(map, self);
        }

        public UpgradePrePayOrderRequestConfluentConfigKsqlList setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public UpgradePrePayOrderRequestConfluentConfigKsqlList setInternalId(String internalId) {
            this.internalId = internalId;
            return this;
        }
        public String getInternalId() {
            return this.internalId;
        }

        public UpgradePrePayOrderRequestConfluentConfigKsqlList setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public UpgradePrePayOrderRequestConfluentConfigKsqlList setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public UpgradePrePayOrderRequestConfluentConfigKsqlList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpgradePrePayOrderRequestConfluentConfig extends TeaModel {
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
         * <p>The number of CPU cores for the ControlCenter component.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ControlCenterCU")
        public Integer controlCenterCU;

        /**
         * <p>The number of replicas for the ControlCenter component.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ControlCenterReplica")
        public Integer controlCenterReplica;

        /**
         * <p>The disk capacity of the ControlCenter component. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("ControlCenterStorage")
        public Integer controlCenterStorage;

        /**
         * <p>The number of CPU cores for the Kafka Broker.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KafkaCU")
        public Integer kafkaCU;

        /**
         * <p>The number of replicas for the Kafka Broker.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("KafkaReplica")
        public Integer kafkaReplica;

        /**
         * <p>The number of CPU cores for the KafkaRestProxy component.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KafkaRestProxyCU")
        public Integer kafkaRestProxyCU;

        /**
         * <p>The number of replicas for the KafkaRestProxy component.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("KafkaRestProxyReplica")
        public Integer kafkaRestProxyReplica;

        /**
         * <p>The disk capacity of the Kafka Broker. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("KafkaStorage")
        public Integer kafkaStorage;

        @NameInMap("KraftControllerCU")
        public Integer kraftControllerCU;

        @NameInMap("KraftControllerReplica")
        public Integer kraftControllerReplica;

        @NameInMap("KraftControllerStorage")
        public Integer kraftControllerStorage;

        /**
         * <p>The number of CPU cores for the KsqlDB component.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KsqlCU")
        public Integer ksqlCU;

        @NameInMap("KsqlList")
        public java.util.List<UpgradePrePayOrderRequestConfluentConfigKsqlList> ksqlList;

        /**
         * <p>The number of replicas for the KsqlDB component.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("KsqlReplica")
        public Integer ksqlReplica;

        /**
         * <p>The disk capacity of the KsqlDB component. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("KsqlStorage")
        public Integer ksqlStorage;

        /**
         * <p>The number of CPU cores for the SchemaRegistry component.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SchemaRegistryCU")
        public Integer schemaRegistryCU;

        /**
         * <p>The number of replicas for the SchemaRegistry component.</p>
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

        public static UpgradePrePayOrderRequestConfluentConfig build(java.util.Map<String, ?> map) throws Exception {
            UpgradePrePayOrderRequestConfluentConfig self = new UpgradePrePayOrderRequestConfluentConfig();
            return TeaModel.build(map, self);
        }

        public UpgradePrePayOrderRequestConfluentConfig setConnectCU(Integer connectCU) {
            this.connectCU = connectCU;
            return this;
        }
        public Integer getConnectCU() {
            return this.connectCU;
        }

        public UpgradePrePayOrderRequestConfluentConfig setConnectReplica(Integer connectReplica) {
            this.connectReplica = connectReplica;
            return this;
        }
        public Integer getConnectReplica() {
            return this.connectReplica;
        }

        public UpgradePrePayOrderRequestConfluentConfig setControlCenterCU(Integer controlCenterCU) {
            this.controlCenterCU = controlCenterCU;
            return this;
        }
        public Integer getControlCenterCU() {
            return this.controlCenterCU;
        }

        public UpgradePrePayOrderRequestConfluentConfig setControlCenterReplica(Integer controlCenterReplica) {
            this.controlCenterReplica = controlCenterReplica;
            return this;
        }
        public Integer getControlCenterReplica() {
            return this.controlCenterReplica;
        }

        public UpgradePrePayOrderRequestConfluentConfig setControlCenterStorage(Integer controlCenterStorage) {
            this.controlCenterStorage = controlCenterStorage;
            return this;
        }
        public Integer getControlCenterStorage() {
            return this.controlCenterStorage;
        }

        public UpgradePrePayOrderRequestConfluentConfig setKafkaCU(Integer kafkaCU) {
            this.kafkaCU = kafkaCU;
            return this;
        }
        public Integer getKafkaCU() {
            return this.kafkaCU;
        }

        public UpgradePrePayOrderRequestConfluentConfig setKafkaReplica(Integer kafkaReplica) {
            this.kafkaReplica = kafkaReplica;
            return this;
        }
        public Integer getKafkaReplica() {
            return this.kafkaReplica;
        }

        public UpgradePrePayOrderRequestConfluentConfig setKafkaRestProxyCU(Integer kafkaRestProxyCU) {
            this.kafkaRestProxyCU = kafkaRestProxyCU;
            return this;
        }
        public Integer getKafkaRestProxyCU() {
            return this.kafkaRestProxyCU;
        }

        public UpgradePrePayOrderRequestConfluentConfig setKafkaRestProxyReplica(Integer kafkaRestProxyReplica) {
            this.kafkaRestProxyReplica = kafkaRestProxyReplica;
            return this;
        }
        public Integer getKafkaRestProxyReplica() {
            return this.kafkaRestProxyReplica;
        }

        public UpgradePrePayOrderRequestConfluentConfig setKafkaStorage(Integer kafkaStorage) {
            this.kafkaStorage = kafkaStorage;
            return this;
        }
        public Integer getKafkaStorage() {
            return this.kafkaStorage;
        }

        public UpgradePrePayOrderRequestConfluentConfig setKraftControllerCU(Integer kraftControllerCU) {
            this.kraftControllerCU = kraftControllerCU;
            return this;
        }
        public Integer getKraftControllerCU() {
            return this.kraftControllerCU;
        }

        public UpgradePrePayOrderRequestConfluentConfig setKraftControllerReplica(Integer kraftControllerReplica) {
            this.kraftControllerReplica = kraftControllerReplica;
            return this;
        }
        public Integer getKraftControllerReplica() {
            return this.kraftControllerReplica;
        }

        public UpgradePrePayOrderRequestConfluentConfig setKraftControllerStorage(Integer kraftControllerStorage) {
            this.kraftControllerStorage = kraftControllerStorage;
            return this;
        }
        public Integer getKraftControllerStorage() {
            return this.kraftControllerStorage;
        }

        public UpgradePrePayOrderRequestConfluentConfig setKsqlCU(Integer ksqlCU) {
            this.ksqlCU = ksqlCU;
            return this;
        }
        public Integer getKsqlCU() {
            return this.ksqlCU;
        }

        public UpgradePrePayOrderRequestConfluentConfig setKsqlList(java.util.List<UpgradePrePayOrderRequestConfluentConfigKsqlList> ksqlList) {
            this.ksqlList = ksqlList;
            return this;
        }
        public java.util.List<UpgradePrePayOrderRequestConfluentConfigKsqlList> getKsqlList() {
            return this.ksqlList;
        }

        public UpgradePrePayOrderRequestConfluentConfig setKsqlReplica(Integer ksqlReplica) {
            this.ksqlReplica = ksqlReplica;
            return this;
        }
        public Integer getKsqlReplica() {
            return this.ksqlReplica;
        }

        public UpgradePrePayOrderRequestConfluentConfig setKsqlStorage(Integer ksqlStorage) {
            this.ksqlStorage = ksqlStorage;
            return this;
        }
        public Integer getKsqlStorage() {
            return this.ksqlStorage;
        }

        public UpgradePrePayOrderRequestConfluentConfig setSchemaRegistryCU(Integer schemaRegistryCU) {
            this.schemaRegistryCU = schemaRegistryCU;
            return this;
        }
        public Integer getSchemaRegistryCU() {
            return this.schemaRegistryCU;
        }

        public UpgradePrePayOrderRequestConfluentConfig setSchemaRegistryReplica(Integer schemaRegistryReplica) {
            this.schemaRegistryReplica = schemaRegistryReplica;
            return this;
        }
        public Integer getSchemaRegistryReplica() {
            return this.schemaRegistryReplica;
        }

        public UpgradePrePayOrderRequestConfluentConfig setZooKeeperCU(Integer zooKeeperCU) {
            this.zooKeeperCU = zooKeeperCU;
            return this;
        }
        public Integer getZooKeeperCU() {
            return this.zooKeeperCU;
        }

        public UpgradePrePayOrderRequestConfluentConfig setZooKeeperReplica(Integer zooKeeperReplica) {
            this.zooKeeperReplica = zooKeeperReplica;
            return this;
        }
        public Integer getZooKeeperReplica() {
            return this.zooKeeperReplica;
        }

        public UpgradePrePayOrderRequestConfluentConfig setZooKeeperStorage(Integer zooKeeperStorage) {
            this.zooKeeperStorage = zooKeeperStorage;
            return this;
        }
        public Integer getZooKeeperStorage() {
            return this.zooKeeperStorage;
        }

    }

}
