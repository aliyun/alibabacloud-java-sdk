// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightListingSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntlFlightListingSearchResponseBody body;

    public static IntlFlightListingSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightListingSearchResponse self = new IntlFlightListingSearchResponse();
        return TeaModel.build(map, self);
    }

    public IntlFlightListingSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntlFlightListingSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntlFlightListingSearchResponse setBody(IntlFlightListingSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public IntlFlightListingSearchResponseBody getBody() {
        return this.body;
    }

}
