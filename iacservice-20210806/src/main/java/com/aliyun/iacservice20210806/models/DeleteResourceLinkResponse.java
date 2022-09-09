// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteResourceLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResourceLinkResponseBody body;

    public static DeleteResourceLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceLinkResponse self = new DeleteResourceLinkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceLinkResponse setBody(DeleteResourceLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceLinkResponseBody getBody() {
        return this.body;
    }

}
