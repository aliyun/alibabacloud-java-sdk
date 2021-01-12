// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkwan20181030.models;

import com.aliyun.tea.*;

public class SubmitKpmEncryptedNodeTupleOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitKpmEncryptedNodeTupleOrderResponseBody body;

    public static SubmitKpmEncryptedNodeTupleOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitKpmEncryptedNodeTupleOrderResponse self = new SubmitKpmEncryptedNodeTupleOrderResponse();
        return TeaModel.build(map, self);
    }

    public SubmitKpmEncryptedNodeTupleOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitKpmEncryptedNodeTupleOrderResponse setBody(SubmitKpmEncryptedNodeTupleOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitKpmEncryptedNodeTupleOrderResponseBody getBody() {
        return this.body;
    }

}
