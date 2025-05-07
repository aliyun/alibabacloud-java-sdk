// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteAxnExtensionBindFixedLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAxnExtensionBindFixedLineResponseBody body;

    public static DeleteAxnExtensionBindFixedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAxnExtensionBindFixedLineResponse self = new DeleteAxnExtensionBindFixedLineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAxnExtensionBindFixedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAxnExtensionBindFixedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAxnExtensionBindFixedLineResponse setBody(DeleteAxnExtensionBindFixedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAxnExtensionBindFixedLineResponseBody getBody() {
        return this.body;
    }

}
