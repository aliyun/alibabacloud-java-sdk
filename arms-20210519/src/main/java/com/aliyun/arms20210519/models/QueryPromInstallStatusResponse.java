// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class QueryPromInstallStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryPromInstallStatusResponse setBody(QueryPromInstallStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPromInstallStatusResponseBody getBody() {
        return this.body;
    }

}
