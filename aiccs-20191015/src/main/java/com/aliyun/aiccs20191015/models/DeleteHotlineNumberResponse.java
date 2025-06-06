// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteHotlineNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHotlineNumberResponseBody body;

    public static DeleteHotlineNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotlineNumberResponse self = new DeleteHotlineNumberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHotlineNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHotlineNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHotlineNumberResponse setBody(DeleteHotlineNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHotlineNumberResponseBody getBody() {
        return this.body;
    }

}
