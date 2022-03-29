// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class IdentifyLoginRiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IdentifyLoginRiskResponseBody body;

    public static IdentifyLoginRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        IdentifyLoginRiskResponse self = new IdentifyLoginRiskResponse();
        return TeaModel.build(map, self);
    }

    public IdentifyLoginRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IdentifyLoginRiskResponse setBody(IdentifyLoginRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public IdentifyLoginRiskResponseBody getBody() {
        return this.body;
    }

}
