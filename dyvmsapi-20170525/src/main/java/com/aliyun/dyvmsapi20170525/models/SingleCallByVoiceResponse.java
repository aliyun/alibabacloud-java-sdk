// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByVoiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SingleCallByVoiceResponseBody body;

    public static SingleCallByVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByVoiceResponse self = new SingleCallByVoiceResponse();
        return TeaModel.build(map, self);
    }

    public SingleCallByVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SingleCallByVoiceResponse setBody(SingleCallByVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public SingleCallByVoiceResponseBody getBody() {
        return this.body;
    }

}
