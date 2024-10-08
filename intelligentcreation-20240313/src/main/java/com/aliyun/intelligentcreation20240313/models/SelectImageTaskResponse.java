// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SelectImageTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SelectImageTaskResponseBody body;

    public static SelectImageTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SelectImageTaskResponse self = new SelectImageTaskResponse();
        return TeaModel.build(map, self);
    }

    public SelectImageTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SelectImageTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SelectImageTaskResponse setBody(SelectImageTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SelectImageTaskResponseBody getBody() {
        return this.body;
    }

}
