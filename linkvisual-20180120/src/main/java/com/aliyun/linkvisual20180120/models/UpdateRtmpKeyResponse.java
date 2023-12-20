// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateRtmpKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRtmpKeyResponseBody body;

    public static UpdateRtmpKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtmpKeyResponse self = new UpdateRtmpKeyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRtmpKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRtmpKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRtmpKeyResponse setBody(UpdateRtmpKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRtmpKeyResponseBody getBody() {
        return this.body;
    }

}
