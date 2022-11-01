// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourcePriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourcePriceResponseBody body;

    public static GetResourcePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePriceResponse self = new GetResourcePriceResponse();
        return TeaModel.build(map, self);
    }

    public GetResourcePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourcePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourcePriceResponse setBody(GetResourcePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourcePriceResponseBody getBody() {
        return this.body;
    }

}
