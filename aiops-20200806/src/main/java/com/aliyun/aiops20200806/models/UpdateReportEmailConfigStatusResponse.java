// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateReportEmailConfigStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateReportEmailConfigStatusResponseBody body;

    public static UpdateReportEmailConfigStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateReportEmailConfigStatusResponse self = new UpdateReportEmailConfigStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateReportEmailConfigStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateReportEmailConfigStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateReportEmailConfigStatusResponse setBody(UpdateReportEmailConfigStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateReportEmailConfigStatusResponseBody getBody() {
        return this.body;
    }

}
