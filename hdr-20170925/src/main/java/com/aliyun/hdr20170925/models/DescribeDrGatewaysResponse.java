// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrGatewaysResponseBody body;

    public static DescribeDrGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewaysResponse self = new DescribeDrGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrGatewaysResponse setBody(DescribeDrGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrGatewaysResponseBody getBody() {
        return this.body;
    }

}
