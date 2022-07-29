// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class SearchContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchContentResponseBody body;

    public static SearchContentResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchContentResponse self = new SearchContentResponse();
        return TeaModel.build(map, self);
    }

    public SearchContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchContentResponse setBody(SearchContentResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchContentResponseBody getBody() {
        return this.body;
    }

}
