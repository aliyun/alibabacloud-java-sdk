// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class AddRtcAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddRtcAccountResponseBody body;

    public static AddRtcAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRtcAccountResponse self = new AddRtcAccountResponse();
        return TeaModel.build(map, self);
    }

    public AddRtcAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRtcAccountResponse setBody(AddRtcAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRtcAccountResponseBody getBody() {
        return this.body;
    }

}
