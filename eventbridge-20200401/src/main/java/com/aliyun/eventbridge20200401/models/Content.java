// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Content extends TeaModel {
    @NameInMap("MessageAttachments")
    public java.util.List<AguiMessage> messageAttachments;

    @NameInMap("QueryAttachments")
    public java.util.List<QueryAttachment> queryAttachments;

    @NameInMap("TextAttachments")
    public java.util.List<String> textAttachments;

    public static Content build(java.util.Map<String, ?> map) throws Exception {
        Content self = new Content();
        return TeaModel.build(map, self);
    }

    public Content setMessageAttachments(java.util.List<AguiMessage> messageAttachments) {
        this.messageAttachments = messageAttachments;
        return this;
    }
    public java.util.List<AguiMessage> getMessageAttachments() {
        return this.messageAttachments;
    }

    public Content setQueryAttachments(java.util.List<QueryAttachment> queryAttachments) {
        this.queryAttachments = queryAttachments;
        return this;
    }
    public java.util.List<QueryAttachment> getQueryAttachments() {
        return this.queryAttachments;
    }

    public Content setTextAttachments(java.util.List<String> textAttachments) {
        this.textAttachments = textAttachments;
        return this;
    }
    public java.util.List<String> getTextAttachments() {
        return this.textAttachments;
    }

}
