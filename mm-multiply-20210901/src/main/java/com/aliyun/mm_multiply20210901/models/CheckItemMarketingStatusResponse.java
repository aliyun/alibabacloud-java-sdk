// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CheckItemMarketingStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckItemMarketingStatusResponseBody body;

    public static CheckItemMarketingStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckItemMarketingStatusResponse self = new CheckItemMarketingStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckItemMarketingStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckItemMarketingStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckItemMarketingStatusResponse setBody(CheckItemMarketingStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckItemMarketingStatusResponseBody getBody() {
        return this.body;
    }

}
