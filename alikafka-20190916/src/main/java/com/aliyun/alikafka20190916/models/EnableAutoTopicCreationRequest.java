// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class EnableAutoTopicCreationRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-v0h1fgs2****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Currently only these three request parameters are supported:</p>
     * <ul>
     * <li><p>enable: Enable automatic topic creation.</p>
     * </li>
     * <li><p>disable: Disable automatic topic creation.</p>
     * </li>
     * <li><p>updatePartition: Modify the number of partitions for automatic creation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("Operate")
    public String operate;

    /**
     * <p>Adjust the default number of partitions for automatically created topics.</p>
     * <blockquote>
     * <p>This value is passed only when the Operate value is updatePartition, or when UpdatePartition is true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PartitionNum")
    public Long partitionNum;

    /**
     * <p>Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Modify the number of partitions for automatic creation.</p>
     * <blockquote>
     * <p>If this parameter is set to true, the Operate parameter must be updatePartition or left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
