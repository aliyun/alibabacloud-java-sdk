// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class CloseTimedResetOperateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseTimedResetOperateResponseBody body;

    public static CloseTimedResetOperateResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseTimedResetOperateResponse self = new CloseTimedResetOperateResponse();
        return TeaModel.build(map, self);
    }

    public CloseTimedResetOperateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseTimedResetOperateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseTimedResetOperateResponse setBody(CloseTimedResetOperateResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseTimedResetOperateResponseBody getBody() {
        return this.body;
    }

}
