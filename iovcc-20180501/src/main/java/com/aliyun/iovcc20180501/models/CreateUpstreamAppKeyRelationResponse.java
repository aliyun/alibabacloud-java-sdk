// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateUpstreamAppKeyRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUpstreamAppKeyRelationResponseBody body;

    public static CreateUpstreamAppKeyRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUpstreamAppKeyRelationResponse self = new CreateUpstreamAppKeyRelationResponse();
        return TeaModel.build(map, self);
    }

    public CreateUpstreamAppKeyRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUpstreamAppKeyRelationResponse setBody(CreateUpstreamAppKeyRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUpstreamAppKeyRelationResponseBody getBody() {
        return this.body;
    }

}
