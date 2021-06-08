// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnReportListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnReportListResponseBody body;

    public static DescribeDcdnReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnReportListResponse self = new DescribeDcdnReportListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnReportListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnReportListResponse setBody(DescribeDcdnReportListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnReportListResponseBody getBody() {
        return this.body;
    }

}
