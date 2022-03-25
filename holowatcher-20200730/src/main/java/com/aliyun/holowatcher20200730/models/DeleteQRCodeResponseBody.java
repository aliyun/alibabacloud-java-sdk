// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DeleteQRCodeResponseBody extends TeaModel {
    // data
    @NameInMap("Data")
    public String data;

    // error
    @NameInMap("Error")
    public String error;

    // msgCode
    @NameInMap("MsgCode")
    public String msgCode;

    // msgInfo
    @NameInMap("MsgInfo")
    public String msgInfo;

    // traceId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static DeleteQRCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQRCodeResponseBody self = new DeleteQRCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQRCodeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteQRCodeResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public DeleteQRCodeResponseBody setMsgCode(String msgCode) {
        this.msgCode = msgCode;
        return this;
    }
    public String getMsgCode() {
        return this.msgCode;
    }

    public DeleteQRCodeResponseBody setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
        return this;
    }
    public String getMsgInfo() {
        return this.msgInfo;
    }

    public DeleteQRCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteQRCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
