// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateCensorPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCensorPipelineResponseBody body;

    public static UpdateCensorPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCensorPipelineResponse self = new UpdateCensorPipelineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCensorPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCensorPipelineResponse setBody(UpdateCensorPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCensorPipelineResponseBody getBody() {
        return this.body;
    }

}
