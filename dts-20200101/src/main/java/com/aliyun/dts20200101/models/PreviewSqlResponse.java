// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class PreviewSqlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PreviewSqlResponseBody body;

    public static PreviewSqlResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewSqlResponse self = new PreviewSqlResponse();
        return TeaModel.build(map, self);
    }

    public PreviewSqlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewSqlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewSqlResponse setBody(PreviewSqlResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewSqlResponseBody getBody() {
        return this.body;
    }

}
