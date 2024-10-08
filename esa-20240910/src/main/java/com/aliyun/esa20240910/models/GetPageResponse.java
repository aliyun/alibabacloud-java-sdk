// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPageResponseBody body;

    public static GetPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPageResponse self = new GetPageResponse();
        return TeaModel.build(map, self);
    }

    public GetPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPageResponse setBody(GetPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPageResponseBody getBody() {
        return this.body;
    }

}
