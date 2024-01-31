// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderDetailV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightOrderDetailV2ResponseBody body;

    public static FlightOrderDetailV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderDetailV2Response self = new FlightOrderDetailV2Response();
        return TeaModel.build(map, self);
    }

    public FlightOrderDetailV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightOrderDetailV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightOrderDetailV2Response setBody(FlightOrderDetailV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightOrderDetailV2ResponseBody getBody() {
        return this.body;
    }

}
