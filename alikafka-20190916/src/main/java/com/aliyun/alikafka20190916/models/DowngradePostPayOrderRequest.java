// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DowngradePostPayOrderRequest extends TeaModel {
    @NameInMap("DiskSize")
    public Integer diskSize;

    @NameInMap("EipMax")
    public Integer eipMax;

    @NameInMap("EipModel")
    public Boolean eipModel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IoMax")
    public Integer ioMax;

    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    @NameInMap("PartitionNum")
    public Integer partitionNum;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServerlessConfig")
    public DowngradePostPayOrderRequestServerlessConfig serverlessConfig;

    @NameInMap("SpecType")
    public String specType;

    @NameInMap("TopicQuota")
    public Integer topicQuota;

    public static DowngradePostPayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        DowngradePostPayOrderRequest self = new DowngradePostPayOrderRequest();
        return TeaModel.build(map, self);
    }

    public DowngradePostPayOrderRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public DowngradePostPayOrderRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public DowngradePostPayOrderRequest setEipModel(Boolean eipModel) {
        this.eipModel = eipModel;
        return this;
    }
    public Boolean getEipModel() {
        return this.eipModel;
    }

    public DowngradePostPayOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DowngradePostPayOrderRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public DowngradePostPayOrderRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public DowngradePostPayOrderRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public DowngradePostPayOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DowngradePostPayOrderRequest setServerlessConfig(DowngradePostPayOrderRequestServerlessConfig serverlessConfig) {
        this.serverlessConfig = serverlessConfig;
        return this;
    }
    public DowngradePostPayOrderRequestServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    public DowngradePostPayOrderRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public DowngradePostPayOrderRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static class DowngradePostPayOrderRequestServerlessConfig extends TeaModel {
        @NameInMap("ReservedPublishCapacity")
        public Long reservedPublishCapacity;

        @NameInMap("ReservedSubscribeCapacity")
        public Long reservedSubscribeCapacity;

        public static DowngradePostPayOrderRequestServerlessConfig build(java.util.Map<String, ?> map) throws Exception {
            DowngradePostPayOrderRequestServerlessConfig self = new DowngradePostPayOrderRequestServerlessConfig();
            return TeaModel.build(map, self);
        }

        public DowngradePostPayOrderRequestServerlessConfig setReservedPublishCapacity(Long reservedPublishCapacity) {
            this.reservedPublishCapacity = reservedPublishCapacity;
            return this;
        }
        public Long getReservedPublishCapacity() {
            return this.reservedPublishCapacity;
        }

        public DowngradePostPayOrderRequestServerlessConfig setReservedSubscribeCapacity(Long reservedSubscribeCapacity) {
            this.reservedSubscribeCapacity = reservedSubscribeCapacity;
            return this;
        }
        public Long getReservedSubscribeCapacity() {
            return this.reservedSubscribeCapacity;
        }

    }

}
