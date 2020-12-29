// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenPrivateZoneRoutesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCenPrivateZoneRoutesResponse setBody(DescribeCenPrivateZoneRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenPrivateZoneRoutesResponseBody getBody() {
        return this.body;
    }

}
