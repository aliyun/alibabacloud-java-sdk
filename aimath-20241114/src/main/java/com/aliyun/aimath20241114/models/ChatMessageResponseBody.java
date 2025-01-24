// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class ChatMessageResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>Param.Invalid</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>The specified parameter is not valid.</p>
     */
    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>696acaa9-eb29-4c1f-b48a-1f901579acc5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ChatMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatMessageResponseBody self = new ChatMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatMessageResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ChatMessageResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ChatMessageResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ChatMessageResponseBody setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ChatMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChatMessageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
