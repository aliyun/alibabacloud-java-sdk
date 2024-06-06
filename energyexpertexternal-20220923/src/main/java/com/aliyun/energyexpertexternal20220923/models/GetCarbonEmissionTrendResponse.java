// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetCarbonEmissionTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCarbonEmissionTrendResponseBody body;

    public static GetCarbonEmissionTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCarbonEmissionTrendResponse self = new GetCarbonEmissionTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetCarbonEmissionTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCarbonEmissionTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCarbonEmissionTrendResponse setBody(GetCarbonEmissionTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCarbonEmissionTrendResponseBody getBody() {
        return this.body;
    }

}
