// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherEnglishParaphraseChatMessageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>how</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("event")
    public String event;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ExecuteAITeacherEnglishParaphraseChatMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherEnglishParaphraseChatMessageResponseBody self = new ExecuteAITeacherEnglishParaphraseChatMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageResponseBody setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public ExecuteAITeacherEnglishParaphraseChatMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
