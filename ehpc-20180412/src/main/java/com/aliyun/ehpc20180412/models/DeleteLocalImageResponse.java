// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteLocalImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLocalImageResponseBody body;

    public static DeleteLocalImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLocalImageResponse self = new DeleteLocalImageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLocalImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLocalImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLocalImageResponse setBody(DeleteLocalImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLocalImageResponseBody getBody() {
        return this.body;
    }

}
