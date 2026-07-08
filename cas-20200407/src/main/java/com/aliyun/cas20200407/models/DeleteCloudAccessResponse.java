// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCloudAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudAccessResponseBody body;

    public static DeleteCloudAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudAccessResponse self = new DeleteCloudAccessResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudAccessResponse setBody(DeleteCloudAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudAccessResponseBody getBody() {
        return this.body;
    }

}
