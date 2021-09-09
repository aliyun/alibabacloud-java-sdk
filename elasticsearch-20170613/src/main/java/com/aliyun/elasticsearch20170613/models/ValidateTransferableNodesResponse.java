// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateTransferableNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateTransferableNodesResponseBody body;

    public static ValidateTransferableNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateTransferableNodesResponse self = new ValidateTransferableNodesResponse();
        return TeaModel.build(map, self);
    }

    public ValidateTransferableNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateTransferableNodesResponse setBody(ValidateTransferableNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateTransferableNodesResponseBody getBody() {
        return this.body;
    }

}
