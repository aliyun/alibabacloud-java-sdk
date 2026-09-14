// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AbolishCrossProjectPipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbolishCrossProjectPipelineRunResponseBody body;

    public static AbolishCrossProjectPipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        AbolishCrossProjectPipelineRunResponse self = new AbolishCrossProjectPipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public AbolishCrossProjectPipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbolishCrossProjectPipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbolishCrossProjectPipelineRunResponse setBody(AbolishCrossProjectPipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public AbolishCrossProjectPipelineRunResponseBody getBody() {
        return this.body;
    }

}
