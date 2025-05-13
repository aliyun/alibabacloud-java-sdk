// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteUmodelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUmodelResponseBody body;

    public static DeleteUmodelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUmodelResponse self = new DeleteUmodelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUmodelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUmodelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUmodelResponse setBody(DeleteUmodelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUmodelResponseBody getBody() {
        return this.body;
    }

}
