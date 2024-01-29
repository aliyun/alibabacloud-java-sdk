// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeterImsSummaryResponseBody body;

    public static DescribeMeterImsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsSummaryResponse self = new DescribeMeterImsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterImsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterImsSummaryResponse setBody(DescribeMeterImsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterImsSummaryResponseBody getBody() {
        return this.body;
    }

}
