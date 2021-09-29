// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SkipTrialPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SkipTrialPolicyResponseBody body;

    public static SkipTrialPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipTrialPolicyResponse self = new SkipTrialPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SkipTrialPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipTrialPolicyResponse setBody(SkipTrialPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipTrialPolicyResponseBody getBody() {
        return this.body;
    }

}
