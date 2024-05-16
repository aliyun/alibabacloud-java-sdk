// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class EnableAutoTopicCreationRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The operation that you want to perform. Valid values:</p>
     * <br>
     * <p>*   enable: enables the automatic topic creation feature.</p>
     * <p>*   disable: disables the automatic topic creation feature.</p>
     * <p>*   updatePartition: changes the number of partitions in topics that are automatically created.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Operate")
    public String operate;

    /**
     * <p>The changed number of partitions in topics that are automatically created.</p>
     * <br>
     * <p>This parameter takes effect only if you set Operate to updatePartition.</p>
     */
    @NameInMap("PartitionNum")
    public Long partitionNum;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static EnableAutoTopicCreationRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAutoTopicCreationRequest self = new EnableAutoTopicCreationRequest();
        return TeaModel.build(map, self);
    }

    public EnableAutoTopicCreationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableAutoTopicCreationRequest setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

    public EnableAutoTopicCreationRequest setPartitionNum(Long partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Long getPartitionNum() {
        return this.partitionNum;
    }

    public EnableAutoTopicCreationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
