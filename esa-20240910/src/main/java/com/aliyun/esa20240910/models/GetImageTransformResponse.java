// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetImageTransformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageTransformResponseBody body;

    public static GetImageTransformResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageTransformResponse self = new GetImageTransformResponse();
        return TeaModel.build(map, self);
    }

    public GetImageTransformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageTransformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageTransformResponse setBody(GetImageTransformResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageTransformResponseBody getBody() {
        return this.body;
    }

}
