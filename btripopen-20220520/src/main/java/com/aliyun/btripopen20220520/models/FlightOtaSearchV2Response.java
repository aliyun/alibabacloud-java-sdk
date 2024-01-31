// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOtaSearchV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightOtaSearchV2ResponseBody body;

    public static FlightOtaSearchV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightOtaSearchV2Response self = new FlightOtaSearchV2Response();
        return TeaModel.build(map, self);
    }

    public FlightOtaSearchV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightOtaSearchV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightOtaSearchV2Response setBody(FlightOtaSearchV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightOtaSearchV2ResponseBody getBody() {
        return this.body;
    }

}
