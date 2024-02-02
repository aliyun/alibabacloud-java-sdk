// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachInstanceRamRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DetachInstanceRamRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachInstanceRamRoleResponse setBody(DetachInstanceRamRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachInstanceRamRoleResponseBody getBody() {
        return this.body;
    }

}
