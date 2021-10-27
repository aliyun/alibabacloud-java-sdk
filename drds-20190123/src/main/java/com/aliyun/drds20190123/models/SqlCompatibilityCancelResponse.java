// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SqlCompatibilityCancelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SqlCompatibilityCancelResponseBody body;

    public static SqlCompatibilityCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        SqlCompatibilityCancelResponse self = new SqlCompatibilityCancelResponse();
        return TeaModel.build(map, self);
    }

    public SqlCompatibilityCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SqlCompatibilityCancelResponse setBody(SqlCompatibilityCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public SqlCompatibilityCancelResponseBody getBody() {
        return this.body;
    }

}
