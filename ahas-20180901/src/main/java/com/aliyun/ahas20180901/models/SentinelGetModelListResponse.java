// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetModelListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGetModelListResponseBody body;

    public static SentinelGetModelListResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetModelListResponse self = new SentinelGetModelListResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGetModelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGetModelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGetModelListResponse setBody(SentinelGetModelListResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGetModelListResponseBody getBody() {
        return this.body;
    }

}
