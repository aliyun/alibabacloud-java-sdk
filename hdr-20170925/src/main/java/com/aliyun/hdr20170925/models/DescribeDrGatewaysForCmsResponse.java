// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewaysForCmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrGatewaysForCmsResponseBody body;

    public static DescribeDrGatewaysForCmsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewaysForCmsResponse self = new DescribeDrGatewaysForCmsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewaysForCmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrGatewaysForCmsResponse setBody(DescribeDrGatewaysForCmsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrGatewaysForCmsResponseBody getBody() {
        return this.body;
    }

}
