// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetResourcePackagePriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourcePackagePriceResponseBody body;

    public static GetResourcePackagePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePackagePriceResponse self = new GetResourcePackagePriceResponse();
        return TeaModel.build(map, self);
    }

    public GetResourcePackagePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourcePackagePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourcePackagePriceResponse setBody(GetResourcePackagePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourcePackagePriceResponseBody getBody() {
        return this.body;
    }

}
