// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNodeResponseBody body;

    public static UpdateNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeResponse self = new UpdateNodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNodeResponse setBody(UpdateNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNodeResponseBody getBody() {
        return this.body;
    }

}
