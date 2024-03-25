// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenPrivateZoneRoutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCenPrivateZoneRoutesResponseBody body;

    public static DescribeCenPrivateZoneRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenPrivateZoneRoutesResponse self = new DescribeCenPrivateZoneRoutesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenPrivateZoneRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenPrivateZoneRoutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCenPrivateZoneRoutesResponse setBody(DescribeCenPrivateZoneRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenPrivateZoneRoutesResponseBody getBody() {
        return this.body;
    }

}
