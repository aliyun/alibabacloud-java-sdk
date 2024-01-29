// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdatePipelineBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePipelineBaseInfoResponseBody body;

    public static UpdatePipelineBaseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineBaseInfoResponse self = new UpdatePipelineBaseInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineBaseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePipelineBaseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePipelineBaseInfoResponse setBody(UpdatePipelineBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelineBaseInfoResponseBody getBody() {
        return this.body;
    }

}
