// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasProServiceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDasProServiceUsageResponseBody body;

    public static GetDasProServiceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDasProServiceUsageResponse self = new GetDasProServiceUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetDasProServiceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDasProServiceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDasProServiceUsageResponse setBody(GetDasProServiceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDasProServiceUsageResponseBody getBody() {
        return this.body;
    }

}
