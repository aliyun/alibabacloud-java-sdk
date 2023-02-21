// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcSimpleCancelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIcSimpleCancelResponseBody body;

    public static GetOcIcSimpleCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcSimpleCancelResponse self = new GetOcIcSimpleCancelResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIcSimpleCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIcSimpleCancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIcSimpleCancelResponse setBody(GetOcIcSimpleCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIcSimpleCancelResponseBody getBody() {
        return this.body;
    }

}
