// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalInstanceReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHistoricalInstanceReportResponseBody body;

    public static GetHistoricalInstanceReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistoricalInstanceReportResponse self = new GetHistoricalInstanceReportResponse();
        return TeaModel.build(map, self);
    }

    public GetHistoricalInstanceReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistoricalInstanceReportResponse setBody(GetHistoricalInstanceReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHistoricalInstanceReportResponseBody getBody() {
        return this.body;
    }

}
