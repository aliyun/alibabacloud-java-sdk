// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class WhoisProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WhoisProtectionResponseBody body;

    public static WhoisProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        WhoisProtectionResponse self = new WhoisProtectionResponse();
        return TeaModel.build(map, self);
    }

    public WhoisProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WhoisProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WhoisProtectionResponse setBody(WhoisProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public WhoisProtectionResponseBody getBody() {
        return this.body;
    }

}
