// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSuspEventOverviewResponseBody body;

    public static DescribeSuspEventOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventOverviewResponse self = new DescribeSuspEventOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspEventOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSuspEventOverviewResponse setBody(DescribeSuspEventOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspEventOverviewResponseBody getBody() {
        return this.body;
    }

}
