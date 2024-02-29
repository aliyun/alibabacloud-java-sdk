// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteBusinessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBusinessResponseBody body;

    public static DeleteBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBusinessResponse self = new DeleteBusinessResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBusinessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBusinessResponse setBody(DeleteBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBusinessResponseBody getBody() {
        return this.body;
    }

}
