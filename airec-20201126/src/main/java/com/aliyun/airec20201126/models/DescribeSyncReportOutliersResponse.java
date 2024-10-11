// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeSyncReportOutliersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSyncReportOutliersResponseBody body;

    public static DescribeSyncReportOutliersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncReportOutliersResponse self = new DescribeSyncReportOutliersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSyncReportOutliersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSyncReportOutliersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSyncReportOutliersResponse setBody(DescribeSyncReportOutliersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncReportOutliersResponseBody getBody() {
        return this.body;
    }

}
