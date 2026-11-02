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
     * <p>Only the following three values are supported:</p>
     * <ul>
     * <li>enable: Enables automatic automatic creation.</li>
     * <li>disable: Disables automatic automatic creation.</li>
     * <li>updatePartition: Modifies the number of automatically created partitions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("Operate")
    public String operate;

    /**
     * <p>The default number of partitions for automatically created topics.</p>
     * <blockquote>
     * <p> Specify this parameter only when Operate is set to updatePartition or UpdatePartition is set to true.</p>
     * </blockquote>
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

    /**
     * <p>Specifies whether to modify the number of partitions for automatic creation.</p>
     * <blockquote>
     * <p> If this parameter is set to true, the Operate parameter must be set to updatePartition or left empty.</p>
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
