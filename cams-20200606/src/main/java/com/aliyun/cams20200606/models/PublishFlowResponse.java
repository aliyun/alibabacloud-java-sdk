// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class PublishFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublishFlowResponseBody body;

    public static PublishFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishFlowResponse self = new PublishFlowResponse();
        return TeaModel.build(map, self);
    }

    public PublishFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishFlowResponse setBody(PublishFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishFlowResponseBody getBody() {
        return this.body;
    }

}
