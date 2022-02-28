// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewayImageUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrGatewayImageUrlResponseBody body;

    public static DescribeDrGatewayImageUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewayImageUrlResponse self = new DescribeDrGatewayImageUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewayImageUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrGatewayImageUrlResponse setBody(DescribeDrGatewayImageUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrGatewayImageUrlResponseBody getBody() {
        return this.body;
    }

}
