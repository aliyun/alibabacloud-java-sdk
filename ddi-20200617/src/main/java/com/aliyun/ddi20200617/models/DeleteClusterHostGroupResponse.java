// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteClusterHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClusterHostGroupResponseBody body;

    public static DeleteClusterHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterHostGroupResponse self = new DeleteClusterHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClusterHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClusterHostGroupResponse setBody(DeleteClusterHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClusterHostGroupResponseBody getBody() {
        return this.body;
    }

}
