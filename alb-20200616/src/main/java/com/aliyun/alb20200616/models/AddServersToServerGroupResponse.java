// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AddServersToServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddServersToServerGroupResponseBody body;

    public static AddServersToServerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddServersToServerGroupResponse self = new AddServersToServerGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddServersToServerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddServersToServerGroupResponse setBody(AddServersToServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddServersToServerGroupResponseBody getBody() {
        return this.body;
    }

}
