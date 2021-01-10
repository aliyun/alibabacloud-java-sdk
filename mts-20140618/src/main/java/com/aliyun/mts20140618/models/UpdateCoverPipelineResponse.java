// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateCoverPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCoverPipelineResponseBody body;

    public static UpdateCoverPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCoverPipelineResponse self = new UpdateCoverPipelineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCoverPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCoverPipelineResponse setBody(UpdateCoverPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCoverPipelineResponseBody getBody() {
        return this.body;
    }

}
