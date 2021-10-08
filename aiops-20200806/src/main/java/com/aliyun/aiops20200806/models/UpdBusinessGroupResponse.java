// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdBusinessGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdBusinessGroupResponseBody body;

    public static UpdBusinessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdBusinessGroupResponse self = new UpdBusinessGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdBusinessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdBusinessGroupResponse setBody(UpdBusinessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdBusinessGroupResponseBody getBody() {
        return this.body;
    }

}
