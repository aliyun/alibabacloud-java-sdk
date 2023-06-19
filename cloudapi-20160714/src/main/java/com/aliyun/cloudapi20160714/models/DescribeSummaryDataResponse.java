// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSummaryDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSummaryDataResponseBody body;

    public static DescribeSummaryDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryDataResponse self = new DescribeSummaryDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSummaryDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSummaryDataResponse setBody(DescribeSummaryDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSummaryDataResponseBody getBody() {
        return this.body;
    }

}
