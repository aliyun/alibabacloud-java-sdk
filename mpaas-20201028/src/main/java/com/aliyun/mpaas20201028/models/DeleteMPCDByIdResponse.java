// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMPCDByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMPCDByIdResponseBody body;

    public static DeleteMPCDByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMPCDByIdResponse self = new DeleteMPCDByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMPCDByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMPCDByIdResponse setBody(DeleteMPCDByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMPCDByIdResponseBody getBody() {
        return this.body;
    }

}
