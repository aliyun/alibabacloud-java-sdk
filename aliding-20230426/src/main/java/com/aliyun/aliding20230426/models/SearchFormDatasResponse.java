// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchFormDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchFormDatasResponseBody body;

    public static SearchFormDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchFormDatasResponse self = new SearchFormDatasResponse();
        return TeaModel.build(map, self);
    }

    public SearchFormDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchFormDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchFormDatasResponse setBody(SearchFormDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchFormDatasResponseBody getBody() {
        return this.body;
    }

}
