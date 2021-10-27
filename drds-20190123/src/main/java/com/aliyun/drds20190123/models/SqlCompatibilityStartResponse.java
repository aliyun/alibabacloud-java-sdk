// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SqlCompatibilityStartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SqlCompatibilityStartResponseBody body;

    public static SqlCompatibilityStartResponse build(java.util.Map<String, ?> map) throws Exception {
        SqlCompatibilityStartResponse self = new SqlCompatibilityStartResponse();
        return TeaModel.build(map, self);
    }

    public SqlCompatibilityStartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SqlCompatibilityStartResponse setBody(SqlCompatibilityStartResponseBody body) {
        this.body = body;
        return this;
    }
    public SqlCompatibilityStartResponseBody getBody() {
        return this.body;
    }

}
