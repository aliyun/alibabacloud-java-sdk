// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetMediaUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMediaUrlResponseBody body;

    public static GetMediaUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaUrlResponse self = new GetMediaUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaUrlResponse setBody(GetMediaUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaUrlResponseBody getBody() {
        return this.body;
    }

}
