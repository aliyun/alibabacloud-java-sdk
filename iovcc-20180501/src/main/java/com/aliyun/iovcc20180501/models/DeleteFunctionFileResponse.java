// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteFunctionFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFunctionFileResponseBody body;

    public static DeleteFunctionFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionFileResponse self = new DeleteFunctionFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFunctionFileResponse setBody(DeleteFunctionFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFunctionFileResponseBody getBody() {
        return this.body;
    }

}
