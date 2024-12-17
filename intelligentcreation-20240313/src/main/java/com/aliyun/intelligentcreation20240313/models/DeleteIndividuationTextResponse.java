// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DeleteIndividuationTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIndividuationTextResponseBody body;

    public static DeleteIndividuationTextResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndividuationTextResponse self = new DeleteIndividuationTextResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIndividuationTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIndividuationTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIndividuationTextResponse setBody(DeleteIndividuationTextResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIndividuationTextResponseBody getBody() {
        return this.body;
    }

}
