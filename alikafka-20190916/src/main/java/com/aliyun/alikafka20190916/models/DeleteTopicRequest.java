// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteTopicRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the topic.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static DeleteTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTopicRequest self = new DeleteTopicRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteTopicRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
