// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteAIServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAIServiceResponseBody body;

    public static DeleteAIServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIServiceResponse self = new DeleteAIServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAIServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAIServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAIServiceResponse setBody(DeleteAIServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAIServiceResponseBody getBody() {
        return this.body;
    }

}
