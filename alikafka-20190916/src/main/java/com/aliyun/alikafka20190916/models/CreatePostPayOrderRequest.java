// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePostPayOrderRequest extends TeaModel {
    /**
     * <p>The deployment mode of the instance. Valid values:</p>
     * <br>
     * <p>*   **4**: deploys the instance that allows access from the Internet and a VPC.</p>
     * <p>*   **5**: deploys the instance that allows access only from a VPC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeployType")
    public Integer deployType;

    /**
     * <p>The disk size.</p>
     * <br>
     * <p>For information about the valid values of this parameter, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     * <br>
     * <p>>  If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The disk type. Valid values:</p>
     * <br>
     * <p>*   **0**: ultra disk</p>
     * <p>*   **1**: standard SSD</p>
     * <br>
     * <p>>  If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The maximum Internet traffic in the instance.</p>
     * <br>
     * <p>*   If you set **DeployType** to **4**, you must configure this parameter.</p>
     * <p>*   For information about the valid values of this parameter, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     * <br>
     * <p>>  If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The maximum traffic in the instance. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   You must configure at least one of IoMax and IoMaxSpec. If you configure both parameters, the value of IoMaxSpec takes effect. We recommend that you configure only IoMaxSpec.</p>
     * <p>*   For information about the valid values of this parameter, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     * <br>
     * <p>>  If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   You must configure at least one of IoMax and IoMaxSpec. If you configure both parameters, the value of IoMaxSpec takes effect. We recommend that you configure only IoMaxSpec.</p>
     * <p>*   For information about the valid values of this parameter, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     * <br>
     * <p>>  If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   1: the pay-as-you-go billing method for ApsaraMQ for Kafka V2 instances.</p>
     * <p>*   3: the pay-as-you-go billing method for serverless ApsaraMQ for Kafka V3 instances.</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   You must configure one of PartitionNum and TopicQuota. We recommend that you configure only ParittionNum.</p>
     * <p>*   If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.</p>
     * <p>*   For information about the valid values of this parameter, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     * <br>
     * <p>>  If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
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
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>If this parameter is left empty, the default resource group is used. You can view the resource group ID on the Resource Group page in the Resource Management console.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The parameters configured for the serverless ApsaraMQ for Kafka V3 instance. When you create a Serverless ApsaraMQ for Kafka V3 serverless instance, you must configure these parameters.</p>
     */
    @NameInMap("ServerlessConfig")
    public CreatePostPayOrderRequestServerlessConfig serverlessConfig;

    /**
     * <p>The instance edition.</p>
     * <br>
     * <p>Valid values if you set PaidType to 1:</p>
     * <br>
     * <p>*   normal: Standard Edition (High Write)</p>
     * <p>*   professional: Professional Edition (High Write)</p>
     * <p>*   professionalForHighRead: Professional Edition (High Read)</p>
     * <br>
     * <p>Valid values if you set PaidType to 3:</p>
     * <br>
     * <p>*   normal: Serverless Standard Edition</p>
     * <p>*   professional: Serverless Professional Edition</p>
     * <br>
     * <p>For more information about the instance editions, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePostPayOrderRequestTag> tag;

    /**
     * <p>The number of topics. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   You must configure one of PartitionNum and TopicQuota. We recommend that you configure only ParittionNum.</p>
     * <p>*   If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.</p>
     * <p>*   The default value of TopicQuota varies based on the value of IoMaxSpec. If the number of topics that you consume exceeds the default value, you are charged additional fees.</p>
     * <p>*   For information about the valid values of this parameter, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     * <br>
     * <p>>  If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
     */
    @NameInMap("TopicQuota")
    public Integer topicQuota;

    public static CreatePostPayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePostPayOrderRequest self = new CreatePostPayOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePostPayOrderRequest setDeployType(Integer deployType) {
        this.deployType = deployType;
        return this;
    }
    public Integer getDeployType() {
        return this.deployType;
    }

    public CreatePostPayOrderRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreatePostPayOrderRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreatePostPayOrderRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public CreatePostPayOrderRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public CreatePostPayOrderRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public CreatePostPayOrderRequest setPaidType(Integer paidType) {
        this.paidType = paidType;
        return this;
    }
    public Integer getPaidType() {
        return this.paidType;
    }

    public CreatePostPayOrderRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public CreatePostPayOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePostPayOrderRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePostPayOrderRequest setServerlessConfig(CreatePostPayOrderRequestServerlessConfig serverlessConfig) {
        this.serverlessConfig = serverlessConfig;
        return this;
    }
    public CreatePostPayOrderRequestServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    public CreatePostPayOrderRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreatePostPayOrderRequest setTag(java.util.List<CreatePostPayOrderRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePostPayOrderRequestTag> getTag() {
        return this.tag;
    }

    public CreatePostPayOrderRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static class CreatePostPayOrderRequestServerlessConfig extends TeaModel {
        /**
         * <p>The reserved capacity for publishing messages. You can specify only an integer for this parameter. Minimum value: 60.</p>
         * <br>
         * <p>>  The actual maximum reserved capacity for publishing messages varies based on available resources in the region. The actual range displayed on the buy page shall prevail.</p>
         */
        @NameInMap("ReservedPublishCapacity")
        public Long reservedPublishCapacity;

        /**
         * <p>The reserved capacity for subscribing to messages. You can specify only an integer for this parameter. Minimum value: 20.</p>
         * <br>
         * <p>>  The actual maximum reserved capacity for subscribing to messages varies based on available resources in the region. The actual range displayed on the buy page shall prevail.</p>
         */
        @NameInMap("ReservedSubscribeCapacity")
        public Long reservedSubscribeCapacity;

        public static CreatePostPayOrderRequestServerlessConfig build(java.util.Map<String, ?> map) throws Exception {
            CreatePostPayOrderRequestServerlessConfig self = new CreatePostPayOrderRequestServerlessConfig();
            return TeaModel.build(map, self);
        }

        public CreatePostPayOrderRequestServerlessConfig setReservedPublishCapacity(Long reservedPublishCapacity) {
            this.reservedPublishCapacity = reservedPublishCapacity;
            return this;
        }
        public Long getReservedPublishCapacity() {
            return this.reservedPublishCapacity;
        }

        public CreatePostPayOrderRequestServerlessConfig setReservedSubscribeCapacity(Long reservedSubscribeCapacity) {
            this.reservedSubscribeCapacity = reservedSubscribeCapacity;
            return this;
        }
        public Long getReservedSubscribeCapacity() {
            return this.reservedSubscribeCapacity;
        }

    }

    public static class CreatePostPayOrderRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * <br>
         * <p>*   Valid values of N: 1 to 20.</p>
         * <p>*   If this parameter is left empty, the keys of all tags are matched.</p>
         * <p>*   The tag key must be up to 128 characters in length. It cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * <br>
         * <p>*   Valid values of N: 1 to 20.</p>
         * <p>*   If you do not specify a tag key, you cannot specify a tag value. If this parameter is not configured, all tag values are matched.</p>
         * <p>*   The tag value must be 1 to 128 characters in length. It cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePostPayOrderRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePostPayOrderRequestTag self = new CreatePostPayOrderRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePostPayOrderRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePostPayOrderRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
