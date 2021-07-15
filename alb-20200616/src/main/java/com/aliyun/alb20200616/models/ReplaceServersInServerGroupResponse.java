// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ReplaceServersInServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceServersInServerGroupResponseBody body;

    public static ReplaceServersInServerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceServersInServerGroupResponse self = new ReplaceServersInServerGroupResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceServersInServerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceServersInServerGroupResponse setBody(ReplaceServersInServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceServersInServerGroupResponseBody getBody() {
        return this.body;
    }

}
