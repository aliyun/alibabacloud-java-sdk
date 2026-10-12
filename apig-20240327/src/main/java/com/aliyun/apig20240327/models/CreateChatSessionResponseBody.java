// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateChatSessionResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public CreateChatSessionResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateChatSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatSessionResponseBody self = new CreateChatSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateChatSessionResponseBody setData(CreateChatSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateChatSessionResponseBodyData getData() {
        return this.data;
    }

    public CreateChatSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateChatSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateChatSessionResponseBodyData extends TeaModel {
        /**
         * <p>The chat session ID. You can use this ID to locate the session in API operations such as UpdateChatSession and DeleteChatSession.</p>
         * 
         * <strong>example:</strong>
         * <p>ses-xxxxxxxx</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static CreateChatSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateChatSessionResponseBodyData self = new CreateChatSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateChatSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
