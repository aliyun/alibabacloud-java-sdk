// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyTopicRemarkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Remark")
    public String remark;

    public static ModifyTopicRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTopicRemarkRequest self = new ModifyTopicRemarkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTopicRemarkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTopicRemarkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ModifyTopicRemarkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyTopicRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
