// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CountAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CountAppVersionResponseBody body;

    public static CountAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CountAppVersionResponse self = new CountAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public CountAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountAppVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountAppVersionResponse setBody(CountAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CountAppVersionResponseBody getBody() {
        return this.body;
    }

}
