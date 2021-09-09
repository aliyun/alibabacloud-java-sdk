// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePipelinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePipelinesResponseBody body;

    public static UpdatePipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelinesResponse self = new UpdatePipelinesResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePipelinesResponse setBody(UpdatePipelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelinesResponseBody getBody() {
        return this.body;
    }

}
