// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardRelateAddResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TravelStandardRelateAddResponseBody body;

    public static TravelStandardRelateAddResponse build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardRelateAddResponse self = new TravelStandardRelateAddResponse();
        return TeaModel.build(map, self);
    }

    public TravelStandardRelateAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TravelStandardRelateAddResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TravelStandardRelateAddResponse setBody(TravelStandardRelateAddResponseBody body) {
        this.body = body;
        return this;
    }
    public TravelStandardRelateAddResponseBody getBody() {
        return this.body;
    }

}
