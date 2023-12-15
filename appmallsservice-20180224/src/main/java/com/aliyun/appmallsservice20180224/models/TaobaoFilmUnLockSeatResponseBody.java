// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmUnLockSeatResponseBody extends TeaModel {
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
    public Boolean returnValue;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMsg")
    public String subMsg;

    public static TaobaoFilmUnLockSeatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmUnLockSeatResponseBody self = new TaobaoFilmUnLockSeatResponseBody();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmUnLockSeatResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TaobaoFilmUnLockSeatResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public TaobaoFilmUnLockSeatResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public TaobaoFilmUnLockSeatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaobaoFilmUnLockSeatResponseBody setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public TaobaoFilmUnLockSeatResponseBody setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
        return this;
    }
    public String getReturnMessage() {
        return this.returnMessage;
    }

    public TaobaoFilmUnLockSeatResponseBody setReturnValue(Boolean returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public Boolean getReturnValue() {
        return this.returnValue;
    }

    public TaobaoFilmUnLockSeatResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public TaobaoFilmUnLockSeatResponseBody setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
