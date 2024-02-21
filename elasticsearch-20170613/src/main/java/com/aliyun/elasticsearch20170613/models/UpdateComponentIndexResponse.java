// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateComponentIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComponentIndexResponseBody body;

    public static UpdateComponentIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentIndexResponse self = new UpdateComponentIndexResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComponentIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComponentIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComponentIndexResponse setBody(UpdateComponentIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComponentIndexResponseBody getBody() {
        return this.body;
    }

}
