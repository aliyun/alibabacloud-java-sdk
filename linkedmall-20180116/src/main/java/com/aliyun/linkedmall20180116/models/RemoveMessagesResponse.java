// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RemoveMessagesResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ActionResult")
    @Validation(required = true)
    public RemoveMessagesResponseActionResult actionResult;

    public static RemoveMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveMessagesResponse self = new RemoveMessagesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveMessagesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveMessagesResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RemoveMessagesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveMessagesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveMessagesResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RemoveMessagesResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RemoveMessagesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveMessagesResponse setActionResult(RemoveMessagesResponseActionResult actionResult) {
        this.actionResult = actionResult;
        return this;
    }
    public RemoveMessagesResponseActionResult getActionResult() {
        return this.actionResult;
    }

    public static class RemoveMessagesResponseActionResult extends TeaModel {
        @NameInMap("ReturnCode")
        @Validation(required = true)
        public String returnCode;

        @NameInMap("ReturnValue")
        @Validation(required = true)
        public String returnValue;

        @NameInMap("ReturnMessage")
        @Validation(required = true)
        public String returnMessage;

        public static RemoveMessagesResponseActionResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveMessagesResponseActionResult self = new RemoveMessagesResponseActionResult();
            return TeaModel.build(map, self);
        }

        public RemoveMessagesResponseActionResult setReturnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }
        public String getReturnCode() {
            return this.returnCode;
        }

        public RemoveMessagesResponseActionResult setReturnValue(String returnValue) {
            this.returnValue = returnValue;
            return this;
        }
        public String getReturnValue() {
            return this.returnValue;
        }

        public RemoveMessagesResponseActionResult setReturnMessage(String returnMessage) {
            this.returnMessage = returnMessage;
            return this;
        }
        public String getReturnMessage() {
            return this.returnMessage;
        }

    }

}
