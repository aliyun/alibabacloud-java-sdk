// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePostPayOrderRequest extends TeaModel {
    /**
     * <p>The disk capacity. Unit: GB.</p>
     * <ul>
     * <li><p>The specified disk capacity must be greater than or equal to the current disk capacity of the instance.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the instance is a serverless instance, you do not need to specify this parameter. You must specify this parameter for a pay-as-you-go instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The Internet traffic.</p>
     * <ul>
     * <li>The specified Internet traffic must be greater than or equal to the current Internet traffic of the instance.</li>
     * <li>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If <strong>EipModel</strong> is set to <strong>true</strong>, <strong>EipMax</strong> must be greater than 0.</li>
     * <li>If <strong>EipModel</strong> is set to <strong>false</strong>, <strong>EipMax</strong> must be set to <strong>0</strong>.</li>
     * <li>If the instance is a serverless instance, you do not need to specify this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>Specifies whether to enable Internet access. Valid values:</p>
     * <ul>
     * <li><p>true: enables Internet access.</p>
     * </li>
     * <li><p>false: disables Internet access.</p>
     * <blockquote>
     * <p>You can specify this parameter for a pay-as-you-go instance. You must specify this parameter for a serverless instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EipModel")
    public Boolean eipModel;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-mp919o4v****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The peak traffic. We do not recommend that you specify this parameter.</p>
     * <ul>
     * <li><p>The specified peak traffic must be greater than or equal to the current peak traffic of the instance.</p>
     * </li>
     * <li><p>You must specify either the peak traffic or the traffic specification. If both are specified, the traffic specification takes precedence. We recommend that you specify only the traffic specification.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p>If the instance is a serverless instance, you do not need to specify this parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification. We recommend that you specify this parameter.</p>
     * <ul>
     * <li><p>The specified traffic specification must be greater than or equal to the current traffic specification of the instance.</p>
     * </li>
     * <li><p>You must specify either the peak traffic or the traffic specification. If both are specified, the traffic specification takes precedence. We recommend that you specify only the traffic specification.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p>If the instance is a serverless instance, you do not need to specify this parameter. You must specify this parameter for a pay-as-you-go instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>alikafka.hw.6xlarge</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <p>The number of partitions. We recommend that you specify this parameter.</p>
     * <ul>
     * <li><p>You must specify either the number of partitions or the topic specification. We recommend that you specify only the number of partitions.</p>
     * </li>
     * <li><p>If both the number of partitions and the topic specification are specified, the system verifies whether they are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the purchase is made based on the number of partitions.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p>If the instance is a serverless instance, you do not need to specify this parameter. You must specify this parameter for a pay-as-you-go instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80</p>
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
     * <p>The settings for the serverless instance. This parameter is required when you change the specifications of a serverless instance.</p>
     */
    @NameInMap("ServerlessConfig")
    public UpgradePostPayOrderRequestServerlessConfig serverlessConfig;

    /**
     * <p>The specification type.</p>
     * <p>Valid values when the PaidType parameter of the instance is set to 1 (pay-as-you-go):</p>
     * <ul>
     * <li>normal: Standard Edition (High Write)</li>
     * <li>professional: Professional Edition (High Write)</li>
     * <li>professionalForHighRead: Professional Edition (High Read)</li>
     * </ul>
     * <p>Valid values when the PaidType parameter of the instance is set to 3 (pay-as-you-go for reserved specifications + pay-as-you-go for serverless elastic scaling):</p>
     * <ul>
     * <li>normal: Serverless Standard Edition</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The number of topics. We do not recommend that you specify this parameter.</p>
     * <ul>
     * <li><p>You must specify either the number of partitions or the topic specification. We recommend that you specify only the number of partitions.</p>
     * </li>
     * <li><p>If both the number of partitions and the topic specification are specified, the system verifies whether they are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the purchase is made based on the number of partitions.</p>
     * </li>
     * <li><p>The default value varies based on the traffic specification. If the number of topics exceeds the default value, you are charged extra fees.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p>If the instance is a serverless instance, you do not need to specify this parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80</p>
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
         * <p>The reserved traffic specification for message publishing. Only integers are supported, and the minimum value is 60. This parameter is required for a serverless instance.</p>
         * <blockquote>
         * <p>The actual upper limit is subject to the inventory in the current region. Refer to the available range on the buy page.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("ReservedPublishCapacity")
        public Long reservedPublishCapacity;

        /**
         * <p>The reserved traffic specification for message consumption. Only integers are supported, and the minimum value is 20. This parameter is required for a serverless instance.</p>
         * <blockquote>
         * <p>The actual upper limit is subject to the inventory in the current region. Refer to the available range on the buy page.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
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
