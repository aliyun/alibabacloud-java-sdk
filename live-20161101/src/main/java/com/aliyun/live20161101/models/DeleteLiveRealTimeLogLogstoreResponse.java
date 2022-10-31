// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveRealTimeLogLogstoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLiveRealTimeLogLogstoreResponseBody body;

    public static DeleteLiveRealTimeLogLogstoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRealTimeLogLogstoreResponse self = new DeleteLiveRealTimeLogLogstoreResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRealTimeLogLogstoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveRealTimeLogLogstoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveRealTimeLogLogstoreResponse setBody(DeleteLiveRealTimeLogLogstoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveRealTimeLogLogstoreResponseBody getBody() {
        return this.body;
    }

}
