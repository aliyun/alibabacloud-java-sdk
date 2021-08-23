// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeShrinkRequest extends TeaModel {
    @NameInMap("Knowledge")
    public String knowledgeShrink;

    public static UpdateKnowledgeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeShrinkRequest self = new UpdateKnowledgeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeShrinkRequest setKnowledgeShrink(String knowledgeShrink) {
        this.knowledgeShrink = knowledgeShrink;
        return this;
    }
    public String getKnowledgeShrink() {
        return this.knowledgeShrink;
    }

}
