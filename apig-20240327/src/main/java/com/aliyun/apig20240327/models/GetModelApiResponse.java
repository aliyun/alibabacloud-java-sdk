// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetModelApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelApiResponseBody body;

    public static GetModelApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelApiResponse self = new GetModelApiResponse();
        return TeaModel.build(map, self);
    }

    public GetModelApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelApiResponse setBody(GetModelApiResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelApiResponseBody getBody() {
        return this.body;
    }

}
