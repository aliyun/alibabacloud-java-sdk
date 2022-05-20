// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetTopicAttributesRequest extends TeaModel {
    @NameInMap("TopicName")
    public String topicName;

    public static GetTopicAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTopicAttributesRequest self = new GetTopicAttributesRequest();
        return TeaModel.build(map, self);
    }

    public GetTopicAttributesRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
