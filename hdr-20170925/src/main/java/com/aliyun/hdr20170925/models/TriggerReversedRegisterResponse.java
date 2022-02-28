// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TriggerReversedRegisterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerReversedRegisterResponseBody body;

    public static TriggerReversedRegisterResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerReversedRegisterResponse self = new TriggerReversedRegisterResponse();
        return TeaModel.build(map, self);
    }

    public TriggerReversedRegisterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerReversedRegisterResponse setBody(TriggerReversedRegisterResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerReversedRegisterResponseBody getBody() {
        return this.body;
    }

}
