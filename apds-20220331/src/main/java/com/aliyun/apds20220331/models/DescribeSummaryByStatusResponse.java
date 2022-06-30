// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeSummaryByStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSummaryByStatusResponseBody body;

    public static DescribeSummaryByStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryByStatusResponse self = new DescribeSummaryByStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryByStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSummaryByStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSummaryByStatusResponse setBody(DescribeSummaryByStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSummaryByStatusResponseBody getBody() {
        return this.body;
    }

}
