// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class RedeployAirflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RedeployAirflowResponseBody body;

    public static RedeployAirflowResponse build(java.util.Map<String, ?> map) throws Exception {
        RedeployAirflowResponse self = new RedeployAirflowResponse();
        return TeaModel.build(map, self);
    }

    public RedeployAirflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RedeployAirflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RedeployAirflowResponse setBody(RedeployAirflowResponseBody body) {
        this.body = body;
        return this;
    }
    public RedeployAirflowResponseBody getBody() {
        return this.body;
    }

}
