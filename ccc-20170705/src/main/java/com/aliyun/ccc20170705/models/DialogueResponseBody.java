// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DialogueResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Feedback")
    public DialogueResponseBodyFeedback feedback;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DialogueResponseBody self = new DialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public DialogueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DialogueResponseBody setFeedback(DialogueResponseBodyFeedback feedback) {
        this.feedback = feedback;
        return this;
    }
    public DialogueResponseBodyFeedback getFeedback() {
        return this.feedback;
    }

    public DialogueResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DialogueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DialogueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DialogueResponseBodyFeedback extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("ActionParams")
        public String actionParams;

        @NameInMap("Content")
        public String content;

        @NameInMap("Interruptible")
        public Boolean interruptible;

        public static DialogueResponseBodyFeedback build(java.util.Map<String, ?> map) throws Exception {
            DialogueResponseBodyFeedback self = new DialogueResponseBodyFeedback();
            return TeaModel.build(map, self);
        }

        public DialogueResponseBodyFeedback setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DialogueResponseBodyFeedback setActionParams(String actionParams) {
            this.actionParams = actionParams;
            return this;
        }
        public String getActionParams() {
            return this.actionParams;
        }

        public DialogueResponseBodyFeedback setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DialogueResponseBodyFeedback setInterruptible(Boolean interruptible) {
            this.interruptible = interruptible;
            return this;
        }
        public Boolean getInterruptible() {
            return this.interruptible;
        }

    }

}
