// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class EnableAutoTopicCreationRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Operate")
    public String operate;

    @NameInMap("PartitionNum")
    public Long partitionNum;

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
