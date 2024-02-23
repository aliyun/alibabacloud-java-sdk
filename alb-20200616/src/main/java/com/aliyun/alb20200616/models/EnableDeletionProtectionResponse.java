// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class EnableDeletionProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDeletionProtectionResponseBody body;

    public static EnableDeletionProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDeletionProtectionResponse self = new EnableDeletionProtectionResponse();
        return TeaModel.build(map, self);
    }

    public EnableDeletionProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDeletionProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDeletionProtectionResponse setBody(EnableDeletionProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDeletionProtectionResponseBody getBody() {
        return this.body;
    }

}
