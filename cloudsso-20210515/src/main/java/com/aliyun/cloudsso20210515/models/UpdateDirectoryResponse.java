// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDirectoryResponseBody body;

    public static UpdateDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDirectoryResponse self = new UpdateDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDirectoryResponse setBody(UpdateDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDirectoryResponseBody getBody() {
        return this.body;
    }

}
