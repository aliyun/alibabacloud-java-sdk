// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DeleteDrdsDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDrdsDBResponseBody body;

    public static DeleteDrdsDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDrdsDBResponse self = new DeleteDrdsDBResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDrdsDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDrdsDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDrdsDBResponse setBody(DeleteDrdsDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDrdsDBResponseBody getBody() {
        return this.body;
    }

}
