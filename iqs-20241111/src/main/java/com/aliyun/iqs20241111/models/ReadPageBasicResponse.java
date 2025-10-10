// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageBasicResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadPageBasicResponseBody body;

    public static ReadPageBasicResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadPageBasicResponse self = new ReadPageBasicResponse();
        return TeaModel.build(map, self);
    }

    public ReadPageBasicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadPageBasicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadPageBasicResponse setBody(ReadPageBasicResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadPageBasicResponseBody getBody() {
        return this.body;
    }

}
