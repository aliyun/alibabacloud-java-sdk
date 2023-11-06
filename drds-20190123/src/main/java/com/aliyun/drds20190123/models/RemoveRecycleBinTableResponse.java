// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveRecycleBinTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveRecycleBinTableResponseBody body;

    public static RemoveRecycleBinTableResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveRecycleBinTableResponse self = new RemoveRecycleBinTableResponse();
        return TeaModel.build(map, self);
    }

    public RemoveRecycleBinTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveRecycleBinTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveRecycleBinTableResponse setBody(RemoveRecycleBinTableResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveRecycleBinTableResponseBody getBody() {
        return this.body;
    }

}
