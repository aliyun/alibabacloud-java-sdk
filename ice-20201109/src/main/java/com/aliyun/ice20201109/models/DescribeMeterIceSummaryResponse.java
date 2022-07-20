// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterIceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterIceSummaryResponseBody body;

    public static DescribeMeterIceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterIceSummaryResponse self = new DescribeMeterIceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterIceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterIceSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterIceSummaryResponse setBody(DescribeMeterIceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterIceSummaryResponseBody getBody() {
        return this.body;
    }

}
