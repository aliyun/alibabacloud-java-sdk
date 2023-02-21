// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIpTrademarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIpTrademarkResponseBody body;

    public static GetOcIpTrademarkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIpTrademarkResponse self = new GetOcIpTrademarkResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIpTrademarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIpTrademarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIpTrademarkResponse setBody(GetOcIpTrademarkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIpTrademarkResponseBody getBody() {
        return this.body;
    }

}
