// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class JoinResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public JoinResourceGroupResponseBody body;

    public static JoinResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinResourceGroupResponse self = new JoinResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public JoinResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinResourceGroupResponse setBody(JoinResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinResourceGroupResponseBody getBody() {
        return this.body;
    }

}
