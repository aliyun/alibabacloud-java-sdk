// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class MuteCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MuteCallResponseBody body;

    public static MuteCallResponse build(java.util.Map<String, ?> map) throws Exception {
        MuteCallResponse self = new MuteCallResponse();
        return TeaModel.build(map, self);
    }

    public MuteCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MuteCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MuteCallResponse setBody(MuteCallResponseBody body) {
        this.body = body;
        return this;
    }
    public MuteCallResponseBody getBody() {
        return this.body;
    }

}
