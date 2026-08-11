// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetEncryptionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEncryptionConfigResponseBody body;

    public static GetEncryptionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEncryptionConfigResponse self = new GetEncryptionConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetEncryptionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEncryptionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEncryptionConfigResponse setBody(GetEncryptionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEncryptionConfigResponseBody getBody() {
        return this.body;
    }

}
