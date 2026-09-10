// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetInnerReadAsyncResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInnerReadAsyncResultResponseBody body;

    public static GetInnerReadAsyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInnerReadAsyncResultResponse self = new GetInnerReadAsyncResultResponse();
        return TeaModel.build(map, self);
    }

    public GetInnerReadAsyncResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInnerReadAsyncResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInnerReadAsyncResultResponse setBody(GetInnerReadAsyncResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInnerReadAsyncResultResponseBody getBody() {
        return this.body;
    }

}
