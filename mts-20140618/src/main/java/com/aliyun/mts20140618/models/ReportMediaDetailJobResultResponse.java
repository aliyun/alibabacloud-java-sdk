// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportMediaDetailJobResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportMediaDetailJobResultResponseBody body;

    public static ReportMediaDetailJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportMediaDetailJobResultResponse self = new ReportMediaDetailJobResultResponse();
        return TeaModel.build(map, self);
    }

    public ReportMediaDetailJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportMediaDetailJobResultResponse setBody(ReportMediaDetailJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportMediaDetailJobResultResponseBody getBody() {
        return this.body;
    }

}
