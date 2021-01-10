// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportCoverJobResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportCoverJobResultResponseBody body;

    public static ReportCoverJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportCoverJobResultResponse self = new ReportCoverJobResultResponse();
        return TeaModel.build(map, self);
    }

    public ReportCoverJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportCoverJobResultResponse setBody(ReportCoverJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportCoverJobResultResponseBody getBody() {
        return this.body;
    }

}
