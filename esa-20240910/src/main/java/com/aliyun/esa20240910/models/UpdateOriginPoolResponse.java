// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOriginPoolResponseBody body;

    public static UpdateOriginPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOriginPoolResponse self = new UpdateOriginPoolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOriginPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOriginPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOriginPoolResponse setBody(UpdateOriginPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOriginPoolResponseBody getBody() {
        return this.body;
    }

}
