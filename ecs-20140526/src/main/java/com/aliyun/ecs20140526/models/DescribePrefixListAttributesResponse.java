// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePrefixListAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePrefixListAttributesResponseBody body;

    public static DescribePrefixListAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrefixListAttributesResponse self = new DescribePrefixListAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrefixListAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrefixListAttributesResponse setBody(DescribePrefixListAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrefixListAttributesResponseBody getBody() {
        return this.body;
    }

}
