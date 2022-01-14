// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMsacAppInstanceByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsacAppInstanceByIdResponseBody body;

    public static DeleteMsacAppInstanceByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsacAppInstanceByIdResponse self = new DeleteMsacAppInstanceByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsacAppInstanceByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsacAppInstanceByIdResponse setBody(DeleteMsacAppInstanceByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsacAppInstanceByIdResponseBody getBody() {
        return this.body;
    }

}
