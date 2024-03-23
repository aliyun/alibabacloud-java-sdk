// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteModelVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelVersionResponseBody body;

    public static DeleteModelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelVersionResponse self = new DeleteModelVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelVersionResponse setBody(DeleteModelVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelVersionResponseBody getBody() {
        return this.body;
    }

}
