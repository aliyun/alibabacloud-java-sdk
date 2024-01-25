// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePurchasedApiGroupsResponseBody body;

    public static DescribePurchasedApiGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApiGroupsResponse self = new DescribePurchasedApiGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApiGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePurchasedApiGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePurchasedApiGroupsResponse setBody(DescribePurchasedApiGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePurchasedApiGroupsResponseBody getBody() {
        return this.body;
    }

}
