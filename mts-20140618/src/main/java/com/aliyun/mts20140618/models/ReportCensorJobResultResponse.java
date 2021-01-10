// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportCensorJobResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportCensorJobResultResponseBody body;

    public static ReportCensorJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportCensorJobResultResponse self = new ReportCensorJobResultResponse();
        return TeaModel.build(map, self);
    }

    public ReportCensorJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportCensorJobResultResponse setBody(ReportCensorJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportCensorJobResultResponseBody getBody() {
        return this.body;
    }

}
