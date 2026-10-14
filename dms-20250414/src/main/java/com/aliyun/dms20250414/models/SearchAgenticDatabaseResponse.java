// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SearchAgenticDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchAgenticDatabaseResponseBody body;

    public static SearchAgenticDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAgenticDatabaseResponse self = new SearchAgenticDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public SearchAgenticDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAgenticDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAgenticDatabaseResponse setBody(SearchAgenticDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAgenticDatabaseResponseBody getBody() {
        return this.body;
    }

}
