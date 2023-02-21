// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcSeriousOffenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIcSeriousOffenseResponseBody body;

    public static GetOcIcSeriousOffenseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcSeriousOffenseResponse self = new GetOcIcSeriousOffenseResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIcSeriousOffenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIcSeriousOffenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIcSeriousOffenseResponse setBody(GetOcIcSeriousOffenseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIcSeriousOffenseResponseBody getBody() {
        return this.body;
    }

}
