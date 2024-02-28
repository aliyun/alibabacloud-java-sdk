// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DeleteTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTargetsResponseBody body;

    public static DeleteTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTargetsResponse self = new DeleteTargetsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTargetsResponse setBody(DeleteTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTargetsResponseBody getBody() {
        return this.body;
    }

}
