// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaFromSearchLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMediaFromSearchLibResponseBody body;

    public static DeleteMediaFromSearchLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaFromSearchLibResponse self = new DeleteMediaFromSearchLibResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaFromSearchLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaFromSearchLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMediaFromSearchLibResponse setBody(DeleteMediaFromSearchLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaFromSearchLibResponseBody getBody() {
        return this.body;
    }

}
