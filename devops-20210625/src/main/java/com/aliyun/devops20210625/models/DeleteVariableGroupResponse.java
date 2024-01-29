// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteVariableGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVariableGroupResponseBody body;

    public static DeleteVariableGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVariableGroupResponse self = new DeleteVariableGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVariableGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVariableGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVariableGroupResponse setBody(DeleteVariableGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVariableGroupResponseBody getBody() {
        return this.body;
    }

}
