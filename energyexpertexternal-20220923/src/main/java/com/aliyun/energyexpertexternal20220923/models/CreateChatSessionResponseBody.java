// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class CreateChatSessionResponseBody extends TeaModel {
    /**
     * <p>Returned data structure.</p>
     */
    @NameInMap("data")
    public CreateChatSessionResponseBodyData data;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9bc20a5a-b26b-4c28-922a-7cd10b61f96f</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateChatSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatSessionResponseBody self = new CreateChatSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatSessionResponseBody setData(CreateChatSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateChatSessionResponseBodyData getData() {
        return this.data;
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
         * <p>Q&amp;A session ID, used to record multiple Q&amp;A sessions of the same user.</p>
         * 
         * <strong>example:</strong>
         * <p>596ac39c-8855-4128-bad7-78aebeff48fc</p>
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
