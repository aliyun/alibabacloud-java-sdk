// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeSecurityGroupResponseBody body;

    public static RevokeSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeSecurityGroupResponse self = new RevokeSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public RevokeSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeSecurityGroupResponse setBody(RevokeSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
