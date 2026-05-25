// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteStageModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStageModelResponseBody body;

    public static DeleteStageModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStageModelResponse self = new DeleteStageModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStageModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStageModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStageModelResponse setBody(DeleteStageModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStageModelResponseBody getBody() {
        return this.body;
    }

}
