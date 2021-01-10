// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportVideoSplitJobResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportVideoSplitJobResultResponseBody body;

    public static ReportVideoSplitJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportVideoSplitJobResultResponse self = new ReportVideoSplitJobResultResponse();
        return TeaModel.build(map, self);
    }

    public ReportVideoSplitJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportVideoSplitJobResultResponse setBody(ReportVideoSplitJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportVideoSplitJobResultResponseBody getBody() {
        return this.body;
    }

}
