// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyPartitionNumRequest extends TeaModel {
    /**
     * <p>The number of partitions that you want to add to the topic.</p>
     * <ul>
     * <li>The value must be an integer that is greater than 0.</li>
     * <li>To reduce the risk of data skew, we recommend that you set the value to a multiple of 6.</li>
     * <li>The number of total partitions ranges from 1 to 360.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("AddPartitionNum")
    public Integer addPartitionNum;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-0pp1l9z****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>The topic name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TopicPartitionNum</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static ModifyPartitionNumRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPartitionNumRequest self = new ModifyPartitionNumRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPartitionNumRequest setAddPartitionNum(Integer addPartitionNum) {
        this.addPartitionNum = addPartitionNum;
        return this;
    }
    public Integer getAddPartitionNum() {
        return this.addPartitionNum;
    }

    public ModifyPartitionNumRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPartitionNumRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPartitionNumRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
