// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePrePayOrderShrinkRequest extends TeaModel {
    /**
     * <p>The configuration of Confluent components.</p>
     * <blockquote>
     * <p>This parameter is required when you create a Confluent series instance.</p>
     * </blockquote>
     */
    @NameInMap("ConfluentConfig")
    public String confluentConfigShrink;

    /**
     * <p>The deployment type. Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong>: Internet/VPC instance</p>
     * </li>
     * <li><p><strong>5</strong>: VPC instance</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you are creating a Confluent series instance, you cannot select the deployment type. You can only set the value to 5. After the purchase, you can adjust whether each component is open to the Internet.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DeployType")
    public Integer deployType;

    /**
     * <p>The disk capacity. Unit: GB.</p>
     * <p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p>If you are creating a Confluent series instance, you do not need to pass this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The disk type. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: ultra disk</p>
     * </li>
     * <li><p><strong>1</strong>: SSD</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you are creating a Confluent series instance, you do not need to pass this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The subscription duration. Unit: month. Default value: 1. Valid values:</p>
     * <ul>
     * <li><p><strong>Confluent instances: 1 or 12</strong></p>
     * </li>
     * <li><p><strong>Kafka instances: 1</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The Internet traffic.</p>
     * <ul>
     * <li><p>If <strong>DeployType</strong> is set to <strong>4</strong>, you must specify this parameter.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/72142.html">pay-as-you-go</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you are creating a Confluent series instance, you do not need to pass this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The traffic peak (not recommended).</p>
     * <ul>
     * <li><p>You must specify either <strong>IoMax</strong> or <strong>IoMaxSpec</strong>. If you specify both parameters, <strong>IoMaxSpec</strong> takes precedence. We recommend that you specify only <strong>IoMaxSpec</strong>.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you are creating a Confluent series instance, you do not need to pass this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification (recommended).</p>
     * <ul>
     * <li><p>You must specify either <strong>IoMax</strong> or <strong>IoMaxSpec</strong>. If you specify both parameters, <strong>IoMaxSpec</strong> takes precedence. We recommend that you specify only <strong>IoMaxSpec</strong>.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you are creating a Confluent series instance, you do not need to pass this parameter.</p>
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
     * <li><p><strong>4</strong>: Confluent series subscription</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions (recommended).</p>
     * <ul>
     * <li><p>You must specify either the number of partitions or the topic specification. We recommend that you specify only the number of partitions.</p>
     * </li>
     * <li><p>If you specify both the number of partitions and the topic specification, the system verifies whether the number of partitions is equivalent to the topic specification based on the old topic sales model. If they are not equivalent, the system returns a failure. If they are equivalent, the system makes the purchase based on the number of partitions.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you are creating a Confluent series instance, you do not need to pass this parameter.</p>
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
     * <p>The resource group ID.</p>
     * <p>If you do not specify this parameter, the instance is added to the default resource group. You can view the resource group ID in the Resource Group console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ac***********7q</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The specification type.</p>
     * <p>Valid values for Kafka instances:</p>
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
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePrePayOrderShrinkRequestTag> tag;

    /**
     * <p>The number of topics (not recommended).</p>
     * <ul>
     * <li><p>You must specify either the number of partitions or the topic specification. We recommend that you specify only the number of partitions.</p>
     * </li>
     * <li><p>If you specify both the number of partitions and the topic specification, the system verifies whether the number of partitions is equivalent to the topic specification based on the old topic sales model. If they are not equivalent, the system returns a failure. If they are equivalent, the system makes the purchase based on the number of partitions.</p>
     * </li>
     * <li><p>The default value varies based on the traffic specification. Additional fees are charged if the value exceeds the default value.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you are creating a Confluent series instance, you do not need to pass this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
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
         * <p>The tag key of the resource.</p>
         * <ul>
         * <li><p>N ranges from 1 to 20.</p>
         * </li>
         * <li><p>If this parameter is empty, all tag keys are matched.</p>
         * </li>
         * <li><p>The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http\:// or https\://.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <ul>
         * <li><p>N ranges from 1 to 20.</p>
         * </li>
         * <li><p>This parameter can be empty.</p>
         * </li>
         * <li><p>The tag value can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http\:// or https\://.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
