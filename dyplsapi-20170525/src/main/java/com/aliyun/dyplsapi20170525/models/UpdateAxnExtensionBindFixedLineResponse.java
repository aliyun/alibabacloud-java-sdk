// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateAxnExtensionBindFixedLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAxnExtensionBindFixedLineResponseBody body;

    public static UpdateAxnExtensionBindFixedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAxnExtensionBindFixedLineResponse self = new UpdateAxnExtensionBindFixedLineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAxnExtensionBindFixedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAxnExtensionBindFixedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAxnExtensionBindFixedLineResponse setBody(UpdateAxnExtensionBindFixedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAxnExtensionBindFixedLineResponseBody getBody() {
        return this.body;
    }

}
