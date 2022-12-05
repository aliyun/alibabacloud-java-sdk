// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamAuthCheckingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamAuthCheckingResponseBody body;

    public static DescribeLiveStreamAuthCheckingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamAuthCheckingResponse self = new DescribeLiveStreamAuthCheckingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamAuthCheckingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamAuthCheckingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamAuthCheckingResponse setBody(DescribeLiveStreamAuthCheckingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamAuthCheckingResponseBody getBody() {
        return this.body;
    }

}
