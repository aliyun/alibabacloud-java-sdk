// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePostPayOrderShrinkRequest extends TeaModel {
    /**
     * <p>The disk size. Unit: GB.</p>
     * <br>
     * <p>*   The disk size that you specify must be greater than or equal to the current disk size of the instance.</p>
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The Internet traffic for the instance.</p>
     * <br>
     * <p>*   The Internet traffic volume that you specify must be greater than or equal to the current Internet traffic volume of the instance.</p>
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
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
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum traffic for the instance. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   The maximum traffic that you specify must be greater than or equal to the current maximum traffic of the instance.</p>
     * <p>*   You must configure at least one of the IoMax and IoMaxSpec parameters. If you configure both parameters, the value of the IoMaxSpec parameter takes effect. We recommend that you specify only the IoMaxSpec parameter.</p>
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   The traffic specification that you specify must be greater than or equal to the current traffic specification of the instance.</p>
     * <p>*   You must configure at least one of the IoMax and IoMaxSpec parameters. If you configure both parameters, the value of the IoMaxSpec parameter takes effect. We recommend that you specify only the IoMaxSpec parameter.</p>
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <p>The number of partitions. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
     */
    @NameInMap("PartitionNum")
    public Integer partitionNum;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServerlessConfig")
    public String serverlessConfigShrink;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **normal**: Standard Edition (High Write)</p>
     * <p>*   **professional**: Professional Edition (High Write)</p>
     * <p>*   **professionalForHighRead**: Professional Edition (High Read)</p>
     * <br>
     * <p>You cannot downgrade an instance from the Professional Edition to the Standard Edition. For more information about these instance editions, see [Billing](~~84737~~).</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The number of topics. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   The default value of the TopicQuota parameter varies based on the value of the IoMaxSpec parameter. If the number of topics that you consume exceeds the default value, you are charged additional fees.</p>
     * <p>*   For more information about the valid values, see [Billing](~~84737~~).</p>
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
