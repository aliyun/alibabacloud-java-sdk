// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetBrandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBrandResponseBody body;

    public static GetBrandResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBrandResponse self = new GetBrandResponse();
        return TeaModel.build(map, self);
    }

    public GetBrandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBrandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBrandResponse setBody(GetBrandResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBrandResponseBody getBody() {
        return this.body;
    }

}
