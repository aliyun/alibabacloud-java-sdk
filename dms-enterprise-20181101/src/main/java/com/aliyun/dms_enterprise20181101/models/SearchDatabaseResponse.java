// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public SearchDatabaseResponse setBody(SearchDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchDatabaseResponseBody getBody() {
        return this.body;
    }

}
