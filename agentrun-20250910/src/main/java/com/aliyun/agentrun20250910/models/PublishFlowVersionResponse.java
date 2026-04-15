// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PublishFlowVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlowVersionResult body;

    public static PublishFlowVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishFlowVersionResponse self = new PublishFlowVersionResponse();
        return TeaModel.build(map, self);
    }

    public PublishFlowVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishFlowVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishFlowVersionResponse setBody(FlowVersionResult body) {
        this.body = body;
        return this;
    }
    public FlowVersionResult getBody() {
        return this.body;
    }

}
