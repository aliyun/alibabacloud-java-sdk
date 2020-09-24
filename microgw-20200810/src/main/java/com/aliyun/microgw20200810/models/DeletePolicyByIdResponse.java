// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class DeletePolicyByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePolicyByIdResponseBody body;

    public static DeletePolicyByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyByIdResponse self = new DeletePolicyByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicyByIdResponse setBody(DeletePolicyByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicyByIdResponseBody getBody() {
        return this.body;
    }

}
