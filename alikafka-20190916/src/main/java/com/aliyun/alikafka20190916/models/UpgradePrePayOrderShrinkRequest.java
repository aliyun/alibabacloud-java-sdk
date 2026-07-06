// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePrePayOrderShrinkRequest extends TeaModel {
    /**
     * <p>Configurations for the Confluent components.</p>
     */
    @NameInMap("ConfluentConfig")
    public String confluentConfigShrink;

    /**
     * <p>The disk capacity.</p>
     * <ul>
     * <li><p>The specified disk capacity must be greater than or equal to the current disk capacity of the instance.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for subscription instances but not for Confluent-series instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The maximum Internet traffic bandwidth.</p>
     * <ul>
     * <li><p>The specified Internet traffic bandwidth must be greater than or equal to the current Internet traffic bandwidth of the instance.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If <strong>EipModel</strong> is set to <strong>true</strong>, <strong>EipMax</strong> must be greater than 0.</p>
     * </li>
     * <li><p>If <strong>EipModel</strong> is set to <strong>false</strong>, <strong>EipMax</strong> must be set to <strong>0</strong>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>Specifies whether to enable Internet access. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: enables Internet access.</p>
     * </li>
     * <li><p><code>false</code>: disables Internet access.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for subscription instances but not for Confluent-series instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EipModel")
    public Boolean eipModel;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-mp919o4v****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The traffic peak (not recommended).</p>
     * <ul>
     * <li><p>The specified traffic peak must be greater than or equal to the current traffic peak of the instance.</p>
     * </li>
     * <li><p>You must specify either this parameter or <code>IoMaxSpec</code>. If you specify both, <code>IoMaxSpec</code> takes precedence. We recommend that you specify only <code>IoMaxSpec</code>.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
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
     * <li><p>The specified traffic specification must be greater than or equal to the current traffic specification of the instance.</p>
     * </li>
     * <li><p>You must specify either this parameter or <code>IoMax</code>. If you specify both, this parameter takes precedence. We recommend that you specify only this parameter.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for subscription instances but not for Confluent-series instances.</p>
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
     * <p>4</p>
     */
    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions (recommended).</p>
     * <ul>
     * <li><p>You must specify either this parameter or <code>TopicQuota</code>. We recommend that you specify only this parameter.</p>
     * </li>
     * <li><p>If you specify both <code>PartitionNum</code> and <code>TopicQuota</code>, the system checks if their values are equivalent under the previous topic pricing model. A mismatch causes the request to fail. If they match, the system uses <code>PartitionNum</code> to process the purchase.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for subscription instances but not for Confluent-series instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PartitionNum")
    public Integer partitionNum;

    /**
     * <p>The ID of the region where the instance is located.</p>
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
     * <p>You cannot downgrade an instance from Professional Edition to Standard Edition. For more information about these specification types, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The number of topics (not recommended).</p>
     * <ul>
     * <li><p>You must specify either this parameter or <code>PartitionNum</code>. We recommend that you specify only <code>PartitionNum</code>.</p>
     * </li>
     * <li><p>If you specify both <code>TopicQuota</code> and <code>PartitionNum</code>, the system checks if their values are equivalent under the previous topic pricing model. A mismatch causes the request to fail. If they match, the system uses <code>PartitionNum</code> to process the purchase.</p>
     * </li>
     * <li><p>The default value of this parameter varies based on the traffic specification. You are charged additional fees if the specified value exceeds the default value.</p>
     * </li>
     * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
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
