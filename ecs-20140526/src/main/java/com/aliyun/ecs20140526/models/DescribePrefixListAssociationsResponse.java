// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePrefixListAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePrefixListAssociationsResponseBody body;

    public static DescribePrefixListAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrefixListAssociationsResponse self = new DescribePrefixListAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrefixListAssociationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrefixListAssociationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrefixListAssociationsResponse setBody(DescribePrefixListAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrefixListAssociationsResponseBody getBody() {
        return this.body;
    }

}
