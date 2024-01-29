// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaMarksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMediaMarksResponseBody body;

    public static DeleteMediaMarksResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaMarksResponse self = new DeleteMediaMarksResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaMarksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaMarksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMediaMarksResponse setBody(DeleteMediaMarksResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaMarksResponseBody getBody() {
        return this.body;
    }

}
