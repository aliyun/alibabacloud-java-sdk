// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateVariableGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateVariableGroupResponse setBody(UpdateVariableGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVariableGroupResponseBody getBody() {
        return this.body;
    }

}
