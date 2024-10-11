// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class PublishFlowControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishFlowControlTaskResponseBody body;

    public static PublishFlowControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishFlowControlTaskResponse self = new PublishFlowControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public PublishFlowControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishFlowControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishFlowControlTaskResponse setBody(PublishFlowControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishFlowControlTaskResponseBody getBody() {
        return this.body;
    }

}
