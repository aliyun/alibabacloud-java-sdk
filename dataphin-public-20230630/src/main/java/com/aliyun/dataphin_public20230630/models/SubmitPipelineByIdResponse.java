// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitPipelineByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitPipelineByIdResponseBody body;

    public static SubmitPipelineByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPipelineByIdResponse self = new SubmitPipelineByIdResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPipelineByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitPipelineByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitPipelineByIdResponse setBody(SubmitPipelineByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPipelineByIdResponseBody getBody() {
        return this.body;
    }

}
