// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightListingSearchV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FlightListingSearchV2ResponseBody body;

    public static FlightListingSearchV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightListingSearchV2Response self = new FlightListingSearchV2Response();
        return TeaModel.build(map, self);
    }

    public FlightListingSearchV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightListingSearchV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightListingSearchV2Response setBody(FlightListingSearchV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightListingSearchV2ResponseBody getBody() {
        return this.body;
    }

}
