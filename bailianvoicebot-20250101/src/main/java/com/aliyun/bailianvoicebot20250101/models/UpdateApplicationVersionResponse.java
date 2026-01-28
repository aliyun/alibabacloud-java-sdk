// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class UpdateApplicationVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationVersionResponseBody body;

    public static UpdateApplicationVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationVersionResponse self = new UpdateApplicationVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationVersionResponse setBody(UpdateApplicationVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationVersionResponseBody getBody() {
        return this.body;
    }

}
