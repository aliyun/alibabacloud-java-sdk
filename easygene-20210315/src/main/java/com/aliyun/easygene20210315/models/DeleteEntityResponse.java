// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEntityResponseBody body;

    public static DeleteEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEntityResponse self = new DeleteEntityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEntityResponse setBody(DeleteEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEntityResponseBody getBody() {
        return this.body;
    }

}
