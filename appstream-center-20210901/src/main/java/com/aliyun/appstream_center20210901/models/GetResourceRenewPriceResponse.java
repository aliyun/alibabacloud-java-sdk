// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourceRenewPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceRenewPriceResponseBody body;

    public static GetResourceRenewPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceRenewPriceResponse self = new GetResourceRenewPriceResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceRenewPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceRenewPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceRenewPriceResponse setBody(GetResourceRenewPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceRenewPriceResponseBody getBody() {
        return this.body;
    }

}
