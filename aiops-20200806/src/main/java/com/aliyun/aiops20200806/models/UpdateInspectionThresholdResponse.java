// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateInspectionThresholdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInspectionThresholdResponseBody body;

    public static UpdateInspectionThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInspectionThresholdResponse self = new UpdateInspectionThresholdResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInspectionThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInspectionThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInspectionThresholdResponse setBody(UpdateInspectionThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInspectionThresholdResponseBody getBody() {
        return this.body;
    }

}
