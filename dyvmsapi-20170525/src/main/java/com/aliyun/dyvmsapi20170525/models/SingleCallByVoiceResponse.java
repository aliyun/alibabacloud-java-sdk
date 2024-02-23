// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByVoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SingleCallByVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SingleCallByVoiceResponse setBody(SingleCallByVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public SingleCallByVoiceResponseBody getBody() {
        return this.body;
    }

}
