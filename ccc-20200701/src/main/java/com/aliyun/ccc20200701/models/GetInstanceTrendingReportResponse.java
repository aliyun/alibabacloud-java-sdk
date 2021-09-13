// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetInstanceTrendingReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceTrendingReportResponseBody body;

    public static GetInstanceTrendingReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTrendingReportResponse self = new GetInstanceTrendingReportResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceTrendingReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceTrendingReportResponse setBody(GetInstanceTrendingReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceTrendingReportResponseBody getBody() {
        return this.body;
    }

}
