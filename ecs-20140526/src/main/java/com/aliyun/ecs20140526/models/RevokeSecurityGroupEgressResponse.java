// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupEgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeSecurityGroupEgressResponseBody body;

    public static RevokeSecurityGroupEgressResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeSecurityGroupEgressResponse self = new RevokeSecurityGroupEgressResponse();
        return TeaModel.build(map, self);
    }

    public RevokeSecurityGroupEgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeSecurityGroupEgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeSecurityGroupEgressResponse setBody(RevokeSecurityGroupEgressResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeSecurityGroupEgressResponseBody getBody() {
        return this.body;
    }

}
