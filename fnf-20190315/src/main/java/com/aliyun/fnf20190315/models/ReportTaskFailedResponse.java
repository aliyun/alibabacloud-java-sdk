// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ReportTaskFailedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportTaskFailedResponseBody body;

    public static ReportTaskFailedResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportTaskFailedResponse self = new ReportTaskFailedResponse();
        return TeaModel.build(map, self);
    }

    public ReportTaskFailedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportTaskFailedResponse setBody(ReportTaskFailedResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportTaskFailedResponseBody getBody() {
        return this.body;
    }

}
