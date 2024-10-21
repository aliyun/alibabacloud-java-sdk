// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetIntlFixPriceDomainListUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIntlFixPriceDomainListUrlResponseBody body;

    public static GetIntlFixPriceDomainListUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIntlFixPriceDomainListUrlResponse self = new GetIntlFixPriceDomainListUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetIntlFixPriceDomainListUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIntlFixPriceDomainListUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIntlFixPriceDomainListUrlResponse setBody(GetIntlFixPriceDomainListUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIntlFixPriceDomainListUrlResponseBody getBody() {
        return this.body;
    }

}
