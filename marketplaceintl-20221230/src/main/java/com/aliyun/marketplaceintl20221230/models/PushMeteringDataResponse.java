// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230.models;

import com.aliyun.tea.*;

public class PushMeteringDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushMeteringDataResponseBody body;

    public static PushMeteringDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PushMeteringDataResponse self = new PushMeteringDataResponse();
        return TeaModel.build(map, self);
    }

    public PushMeteringDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushMeteringDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushMeteringDataResponse setBody(PushMeteringDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PushMeteringDataResponseBody getBody() {
        return this.body;
    }

}
