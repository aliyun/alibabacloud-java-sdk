// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SearchMetaTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchMetaTablesResponseBody body;

    public static SearchMetaTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMetaTablesResponse self = new SearchMetaTablesResponse();
        return TeaModel.build(map, self);
    }

    public SearchMetaTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMetaTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchMetaTablesResponse setBody(SearchMetaTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMetaTablesResponseBody getBody() {
        return this.body;
    }

}
