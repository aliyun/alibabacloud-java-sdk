// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteSubnetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSubnetResponseBody body;

    public static DeleteSubnetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubnetResponse self = new DeleteSubnetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubnetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubnetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSubnetResponse setBody(DeleteSubnetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubnetResponseBody getBody() {
        return this.body;
    }

}
