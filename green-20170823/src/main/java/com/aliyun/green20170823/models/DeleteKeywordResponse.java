// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteKeywordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKeywordResponseBody body;

    public static DeleteKeywordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeywordResponse self = new DeleteKeywordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKeywordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKeywordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKeywordResponse setBody(DeleteKeywordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKeywordResponseBody getBody() {
        return this.body;
    }

}
