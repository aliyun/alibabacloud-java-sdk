// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePostPayInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The deployment type. Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong>: instance that is accessible over the internet and a VPC</p>
     * </li>
     * <li><p><strong>5</strong>: instance that is accessible only over a VPC</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("DeployType")
    public Integer deployType;

    /**
     * <p>The disk capacity.</p>
     * <p>For more information about the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p>This parameter is not required when you create a Serverless instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1500</p>
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
     * <p>This parameter is not required when you create a Serverless instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The Internet traffic.</p>
     * <ul>
     * <li><p>This parameter is required if you set <strong>DeployType</strong> to <strong>4</strong>.</p>
     * </li>
     * <li><p>For more information about the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not required when you create a Serverless instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The traffic specification.</p>
     * <ul>
     * <li>For more information about the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not required when you create a Serverless instance.</p>
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
     * <li><p>1 (default): pay-as-you-go for reserved instances.</p>
     * </li>
     * <li><p>3: pay-as-you-go for reserved capacity and elastic scaling of Serverless instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions.</p>
     * <ul>
     * <li>For more information about the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not required if the instance is a Serverless instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
     * <p>If you do not specify this parameter, the instance is added to the default resource group. You can view the resource group ID in the Resource Group console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ac***********7q</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The settings of the Serverless instance. This parameter is required when you create a Serverless instance.</p>
     */
    @NameInMap("ServerlessConfig")
    public String serverlessConfigShrink;

    /**
     * <p>The edition of the instance.</p>
     * <p>If you set the PaidType parameter to 1 (pay-as-you-go for reserved instances), valid values are:</p>
     * <ul>
     * <li><p>normal: Standard Edition (High-write)</p>
     * </li>
     * <li><p>professional: Professional Edition (High-write)</p>
     * </li>
     * <li><p>professionalForHighRead: Professional Edition (High-read)</p>
     * </li>
     * </ul>
     * <p>If you set the PaidType parameter to 3 (pay-as-you-go for reserved capacity and elastic scaling of Serverless instances), valid values are:</p>
     * <ul>
     * <li><p>basic: Serverless Basic Edition</p>
     * </li>
     * <li><p>normal: Serverless Standard Edition</p>
     * </li>
     * <li><p>professional: Serverless Professional Edition</p>
     * </li>
     * </ul>
     * <p>For more information about these instance editions, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePostPayInstanceShrinkRequestTag> tag;

    public static CreatePostPayInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePostPayInstanceShrinkRequest self = new CreatePostPayInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePostPayInstanceShrinkRequest setDeployType(Integer deployType) {
        this.deployType = deployType;
        return this;
    }
    public Integer getDeployType() {
        return this.deployType;
    }

    public CreatePostPayInstanceShrinkRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreatePostPayInstanceShrinkRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreatePostPayInstanceShrinkRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public CreatePostPayInstanceShrinkRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public CreatePostPayInstanceShrinkRequest setPaidType(Integer paidType) {
        this.paidType = paidType;
        return this;
    }
    public Integer getPaidType() {
        return this.paidType;
    }

    public CreatePostPayInstanceShrinkRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public CreatePostPayInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePostPayInstanceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePostPayInstanceShrinkRequest setServerlessConfigShrink(String serverlessConfigShrink) {
        this.serverlessConfigShrink = serverlessConfigShrink;
        return this;
    }
    public String getServerlessConfigShrink() {
        return this.serverlessConfigShrink;
    }

    public CreatePostPayInstanceShrinkRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreatePostPayInstanceShrinkRequest setTag(java.util.List<CreatePostPayInstanceShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePostPayInstanceShrinkRequestTag> getTag() {
        return this.tag;
    }

    public static class CreatePostPayInstanceShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <ul>
         * <li><p>The value of N can be from 1 to 20.</p>
         * </li>
         * <li><p>If this parameter is left empty, all tag keys are matched.</p>
         * </li>
         * <li><p>The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http\:// or https\://.</p>
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
         * <li><p>The value of N can be from 1 to 20.</p>
         * </li>
         * <li><p>If the tag key is empty, this parameter must also be empty. If this parameter is empty, all tag values are matched.</p>
         * </li>
         * <li><p>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http\:// or https\://.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePostPayInstanceShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePostPayInstanceShrinkRequestTag self = new CreatePostPayInstanceShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePostPayInstanceShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePostPayInstanceShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
