// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCreateOrderV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FlightCreateOrderV2ResponseBody body;

    public static FlightCreateOrderV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightCreateOrderV2Response self = new FlightCreateOrderV2Response();
        return TeaModel.build(map, self);
    }

    public FlightCreateOrderV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightCreateOrderV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightCreateOrderV2Response setBody(FlightCreateOrderV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightCreateOrderV2ResponseBody getBody() {
        return this.body;
    }

}
