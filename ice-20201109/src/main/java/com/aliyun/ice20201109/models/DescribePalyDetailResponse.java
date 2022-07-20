// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePalyDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePalyDetailResponseBody body;

    public static DescribePalyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePalyDetailResponse self = new DescribePalyDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePalyDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePalyDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePalyDetailResponse setBody(DescribePalyDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePalyDetailResponseBody getBody() {
        return this.body;
    }

}
