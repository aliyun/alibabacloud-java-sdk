// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteCallTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCallTagResponseBody body;

    public static DeleteCallTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCallTagResponse self = new DeleteCallTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCallTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCallTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCallTagResponse setBody(DeleteCallTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCallTagResponseBody getBody() {
        return this.body;
    }

}
