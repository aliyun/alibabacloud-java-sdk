// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class UpdateAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAgentGroupResponseBody body;

    public static UpdateAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentGroupResponse self = new UpdateAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentGroupResponse setBody(UpdateAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentGroupResponseBody getBody() {
        return this.body;
    }

}
