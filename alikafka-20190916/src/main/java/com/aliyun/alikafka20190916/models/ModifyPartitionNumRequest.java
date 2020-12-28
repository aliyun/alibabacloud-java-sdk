// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyPartitionNumRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AddPartitionNum")
    public Integer addPartitionNum;

    public static ModifyPartitionNumRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPartitionNumRequest self = new ModifyPartitionNumRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPartitionNumRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPartitionNumRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ModifyPartitionNumRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPartitionNumRequest setAddPartitionNum(Integer addPartitionNum) {
        this.addPartitionNum = addPartitionNum;
        return this;
    }
    public Integer getAddPartitionNum() {
        return this.addPartitionNum;
    }

}
