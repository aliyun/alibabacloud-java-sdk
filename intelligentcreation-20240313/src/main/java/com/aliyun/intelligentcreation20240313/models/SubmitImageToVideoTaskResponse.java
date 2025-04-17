// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SubmitImageToVideoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitImageToVideoTaskResponseBody body;

    public static SubmitImageToVideoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageToVideoTaskResponse self = new SubmitImageToVideoTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImageToVideoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImageToVideoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitImageToVideoTaskResponse setBody(SubmitImageToVideoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImageToVideoTaskResponseBody getBody() {
        return this.body;
    }

}
