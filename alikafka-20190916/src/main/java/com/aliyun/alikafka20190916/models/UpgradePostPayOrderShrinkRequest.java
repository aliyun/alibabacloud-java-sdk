// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePostPayOrderShrinkRequest extends TeaModel {
    /**
     * <p>The disk capacity. Unit: GB.</p>
     * <ul>
     * <li><p>The disk capacity that you specify must be greater than or equal to the current disk capacity of the instance.</p>
     * </li>
     * <li><p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the instance is a serverless instance, you do not need to specify this parameter. This parameter is required for pay-as-you-go instances.</p>
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
     * <li>The Internet traffic that you specify must be greater than or equal to the current Internet traffic of the instance.</li>
     * <li>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If EipModel is set to true, the value of EipMax must be greater than 0.</li>
     * <li>If EipModel is set to false, the value of EipMax must be 0.</li>
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
     * <p>Specifies whether the instance requires Internet access. Valid values:</p>
     * <ul>
     * <li><p>true: Internet access is required.</p>
     * </li>
     * <li><p>false: Internet access is not required.</p>
     * <blockquote>
     * <p>This parameter is optional for pay-as-you-go instances. This parameter is required for serverless instances.</p>
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
     * <p>The peak traffic (not recommended).</p>
     * <ul>
     * <li><p>The peak traffic that you specify must be greater than or equal to the current peak traffic of the instance.</p>
     * </li>
     * <li><p>You must specify either the peak traffic or the traffic specification. If you specify both, the traffic specification takes precedence. Specify only the traffic specification.</p>
     * </li>
     * <li><p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
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
     * <p>The traffic specification (recommended).</p>
     * <ul>
     * <li><p>The traffic specification that you specify must be greater than or equal to the current traffic specification of the instance.</p>
     * </li>
     * <li><p>You must specify either the peak traffic or the traffic specification. If you specify both, the traffic specification takes precedence. Specify only the traffic specification.</p>
     * </li>
     * <li><p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p>If the instance is a serverless instance, you do not need to specify this parameter. This parameter is required for pay-as-you-go instances.</p>
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
     * <p>The number of partitions (recommended).</p>
     * <ul>
     * <li><p>You must specify either the number of partitions or the topic specification. Specify only the number of partitions.</p>
     * </li>
     * <li><p>If you specify both the number of partitions and the topic specification, the system validates whether the number of partitions and the topic specification are equivalent based on the legacy topic sales model. If they are not equivalent, an error is returned. If they are equivalent, the purchase is made based on the number of partitions.</p>
     * </li>
     * <li><p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <blockquote>
     * <p>If the instance is a serverless instance, you do not need to specify this parameter. This parameter is required for pay-as-you-go instances.</p>
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
     * <p>The settings of the serverless instance. This parameter is required when you change the specifications of a serverless instance.</p>
     */
    @NameInMap("ServerlessConfig")
    public String serverlessConfigShrink;

    /**
     * <p>The specification type.</p>
     * <p>If the PaidType of the instance is 1 (pay-as-you-go), valid values:</p>
     * <ul>
     * <li>normal: Standard Edition (shared throughput)</li>
     * <li>professional: Professional Edition (shared throughput)</li>
     * <li>professionalForHighRead: Professional Edition (shared read throughput)</li>
     * </ul>
     * <p>If the PaidType of the instance is 3 (reserved specification pay-as-you-go + serverless elastic scaling pay-as-you-go), valid values:</p>
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
     * <p>The number of topics (not recommended).</p>
     * <ul>
     * <li><p>You must specify either the number of partitions or the topic specification. Specify only the number of partitions.</p>
     * </li>
     * <li><p>If you specify both the number of partitions and the topic specification, the system validates whether the number of partitions and the topic specification are equivalent based on the legacy topic sales model. If they are not equivalent, an error is returned. If they are equivalent, the purchase is made based on the number of partitions.</p>
     * </li>
     * <li><p>The default value varies based on the traffic specification. Additional fees are charged if the value exceeds the default value.</p>
     * </li>
     * <li><p>For the value range, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
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

    public static UpgradePostPayOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePostPayOrderShrinkRequest self = new UpgradePostPayOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePostPayOrderShrinkRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public UpgradePostPayOrderShrinkRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public UpgradePostPayOrderShrinkRequest setEipModel(Boolean eipModel) {
        this.eipModel = eipModel;
        return this;
    }
    public Boolean getEipModel() {
        return this.eipModel;
    }

    public UpgradePostPayOrderShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradePostPayOrderShrinkRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public UpgradePostPayOrderShrinkRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public UpgradePostPayOrderShrinkRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public UpgradePostPayOrderShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradePostPayOrderShrinkRequest setServerlessConfigShrink(String serverlessConfigShrink) {
        this.serverlessConfigShrink = serverlessConfigShrink;
        return this;
    }
    public String getServerlessConfigShrink() {
        return this.serverlessConfigShrink;
    }

    public UpgradePostPayOrderShrinkRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public UpgradePostPayOrderShrinkRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

}
