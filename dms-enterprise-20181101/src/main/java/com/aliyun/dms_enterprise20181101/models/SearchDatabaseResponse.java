// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchDatabaseResponseBody body;

    public static SearchDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchDatabaseResponse self = new SearchDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public SearchDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchDatabaseResponse setBody(SearchDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchDatabaseResponseBody getBody() {
        return this.body;
    }

}
