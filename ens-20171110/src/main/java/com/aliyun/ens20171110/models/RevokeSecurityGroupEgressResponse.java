// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupEgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RevokeSecurityGroupEgressResponse setBody(RevokeSecurityGroupEgressResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeSecurityGroupEgressResponseBody getBody() {
        return this.body;
    }

}
