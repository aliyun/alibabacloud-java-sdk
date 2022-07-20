// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePalyListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePalyListResponseBody body;

    public static DescribePalyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePalyListResponse self = new DescribePalyListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePalyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePalyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePalyListResponse setBody(DescribePalyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePalyListResponseBody getBody() {
        return this.body;
    }

}
