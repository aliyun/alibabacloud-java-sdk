// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdatePornPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePornPipelineResponseBody body;

    public static UpdatePornPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePornPipelineResponse self = new UpdatePornPipelineResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePornPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePornPipelineResponse setBody(UpdatePornPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePornPipelineResponseBody getBody() {
        return this.body;
    }

}
