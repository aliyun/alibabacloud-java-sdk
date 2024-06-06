// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetElecTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetElecTrendResponseBody body;

    public static GetElecTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetElecTrendResponse self = new GetElecTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetElecTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetElecTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetElecTrendResponse setBody(GetElecTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetElecTrendResponseBody getBody() {
        return this.body;
    }

}
