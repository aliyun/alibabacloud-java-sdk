// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ContextualAnswerResponseBody extends TeaModel {
    @NameInMap("Answer")
    public Answer answer;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>22F081FB-90D7-525A-BFE4-D28DC906A28F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ContextualAnswerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContextualAnswerResponseBody self = new ContextualAnswerResponseBody();
        return TeaModel.build(map, self);
    }

    public ContextualAnswerResponseBody setAnswer(Answer answer) {
        this.answer = answer;
        return this;
    }
    public Answer getAnswer() {
        return this.answer;
    }

    public ContextualAnswerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ContextualAnswerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ContextualAnswerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
