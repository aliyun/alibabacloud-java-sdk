// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CloseManagedIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CloseManagedIndexResponseBody body;

    public static CloseManagedIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseManagedIndexResponse self = new CloseManagedIndexResponse();
        return TeaModel.build(map, self);
    }

    public CloseManagedIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseManagedIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseManagedIndexResponse setBody(CloseManagedIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseManagedIndexResponseBody getBody() {
        return this.body;
    }

}
