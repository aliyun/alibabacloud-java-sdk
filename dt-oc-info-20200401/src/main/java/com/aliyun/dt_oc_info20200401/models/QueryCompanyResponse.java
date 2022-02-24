// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryCompanyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCompanyResponseBody body;

    public static QueryCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCompanyResponse self = new QueryCompanyResponse();
        return TeaModel.build(map, self);
    }

    public QueryCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCompanyResponse setBody(QueryCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCompanyResponseBody getBody() {
        return this.body;
    }

}
