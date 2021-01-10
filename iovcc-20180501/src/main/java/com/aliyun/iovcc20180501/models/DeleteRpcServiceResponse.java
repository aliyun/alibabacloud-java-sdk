// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteRpcServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRpcServiceResponseBody body;

    public static DeleteRpcServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRpcServiceResponse self = new DeleteRpcServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRpcServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRpcServiceResponse setBody(DeleteRpcServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRpcServiceResponseBody getBody() {
        return this.body;
    }

}
