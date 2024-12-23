// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class VoiceSingleCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VoiceSingleCallResponseBody body;

    public static VoiceSingleCallResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceSingleCallResponse self = new VoiceSingleCallResponse();
        return TeaModel.build(map, self);
    }

    public VoiceSingleCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VoiceSingleCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VoiceSingleCallResponse setBody(VoiceSingleCallResponseBody body) {
        this.body = body;
        return this;
    }
    public VoiceSingleCallResponseBody getBody() {
        return this.body;
    }

}
