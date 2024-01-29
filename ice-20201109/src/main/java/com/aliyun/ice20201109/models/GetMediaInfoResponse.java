// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaInfoResponseBody body;

    public static GetMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaInfoResponse self = new GetMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaInfoResponse setBody(GetMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaInfoResponseBody getBody() {
        return this.body;
    }

}
