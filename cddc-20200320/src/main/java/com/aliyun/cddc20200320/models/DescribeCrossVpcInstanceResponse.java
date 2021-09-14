// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeCrossVpcInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCrossVpcInstanceResponseBody body;

    public static DescribeCrossVpcInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossVpcInstanceResponse self = new DescribeCrossVpcInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrossVpcInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCrossVpcInstanceResponse setBody(DescribeCrossVpcInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrossVpcInstanceResponseBody getBody() {
        return this.body;
    }

}
