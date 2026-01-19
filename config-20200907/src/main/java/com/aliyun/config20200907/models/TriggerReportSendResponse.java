// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class TriggerReportSendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerReportSendResponseBody body;

    public static TriggerReportSendResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerReportSendResponse self = new TriggerReportSendResponse();
        return TeaModel.build(map, self);
    }

    public TriggerReportSendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerReportSendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerReportSendResponse setBody(TriggerReportSendResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerReportSendResponseBody getBody() {
        return this.body;
    }

}
