// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteAxgGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAxgGroupResponseBody body;

    public static DeleteAxgGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAxgGroupResponse self = new DeleteAxgGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAxgGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAxgGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAxgGroupResponse setBody(DeleteAxgGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAxgGroupResponseBody getBody() {
        return this.body;
    }

}
