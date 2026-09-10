// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckReportOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCheckReportOverviewResponseBody body;

    public static GetDataCheckReportOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckReportOverviewResponse self = new GetDataCheckReportOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCheckReportOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCheckReportOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCheckReportOverviewResponse setBody(GetDataCheckReportOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCheckReportOverviewResponseBody getBody() {
        return this.body;
    }

}
