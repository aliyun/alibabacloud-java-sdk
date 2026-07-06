// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePrePayOrderRequest extends TeaModel {
    /**
     * <p>Configurations for the Confluent components.</p>
     */
    @NameInMap("ConfluentConfig")
    public UpgradePrePayOrderRequestConfluentConfig confluentConfig;

    /**
     * <p>The disk capacity.</p>
     * <ul>
     * <li><p>The specified disk capacity must be greater than or equal to the current disk capacity of the instance.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for subscription instances but not for Confluent-series instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The maximum Internet traffic bandwidth.</p>
     * <ul>
     * <li><p>The specified Internet traffic bandwidth must be greater than or equal to the current Internet traffic bandwidth of the instance.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If <strong>EipModel</strong> is set to <strong>true</strong>, <strong>EipMax</strong> must be greater than 0.</p>
     * </li>
     * <li><p>If <strong>EipModel</strong> is set to <strong>false</strong>, <strong>EipMax</strong> must be set to <strong>0</strong>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>Specifies whether to enable Internet access. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: enables Internet access.</p>
     * </li>
     * <li><p><code>false</code>: disables Internet access.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for subscription instances but not for Confluent-series instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EipModel")
    public Boolean eipModel;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-mp919o4v****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The traffic peak (not recommended).</p>
     * <ul>
     * <li><p>The specified traffic peak must be greater than or equal to the current traffic peak of the instance.</p>
     * </li>
     * <li><p>You must specify either this parameter or <code>IoMaxSpec</code>. If you specify both, <code>IoMaxSpec</code> takes precedence. We recommend that you specify only <code>IoMaxSpec</code>.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
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
     * <li><p>The specified traffic specification must be greater than or equal to the current traffic specification of the instance.</p>
     * </li>
     * <li><p>You must specify either this parameter or <code>IoMax</code>. If you specify both, this parameter takes precedence. We recommend that you specify only this parameter.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for subscription instances but not for Confluent-series instances.</p>
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
     * <p>4</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions (recommended).</p>
     * <ul>
     * <li><p>You must specify either this parameter or <code>TopicQuota</code>. We recommend that you specify only this parameter.</p>
     * </li>
     * <li><p>If you specify both <code>PartitionNum</code> and <code>TopicQuota</code>, the system checks if their values are equivalent under the previous topic pricing model. A mismatch causes the request to fail. If they match, the system uses <code>PartitionNum</code> to process the purchase.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for subscription instances but not for Confluent-series instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PartitionNum")
    public Integer partitionNum;

    /**
     * <p>The ID of the region where the instance is located.</p>
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
     * <li><p><strong>normal</strong>: Standard Edition (high write)</p>
     * </li>
     * <li><p><strong>professional</strong>: Professional Edition (high write)</p>
     * </li>
     * <li><p><strong>professionalForHighRead</strong>: Professional Edition (high read)</p>
     * </li>
     * </ul>
     * <p>Valid values for Confluent instances:</p>
     * <ul>
     * <li><p><strong>professional</strong>: Professional Edition</p>
     * </li>
     * <li><p><strong>enterprise</strong>: Enterprise Edition</p>
     * </li>
     * </ul>
     * <p>You cannot downgrade an instance from Professional Edition to Standard Edition. For more information about these specification types, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The number of topics (not recommended).</p>
     * <ul>
     * <li><p>You must specify either this parameter or <code>PartitionNum</code>. We recommend that you specify only <code>PartitionNum</code>.</p>
     * </li>
     * <li><p>If you specify both <code>TopicQuota</code> and <code>PartitionNum</code>, the system checks if their values are equivalent under the previous topic pricing model. A mismatch causes the request to fail. If they match, the system uses <code>PartitionNum</code> to process the purchase.</p>
     * </li>
     * <li><p>The default value of this parameter varies based on the traffic specification. You are charged additional fees if the specified value exceeds the default value.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
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
         * <p>The disk capacity of the Control Center component, in GB.</p>
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
         * <p>The disk capacity of the Kafka broker, in GB.</p>
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
         * <p>The number of CPU cores for the ksqlDB component.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KsqlCU")
        public Integer ksqlCU;

        @NameInMap("KsqlList")
        public java.util.List<UpgradePrePayOrderRequestConfluentConfigKsqlList> ksqlList;

        /**
         * <p>The number of replicas for the ksqlDB component.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("KsqlReplica")
        public Integer ksqlReplica;

        /**
         * <p>The disk capacity of the ksqlDB component, in GB.</p>
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
         * <p>The disk capacity of the ZooKeeper component, in GB.</p>
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
