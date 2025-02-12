// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePrePayInstanceRequest extends TeaModel {
    @NameInMap("ConfluentConfig")
    public CreatePrePayInstanceRequestConfluentConfig confluentConfig;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DeployType")
    public Integer deployType;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <strong>example:</strong>
     * <p>alikafka.hw.2xlarge</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("PartitionNum")
    public Integer partitionNum;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-ac***********7q</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("SpecType")
    public String specType;

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

    public static class CreatePrePayInstanceRequestConfluentConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ConnectCU")
        public Integer connectCU;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ConnectReplica")
        public Integer connectReplica;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ControlCenterCU")
        public Integer controlCenterCU;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ControlCenterReplica")
        public Integer controlCenterReplica;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("ControlCenterStorage")
        public Integer controlCenterStorage;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KafkaCU")
        public Integer kafkaCU;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("KafkaReplica")
        public Integer kafkaReplica;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KafkaRestProxyCU")
        public Integer kafkaRestProxyCU;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("KafkaRestProxyReplica")
        public Integer kafkaRestProxyReplica;

        /**
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("KafkaStorage")
        public Integer kafkaStorage;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("KsqlCU")
        public Integer ksqlCU;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("KsqlReplica")
        public Integer ksqlReplica;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("KsqlStorage")
        public Integer ksqlStorage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SchemaRegistryCU")
        public Integer schemaRegistryCU;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SchemaRegistryReplica")
        public Integer schemaRegistryReplica;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ZooKeeperCU")
        public Integer zooKeeperCU;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ZooKeeperReplica")
        public Integer zooKeeperReplica;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
