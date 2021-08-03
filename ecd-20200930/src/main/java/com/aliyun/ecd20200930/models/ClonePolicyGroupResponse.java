// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ClonePolicyGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClonePolicyGroupResponseBody body;

    public static ClonePolicyGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ClonePolicyGroupResponse self = new ClonePolicyGroupResponse();
        return TeaModel.build(map, self);
    }

    public ClonePolicyGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClonePolicyGroupResponse setBody(ClonePolicyGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ClonePolicyGroupResponseBody getBody() {
        return this.body;
    }

}
