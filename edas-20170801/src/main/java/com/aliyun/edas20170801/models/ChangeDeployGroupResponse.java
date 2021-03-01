// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ChangeDeployGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeDeployGroupResponseBody body;

    public static ChangeDeployGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeDeployGroupResponse self = new ChangeDeployGroupResponse();
        return TeaModel.build(map, self);
    }

    public ChangeDeployGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeDeployGroupResponse setBody(ChangeDeployGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeDeployGroupResponseBody getBody() {
        return this.body;
    }

}
