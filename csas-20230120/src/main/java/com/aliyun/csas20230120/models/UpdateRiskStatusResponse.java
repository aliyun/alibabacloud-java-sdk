// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateRiskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRiskStatusResponseBody body;

    public static UpdateRiskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRiskStatusResponse self = new UpdateRiskStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRiskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRiskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRiskStatusResponse setBody(UpdateRiskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRiskStatusResponseBody getBody() {
        return this.body;
    }

}
