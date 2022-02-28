// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TriggerRegisterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerRegisterResponseBody body;

    public static TriggerRegisterResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerRegisterResponse self = new TriggerRegisterResponse();
        return TeaModel.build(map, self);
    }

    public TriggerRegisterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerRegisterResponse setBody(TriggerRegisterResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerRegisterResponseBody getBody() {
        return this.body;
    }

}
