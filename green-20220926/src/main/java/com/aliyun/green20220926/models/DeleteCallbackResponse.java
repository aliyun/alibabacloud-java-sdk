// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCallbackResponseBody body;

    public static DeleteCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCallbackResponse self = new DeleteCallbackResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCallbackResponse setBody(DeleteCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCallbackResponseBody getBody() {
        return this.body;
    }

}
