// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetPayAsYouGoPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPayAsYouGoPriceResponseBody body;

    public static GetPayAsYouGoPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPayAsYouGoPriceResponse self = new GetPayAsYouGoPriceResponse();
        return TeaModel.build(map, self);
    }

    public GetPayAsYouGoPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPayAsYouGoPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPayAsYouGoPriceResponse setBody(GetPayAsYouGoPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPayAsYouGoPriceResponseBody getBody() {
        return this.body;
    }

}
