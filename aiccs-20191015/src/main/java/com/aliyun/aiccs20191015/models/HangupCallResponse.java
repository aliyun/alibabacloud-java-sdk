// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HangupCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HangupCallResponseBody body;

    public static HangupCallResponse build(java.util.Map<String, ?> map) throws Exception {
        HangupCallResponse self = new HangupCallResponse();
        return TeaModel.build(map, self);
    }

    public HangupCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HangupCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HangupCallResponse setBody(HangupCallResponseBody body) {
        this.body = body;
        return this;
    }
    public HangupCallResponseBody getBody() {
        return this.body;
    }

}
