// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteModelLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelLabelsResponseBody body;

    public static DeleteModelLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelLabelsResponse self = new DeleteModelLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelLabelsResponse setBody(DeleteModelLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelLabelsResponseBody getBody() {
        return this.body;
    }

}
