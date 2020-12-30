// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PublishContactFlowVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishContactFlowVersionResponseBody body;

    public static PublishContactFlowVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishContactFlowVersionResponse self = new PublishContactFlowVersionResponse();
        return TeaModel.build(map, self);
    }

    public PublishContactFlowVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishContactFlowVersionResponse setBody(PublishContactFlowVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishContactFlowVersionResponseBody getBody() {
        return this.body;
    }

}
