// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetKeywordChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKeywordChEcomResponseBody body;

    public static GetKeywordChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKeywordChEcomResponse self = new GetKeywordChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetKeywordChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKeywordChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKeywordChEcomResponse setBody(GetKeywordChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKeywordChEcomResponseBody getBody() {
        return this.body;
    }

}
