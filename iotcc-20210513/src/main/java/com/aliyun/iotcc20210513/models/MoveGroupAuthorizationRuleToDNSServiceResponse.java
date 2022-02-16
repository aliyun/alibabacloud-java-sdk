// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class MoveGroupAuthorizationRuleToDNSServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MoveGroupAuthorizationRuleToDNSServiceResponseBody body;

    public static MoveGroupAuthorizationRuleToDNSServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveGroupAuthorizationRuleToDNSServiceResponse self = new MoveGroupAuthorizationRuleToDNSServiceResponse();
        return TeaModel.build(map, self);
    }

    public MoveGroupAuthorizationRuleToDNSServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveGroupAuthorizationRuleToDNSServiceResponse setBody(MoveGroupAuthorizationRuleToDNSServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveGroupAuthorizationRuleToDNSServiceResponseBody getBody() {
        return this.body;
    }

}
