// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class DeleteDigitalVideoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDigitalVideoResponseBody body;

    public static DeleteDigitalVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDigitalVideoResponse self = new DeleteDigitalVideoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDigitalVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDigitalVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDigitalVideoResponse setBody(DeleteDigitalVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDigitalVideoResponseBody getBody() {
        return this.body;
    }

}
