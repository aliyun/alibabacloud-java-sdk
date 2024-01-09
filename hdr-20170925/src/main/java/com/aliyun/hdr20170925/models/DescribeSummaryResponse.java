// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSummaryResponseBody body;

    public static DescribeSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryResponse self = new DescribeSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSummaryResponse setBody(DescribeSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSummaryResponseBody getBody() {
        return this.body;
    }

}
