// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetDataPipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataPipelineResponseBody body;

    public static GetDataPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataPipelineResponse self = new GetDataPipelineResponse();
        return TeaModel.build(map, self);
    }

    public GetDataPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataPipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataPipelineResponse setBody(GetDataPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataPipelineResponseBody getBody() {
        return this.body;
    }

}
