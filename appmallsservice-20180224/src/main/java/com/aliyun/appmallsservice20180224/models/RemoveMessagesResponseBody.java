// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class RemoveMessagesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReturnCode")
    public String returnCode;

    @NameInMap("ReturnMessage")
    public String returnMessage;

    @NameInMap("ReturnValue")
    public String returnValue;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMsg")
    public String subMsg;

    public static RemoveMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveMessagesResponseBody self = new RemoveMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveMessagesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RemoveMessagesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RemoveMessagesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public RemoveMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveMessagesResponseBody setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public RemoveMessagesResponseBody setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
        return this;
    }
    public String getReturnMessage() {
        return this.returnMessage;
    }

    public RemoveMessagesResponseBody setReturnValue(String returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public String getReturnValue() {
        return this.returnValue;
    }

    public RemoveMessagesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RemoveMessagesResponseBody setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
