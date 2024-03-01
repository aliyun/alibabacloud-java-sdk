// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePrePayOrderRequest extends TeaModel {
    @NameInMap("ConfluentConfig")
    public UpgradePrePayOrderRequestConfluentConfig confluentConfig;

    /**
     * <p>The size of the disk.</p>
     * <br>
     * <p>*   The disk size that you specify must be greater than or equal to the current disk size of the instance.</p>
     * <p>*   For more information about the valid values, see [Billing overview](~~84737~~).</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The Internet traffic for the instance.</p>
     * <br>
     * <p>*   The Internet traffic volume that you specify must be greater than or equal to the current Internet traffic volume of the instance.</p>
     * <p>*   For more information about the valid values, see [Billing overview](~~84737~~).</p>
     * <p>> - If the **EipModel** parameter is set to **true**, set the **EipMax** parameter to a value that is greater than 0.</p>
     * <p>> - If the **EipModel** parameter is set to **false**, set the **EipMax** parameter to **0**.</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>Specifies whether to enable Internet access for the instance. Valid values:</p>
     * <br>
     * <p>*   true: enables Internet access.</p>
     * <p>*   false: disables Internet access.</p>
     */
    @NameInMap("EipModel")
    public Boolean eipModel;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum traffic for the instance. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   The maximum traffic volume that you specify must be greater than or equal to the current maximum traffic volume of the instance.</p>
     * <p>*   You must configure at least one of the IoMax and IoMaxSpec parameters. If you configure both parameters, the value of the IoMaxSpec parameter takes effect. We recommend that you configure only the IoMaxSpec parameter.</p>
     * <p>*   For more information about the valid values, see [Billing overview](~~84737~~).</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   The traffic specification that you specify must be greater than or equal to the current traffic specification of the instance.</p>
     * <p>*   You must configure at least one of the IoMax and IoMaxSpec parameters. If you configure both parameters, the value of the IoMaxSpec parameter takes effect. We recommend that you configure only the IoMaxSpec parameter.</p>
     * <p>*   For more information about the valid values, see [Billing overview](~~84737~~).</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   For more information about the valid values, see [Billing overview](~~84737~~).</p>
     */
    @NameInMap("PartitionNum")
    public Integer partitionNum;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **normal**: Standard Edition (High Write)</p>
     * <p>*   **professional**: Professional Edition (High Write)</p>
     * <p>*   **professionalForHighRead**: Professional Edition (High Read)</p>
     * <br>
     * <p>You cannot downgrade an instance from the Professional Edition to the Standard Edition. For more information about these instance editions, see [Billing overview](~~84737~~).</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The number of topics. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   The default value of the TopicQuota parameter varies based on the value of the IoMaxSpec parameter. If the number of topics that you consume exceeds the default value, you are charged additional fees.</p>
     * <p>*   For more information about the valid values, see [Billing overview](~~84737~~).</p>
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

    public static class UpgradePrePayOrderRequestConfluentConfig extends TeaModel {
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

        public UpgradePrePayOrderRequestConfluentConfig setKsqlCU(Integer ksqlCU) {
            this.ksqlCU = ksqlCU;
            return this;
        }
        public Integer getKsqlCU() {
            return this.ksqlCU;
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
