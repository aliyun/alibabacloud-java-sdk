// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteExtensionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExtensionResponseBody body;

    public static DeleteExtensionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExtensionResponse self = new DeleteExtensionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExtensionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExtensionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExtensionResponse setBody(DeleteExtensionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExtensionResponseBody getBody() {
        return this.body;
    }

}
