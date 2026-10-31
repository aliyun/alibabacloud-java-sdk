// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitPipelineAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitPipelineAsyncResponseBody body;

    public static SubmitPipelineAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPipelineAsyncResponse self = new SubmitPipelineAsyncResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPipelineAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitPipelineAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitPipelineAsyncResponse setBody(SubmitPipelineAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPipelineAsyncResponseBody getBody() {
        return this.body;
    }

}
