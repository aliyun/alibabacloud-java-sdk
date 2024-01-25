// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateReportSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateReportSubscriptionResponseBody body;

    public static UpdateReportSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateReportSubscriptionResponse self = new UpdateReportSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateReportSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateReportSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateReportSubscriptionResponse setBody(UpdateReportSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateReportSubscriptionResponseBody getBody() {
        return this.body;
    }

}
