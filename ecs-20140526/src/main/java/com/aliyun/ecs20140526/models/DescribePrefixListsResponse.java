// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePrefixListsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribePrefixListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrefixListsResponse setBody(DescribePrefixListsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrefixListsResponseBody getBody() {
        return this.body;
    }

}
