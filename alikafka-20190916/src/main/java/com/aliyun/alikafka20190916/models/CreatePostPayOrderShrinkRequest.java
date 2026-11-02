// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePostPayOrderShrinkRequest extends TeaModel {
    /**
     * <p>The deployment type. Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong>: Internet- and VPC-connected instance</p>
     * </li>
     * <li><p><strong>5</strong>: VPC-connected instance</p>
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
     * <p>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
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
     * <li><p><strong>1</strong>: standard SSD</p>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The Internet traffic.</p>
     * <ul>
     * <li><p>This parameter is required if <strong>DeployType</strong> is set to <strong>4</strong>.</p>
     * </li>
     * <li><p>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The peak traffic (not recommended).</p>
     * <ul>
     * <li><p>You must specify either the peak traffic or the traffic specification. If both are specified, the traffic specification takes precedence. We recommend that you specify only the traffic specification.</p>
     * </li>
     * <li><p>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
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
     * <li><p>You must specify either the peak traffic or the traffic specification. If both are specified, the traffic specification takes precedence. We recommend that you specify only the traffic specification.</p>
     * </li>
     * <li><p>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
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
     * <li>1 (default): pay-as-you-go for reserved instances</li>
     * <li>3: pay-as-you-go for reserved specifications and elastic scaling of serverless instances</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions (recommended).</p>
     * <ul>
     * <li><p>You must specify either the number of partitions or the topic specification. We recommend that you specify only the number of partitions.</p>
     * </li>
     * <li><p>If both the number of partitions and the topic specification are specified, the system verifies whether they are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the instance is purchased based on the number of partitions.</p>
     * </li>
     * <li><p>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
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
     * <p>If you do not specify this parameter, the instance is added to the default resource group. You can view the resource group ID in the Resource Management console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ac***********7q</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The settings for the serverless instance. This parameter is required when you create a serverless instance.</p>
     */
    @NameInMap("ServerlessConfig")
    public String serverlessConfigShrink;

    /**
     * <p>The specification type.</p>
     * <p>Valid values when the PaidType parameter is set to 1 (pay-as-you-go for reserved instances):</p>
     * <ul>
     * <li>normal: Standard Edition (High Write)</li>
     * <li>professional: Professional Edition (High Write)</li>
     * <li>professionalForHighRead: Professional Edition (High Read)</li>
     * </ul>
     * <p>Valid values when the PaidType parameter is set to 3 (pay-as-you-go for reserved specifications and elastic scaling of serverless instances):</p>
     * <ul>
     * <li>basic: Serverless Basic Edition</li>
     * <li>normal: Serverless Standard Edition</li>
     * <li>professional: Serverless Professional Edition</li>
     * </ul>
     * <p>For more information about the preceding specification types, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
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
     * <p>The number of topics (not recommended).</p>
     * <ul>
     * <li><p>You must specify either the number of partitions or the topic specification. We recommend that you specify only the number of partitions.</p>
     * </li>
     * <li><p>If both the number of partitions and the topic specification are specified, the system verifies whether they are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the instance is purchased based on the number of partitions.</p>
     * </li>
     * <li><p>The default value varies based on the traffic specification. If the number of topics exceeds the default value, you are charged extra fees.</p>
     * </li>
     * <li><p>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
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
         * <p>The tag key of the resource.</p>
         * <ul>
         * <li>N ranges from 1 to 20.</li>
         * <li>If this parameter is left empty, all tag keys are matched.</li>
         * <li>The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</li>
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
         * <li>N ranges from 1 to 20.</li>
         * <li>If the tag key is empty, this parameter must be empty. If this parameter is left empty, all tag values are matched.</li>
         * <li>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</li>
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
