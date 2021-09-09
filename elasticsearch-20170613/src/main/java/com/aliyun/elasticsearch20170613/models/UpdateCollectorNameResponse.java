// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateCollectorNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCollectorNameResponseBody body;

    public static UpdateCollectorNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCollectorNameResponse self = new UpdateCollectorNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCollectorNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCollectorNameResponse setBody(UpdateCollectorNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCollectorNameResponseBody getBody() {
        return this.body;
    }

}
