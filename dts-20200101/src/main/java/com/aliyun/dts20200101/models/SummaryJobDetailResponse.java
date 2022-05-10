// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SummaryJobDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SummaryJobDetailResponseBody body;

    public static SummaryJobDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        SummaryJobDetailResponse self = new SummaryJobDetailResponse();
        return TeaModel.build(map, self);
    }

    public SummaryJobDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SummaryJobDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SummaryJobDetailResponse setBody(SummaryJobDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public SummaryJobDetailResponseBody getBody() {
        return this.body;
    }

}
