// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class FeedbackResponseBody extends TeaModel {
    @NameInMap("Feedback")
    public String feedback;

    @NameInMap("HttpStatus")
    public Long httpStatus;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FeedbackResponseBody self = new FeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public FeedbackResponseBody setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public FeedbackResponseBody setHttpStatus(Long httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }
    public Long getHttpStatus() {
        return this.httpStatus;
    }

    public FeedbackResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public FeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FeedbackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
