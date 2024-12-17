// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DeleteIndividuationProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIndividuationProjectResponseBody body;

    public static DeleteIndividuationProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndividuationProjectResponse self = new DeleteIndividuationProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIndividuationProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIndividuationProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIndividuationProjectResponse setBody(DeleteIndividuationProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIndividuationProjectResponseBody getBody() {
        return this.body;
    }

}
