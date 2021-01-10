// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportTerrorismJobResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportTerrorismJobResultResponseBody body;

    public static ReportTerrorismJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportTerrorismJobResultResponse self = new ReportTerrorismJobResultResponse();
        return TeaModel.build(map, self);
    }

    public ReportTerrorismJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportTerrorismJobResultResponse setBody(ReportTerrorismJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportTerrorismJobResultResponseBody getBody() {
        return this.body;
    }

}
