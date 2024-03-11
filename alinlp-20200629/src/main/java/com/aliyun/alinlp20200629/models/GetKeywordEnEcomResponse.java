// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetKeywordEnEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKeywordEnEcomResponseBody body;

    public static GetKeywordEnEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKeywordEnEcomResponse self = new GetKeywordEnEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetKeywordEnEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKeywordEnEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKeywordEnEcomResponse setBody(GetKeywordEnEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKeywordEnEcomResponseBody getBody() {
        return this.body;
    }

}
