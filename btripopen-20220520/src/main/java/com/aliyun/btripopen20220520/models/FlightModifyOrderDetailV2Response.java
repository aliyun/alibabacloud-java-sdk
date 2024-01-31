// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyOrderDetailV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightModifyOrderDetailV2ResponseBody body;

    public static FlightModifyOrderDetailV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyOrderDetailV2Response self = new FlightModifyOrderDetailV2Response();
        return TeaModel.build(map, self);
    }

    public FlightModifyOrderDetailV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightModifyOrderDetailV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightModifyOrderDetailV2Response setBody(FlightModifyOrderDetailV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightModifyOrderDetailV2ResponseBody getBody() {
        return this.body;
    }

}
