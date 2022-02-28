// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrGatewayResponseBody body;

    public static DescribeDrGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewayResponse self = new DescribeDrGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrGatewayResponse setBody(DescribeDrGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrGatewayResponseBody getBody() {
        return this.body;
    }

}
