// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdatePipelineBaseInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdatePipelineBaseInfoResponse setBody(UpdatePipelineBaseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelineBaseInfoResponseBody getBody() {
        return this.body;
    }

}
