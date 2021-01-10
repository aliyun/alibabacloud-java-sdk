// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportFacerecogJobResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportFacerecogJobResultResponseBody body;

    public static ReportFacerecogJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportFacerecogJobResultResponse self = new ReportFacerecogJobResultResponse();
        return TeaModel.build(map, self);
    }

    public ReportFacerecogJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportFacerecogJobResultResponse setBody(ReportFacerecogJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportFacerecogJobResultResponseBody getBody() {
        return this.body;
    }

}
