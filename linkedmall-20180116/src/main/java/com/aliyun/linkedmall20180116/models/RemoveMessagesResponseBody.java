// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RemoveMessagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("ActionResult")
    public RemoveMessagesResponseBodyActionResult actionResult;

    public static RemoveMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveMessagesResponseBody self = new RemoveMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveMessagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveMessagesResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RemoveMessagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveMessagesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RemoveMessagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveMessagesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RemoveMessagesResponseBody setActionResult(RemoveMessagesResponseBodyActionResult actionResult) {
        this.actionResult = actionResult;
        return this;
    }
    public RemoveMessagesResponseBodyActionResult getActionResult() {
        return this.actionResult;
    }

    public static class RemoveMessagesResponseBodyActionResult extends TeaModel {
        @NameInMap("ReturnCode")
        public String returnCode;

        @NameInMap("ReturnValue")
        public String returnValue;

        @NameInMap("ReturnMessage")
        public String returnMessage;

        public static RemoveMessagesResponseBodyActionResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveMessagesResponseBodyActionResult self = new RemoveMessagesResponseBodyActionResult();
            return TeaModel.build(map, self);
        }

        public RemoveMessagesResponseBodyActionResult setReturnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }
        public String getReturnCode() {
            return this.returnCode;
        }

        public RemoveMessagesResponseBodyActionResult setReturnValue(String returnValue) {
            this.returnValue = returnValue;
            return this;
        }
        public String getReturnValue() {
            return this.returnValue;
        }

        public RemoveMessagesResponseBodyActionResult setReturnMessage(String returnMessage) {
            this.returnMessage = returnMessage;
            return this;
        }
        public String getReturnMessage() {
            return this.returnMessage;
        }

    }

}
