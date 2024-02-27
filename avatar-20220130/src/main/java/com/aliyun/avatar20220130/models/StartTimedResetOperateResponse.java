// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class StartTimedResetOperateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartTimedResetOperateResponseBody body;

    public static StartTimedResetOperateResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTimedResetOperateResponse self = new StartTimedResetOperateResponse();
        return TeaModel.build(map, self);
    }

    public StartTimedResetOperateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTimedResetOperateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTimedResetOperateResponse setBody(StartTimedResetOperateResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTimedResetOperateResponseBody getBody() {
        return this.body;
    }

}
