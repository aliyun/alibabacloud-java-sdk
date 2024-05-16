// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePostPayOrderRequest extends TeaModel {
    /**
     * <p>The disk size. Unit: GB.</p>
     * <br>
     * <p>*   The disk size that you specify must be greater than or equal to the current disk size of the instance.</p>
     * <p>*   For information about the valid values of this parameter, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     * <br>
     * <p>>  When you create an ApsaraMQ for Kafka V3 serverless instance, you do not need to configure this parameter.</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The Internet traffic for the instance.</p>
     * <br>
     * <p>*   The Internet traffic that you specify must be greater than or equal to the current Internet traffic of the instance.</p>
     * <p>*   For information about the valid values of this parameter, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you set **EipModel** to **true**, set **EipMax** to a value that is greater than 0.</p>
     * <br>
     * <p>*   If you set **EipModel** to **false**, set **EipMax** to **0**.</p>
     * <br>
     * <p>*   When you create an ApsaraMQ for Kafka V3 serverless instance, you do not need to configure this parameter.</p>
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
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum traffic for the instance. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   The maximum traffic that you specify must be greater than or equal to the current maximum traffic of the instance.</p>
     * <p>*   You must configure at least one of IoMax and IoMaxSpec. If you configure both parameters, the value of IoMaxSpec takes effect. We recommend that you configure only IoMaxSpec.</p>
     * <p>*   For information about the valid values of this parameter, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     * <br>
     * <p>>  When you create an ApsaraMQ for Kafka V3 serverless instance, you do not need to configure this parameter.</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   The traffic specification that you specify must be greater than or equal to the current traffic specification of the instance.</p>
     * <p>*   You must configure at least one of IoMax and IoMaxSpec. If you configure both parameters, the value of IoMaxSpec takes effect. We recommend that you configure only IoMaxSpec.</p>
     * <p>*   For information about the valid values of this parameter, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     * <br>
     * <p>>  When you create an ApsaraMQ for Kafka V3 serverless instance, you do not need to configure this parameter.</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <p>The number of partitions. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   You must configure one of PartitionNum and TopicQuota. We recommend that you configure only ParittionNum.</p>
     * <p>*   If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.</p>
     * <p>*   For information about the valid values of this parameter, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     * <br>
     * <p>>  When you create an ApsaraMQ for Kafka V3 serverless instance, you do not need to configure this parameter.</p>
     */
    @NameInMap("PartitionNum")
    public Integer partitionNum;

    /**
     * <p>The region ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The parameters that are configured for the ApsaraMQ for Kafka serverless instance. When you create a serverless ApsaraMQ for Kafka instance, you must configure these parameters.</p>
     */
    @NameInMap("ServerlessConfig")
    public UpgradePostPayOrderRequestServerlessConfig serverlessConfig;

    /**
     * <p>The instance edition.</p>
     * <br>
     * <p>Valid values for this parameter if you set PaidType to 1:</p>
     * <br>
     * <p>*   normal: Standard Edition (High Write)</p>
     * <p>*   professional: Professional Edition (High Write)</p>
     * <p>*   professionalForHighRead: Professional Edition (High Read)</p>
     * <br>
     * <p>Valid values for this parameter if you set PaidType to 3:</p>
     * <br>
     * <p>*   normal: Serverless Standard Edition</p>
     * <p>*   professional: Serverless Professional Edition</p>
     * <br>
     * <p>For more information, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The number of topics. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   You must configure one of PartitionNum and TopicQuota. We recommend that you configure only ParittionNum.</p>
     * <p>*   If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.</p>
     * <p>*   The default value of TopicQuota varies based on the value of IoMaxSpec. If the number of topics that you consume exceeds the default value, you are charged additional fees.</p>
     * <p>*   For information about the valid values of this parameter, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     * <br>
     * <p>>  When you create an ApsaraMQ for Kafka V3 serverless instance, you do not need to configure this parameter.</p>
     */
    @NameInMap("TopicQuota")
    public Integer topicQuota;

    public static UpgradePostPayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePostPayOrderRequest self = new UpgradePostPayOrderRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePostPayOrderRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public UpgradePostPayOrderRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public UpgradePostPayOrderRequest setEipModel(Boolean eipModel) {
        this.eipModel = eipModel;
        return this;
    }
    public Boolean getEipModel() {
        return this.eipModel;
    }

    public UpgradePostPayOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradePostPayOrderRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public UpgradePostPayOrderRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public UpgradePostPayOrderRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public UpgradePostPayOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradePostPayOrderRequest setServerlessConfig(UpgradePostPayOrderRequestServerlessConfig serverlessConfig) {
        this.serverlessConfig = serverlessConfig;
        return this;
    }
    public UpgradePostPayOrderRequestServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    public UpgradePostPayOrderRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public UpgradePostPayOrderRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static class UpgradePostPayOrderRequestServerlessConfig extends TeaModel {
        /**
         * <p>The reserved capacity for publishing messages. You can specify only integers for this parameter. Minimum value: 60.</p>
         * <br>
         * <p>>  The maximum capacity that you can reserve for an instance varies based on available resources in a region. The reserved capacity range displayed on the buy page shall prevail.</p>
         */
        @NameInMap("ReservedPublishCapacity")
        public Long reservedPublishCapacity;

        /**
         * <p>The reserved capacity for subscribing to messages. You can specify only integers for this parameter. Minimum value: 50.</p>
         * <br>
         * <p>>  The maximum capacity that you can reserve for an instance varies based on available resources in a region. The reserved capacity range displayed on the buy page shall prevail.</p>
         */
        @NameInMap("ReservedSubscribeCapacity")
        public Long reservedSubscribeCapacity;

        public static UpgradePostPayOrderRequestServerlessConfig build(java.util.Map<String, ?> map) throws Exception {
            UpgradePostPayOrderRequestServerlessConfig self = new UpgradePostPayOrderRequestServerlessConfig();
            return TeaModel.build(map, self);
        }

        public UpgradePostPayOrderRequestServerlessConfig setReservedPublishCapacity(Long reservedPublishCapacity) {
            this.reservedPublishCapacity = reservedPublishCapacity;
            return this;
        }
        public Long getReservedPublishCapacity() {
            return this.reservedPublishCapacity;
        }

        public UpgradePostPayOrderRequestServerlessConfig setReservedSubscribeCapacity(Long reservedSubscribeCapacity) {
            this.reservedSubscribeCapacity = reservedSubscribeCapacity;
            return this;
        }
        public Long getReservedSubscribeCapacity() {
            return this.reservedSubscribeCapacity;
        }

    }

}
