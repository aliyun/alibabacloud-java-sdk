// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePrePayOrderShrinkRequest extends TeaModel {
    /**
     * <p>The configurations of ApsaraMQ for Confluent components.</p>
     */
    @NameInMap("ConfluentConfig")
    public String confluentConfigShrink;

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
     * <p>For more information about the valid values, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
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
     * <p>The subscription duration. Unit: months. Default value: 1. Valid values:</p>
     * <br>
     * <p>*   **1 to 12**</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The Internet traffic for the instance.</p>
     * <br>
     * <p>*   This parameter is required if the **DeployType** parameter is set to **4**.</p>
     * <p>*   For more information about the valid values, see [Pay-as-you-go](https://help.aliyun.com/document_detail/72142.html).</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The maximum traffic for the instance. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   You must configure at least one of the **IoMax** and **IoMaxSpec** parameters. If both parameters are configured, the value of the **IoMaxSpec** parameter takes effect. We recommend that you configure only the **IoMaxSpec** parameter.</p>
     * <p>*   For more information about the valid values, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   You must configure at least one of the **IoMax** and **IoMaxSpec** parameters. If both parameters are configured, the value of the **IoMaxSpec** parameter takes effect. We recommend that you configure only the **IoMaxSpec** parameter.</p>
     * <p>*   For more information about the valid values, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **0**: the subscription billing method</p>
     * <p>*   **4**: the subscription billing method for ApsaraMQ for Confluent instances</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   For more information about the valid values, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
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
     * <p>The edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **normal**: Standard Edition (High Write)</p>
     * <p>*   **professional**: Professional Edition (High Write)</p>
     * <p>*   **professionalForHighRead**: Professional Edition (High Read)</p>
     * <br>
     * <p>For more information, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePrePayOrderShrinkRequestTag> tag;

    /**
     * <p>The number of topics. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   The default value of the TopicQuota parameter varies based on the value of the IoMaxSpec parameter. If the number of topics that you consume exceeds the default value, you are charged additional fees.</p>
     * <p>*   For more information about the valid values, see [Billing](https://help.aliyun.com/document_detail/84737.html).</p>
     */
    @NameInMap("TopicQuota")
    public Integer topicQuota;

    public static CreatePrePayOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrePayOrderShrinkRequest self = new CreatePrePayOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrePayOrderShrinkRequest setConfluentConfigShrink(String confluentConfigShrink) {
        this.confluentConfigShrink = confluentConfigShrink;
        return this;
    }
    public String getConfluentConfigShrink() {
        return this.confluentConfigShrink;
    }

    public CreatePrePayOrderShrinkRequest setDeployType(Integer deployType) {
        this.deployType = deployType;
        return this;
    }
    public Integer getDeployType() {
        return this.deployType;
    }

    public CreatePrePayOrderShrinkRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreatePrePayOrderShrinkRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreatePrePayOrderShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreatePrePayOrderShrinkRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public CreatePrePayOrderShrinkRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public CreatePrePayOrderShrinkRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public CreatePrePayOrderShrinkRequest setPaidType(Integer paidType) {
        this.paidType = paidType;
        return this;
    }
    public Integer getPaidType() {
        return this.paidType;
    }

    public CreatePrePayOrderShrinkRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public CreatePrePayOrderShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePrePayOrderShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePrePayOrderShrinkRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreatePrePayOrderShrinkRequest setTag(java.util.List<CreatePrePayOrderShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePrePayOrderShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreatePrePayOrderShrinkRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static class CreatePrePayOrderShrinkRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * <br>
         * <p>*   Valid values of N: 1 to 20.</p>
         * <p>*   If this parameter is left empty, the keys of all tags are matched.</p>
         * <p>*   The tag key can be up to 128 characters in length and cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
         * <br>
         * <p>This parameter is required.</p>
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

        public static CreatePrePayOrderShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePrePayOrderShrinkRequestTag self = new CreatePrePayOrderShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePrePayOrderShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePrePayOrderShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
