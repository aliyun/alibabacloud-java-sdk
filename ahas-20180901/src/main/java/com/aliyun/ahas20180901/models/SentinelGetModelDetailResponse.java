// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetModelDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGetModelDetailResponseBody body;

    public static SentinelGetModelDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetModelDetailResponse self = new SentinelGetModelDetailResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGetModelDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGetModelDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGetModelDetailResponse setBody(SentinelGetModelDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGetModelDetailResponseBody getBody() {
        return this.body;
    }

}
