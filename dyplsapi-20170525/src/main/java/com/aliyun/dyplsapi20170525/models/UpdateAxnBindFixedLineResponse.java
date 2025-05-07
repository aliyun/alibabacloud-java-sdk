// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateAxnBindFixedLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAxnBindFixedLineResponseBody body;

    public static UpdateAxnBindFixedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAxnBindFixedLineResponse self = new UpdateAxnBindFixedLineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAxnBindFixedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAxnBindFixedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAxnBindFixedLineResponse setBody(UpdateAxnBindFixedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAxnBindFixedLineResponseBody getBody() {
        return this.body;
    }

}
