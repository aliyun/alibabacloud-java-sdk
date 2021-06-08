// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnReportResponseBody body;

    public static DescribeDcdnReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnReportResponse self = new DescribeDcdnReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnReportResponse setBody(DescribeDcdnReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnReportResponseBody getBody() {
        return this.body;
    }

}
