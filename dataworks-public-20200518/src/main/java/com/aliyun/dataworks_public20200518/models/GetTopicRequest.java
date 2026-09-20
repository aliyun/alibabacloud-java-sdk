// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicRequest extends TeaModel {
    /**
     * <p>The ID of the event. You can call <a href="https://help.aliyun.com/document_detail/173973.html">listTopics</a> to obtain the ID.</p>
     * <p>The documentation example is for format demonstration only. Valid TopicId values can be obtained from Data.Topics[].TopicId in the ListTopics response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
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
