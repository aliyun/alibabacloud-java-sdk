// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RemoveMessagesResponseBody extends TeaModel {
    @NameInMap("ActionResult")
    public RemoveMessagesResponseBodyActionResult actionResult;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogsId")
    public String logsId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1718921E-C8D4-55E1-B8D4-114AE537C1B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RemoveMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveMessagesResponseBody self = new RemoveMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveMessagesResponseBody setActionResult(RemoveMessagesResponseBodyActionResult actionResult) {
        this.actionResult = actionResult;
        return this;
    }
    public RemoveMessagesResponseBodyActionResult getActionResult() {
        return this.actionResult;
    }

    public RemoveMessagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveMessagesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RemoveMessagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveMessagesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RemoveMessagesResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RemoveMessagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveMessagesResponseBodyActionResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReturnCode")
        public String returnCode;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ReturnMessage")
        public String returnMessage;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;uuid\&quot;: \&quot;dim-a0bf795*******8e86d4d464dc3a\&quot;, \&quot;code\&quot;: \&quot;itm\&quot;, \&quot;extendName\&quot;: \&quot;item\&quot;, \&quot;name\&quot;: u\&quot;\u5541\&quot;, \&quot;description\&quot;: u\&quot;\u5546\u4e49\&quot;}]</p>
         */
        @NameInMap("ReturnValue")
        public String returnValue;

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

        public RemoveMessagesResponseBodyActionResult setReturnMessage(String returnMessage) {
            this.returnMessage = returnMessage;
            return this;
        }
        public String getReturnMessage() {
            return this.returnMessage;
        }

        public RemoveMessagesResponseBodyActionResult setReturnValue(String returnValue) {
            this.returnValue = returnValue;
            return this;
        }
        public String getReturnValue() {
            return this.returnValue;
        }

    }

}
