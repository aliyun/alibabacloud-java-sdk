// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePalyEventListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePalyEventListResponseBody body;

    public static DescribePalyEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePalyEventListResponse self = new DescribePalyEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePalyEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePalyEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePalyEventListResponse setBody(DescribePalyEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePalyEventListResponseBody getBody() {
        return this.body;
    }

}
