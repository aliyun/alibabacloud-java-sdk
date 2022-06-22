// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GiveAwayCouponsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GiveAwayCouponsResponseBody body;

    public static GiveAwayCouponsResponse build(java.util.Map<String, ?> map) throws Exception {
        GiveAwayCouponsResponse self = new GiveAwayCouponsResponse();
        return TeaModel.build(map, self);
    }

    public GiveAwayCouponsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GiveAwayCouponsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GiveAwayCouponsResponse setBody(GiveAwayCouponsResponseBody body) {
        this.body = body;
        return this;
    }
    public GiveAwayCouponsResponseBody getBody() {
        return this.body;
    }

}
