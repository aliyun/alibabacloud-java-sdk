// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetTopicSubscribeStatusRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>You can call the [GetInstanceList](https://help.aliyun.com/document_detail/437663.html) operation to query instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The topic name.</p>
     * <br>
     * <p>You can call the [GetTopicList](https://help.aliyun.com/document_detail/437677.html) operation to query topics.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static GetTopicSubscribeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTopicSubscribeStatusRequest self = new GetTopicSubscribeStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetTopicSubscribeStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTopicSubscribeStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTopicSubscribeStatusRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
