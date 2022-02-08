// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class SendTaskMetaCallbackResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("RequestId")
    public String requestId;

    public static SendTaskMetaCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendTaskMetaCallbackResponseBody self = new SendTaskMetaCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public SendTaskMetaCallbackResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendTaskMetaCallbackResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public SendTaskMetaCallbackResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public SendTaskMetaCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
