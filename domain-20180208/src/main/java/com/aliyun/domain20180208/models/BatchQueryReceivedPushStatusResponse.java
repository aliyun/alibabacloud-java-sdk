// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchQueryReceivedPushStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchQueryReceivedPushStatusResponseBody body;

    public static BatchQueryReceivedPushStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryReceivedPushStatusResponse self = new BatchQueryReceivedPushStatusResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryReceivedPushStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchQueryReceivedPushStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchQueryReceivedPushStatusResponse setBody(BatchQueryReceivedPushStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchQueryReceivedPushStatusResponseBody getBody() {
        return this.body;
    }

}
