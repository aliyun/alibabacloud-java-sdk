// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ClaimCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClaimCallResponseBody body;

    public static ClaimCallResponse build(java.util.Map<String, ?> map) throws Exception {
        ClaimCallResponse self = new ClaimCallResponse();
        return TeaModel.build(map, self);
    }

    public ClaimCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClaimCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClaimCallResponse setBody(ClaimCallResponseBody body) {
        this.body = body;
        return this;
    }
    public ClaimCallResponseBody getBody() {
        return this.body;
    }

}
