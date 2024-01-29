// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateVariableGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVariableGroupResponseBody body;

    public static UpdateVariableGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVariableGroupResponse self = new UpdateVariableGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVariableGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVariableGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVariableGroupResponse setBody(UpdateVariableGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVariableGroupResponseBody getBody() {
        return this.body;
    }

}
