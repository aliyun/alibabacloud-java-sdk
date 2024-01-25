// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteBusinessGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBusinessGroupResponseBody body;

    public static DeleteBusinessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBusinessGroupResponse self = new DeleteBusinessGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBusinessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBusinessGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBusinessGroupResponse setBody(DeleteBusinessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBusinessGroupResponseBody getBody() {
        return this.body;
    }

}
