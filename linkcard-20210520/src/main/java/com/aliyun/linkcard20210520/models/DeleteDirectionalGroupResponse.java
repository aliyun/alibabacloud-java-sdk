// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class DeleteDirectionalGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDirectionalGroupResponseBody body;

    public static DeleteDirectionalGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectionalGroupResponse self = new DeleteDirectionalGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDirectionalGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDirectionalGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDirectionalGroupResponse setBody(DeleteDirectionalGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDirectionalGroupResponseBody getBody() {
        return this.body;
    }

}
