// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSlsReportListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSlsReportListResponseBody body;

    public static GetSlsReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSlsReportListResponse self = new GetSlsReportListResponse();
        return TeaModel.build(map, self);
    }

    public GetSlsReportListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSlsReportListResponse setBody(GetSlsReportListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSlsReportListResponseBody getBody() {
        return this.body;
    }

}
