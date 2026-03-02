// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetRiskCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRiskCountResponseBody body;

    public static GetRiskCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskCountResponse self = new GetRiskCountResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRiskCountResponse setBody(GetRiskCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskCountResponseBody getBody() {
        return this.body;
    }

}
