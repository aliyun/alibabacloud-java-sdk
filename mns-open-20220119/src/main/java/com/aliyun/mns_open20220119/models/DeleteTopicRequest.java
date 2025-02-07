// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class DeleteTopicRequest extends TeaModel {
    /**
     * <p>The name of the topic that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tf-testAccMNSTopic-112965059402264645</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static DeleteTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTopicRequest self = new DeleteTopicRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTopicRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
