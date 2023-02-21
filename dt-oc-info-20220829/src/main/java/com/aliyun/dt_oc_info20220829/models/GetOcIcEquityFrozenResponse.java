// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcEquityFrozenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIcEquityFrozenResponseBody body;

    public static GetOcIcEquityFrozenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcEquityFrozenResponse self = new GetOcIcEquityFrozenResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIcEquityFrozenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIcEquityFrozenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIcEquityFrozenResponse setBody(GetOcIcEquityFrozenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIcEquityFrozenResponseBody getBody() {
        return this.body;
    }

}
