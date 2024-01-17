// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BuySessionPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BuySessionPackageResponseBody body;

    public static BuySessionPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        BuySessionPackageResponse self = new BuySessionPackageResponse();
        return TeaModel.build(map, self);
    }

    public BuySessionPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BuySessionPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BuySessionPackageResponse setBody(BuySessionPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public BuySessionPackageResponseBody getBody() {
        return this.body;
    }

}
