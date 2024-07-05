// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdatePipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePipelineResponseBody body;

    public static UpdatePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineResponse self = new UpdatePipelineResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePipelineResponse setBody(UpdatePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelineResponseBody getBody() {
        return this.body;
    }

}
