// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class QueryHostInstanceConsoleInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHostInstanceConsoleInfoResponseBody body;

    public static QueryHostInstanceConsoleInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHostInstanceConsoleInfoResponse self = new QueryHostInstanceConsoleInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryHostInstanceConsoleInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHostInstanceConsoleInfoResponse setBody(QueryHostInstanceConsoleInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHostInstanceConsoleInfoResponseBody getBody() {
        return this.body;
    }

}
