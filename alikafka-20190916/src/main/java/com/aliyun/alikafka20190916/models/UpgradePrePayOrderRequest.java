// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePrePayOrderRequest extends TeaModel {
    /**
     * <p>The number of topics. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   The default value of the TopicQuota parameter varies based on the value of the IoMaxSpec parameter. If the number of topics that you consume exceeds the default value, you are charged additional fees.</p>
     * <p>*   For more information about the valid values, see [Billing overview](~~84737~~).</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The maximum traffic for the instance. We recommend that you do not configure this parameter.</p>
     * <br>
     * <p>*   The maximum traffic volume that you specify must be greater than or equal to the current maximum traffic volume of the instance.</p>
     * <p>*   You must configure at least one of the IoMax and IoMaxSpec parameters. If you configure both parameters, the value of the IoMaxSpec parameter takes effect. We recommend that you configure only the IoMaxSpec parameter.</p>
     * <p>*   For more information about the valid values, see [Billing overview](~~84737~~).</p>
     */
    @NameInMap("EipMax")
    public Integer eipMax;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("EipModel")
    public Boolean eipModel;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **normal**: Standard Edition (High Write)</p>
     * <p>*   **professional**: Professional Edition (High Write)</p>
     * <p>*   **professionalForHighRead**: Professional Edition (High Read)</p>
     * <br>
     * <p>You cannot downgrade an instance from the Professional Edition to the Standard Edition. For more information about these instance editions, see [Billing overview](~~84737~~).</p>
     */
    @NameInMap("IoMax")
    public Integer ioMax;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("IoMaxSpec")
    public String ioMaxSpec;

    /**
     * <p>The number of partitions. We recommend that you configure this parameter.</p>
     * <br>
     * <p>*   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</p>
     * <p>*   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</p>
     * <p>*   For more information about the valid values, see [Billing overview](~~84737~~).</p>
     */
    @NameInMap("PartitionNum")
    public Integer partitionNum;

    /**
     * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("SpecType")
    public String specType;

    /**
     * <p>The Internet traffic for the instance.</p>
     * <br>
     * <p>*   The Internet traffic volume that you specify must be greater than or equal to the current Internet traffic volume of the instance.</p>
     * <p>*   For more information about the valid values, see [Billing overview](~~84737~~).</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If the **EipModel** parameter is set to **true**, set the **EipMax** parameter to a value that is greater than 0.</p>
     * <br>
     * <p>*   If the **EipModel** parameter is set to **false**, set the **EipMax** parameter to **0**.</p>
     */
    @NameInMap("TopicQuota")
    public Integer topicQuota;

    public static UpgradePrePayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePrePayOrderRequest self = new UpgradePrePayOrderRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePrePayOrderRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public UpgradePrePayOrderRequest setEipMax(Integer eipMax) {
        this.eipMax = eipMax;
        return this;
    }
    public Integer getEipMax() {
        return this.eipMax;
    }

    public UpgradePrePayOrderRequest setEipModel(Boolean eipModel) {
        this.eipModel = eipModel;
        return this;
    }
    public Boolean getEipModel() {
        return this.eipModel;
    }

    public UpgradePrePayOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradePrePayOrderRequest setIoMax(Integer ioMax) {
        this.ioMax = ioMax;
        return this;
    }
    public Integer getIoMax() {
        return this.ioMax;
    }

    public UpgradePrePayOrderRequest setIoMaxSpec(String ioMaxSpec) {
        this.ioMaxSpec = ioMaxSpec;
        return this;
    }
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    public UpgradePrePayOrderRequest setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public UpgradePrePayOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradePrePayOrderRequest setSpecType(String specType) {
        this.specType = specType;
        return this;
    }
    public String getSpecType() {
        return this.specType;
    }

    public UpgradePrePayOrderRequest setTopicQuota(Integer topicQuota) {
        this.topicQuota = topicQuota;
        return this;
    }
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

}
