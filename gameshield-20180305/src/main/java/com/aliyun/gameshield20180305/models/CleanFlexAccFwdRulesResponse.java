// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CleanFlexAccFwdRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CleanFlexAccFwdRulesResponseBody body;

    public static CleanFlexAccFwdRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CleanFlexAccFwdRulesResponse self = new CleanFlexAccFwdRulesResponse();
        return TeaModel.build(map, self);
    }

    public CleanFlexAccFwdRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CleanFlexAccFwdRulesResponse setBody(CleanFlexAccFwdRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CleanFlexAccFwdRulesResponseBody getBody() {
        return this.body;
    }

}
