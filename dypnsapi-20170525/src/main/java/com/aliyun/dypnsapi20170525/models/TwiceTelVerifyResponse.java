// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class TwiceTelVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TwiceTelVerifyResponseBody body;

    public static TwiceTelVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        TwiceTelVerifyResponse self = new TwiceTelVerifyResponse();
        return TeaModel.build(map, self);
    }

    public TwiceTelVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TwiceTelVerifyResponse setBody(TwiceTelVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public TwiceTelVerifyResponseBody getBody() {
        return this.body;
    }

}
