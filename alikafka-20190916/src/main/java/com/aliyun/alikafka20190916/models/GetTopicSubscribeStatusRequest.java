// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetTopicSubscribeStatusRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/437663.html">GetInstanceList</a> to obtain it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_pre-cn-v0h1cng0***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>Topic name.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/437677.html">GetTopicList</a> to obtain it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>topic_name</p>
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
