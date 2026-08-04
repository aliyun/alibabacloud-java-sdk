// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePostPayOrderRequest extends TeaModel {
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
     * <p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to set this parameter.</p>
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
     * <li><p><strong>0</strong>: premium cloud disk</p>
     * </li>
     * <li><p><strong>1</strong>: SSD</p>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to set this parameter.</p>
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
     * <li><p>If <strong>DeployType</strong> is set to <strong>4</strong>, this parameter is required.</p>
     * </li>
     * <li><p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The maximum traffic (not recommended).</p>
     * <ul>
     * <li><p>You must specify one of IoMax and IoMaxSpec. If both parameters are specified, the value of IoMaxSpec takes precedence. Specify only IoMaxSpec.</p>
     * </li>
     * <li><p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to set this parameter.</p>
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
     * <li><p>You must specify one of IoMax and IoMaxSpec. If both parameters are specified, the value of IoMaxSpec takes precedence. Specify only IoMaxSpec.</p>
     * </li>
     * <li><p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>alikafka.hw.2xlarge</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <p>The billing type. Valid values:</p>
     * <ul>
     * <li>1 (default): reserved instance with pay-as-you-go billing.</li>
     * <li>3: serverless instance with reserved specification pay-as-you-go billing + serverless elastic scaling pay-as-you-go billing.</li>
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
     * <li><p>You must specify one of PartitionNum and TopicQuota. Specify only PartitionNum.</p>
     * </li>
     * <li><p>If both PartitionNum and TopicQuota are specified, the system verifies whether the values are equivalent based on the legacy topic sales model. If the values are not equivalent, the request fails. If the values are equivalent, the purchase is made based on the number of partitions.</p>
     * </li>
     * <li><p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to set this parameter.</p>
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
     * <p>If this parameter is not specified, the instance is placed in the default resource group. You can view the resource group ID in the Resource Management console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ac***********7q</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The settings of the serverless instance. This parameter is required when you create a serverless instance.</p>
     */
    @NameInMap("ServerlessConfig")
    public CreatePostPayOrderRequestServerlessConfig serverlessConfig;

    /**
     * <p>The specification type.</p>
     * <p>Valid values when PaidType is set to 1 (reserved instance with pay-as-you-go billing):</p>
     * <ul>
     * <li>normal: Standard Edition (shared throughput for writes)</li>
     * <li>professional: Professional Edition (shared throughput for writes)</li>
     * <li>professionalForHighRead: Professional Edition (shared throughput for reads)</li>
     * </ul>
     * <p>Valid values when PaidType is set to 3 (serverless instance with reserved specification pay-as-you-go billing + serverless elastic scaling pay-as-you-go billing):</p>
     * <ul>
     * <li>basic: Serverless Basic Edition</li>
     * <li>normal: Serverless Standard Edition</li>
     * <li>professional: Serverless Professional Edition</li>
     * </ul>
     * <p>For more information about these specification types, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
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
    public java.util.List<CreatePostPayOrderRequestTag> tag;

    /**
     * <p>The number of topics (not recommended).</p>
     * <ul>
     * <li><p>You must specify one of PartitionNum and TopicQuota. Specify only PartitionNum.</p>
     * </li>
     * <li><p>If both PartitionNum and TopicQuota are specified, the system verifies whether the values are equivalent based on the legacy topic sales model. If the values are not equivalent, the request fails. If the values are equivalent, the purchase is made based on the number of partitions.</p>
     * </li>
     * <li><p>The default value varies based on the traffic specification. If the value exceeds the default value, additional fees are charged.</p>
     * </li>
     * <li><p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you create a serverless instance, you do not need to set this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
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
         * <p>The reserved publish traffic specification value. Only integers are supported. The minimum value is 60. This parameter is required for serverless instances.</p>
         * <blockquote>
         * <p>The actual upper limit depends on the inventory in the current region. Refer to the purchase page for the available range.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("ReservedPublishCapacity")
        public Long reservedPublishCapacity;

        /**
         * <p>The reserved subscribe traffic specification value. Only integers are supported. The minimum value is 20. This parameter is required for serverless instances.</p>
         * <blockquote>
         * <p>The actual upper limit depends on the inventory in the current region. Refer to the purchase page for the available range.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
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
         * <p>The tag key of the resource.</p>
         * <ul>
         * <li>N ranges from 1 to 20.</li>
         * <li>If this parameter is left empty, all tag keys are matched.</li>
         * <li>The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</li>
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
         * <li>If the tag key is left empty, this parameter must also be left empty. If this parameter is left empty, all tag values are matched.</li>
         * <li>The tag value can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
