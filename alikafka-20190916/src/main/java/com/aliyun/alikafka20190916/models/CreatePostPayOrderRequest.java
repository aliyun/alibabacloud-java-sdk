// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePostPayOrderRequest extends TeaModel {
    /**
     * <p>The deployment mode of the instance. Valid values:</p>
     * <br>
     * <p>*   **4**: deploys the instance that allows access from the Internet and a VPC.</p>
     * <p>*   **5**: deploys the instance that allows access only from a VPC.</p>
     */
    @NameInMap("DeployType")
    public Integer deployType;

    /**
     * <p>The disk size.</p>
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
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The maximum traffic for the instance. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the IoMax and IoMaxSpec parameters. If you configure both parameters, the value of the IoMaxSpec parameter takes effect. We recommend that you specify only the IoMaxSpec parameter.</p>
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the IoMax and IoMaxSpec parameters. If you configure both parameters, the value of the IoMaxSpec parameter takes effect. We recommend that you specify only the IoMaxSpec parameter.</p>
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
     * <p>For more information about these instance editions, see [Billing](~~84737~~).</p>
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
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   The default value of the TopicQuota parameter varies based on the value of the IoMaxSpec parameter. If the number of topics that you consume exceeds the default value, you are charged additional fees.</p>
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
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

    public static class CreatePostPayOrderRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * <br>
         * <p>*   Valid values of N: 1 to 20.</p>
         * <p>*   If this parameter is left empty, the keys of all tags are matched.</p>
         * <p>*   The tag key must be up to 128 characters in length. It cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
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
