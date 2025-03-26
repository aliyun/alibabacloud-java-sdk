// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody extends TeaModel {
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

    public static ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody self = new ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
