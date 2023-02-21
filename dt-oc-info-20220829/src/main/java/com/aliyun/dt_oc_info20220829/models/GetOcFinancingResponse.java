// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcFinancingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcFinancingResponseBody body;

    public static GetOcFinancingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcFinancingResponse self = new GetOcFinancingResponse();
        return TeaModel.build(map, self);
    }

    public GetOcFinancingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcFinancingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcFinancingResponse setBody(GetOcFinancingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcFinancingResponseBody getBody() {
        return this.body;
    }

}
