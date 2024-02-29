// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTableResponseBody body;

    public static UpdateTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableResponse self = new UpdateTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTableResponse setBody(UpdateTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTableResponseBody getBody() {
        return this.body;
    }

}
