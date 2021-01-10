// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteUpstreamAppKeyRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUpstreamAppKeyRelationResponseBody body;

    public static DeleteUpstreamAppKeyRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUpstreamAppKeyRelationResponse self = new DeleteUpstreamAppKeyRelationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUpstreamAppKeyRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUpstreamAppKeyRelationResponse setBody(DeleteUpstreamAppKeyRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUpstreamAppKeyRelationResponseBody getBody() {
        return this.body;
    }

}
