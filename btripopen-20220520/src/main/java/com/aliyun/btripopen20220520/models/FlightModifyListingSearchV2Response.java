// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyListingSearchV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightModifyListingSearchV2ResponseBody body;

    public static FlightModifyListingSearchV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyListingSearchV2Response self = new FlightModifyListingSearchV2Response();
        return TeaModel.build(map, self);
    }

    public FlightModifyListingSearchV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightModifyListingSearchV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightModifyListingSearchV2Response setBody(FlightModifyListingSearchV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightModifyListingSearchV2ResponseBody getBody() {
        return this.body;
    }

}
