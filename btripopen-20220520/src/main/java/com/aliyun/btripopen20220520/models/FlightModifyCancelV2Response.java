// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyCancelV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightModifyCancelV2ResponseBody body;

    public static FlightModifyCancelV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyCancelV2Response self = new FlightModifyCancelV2Response();
        return TeaModel.build(map, self);
    }

    public FlightModifyCancelV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightModifyCancelV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightModifyCancelV2Response setBody(FlightModifyCancelV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightModifyCancelV2ResponseBody getBody() {
        return this.body;
    }

}
