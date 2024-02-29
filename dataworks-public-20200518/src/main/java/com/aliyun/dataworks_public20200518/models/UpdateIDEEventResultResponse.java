// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateIDEEventResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIDEEventResultResponseBody body;

    public static UpdateIDEEventResultResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIDEEventResultResponse self = new UpdateIDEEventResultResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIDEEventResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIDEEventResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIDEEventResultResponse setBody(UpdateIDEEventResultResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIDEEventResultResponseBody getBody() {
        return this.body;
    }

}
