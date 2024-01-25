// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelResponseBody body;

    public static DeleteModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelResponse self = new DeleteModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelResponse setBody(DeleteModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelResponseBody getBody() {
        return this.body;
    }

}
