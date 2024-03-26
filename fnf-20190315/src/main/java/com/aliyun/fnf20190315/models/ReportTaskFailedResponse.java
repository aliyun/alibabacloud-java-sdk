// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ReportTaskFailedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ReportTaskFailedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportTaskFailedResponse setBody(ReportTaskFailedResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportTaskFailedResponseBody getBody() {
        return this.body;
    }

}
