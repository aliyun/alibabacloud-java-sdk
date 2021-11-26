// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class SearchRDSTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchRDSTablesResponseBody body;

    public static SearchRDSTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchRDSTablesResponse self = new SearchRDSTablesResponse();
        return TeaModel.build(map, self);
    }

    public SearchRDSTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchRDSTablesResponse setBody(SearchRDSTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchRDSTablesResponseBody getBody() {
        return this.body;
    }

}
