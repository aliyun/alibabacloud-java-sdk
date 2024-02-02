// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class PublishContactFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishContactFlowResponseBody body;

    public static PublishContactFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishContactFlowResponse self = new PublishContactFlowResponse();
        return TeaModel.build(map, self);
    }

    public PublishContactFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishContactFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishContactFlowResponse setBody(PublishContactFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishContactFlowResponseBody getBody() {
        return this.body;
    }

}
