// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMpsAiUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeterImsMpsAiUsageResponseBody body;

    public static DescribeMeterImsMpsAiUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsMpsAiUsageResponse self = new DescribeMeterImsMpsAiUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsMpsAiUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterImsMpsAiUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterImsMpsAiUsageResponse setBody(DescribeMeterImsMpsAiUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterImsMpsAiUsageResponseBody getBody() {
        return this.body;
    }

}
