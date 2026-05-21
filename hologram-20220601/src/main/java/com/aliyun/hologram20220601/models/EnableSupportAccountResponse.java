// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class EnableSupportAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSupportAccountResponseBody body;

    public static EnableSupportAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSupportAccountResponse self = new EnableSupportAccountResponse();
        return TeaModel.build(map, self);
    }

    public EnableSupportAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSupportAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSupportAccountResponse setBody(EnableSupportAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSupportAccountResponseBody getBody() {
        return this.body;
    }

}
