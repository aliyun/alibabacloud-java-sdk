// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateQRCodeAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQRCodeAuthorityResponseBody body;

    public static UpdateQRCodeAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQRCodeAuthorityResponse self = new UpdateQRCodeAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQRCodeAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQRCodeAuthorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQRCodeAuthorityResponse setBody(UpdateQRCodeAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQRCodeAuthorityResponseBody getBody() {
        return this.body;
    }

}
