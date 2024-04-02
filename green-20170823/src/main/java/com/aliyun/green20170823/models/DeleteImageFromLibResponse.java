// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteImageFromLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteImageFromLibResponseBody body;

    public static DeleteImageFromLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageFromLibResponse self = new DeleteImageFromLibResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImageFromLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImageFromLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteImageFromLibResponse setBody(DeleteImageFromLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImageFromLibResponseBody getBody() {
        return this.body;
    }

}
