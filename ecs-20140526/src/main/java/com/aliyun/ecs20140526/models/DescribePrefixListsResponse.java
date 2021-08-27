// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePrefixListsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePrefixListsResponseBody body;

    public static DescribePrefixListsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrefixListsResponse self = new DescribePrefixListsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrefixListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrefixListsResponse setBody(DescribePrefixListsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrefixListsResponseBody getBody() {
        return this.body;
    }

}
