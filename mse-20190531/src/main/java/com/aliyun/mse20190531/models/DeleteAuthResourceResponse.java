// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteAuthResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAuthResourceResponseBody body;

    public static DeleteAuthResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthResourceResponse self = new DeleteAuthResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuthResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuthResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAuthResourceResponse setBody(DeleteAuthResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthResourceResponseBody getBody() {
        return this.body;
    }

}
