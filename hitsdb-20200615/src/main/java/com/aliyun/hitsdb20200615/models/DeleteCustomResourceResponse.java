// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class DeleteCustomResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomResourceResponseBody body;

    public static DeleteCustomResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomResourceResponse self = new DeleteCustomResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomResourceResponse setBody(DeleteCustomResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomResourceResponseBody getBody() {
        return this.body;
    }

}
