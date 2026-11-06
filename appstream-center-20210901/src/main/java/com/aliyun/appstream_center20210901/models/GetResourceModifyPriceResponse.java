// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourceModifyPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceModifyPriceResponseBody body;

    public static GetResourceModifyPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceModifyPriceResponse self = new GetResourceModifyPriceResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceModifyPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceModifyPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceModifyPriceResponse setBody(GetResourceModifyPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceModifyPriceResponseBody getBody() {
        return this.body;
    }

}
