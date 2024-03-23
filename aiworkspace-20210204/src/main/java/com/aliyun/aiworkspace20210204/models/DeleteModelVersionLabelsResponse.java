// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteModelVersionLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelVersionLabelsResponseBody body;

    public static DeleteModelVersionLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelVersionLabelsResponse self = new DeleteModelVersionLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelVersionLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelVersionLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelVersionLabelsResponse setBody(DeleteModelVersionLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelVersionLabelsResponseBody getBody() {
        return this.body;
    }

}
