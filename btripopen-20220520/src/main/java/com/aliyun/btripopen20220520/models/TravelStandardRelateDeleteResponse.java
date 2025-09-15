// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardRelateDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TravelStandardRelateDeleteResponseBody body;

    public static TravelStandardRelateDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardRelateDeleteResponse self = new TravelStandardRelateDeleteResponse();
        return TeaModel.build(map, self);
    }

    public TravelStandardRelateDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TravelStandardRelateDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TravelStandardRelateDeleteResponse setBody(TravelStandardRelateDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public TravelStandardRelateDeleteResponseBody getBody() {
        return this.body;
    }

}
