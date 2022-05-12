// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetVariableGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetVariableGroupResponseBody body;

    public static GetVariableGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVariableGroupResponse self = new GetVariableGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetVariableGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVariableGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVariableGroupResponse setBody(GetVariableGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVariableGroupResponseBody getBody() {
        return this.body;
    }

}
