// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class SetEncryptionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetEncryptionConfigResponseBody body;

    public static SetEncryptionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetEncryptionConfigResponse self = new SetEncryptionConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetEncryptionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetEncryptionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetEncryptionConfigResponse setBody(SetEncryptionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetEncryptionConfigResponseBody getBody() {
        return this.body;
    }

}
