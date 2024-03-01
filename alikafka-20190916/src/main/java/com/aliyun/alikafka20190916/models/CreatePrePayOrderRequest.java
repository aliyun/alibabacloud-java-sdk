// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePrePayOrderRequest extends TeaModel {
    @NameInMap("ConfluentConfig")
    public CreatePrePayOrderRequestConfluentConfig confluentConfig;

    /**
     * <p>The deployment mode of the instance. Valid values:</p>
     * <br>
     * <p>*   **4**: deploys the instance that allows access from the Internet and a VPC.</p>
     * <p>*   **5**: deploys the instance that allows access only from a VPC.</p>
     */
    @NameInMap("DeployType")
    public Integer deployType;

    /**
     * <p>The disk size. Unit: GB.</p>
     * <br>
     * <p>For more information about the valid values, see [Billing](~~84737~~).</p>
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
    public String diskType;

    /**
     * <p>The Internet traffic for the instance.</p>
     * <br>
     * <p>*   This parameter is required if the **DeployType** parameter is set to **4**.</p>
     * <p>*   For more information about the valid values, see [Pay-as-you-go](~~72142~~).</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The maximum traffic for the instance. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   You must configure at least one of the **IoMax** and **IoMaxSpec** parameters. If both parameters are configured, the value of the **IoMaxSpec** parameter takes effect. We recommend that you configure only the **IoMaxSpec** parameter.</p>
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   You must configure at least one of the **IoMax** and **IoMaxSpec** parameters. If both parameters are configured, the value of the **IoMaxSpec** parameter takes effect. We recommend that you configure only the **IoMaxSpec** parameter.</p>
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <p>The number of partitions. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
     */
    @NameInMap("PartitionNum")
    public Integer partitionNum;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>If this parameter is left empty, the default resource group is used. You can view the resource group ID on the Resource Group page in the Resource Management console.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **normal**: Standard Edition (High Write)</p>
     * <p>*   **professional**: Professional Edition (High Write)</p>
     * <p>*   **professionalForHighRead**: Professional Edition (High Read)</p>
     * <br>
     * <p>For more information, see [Billing](~~84737~~).</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePrePayOrderRequestTag> tag;

    /**
     * <p>The number of topics. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   The default value of the TopicQuota parameter varies based on the value of the IoMaxSpec parameter. If the number of topics that you consume exceeds the default value, you are charged additional fees.</p>
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
     */
    @NameInMap("TopicQuota")
    public Integer topicQuota;

    public static CreatePrePayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrePayOrderRequest self = new CreatePrePayOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrePayOrderRequest setConfluentConfig(CreatePrePayOrderRequestConfluentConfig confluentConfig) {
        this.confluentConfig = confluentConfig;
        return this;
    }
    public CreatePrePayOrderRequestConfluentConfig getConfluentConfig() {
        return this.confluentConfig;
    }

    public CreatePrePayOrderRequest setDeployType(Integer deployType) {
        this.deployType = deployType;
        return this;
    }
    public Integer getDeployType() {
        return this.deployType;
    }

    public CreatePrePayOrderRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreatePrePayOrderRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreatePrePayOrderRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public CreatePrePayOrderRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public CreatePrePayOrderRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public CreatePrePayOrderRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public CreatePrePayOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePrePayOrderRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePrePayOrderRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreatePrePayOrderRequest setTag(java.util.List<CreatePrePayOrderRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePrePayOrderRequestTag> getTag() {
        return this.tag;
    }

    public CreatePrePayOrderRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static class CreatePrePayOrderRequestConfluentConfig extends TeaModel {
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

        public static CreatePrePayOrderRequestConfluentConfig build(java.util.Map<String, ?> map) throws Exception {
            CreatePrePayOrderRequestConfluentConfig self = new CreatePrePayOrderRequestConfluentConfig();
            return TeaModel.build(map, self);
        }

        public CreatePrePayOrderRequestConfluentConfig setConnectCU(Integer connectCU) {
            this.connectCU = connectCU;
            return this;
        }
        public Integer getConnectCU() {
            return this.connectCU;
        }

        public CreatePrePayOrderRequestConfluentConfig setConnectReplica(Integer connectReplica) {
            this.connectReplica = connectReplica;
            return this;
        }
        public Integer getConnectReplica() {
            return this.connectReplica;
        }

        public CreatePrePayOrderRequestConfluentConfig setControlCenterCU(Integer controlCenterCU) {
            this.controlCenterCU = controlCenterCU;
            return this;
        }
        public Integer getControlCenterCU() {
            return this.controlCenterCU;
        }

        public CreatePrePayOrderRequestConfluentConfig setControlCenterReplica(Integer controlCenterReplica) {
            this.controlCenterReplica = controlCenterReplica;
            return this;
        }
        public Integer getControlCenterReplica() {
            return this.controlCenterReplica;
        }

        public CreatePrePayOrderRequestConfluentConfig setControlCenterStorage(Integer controlCenterStorage) {
            this.controlCenterStorage = controlCenterStorage;
            return this;
        }
        public Integer getControlCenterStorage() {
            return this.controlCenterStorage;
        }

        public CreatePrePayOrderRequestConfluentConfig setKafkaCU(Integer kafkaCU) {
            this.kafkaCU = kafkaCU;
            return this;
        }
        public Integer getKafkaCU() {
            return this.kafkaCU;
        }

        public CreatePrePayOrderRequestConfluentConfig setKafkaReplica(Integer kafkaReplica) {
            this.kafkaReplica = kafkaReplica;
            return this;
        }
        public Integer getKafkaReplica() {
            return this.kafkaReplica;
        }

        public CreatePrePayOrderRequestConfluentConfig setKafkaRestProxyCU(Integer kafkaRestProxyCU) {
            this.kafkaRestProxyCU = kafkaRestProxyCU;
            return this;
        }
        public Integer getKafkaRestProxyCU() {
            return this.kafkaRestProxyCU;
        }

        public CreatePrePayOrderRequestConfluentConfig setKafkaRestProxyReplica(Integer kafkaRestProxyReplica) {
            this.kafkaRestProxyReplica = kafkaRestProxyReplica;
            return this;
        }
        public Integer getKafkaRestProxyReplica() {
            return this.kafkaRestProxyReplica;
        }

        public CreatePrePayOrderRequestConfluentConfig setKafkaStorage(Integer kafkaStorage) {
            this.kafkaStorage = kafkaStorage;
            return this;
        }
        public Integer getKafkaStorage() {
            return this.kafkaStorage;
        }

        public CreatePrePayOrderRequestConfluentConfig setKsqlCU(Integer ksqlCU) {
            this.ksqlCU = ksqlCU;
            return this;
        }
        public Integer getKsqlCU() {
            return this.ksqlCU;
        }

        public CreatePrePayOrderRequestConfluentConfig setKsqlReplica(Integer ksqlReplica) {
            this.ksqlReplica = ksqlReplica;
            return this;
        }
        public Integer getKsqlReplica() {
            return this.ksqlReplica;
        }

        public CreatePrePayOrderRequestConfluentConfig setKsqlStorage(Integer ksqlStorage) {
            this.ksqlStorage = ksqlStorage;
            return this;
        }
        public Integer getKsqlStorage() {
            return this.ksqlStorage;
        }

        public CreatePrePayOrderRequestConfluentConfig setSchemaRegistryCU(Integer schemaRegistryCU) {
            this.schemaRegistryCU = schemaRegistryCU;
            return this;
        }
        public Integer getSchemaRegistryCU() {
            return this.schemaRegistryCU;
        }

        public CreatePrePayOrderRequestConfluentConfig setSchemaRegistryReplica(Integer schemaRegistryReplica) {
            this.schemaRegistryReplica = schemaRegistryReplica;
            return this;
        }
        public Integer getSchemaRegistryReplica() {
            return this.schemaRegistryReplica;
        }

        public CreatePrePayOrderRequestConfluentConfig setZooKeeperCU(Integer zooKeeperCU) {
            this.zooKeeperCU = zooKeeperCU;
            return this;
        }
        public Integer getZooKeeperCU() {
            return this.zooKeeperCU;
        }

        public CreatePrePayOrderRequestConfluentConfig setZooKeeperReplica(Integer zooKeeperReplica) {
            this.zooKeeperReplica = zooKeeperReplica;
            return this;
        }
        public Integer getZooKeeperReplica() {
            return this.zooKeeperReplica;
        }

        public CreatePrePayOrderRequestConfluentConfig setZooKeeperStorage(Integer zooKeeperStorage) {
            this.zooKeeperStorage = zooKeeperStorage;
            return this;
        }
        public Integer getZooKeeperStorage() {
            return this.zooKeeperStorage;
        }

    }

    public static class CreatePrePayOrderRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * <br>
         * <p>*   Valid values of N: 1 to 20.</p>
         * <p>*   If this parameter is left empty, the keys of all tags are matched.</p>
         * <p>*   The tag key can be up to 128 characters in length and cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * <br>
         * <p>*   Valid values of N: 1 to 20.</p>
         * <p>*   This parameter can be left empty.</p>
         * <p>*   The tag value can be 1 to 128 characters in length and cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePrePayOrderRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePrePayOrderRequestTag self = new CreatePrePayOrderRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePrePayOrderRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePrePayOrderRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
