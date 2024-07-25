// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHttpApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHttpApiResponseBody body;

    public static GetHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHttpApiResponse self = new GetHttpApiResponse();
        return TeaModel.build(map, self);
    }

    public GetHttpApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHttpApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHttpApiResponse setBody(GetHttpApiResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHttpApiResponseBody getBody() {
        return this.body;
    }

}
