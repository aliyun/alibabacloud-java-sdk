// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportFpShotJobResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportFpShotJobResultResponseBody body;

    public static ReportFpShotJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportFpShotJobResultResponse self = new ReportFpShotJobResultResponse();
        return TeaModel.build(map, self);
    }

    public ReportFpShotJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportFpShotJobResultResponse setBody(ReportFpShotJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportFpShotJobResultResponseBody getBody() {
        return this.body;
    }

}
