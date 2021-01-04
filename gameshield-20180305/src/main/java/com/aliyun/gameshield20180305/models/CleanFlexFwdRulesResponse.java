// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CleanFlexFwdRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CleanFlexFwdRulesResponseBody body;

    public static CleanFlexFwdRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CleanFlexFwdRulesResponse self = new CleanFlexFwdRulesResponse();
        return TeaModel.build(map, self);
    }

    public CleanFlexFwdRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CleanFlexFwdRulesResponse setBody(CleanFlexFwdRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CleanFlexFwdRulesResponseBody getBody() {
        return this.body;
    }

}
