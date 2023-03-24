// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeletePrivateAccessTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePrivateAccessTagResponseBody body;

    public static DeletePrivateAccessTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateAccessTagResponse self = new DeletePrivateAccessTagResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrivateAccessTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrivateAccessTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrivateAccessTagResponse setBody(DeletePrivateAccessTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrivateAccessTagResponseBody getBody() {
        return this.body;
    }

}
