// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ReportTaskSucceededResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReportTaskSucceededResponseBody body;

    public static ReportTaskSucceededResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportTaskSucceededResponse self = new ReportTaskSucceededResponse();
        return TeaModel.build(map, self);
    }

    public ReportTaskSucceededResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportTaskSucceededResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportTaskSucceededResponse setBody(ReportTaskSucceededResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportTaskSucceededResponseBody getBody() {
        return this.body;
    }

}
