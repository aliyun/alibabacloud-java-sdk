// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightPayOrderV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightPayOrderV2ResponseBody body;

    public static FlightPayOrderV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightPayOrderV2Response self = new FlightPayOrderV2Response();
        return TeaModel.build(map, self);
    }

    public FlightPayOrderV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightPayOrderV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightPayOrderV2Response setBody(FlightPayOrderV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightPayOrderV2ResponseBody getBody() {
        return this.body;
    }

}
