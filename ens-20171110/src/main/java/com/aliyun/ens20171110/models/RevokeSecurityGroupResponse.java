// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
