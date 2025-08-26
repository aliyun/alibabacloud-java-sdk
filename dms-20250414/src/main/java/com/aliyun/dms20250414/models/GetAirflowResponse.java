// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAirflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAirflowResponseBody body;

    public static GetAirflowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAirflowResponse self = new GetAirflowResponse();
        return TeaModel.build(map, self);
    }

    public GetAirflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAirflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAirflowResponse setBody(GetAirflowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAirflowResponseBody getBody() {
        return this.body;
    }

}
