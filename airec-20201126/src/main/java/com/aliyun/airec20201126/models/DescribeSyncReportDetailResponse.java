// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeSyncReportDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSyncReportDetailResponseBody body;

    public static DescribeSyncReportDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncReportDetailResponse self = new DescribeSyncReportDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSyncReportDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSyncReportDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSyncReportDetailResponse setBody(DescribeSyncReportDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncReportDetailResponseBody getBody() {
        return this.body;
    }

}
