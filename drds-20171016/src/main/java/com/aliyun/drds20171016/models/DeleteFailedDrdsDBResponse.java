// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DeleteFailedDrdsDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFailedDrdsDBResponseBody body;

    public static DeleteFailedDrdsDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFailedDrdsDBResponse self = new DeleteFailedDrdsDBResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFailedDrdsDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFailedDrdsDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFailedDrdsDBResponse setBody(DeleteFailedDrdsDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFailedDrdsDBResponseBody getBody() {
        return this.body;
    }

}
