// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteBackendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBackendResponseBody body;

    public static DeleteBackendResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackendResponse self = new DeleteBackendResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBackendResponse setBody(DeleteBackendResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackendResponseBody getBody() {
        return this.body;
    }

}
