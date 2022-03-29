// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class IdentifyAccountModifyRiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IdentifyAccountModifyRiskResponseBody body;

    public static IdentifyAccountModifyRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        IdentifyAccountModifyRiskResponse self = new IdentifyAccountModifyRiskResponse();
        return TeaModel.build(map, self);
    }

    public IdentifyAccountModifyRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IdentifyAccountModifyRiskResponse setBody(IdentifyAccountModifyRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public IdentifyAccountModifyRiskResponseBody getBody() {
        return this.body;
    }

}
