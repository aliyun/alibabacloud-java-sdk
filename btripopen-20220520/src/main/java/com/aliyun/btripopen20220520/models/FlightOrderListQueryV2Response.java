// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderListQueryV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightOrderListQueryV2ResponseBody body;

    public static FlightOrderListQueryV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderListQueryV2Response self = new FlightOrderListQueryV2Response();
        return TeaModel.build(map, self);
    }

    public FlightOrderListQueryV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightOrderListQueryV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightOrderListQueryV2Response setBody(FlightOrderListQueryV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightOrderListQueryV2ResponseBody getBody() {
        return this.body;
    }

}
