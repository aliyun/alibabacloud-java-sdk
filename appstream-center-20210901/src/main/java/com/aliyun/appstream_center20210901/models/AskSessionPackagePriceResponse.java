// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AskSessionPackagePriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AskSessionPackagePriceResponseBody body;

    public static AskSessionPackagePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        AskSessionPackagePriceResponse self = new AskSessionPackagePriceResponse();
        return TeaModel.build(map, self);
    }

    public AskSessionPackagePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AskSessionPackagePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AskSessionPackagePriceResponse setBody(AskSessionPackagePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public AskSessionPackagePriceResponseBody getBody() {
        return this.body;
    }

}
