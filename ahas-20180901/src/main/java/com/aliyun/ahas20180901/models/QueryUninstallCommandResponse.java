// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryUninstallCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUninstallCommandResponseBody body;

    public static QueryUninstallCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUninstallCommandResponse self = new QueryUninstallCommandResponse();
        return TeaModel.build(map, self);
    }

    public QueryUninstallCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUninstallCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUninstallCommandResponse setBody(QueryUninstallCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUninstallCommandResponseBody getBody() {
        return this.body;
    }

}
