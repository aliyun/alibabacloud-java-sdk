// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyTopicRemarkRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The description of the topic.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The name of the topic.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Topic")
    public String topic;

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

    public ModifyTopicRemarkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
