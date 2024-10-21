// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckIntlFixPriceDomainStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckIntlFixPriceDomainStatusResponseBody body;

    public static CheckIntlFixPriceDomainStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckIntlFixPriceDomainStatusResponse self = new CheckIntlFixPriceDomainStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckIntlFixPriceDomainStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckIntlFixPriceDomainStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckIntlFixPriceDomainStatusResponse setBody(CheckIntlFixPriceDomainStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckIntlFixPriceDomainStatusResponseBody getBody() {
        return this.body;
    }

}
