// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class IdentifyRegisterRiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IdentifyRegisterRiskResponseBody body;

    public static IdentifyRegisterRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        IdentifyRegisterRiskResponse self = new IdentifyRegisterRiskResponse();
        return TeaModel.build(map, self);
    }

    public IdentifyRegisterRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IdentifyRegisterRiskResponse setBody(IdentifyRegisterRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public IdentifyRegisterRiskResponseBody getBody() {
        return this.body;
    }

}
