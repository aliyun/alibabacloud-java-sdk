// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPipelineByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPipelineByIdResponseBody body;

    public static GetPipelineByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineByIdResponse self = new GetPipelineByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPipelineByIdResponse setBody(GetPipelineByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineByIdResponseBody getBody() {
        return this.body;
    }

}
