// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableAllFwSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutEnableAllFwSwitchResponseBody body;

    public static PutEnableAllFwSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        PutEnableAllFwSwitchResponse self = new PutEnableAllFwSwitchResponse();
        return TeaModel.build(map, self);
    }

    public PutEnableAllFwSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutEnableAllFwSwitchResponse setBody(PutEnableAllFwSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEnableAllFwSwitchResponseBody getBody() {
        return this.body;
    }

}
