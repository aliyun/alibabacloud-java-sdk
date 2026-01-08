// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteMessengerPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMessengerPageResponseBody body;

    public static DeleteMessengerPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessengerPageResponse self = new DeleteMessengerPageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMessengerPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMessengerPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMessengerPageResponse setBody(DeleteMessengerPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMessengerPageResponseBody getBody() {
        return this.body;
    }

}
