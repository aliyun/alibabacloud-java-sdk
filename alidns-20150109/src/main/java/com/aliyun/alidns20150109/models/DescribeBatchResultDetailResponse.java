// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBatchResultDetailResponseBody body;

    public static DescribeBatchResultDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultDetailResponse self = new DescribeBatchResultDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBatchResultDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBatchResultDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBatchResultDetailResponse setBody(DescribeBatchResultDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBatchResultDetailResponseBody getBody() {
        return this.body;
    }

}
