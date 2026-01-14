// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class CallNumberDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CallNumberDetailResponseBody body;

    public static CallNumberDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        CallNumberDetailResponse self = new CallNumberDetailResponse();
        return TeaModel.build(map, self);
    }

    public CallNumberDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CallNumberDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CallNumberDetailResponse setBody(CallNumberDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public CallNumberDetailResponseBody getBody() {
        return this.body;
    }

}
