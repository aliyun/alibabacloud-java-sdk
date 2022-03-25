// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PublishRealResponseBody extends TeaModel {
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

    public static PublishRealResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishRealResponseBody self = new PublishRealResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishRealResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PublishRealResponseBody setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public PublishRealResponseBody setMsgCode(String msgCode) {
        this.msgCode = msgCode;
        return this;
    }
    public String getMsgCode() {
        return this.msgCode;
    }

    public PublishRealResponseBody setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
        return this;
    }
    public String getMsgInfo() {
        return this.msgInfo;
    }

    public PublishRealResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishRealResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
