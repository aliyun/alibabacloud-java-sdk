// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutReportEmailConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutReportEmailConfigResponseBody body;

    public static PutReportEmailConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PutReportEmailConfigResponse self = new PutReportEmailConfigResponse();
        return TeaModel.build(map, self);
    }

    public PutReportEmailConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutReportEmailConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutReportEmailConfigResponse setBody(PutReportEmailConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PutReportEmailConfigResponseBody getBody() {
        return this.body;
    }

}
