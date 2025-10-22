// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchQueryPushStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchQueryPushStatusResponseBody body;

    public static BatchQueryPushStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryPushStatusResponse self = new BatchQueryPushStatusResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryPushStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQueryPushStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchQueryPushStatusResponse setBody(BatchQueryPushStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQueryPushStatusResponseBody getBody() {
        return this.body;
    }

}
