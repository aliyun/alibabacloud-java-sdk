// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachInstanceRamRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachInstanceRamRoleResponseBody body;

    public static AttachInstanceRamRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachInstanceRamRoleResponse self = new AttachInstanceRamRoleResponse();
        return TeaModel.build(map, self);
    }

    public AttachInstanceRamRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachInstanceRamRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachInstanceRamRoleResponse setBody(AttachInstanceRamRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachInstanceRamRoleResponseBody getBody() {
        return this.body;
    }

}
