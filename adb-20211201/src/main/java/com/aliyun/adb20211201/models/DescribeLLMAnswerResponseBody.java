// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeLLMAnswerResponseBody extends TeaModel {
    /**
     * <p>The answer by the intelligent assistant to the question.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static DescribeLLMAnswerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLLMAnswerResponseBody self = new DescribeLLMAnswerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLLMAnswerResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeLLMAnswerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLLMAnswerResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
