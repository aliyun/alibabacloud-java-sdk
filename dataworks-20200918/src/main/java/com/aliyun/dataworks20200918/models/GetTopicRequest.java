// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetTopicRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TopicId")
    public Long topicId;

    public static GetTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTopicRequest self = new GetTopicRequest();
        return TeaModel.build(map, self);
    }

    public GetTopicRequest setTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }
    public Long getTopicId() {
        return this.topicId;
    }

}
