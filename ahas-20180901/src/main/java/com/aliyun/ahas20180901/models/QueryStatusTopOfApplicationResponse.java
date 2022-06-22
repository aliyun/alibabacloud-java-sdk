// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryStatusTopOfApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryStatusTopOfApplicationResponseBody body;

    public static QueryStatusTopOfApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatusTopOfApplicationResponse self = new QueryStatusTopOfApplicationResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatusTopOfApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStatusTopOfApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStatusTopOfApplicationResponse setBody(QueryStatusTopOfApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStatusTopOfApplicationResponseBody getBody() {
        return this.body;
    }

}
