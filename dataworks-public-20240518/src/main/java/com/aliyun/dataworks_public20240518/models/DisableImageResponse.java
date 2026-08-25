// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DisableImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableImageResponseBody body;

    public static DisableImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableImageResponse self = new DisableImageResponse();
        return TeaModel.build(map, self);
    }

    public DisableImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableImageResponse setBody(DisableImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableImageResponseBody getBody() {
        return this.body;
    }

}
