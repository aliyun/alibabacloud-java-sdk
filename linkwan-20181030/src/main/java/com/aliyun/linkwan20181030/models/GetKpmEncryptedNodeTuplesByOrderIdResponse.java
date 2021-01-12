// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkwan20181030.models;

import com.aliyun.tea.*;

public class GetKpmEncryptedNodeTuplesByOrderIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetKpmEncryptedNodeTuplesByOrderIdResponseBody body;

    public static GetKpmEncryptedNodeTuplesByOrderIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKpmEncryptedNodeTuplesByOrderIdResponse self = new GetKpmEncryptedNodeTuplesByOrderIdResponse();
        return TeaModel.build(map, self);
    }

    public GetKpmEncryptedNodeTuplesByOrderIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKpmEncryptedNodeTuplesByOrderIdResponse setBody(GetKpmEncryptedNodeTuplesByOrderIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKpmEncryptedNodeTuplesByOrderIdResponseBody getBody() {
        return this.body;
    }

}
