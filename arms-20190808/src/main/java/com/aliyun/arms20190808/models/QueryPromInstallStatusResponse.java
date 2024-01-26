// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryPromInstallStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPromInstallStatusResponseBody body;

    public static QueryPromInstallStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPromInstallStatusResponse self = new QueryPromInstallStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryPromInstallStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPromInstallStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPromInstallStatusResponse setBody(QueryPromInstallStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPromInstallStatusResponseBody getBody() {
        return this.body;
    }

}
