// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteCustomEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomEntityResponseBody body;

    public static DeleteCustomEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomEntityResponse self = new DeleteCustomEntityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomEntityResponse setBody(DeleteCustomEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomEntityResponseBody getBody() {
        return this.body;
    }

}
