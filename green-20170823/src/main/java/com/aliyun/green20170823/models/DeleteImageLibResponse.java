// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteImageLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteImageLibResponseBody body;

    public static DeleteImageLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageLibResponse self = new DeleteImageLibResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImageLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImageLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteImageLibResponse setBody(DeleteImageLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImageLibResponseBody getBody() {
        return this.body;
    }

}
