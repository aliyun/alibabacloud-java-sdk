// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePrePayInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The configurations of the Confluent components.</p>
     * <blockquote>
     * <p>This parameter is required if you create a Confluent instance.</p>
     * </blockquote>
     */
    @NameInMap("ConfluentConfig")
    public String confluentConfigShrink;

    /**
     * <p>The deployment type. Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong>: an instance accessible from the internet and a VPC</p>
     * </li>
     * <li><p><strong>5</strong>: an instance accessible from a VPC only</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a Confluent instance, you cannot specify the deployment type and must set this parameter to 5. After the instance is created, you can configure internet access for each component.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DeployType")
    public Integer deployType;

    /**
     * <p>The disk capacity, in GB.</p>
     * <p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p>This parameter is not required if you create a Confluent instance.</p>
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
     * <p>This parameter is not required if you create a Confluent instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The subscription duration, in months. Default value: 1. Valid values:</p>
     * <ul>
     * <li><p>Confluent instances: <strong>1</strong> and <strong>12</strong></p>
     * </li>
     * <li><p>Kafka instances: <strong>1</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The peak internet bandwidth.</p>
     * <ul>
     * <li><p>This parameter is required if you set <strong>DeployType</strong> to <strong>4</strong>.</p>
     * </li>
     * <li><p>For the value range, see <a href="https://help.aliyun.com/document_detail/72142.html">pay-as-you-go</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not required if you create a Confluent instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The I/O specification.</p>
     * <ul>
     * <li>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not required if you create a Confluent instance.</p>
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
     * <p>1</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions.</p>
     * <ul>
     * <li>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not required if you create a Confluent instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
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
     * <p>The ID of the resource group.</p>
     * <p>If you do not specify this parameter, the instance is placed in the default resource group. You can find the resource group ID in the Resource Group console.</p>
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
     * <li><p><strong>normal</strong>: Standard Edition (High-write)</p>
     * </li>
     * <li><p><strong>professional</strong>: Professional Edition (High-write)</p>
     * </li>
     * <li><p><strong>professionalForHighRead</strong>: Professional Edition (High-read)</p>
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
     * <p>professional</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The tags to attach to the instance. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePrePayInstanceShrinkRequestTag> tag;

    public static CreatePrePayInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrePayInstanceShrinkRequest self = new CreatePrePayInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrePayInstanceShrinkRequest setConfluentConfigShrink(String confluentConfigShrink) {
        this.confluentConfigShrink = confluentConfigShrink;
        return this;
    }
    public String getConfluentConfigShrink() {
        return this.confluentConfigShrink;
    }

    public CreatePrePayInstanceShrinkRequest setDeployType(Integer deployType) {
        this.deployType = deployType;
        return this;
    }
    public Integer getDeployType() {
        return this.deployType;
    }

    public CreatePrePayInstanceShrinkRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreatePrePayInstanceShrinkRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreatePrePayInstanceShrinkRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreatePrePayInstanceShrinkRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public CreatePrePayInstanceShrinkRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public CreatePrePayInstanceShrinkRequest setPaidType(Integer paidType) {
        this.paidType = paidType;
        return this;
    }
    public Integer getPaidType() {
        return this.paidType;
    }

    public CreatePrePayInstanceShrinkRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public CreatePrePayInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePrePayInstanceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePrePayInstanceShrinkRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreatePrePayInstanceShrinkRequest setTag(java.util.List<CreatePrePayInstanceShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePrePayInstanceShrinkRequestTag> getTag() {
        return this.tag;
    }

    public static class CreatePrePayInstanceShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <ul>
         * <li></li>
         * <li></li>
         * <li><p>The key must be 1 to 128 characters long. It cannot start with aliyun or acs:, nor can it contain http\:// or https\://.</p>
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
         * <p>The tag value.</p>
         * <ul>
         * <li></li>
         * <li></li>
         * <li><p>The value can be 0 to 128 characters long. It cannot start with aliyun or acs:, nor can it contain http\:// or https\://.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePrePayInstanceShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePrePayInstanceShrinkRequestTag self = new CreatePrePayInstanceShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePrePayInstanceShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePrePayInstanceShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
