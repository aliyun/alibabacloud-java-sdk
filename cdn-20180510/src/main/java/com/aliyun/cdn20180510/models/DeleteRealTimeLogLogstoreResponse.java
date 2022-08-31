// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteRealTimeLogLogstoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRealTimeLogLogstoreResponseBody body;

    public static DeleteRealTimeLogLogstoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRealTimeLogLogstoreResponse self = new DeleteRealTimeLogLogstoreResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRealTimeLogLogstoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRealTimeLogLogstoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRealTimeLogLogstoreResponse setBody(DeleteRealTimeLogLogstoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRealTimeLogLogstoreResponseBody getBody() {
        return this.body;
    }

}
