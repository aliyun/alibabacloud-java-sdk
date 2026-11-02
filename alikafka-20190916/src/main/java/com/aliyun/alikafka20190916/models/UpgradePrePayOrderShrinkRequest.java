// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePrePayOrderShrinkRequest extends TeaModel {
    /**
     * <p>The Confluent component configurations.</p>
     */
    @NameInMap("ConfluentConfig")
    public String confluentConfigShrink;

    /**
     * <p>The disk capacity.</p>
     * <ul>
     * <li><p>The disk capacity that you specify must be greater than or equal to the current disk capacity of the instance.</p>
     * </li>
     * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you upgrade a Confluent instance, you do not need to specify this parameter. This parameter is required for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The public network traffic.</p>
     * <ul>
     * <li><p>The public network traffic that you specify must be greater than or equal to the current public network traffic of the instance.</p>
     * </li>
     * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If <strong>EipModel</strong> is set to <strong>true</strong>, the value of <strong>EipMax</strong> must be greater than 0.</li>
     * <li>If <strong>EipModel</strong> is set to <strong>false</strong>, the value of <strong>EipMax</strong> must be <strong>0</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>Specifies whether public network access is required. Valid values:</p>
     * <ul>
     * <li><p>true: Public network access is required.</p>
     * </li>
     * <li><p>false: Public network access is not required.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you upgrade a Confluent instance, you do not need to specify this parameter. This parameter is required for subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <li><p>You must specify one of peak traffic and traffic specification. If you specify both, the traffic specification takes precedence. Specify only the traffic specification.</p>
     * </li>
     * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification (recommended).</p>
     * <ul>
     * <li><p>The traffic specification that you specify must be greater than or equal to the current traffic specification of the instance.</p>
     * </li>
     * <li><p>You must specify one of peak traffic and traffic specification. If you specify both, the traffic specification takes precedence. Specify only the traffic specification.</p>
     * </li>
     * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you upgrade a Confluent instance, you do not need to specify this parameter. This parameter is required for subscription instances.</p>
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
     * <li><p><strong>0</strong>: subscription.</p>
     * </li>
     * <li><p><strong>4</strong>: Confluent series subscription.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions (recommended).</p>
     * <ul>
     * <li><p>You must specify one of the number of partitions and the topic specification. Specify only the number of partitions.</p>
     * </li>
     * <li><p>If you specify both the number of partitions and the topic specification, the system validates whether the number of partitions and the topic specification are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the purchase is made based on the number of partitions.</p>
     * </li>
     * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you upgrade a Confluent instance, you do not need to specify this parameter. This parameter is required for subscription instances.</p>
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
     * <p>The specification type.</p>
     * <p>Valid values for ApsaraMQ for Kafka instances:</p>
     * <ul>
     * <li><p><strong>normal</strong>: Standard Edition (shared throughput)</p>
     * </li>
     * <li><p><strong>professional</strong>: Professional Edition (shared throughput)</p>
     * </li>
     * <li><p><strong>professionalForHighRead</strong>: Professional Edition (shared read)</p>
     * </li>
     * </ul>
     * <p>Valid values for Confluent instances:</p>
     * <ul>
     * <li><p><strong>professional</strong>: Professional Edition.</p>
     * </li>
     * <li><p><strong>enterprise</strong>: Enterprise Edition.</p>
     * </li>
     * </ul>
     * <p>Downgrading an instance from Professional Edition to Standard Edition is not supported. For more information about the specification types, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The number of topics (not recommended).</p>
     * <ul>
     * <li><p>You must specify one of the number of partitions and the topic specification. Specify only the number of partitions.</p>
     * </li>
     * <li><p>If you specify both the number of partitions and the topic specification, the system validates whether the number of partitions and the topic specification are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the purchase is made based on the number of partitions.</p>
     * </li>
     * <li><p>The default value varies based on the traffic specification. Additional fees are charged if the value exceeds the default value.</p>
     * </li>
     * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TopicQuota")
    public Integer topicQuota;

    public static UpgradePrePayOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePrePayOrderShrinkRequest self = new UpgradePrePayOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePrePayOrderShrinkRequest setConfluentConfigShrink(String confluentConfigShrink) {
        this.confluentConfigShrink = confluentConfigShrink;
        return this;
    }
    public String getConfluentConfigShrink() {
        return this.confluentConfigShrink;
    }

    public UpgradePrePayOrderShrinkRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public UpgradePrePayOrderShrinkRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public UpgradePrePayOrderShrinkRequest setEipModel(Boolean eipModel) {
        this.eipModel = eipModel;
        return this;
    }
    public Boolean getEipModel() {
        return this.eipModel;
    }

    public UpgradePrePayOrderShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradePrePayOrderShrinkRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public UpgradePrePayOrderShrinkRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public UpgradePrePayOrderShrinkRequest setPaidType(Integer paidType) {
        this.paidType = paidType;
        return this;
    }
    public Integer getPaidType() {
        return this.paidType;
    }

    public UpgradePrePayOrderShrinkRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public UpgradePrePayOrderShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradePrePayOrderShrinkRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public UpgradePrePayOrderShrinkRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

}
