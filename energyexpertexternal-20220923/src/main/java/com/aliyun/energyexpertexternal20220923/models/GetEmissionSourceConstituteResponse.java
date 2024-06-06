// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetEmissionSourceConstituteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEmissionSourceConstituteResponseBody body;

    public static GetEmissionSourceConstituteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmissionSourceConstituteResponse self = new GetEmissionSourceConstituteResponse();
        return TeaModel.build(map, self);
    }

    public GetEmissionSourceConstituteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEmissionSourceConstituteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEmissionSourceConstituteResponse setBody(GetEmissionSourceConstituteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmissionSourceConstituteResponseBody getBody() {
        return this.body;
    }

}
