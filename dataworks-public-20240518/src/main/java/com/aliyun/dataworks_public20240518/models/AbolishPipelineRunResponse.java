// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AbolishPipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbolishPipelineRunResponseBody body;

    public static AbolishPipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        AbolishPipelineRunResponse self = new AbolishPipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public AbolishPipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbolishPipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbolishPipelineRunResponse setBody(AbolishPipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public AbolishPipelineRunResponseBody getBody() {
        return this.body;
    }

}
