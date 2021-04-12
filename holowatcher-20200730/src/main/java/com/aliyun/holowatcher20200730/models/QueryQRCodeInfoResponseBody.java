// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class QueryQRCodeInfoResponseBody extends TeaModel {
    // msgInfo
    @NameInMap("MsgInfo")
    public String msgInfo;

    // msgCode
    @NameInMap("MsgCode")
    public String msgCode;

    // error
    @NameInMap("Error")
    public String error;

    // traceId
    @NameInMap("RequestId")
    public String requestId;

    // data
    @NameInMap("Data")
    public String data;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static QueryQRCodeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryQRCodeInfoResponseBody self = new QueryQRCodeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryQRCodeInfoResponseBody setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
        return this;
    }
    public String getMsgInfo() {
        return this.msgInfo;
    }

    public QueryQRCodeInfoResponseBody setMsgCode(String msgCode) {
        this.msgCode = msgCode;
        return this;
    }
    public String getMsgCode() {
        return this.msgCode;
    }

    public QueryQRCodeInfoResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public QueryQRCodeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryQRCodeInfoResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryQRCodeInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
