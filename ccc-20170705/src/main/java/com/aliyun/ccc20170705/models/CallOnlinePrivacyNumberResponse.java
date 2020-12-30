// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CallOnlinePrivacyNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CallOnlinePrivacyNumberResponseBody body;

    public static CallOnlinePrivacyNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        CallOnlinePrivacyNumberResponse self = new CallOnlinePrivacyNumberResponse();
        return TeaModel.build(map, self);
    }

    public CallOnlinePrivacyNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CallOnlinePrivacyNumberResponse setBody(CallOnlinePrivacyNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public CallOnlinePrivacyNumberResponseBody getBody() {
        return this.body;
    }

}
