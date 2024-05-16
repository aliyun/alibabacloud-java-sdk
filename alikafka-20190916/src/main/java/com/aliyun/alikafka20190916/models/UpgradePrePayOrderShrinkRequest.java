// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePrePayOrderShrinkRequest extends TeaModel {
    @NameInMap("ConfluentConfig")
    public String confluentConfigShrink;

    /**
     * <p>The size of the disk.</p>
     * <br>
     * <p>*   The disk size that you specify must be greater than or equal to the current disk size of the instance.</p>
     * <p>*   For more information about the valid values, see [Billing overview](https://help.aliyun.com/document_detail/84737.html).</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The Internet traffic for the instance.</p>
     * <br>
     * <p>*   The Internet traffic volume that you specify must be greater than or equal to the current Internet traffic volume of the instance.</p>
     * <p>*   For more information about the valid values, see [Billing overview](https://help.aliyun.com/document_detail/84737.html).</p>
     * <p>> - If the **EipModel** parameter is set to **true**, set the **EipMax** parameter to a value that is greater than 0.</p>
     * <p>> - If the **EipModel** parameter is set to **false**, set the **EipMax** parameter to **0**.</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>Specifies whether to enable Internet access for the instance. Valid values:</p>
     * <br>
     * <p>*   true: enables Internet access.</p>
     * <p>*   false: disables Internet access.</p>
     */
    @NameInMap("EipModel")
    public Boolean eipModel;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum traffic for the instance. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   The maximum traffic volume that you specify must be greater than or equal to the current maximum traffic volume of the instance.</p>
     * <p>*   You must configure at least one of the IoMax and IoMaxSpec parameters. If you configure both parameters, the value of the IoMaxSpec parameter takes effect. We recommend that you configure only the IoMaxSpec parameter.</p>
     * <p>*   For more information about the valid values, see [Billing overview](https://help.aliyun.com/document_detail/84737.html).</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   The traffic specification that you specify must be greater than or equal to the current traffic specification of the instance.</p>
     * <p>*   You must configure at least one of the IoMax and IoMaxSpec parameters. If you configure both parameters, the value of the IoMaxSpec parameter takes effect. We recommend that you configure only the IoMaxSpec parameter.</p>
     * <p>*   For more information about the valid values, see [Billing overview](https://help.aliyun.com/document_detail/84737.html).</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    @NameInMap("PaidType")
    public Integer paidType;

    /**
     * <p>The number of partitions. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   For more information about the valid values, see [Billing overview](https://help.aliyun.com/document_detail/84737.html).</p>
     */
    @NameInMap("PartitionNum")
    public Integer partitionNum;

    /**
     * <p>The region ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **normal**: Standard Edition (High Write)</p>
     * <p>*   **professional**: Professional Edition (High Write)</p>
     * <p>*   **professionalForHighRead**: Professional Edition (High Read)</p>
     * <br>
     * <p>You cannot downgrade an instance from the Professional Edition to the Standard Edition. For more information about these instance editions, see [Billing overview](https://help.aliyun.com/document_detail/84737.html).</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The number of topics. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   The default value of the TopicQuota parameter varies based on the value of the IoMaxSpec parameter. If the number of topics that you consume exceeds the default value, you are charged additional fees.</p>
     * <p>*   For more information about the valid values, see [Billing overview](https://help.aliyun.com/document_detail/84737.html).</p>
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
