// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class DeleteResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResourceResponseBody body;

    public static DeleteResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceResponse self = new DeleteResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceResponse setBody(DeleteResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceResponseBody getBody() {
        return this.body;
    }

}
