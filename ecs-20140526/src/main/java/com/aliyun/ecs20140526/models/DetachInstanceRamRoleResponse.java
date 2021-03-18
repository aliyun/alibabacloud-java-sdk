// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachInstanceRamRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachInstanceRamRoleResponseBody body;

    public static DetachInstanceRamRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachInstanceRamRoleResponse self = new DetachInstanceRamRoleResponse();
        return TeaModel.build(map, self);
    }

    public DetachInstanceRamRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachInstanceRamRoleResponse setBody(DetachInstanceRamRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachInstanceRamRoleResponseBody getBody() {
        return this.body;
    }

}
