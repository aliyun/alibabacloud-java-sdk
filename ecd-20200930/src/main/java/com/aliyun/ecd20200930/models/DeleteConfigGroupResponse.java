// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteConfigGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConfigGroupResponseBody body;

    public static DeleteConfigGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigGroupResponse self = new DeleteConfigGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConfigGroupResponse setBody(DeleteConfigGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigGroupResponseBody getBody() {
        return this.body;
    }

}
