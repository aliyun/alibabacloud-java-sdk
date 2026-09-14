// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCrossProjectPipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCrossProjectPipelineRunResponseBody body;

    public static GetCrossProjectPipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCrossProjectPipelineRunResponse self = new GetCrossProjectPipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public GetCrossProjectPipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCrossProjectPipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCrossProjectPipelineRunResponse setBody(GetCrossProjectPipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCrossProjectPipelineRunResponseBody getBody() {
        return this.body;
    }

}
