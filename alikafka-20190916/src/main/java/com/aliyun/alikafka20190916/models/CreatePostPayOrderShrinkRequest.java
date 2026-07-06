// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePostPayOrderShrinkRequest extends TeaModel {
    /**
     * <p>The deployment type. Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong>: An instance that is accessible from the Internet and a VPC.</p>
     * </li>
     * <li><p><strong>5</strong>: An instance that is accessible only from a VPC.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DeployType")
    public Integer deployType;

    /**
     * <p>The disk capacity.</p>
     * <p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p>Do not specify this parameter if you create a Serverless instance.</p>
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
     * <li><p><strong>0</strong>: Ultra disk</p>
     * </li>
     * <li><p><strong>1</strong>: SSD</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Do not specify this parameter if you create a Serverless instance.</p>
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
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Do not specify this parameter if you create a Serverless instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The peak traffic. This parameter is not recommended.</p>
     * <ul>
     * <li><p>You must specify this parameter or \<code>IoMaxSpec\\</code>. If you specify both parameters, the value of \<code>IoMaxSpec\\</code> takes precedence. We recommend that you specify only \<code>IoMaxSpec\\</code>.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Do not specify this parameter if you create a Serverless instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification. This parameter is recommended.</p>
     * <ul>
     * <li><p>You must specify this parameter or \<code>IoMax\\</code>. If you specify both parameters, the value of this parameter takes precedence. We recommend that you specify only this parameter.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Do not specify this parameter if you create a Serverless instance.</p>
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
     * <li><p>1 (default): Pay-as-you-go for a reserved instance.</p>
     * </li>
     * <li><p>3: Pay-as-you-go for a reserved Serverless instance and pay-as-you-go for elastic scaling of a Serverless instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions. This parameter is recommended.</p>
     * <ul>
     * <li><p>You must specify this parameter or \<code>TopicQuota\\</code>. We recommend that you specify only this parameter.</p>
     * </li>
     * <li><p>If you specify both this parameter and \<code>TopicQuota\\</code>, the system verifies whether the values of the two parameters are equivalent based on the previous topic-based sales model. If the values are not equivalent, the system returns a failure. If the values are equivalent, the purchase is made based on the number of partitions.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Do not specify this parameter if you create a Serverless instance.</p>
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
     * <p>The ID of the resource group.</p>
     * <p>If you do not set this parameter, the instance is added to the default resource group. You can view the resource group ID in the Resource Group console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ac***********7q</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The settings of the Serverless instance. This parameter is required if you create a Serverless instance.</p>
     */
    @NameInMap("ServerlessConfig")
    public String serverlessConfigShrink;

    /**
     * <p>The specification type.</p>
     * <p>If you set \<code>PaidType\\</code> to 1 (pay-as-you-go for a reserved instance), valid values are:</p>
     * <ul>
     * <li><p>normal: Standard Edition (High-write)</p>
     * </li>
     * <li><p>professional: Professional Edition (High-write)</p>
     * </li>
     * <li><p>professionalForHighRead: Professional Edition (High-read)</p>
     * </li>
     * </ul>
     * <p>If you set \<code>PaidType\\</code> to 3 (pay-as-you-go for a reserved Serverless instance and pay-as-you-go for elastic scaling of a Serverless instance), valid values are:</p>
     * <ul>
     * <li><p>basic: Serverless Basic Edition</p>
     * </li>
     * <li><p>normal: Serverless Standard Edition</p>
     * </li>
     * <li><p>professional: Serverless Professional Edition</p>
     * </li>
     * </ul>
     * <p>For more information about these specification types, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePostPayOrderShrinkRequestTag> tag;

    /**
     * <p>The number of topics. This parameter is not recommended.</p>
     * <ul>
     * <li><p>You must specify this parameter or \<code>PartitionNum\\</code>. We recommend that you specify only \<code>PartitionNum\\</code>.</p>
     * </li>
     * <li><p>If you specify both this parameter and \<code>PartitionNum\\</code>, the system verifies whether the values of the two parameters are equivalent based on the previous topic-based sales model. If the values are not equivalent, the system returns a failure. If the values are equivalent, the purchase is made based on the number of partitions.</p>
     * </li>
     * <li><p>The default value of this parameter varies based on the traffic specification. You are charged for the extra topics that exceed the default value.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Do not specify this parameter if you create a Serverless instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TopicQuota")
    public Integer topicQuota;

    public static CreatePostPayOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePostPayOrderShrinkRequest self = new CreatePostPayOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePostPayOrderShrinkRequest setDeployType(Integer deployType) {
        this.deployType = deployType;
        return this;
    }
    public Integer getDeployType() {
        return this.deployType;
    }

    public CreatePostPayOrderShrinkRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreatePostPayOrderShrinkRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreatePostPayOrderShrinkRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public CreatePostPayOrderShrinkRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public CreatePostPayOrderShrinkRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public CreatePostPayOrderShrinkRequest setPaidType(Integer paidType) {
        this.paidType = paidType;
        return this;
    }
    public Integer getPaidType() {
        return this.paidType;
    }

    public CreatePostPayOrderShrinkRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public CreatePostPayOrderShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePostPayOrderShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePostPayOrderShrinkRequest setServerlessConfigShrink(String serverlessConfigShrink) {
        this.serverlessConfigShrink = serverlessConfigShrink;
        return this;
    }
    public String getServerlessConfigShrink() {
        return this.serverlessConfigShrink;
    }

    public CreatePostPayOrderShrinkRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public CreatePostPayOrderShrinkRequest setTag(java.util.List<CreatePostPayOrderShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePostPayOrderShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreatePostPayOrderShrinkRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static class CreatePostPayOrderShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <ul>
         * <li><p>N can be an integer from 1 to 20.</p>
         * </li>
         * <li><p>If this parameter is empty, all tag keys are matched.</p>
         * </li>
         * <li><p>The tag key can be up to 128 characters in length. It cannot start with \<code>aliyun\\</code> or \<code>acs:\\</code> and cannot contain \<code>http\\://\\</code> or \<code>https\\://\\</code>.</p>
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
         * <li><p>N can be an integer from 1 to 20.</p>
         * </li>
         * <li><p>This parameter must be empty if the tag key is empty. If this parameter is empty, all tag values are matched.</p>
         * </li>
         * <li><p>The tag value can be up to 128 characters in length. It cannot start with \<code>aliyun\\</code> or \<code>acs:\\</code> and cannot contain \<code>http\\://\\</code> or \<code>https\\://\\</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePostPayOrderShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePostPayOrderShrinkRequestTag self = new CreatePostPayOrderShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePostPayOrderShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePostPayOrderShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
