// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteObjectResponseBody body;

    public static DeleteObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteObjectResponse self = new DeleteObjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteObjectResponse setBody(DeleteObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteObjectResponseBody getBody() {
        return this.body;
    }

}
