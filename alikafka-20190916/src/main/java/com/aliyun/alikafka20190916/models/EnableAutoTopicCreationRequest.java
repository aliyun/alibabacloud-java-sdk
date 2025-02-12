// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class EnableAutoTopicCreationRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-v0h1fgs2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The operation that you want to perform. Valid values:</p>
     * <ul>
     * <li>enable: enables the automatic topic creation feature.</li>
     * <li>disable: disables the automatic topic creation feature.</li>
     * <li>updatePartition: changes the number of partitions in topics that are automatically created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("Operate")
    public String operate;

    /**
     * <p>The changed number of partitions in topics that are automatically created.</p>
     * <p>This parameter takes effect only if you set Operate to updatePartition.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PartitionNum")
    public Long partitionNum;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UpdatePartition")
    public Boolean updatePartition;

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

    public EnableAutoTopicCreationRequest setUpdatePartition(Boolean updatePartition) {
        this.updatePartition = updatePartition;
        return this;
    }
    public Boolean getUpdatePartition() {
        return this.updatePartition;
    }

}
