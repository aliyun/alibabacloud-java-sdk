// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDrmUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDrmUsageDataResponseBody body;

    public static DescribeLiveDrmUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDrmUsageDataResponse self = new DescribeLiveDrmUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDrmUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDrmUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDrmUsageDataResponse setBody(DescribeLiveDrmUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDrmUsageDataResponseBody getBody() {
        return this.body;
    }

}
