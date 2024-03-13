// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MonitorExaminationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MonitorExaminationResponseBody body;

    public static MonitorExaminationResponse build(java.util.Map<String, ?> map) throws Exception {
        MonitorExaminationResponse self = new MonitorExaminationResponse();
        return TeaModel.build(map, self);
    }

    public MonitorExaminationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MonitorExaminationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MonitorExaminationResponse setBody(MonitorExaminationResponseBody body) {
        this.body = body;
        return this;
    }
    public MonitorExaminationResponseBody getBody() {
        return this.body;
    }

}
