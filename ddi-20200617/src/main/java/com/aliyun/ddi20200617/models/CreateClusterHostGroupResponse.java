// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateClusterHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClusterHostGroupResponseBody body;

    public static CreateClusterHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterHostGroupResponse self = new CreateClusterHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterHostGroupResponse setBody(CreateClusterHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterHostGroupResponseBody getBody() {
        return this.body;
    }

}
