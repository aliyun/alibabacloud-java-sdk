// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class MoveAuthorizationRuleToDNSServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MoveAuthorizationRuleToDNSServiceResponseBody body;

    public static MoveAuthorizationRuleToDNSServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveAuthorizationRuleToDNSServiceResponse self = new MoveAuthorizationRuleToDNSServiceResponse();
        return TeaModel.build(map, self);
    }

    public MoveAuthorizationRuleToDNSServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveAuthorizationRuleToDNSServiceResponse setBody(MoveAuthorizationRuleToDNSServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveAuthorizationRuleToDNSServiceResponseBody getBody() {
        return this.body;
    }

}
