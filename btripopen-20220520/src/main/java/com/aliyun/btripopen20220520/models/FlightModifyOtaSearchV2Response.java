// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyOtaSearchV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightModifyOtaSearchV2ResponseBody body;

    public static FlightModifyOtaSearchV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyOtaSearchV2Response self = new FlightModifyOtaSearchV2Response();
        return TeaModel.build(map, self);
    }

    public FlightModifyOtaSearchV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightModifyOtaSearchV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightModifyOtaSearchV2Response setBody(FlightModifyOtaSearchV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightModifyOtaSearchV2ResponseBody getBody() {
        return this.body;
    }

}
