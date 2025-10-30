// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdatePipelineByAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePipelineByAsyncResponseBody body;

    public static UpdatePipelineByAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineByAsyncResponse self = new UpdatePipelineByAsyncResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineByAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePipelineByAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePipelineByAsyncResponse setBody(UpdatePipelineByAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelineByAsyncResponseBody getBody() {
        return this.body;
    }

}
