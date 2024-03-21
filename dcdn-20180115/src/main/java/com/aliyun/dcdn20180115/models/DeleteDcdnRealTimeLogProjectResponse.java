// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnRealTimeLogProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDcdnRealTimeLogProjectResponseBody body;

    public static DeleteDcdnRealTimeLogProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnRealTimeLogProjectResponse self = new DeleteDcdnRealTimeLogProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnRealTimeLogProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnRealTimeLogProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnRealTimeLogProjectResponse setBody(DeleteDcdnRealTimeLogProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnRealTimeLogProjectResponseBody getBody() {
        return this.body;
    }

}
