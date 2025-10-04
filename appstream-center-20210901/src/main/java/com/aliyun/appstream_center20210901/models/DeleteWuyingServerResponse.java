// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteWuyingServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWuyingServerResponseBody body;

    public static DeleteWuyingServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWuyingServerResponse self = new DeleteWuyingServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWuyingServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWuyingServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWuyingServerResponse setBody(DeleteWuyingServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWuyingServerResponseBody getBody() {
        return this.body;
    }

}
