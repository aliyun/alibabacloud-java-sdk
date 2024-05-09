// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetPageNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPageNumResponseBody body;

    public static GetPageNumResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPageNumResponse self = new GetPageNumResponse();
        return TeaModel.build(map, self);
    }

    public GetPageNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPageNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPageNumResponse setBody(GetPageNumResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPageNumResponseBody getBody() {
        return this.body;
    }

}
