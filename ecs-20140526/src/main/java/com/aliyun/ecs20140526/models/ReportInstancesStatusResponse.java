// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReportInstancesStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportInstancesStatusResponseBody body;

    public static ReportInstancesStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportInstancesStatusResponse self = new ReportInstancesStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportInstancesStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportInstancesStatusResponse setBody(ReportInstancesStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportInstancesStatusResponseBody getBody() {
        return this.body;
    }

}
