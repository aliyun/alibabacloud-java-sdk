// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateAIPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAIPlanResponseBody body;

    public static UpdateAIPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAIPlanResponse self = new UpdateAIPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAIPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAIPlanResponse setBody(UpdateAIPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAIPlanResponseBody getBody() {
        return this.body;
    }

}
