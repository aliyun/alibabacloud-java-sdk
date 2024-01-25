// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePurchasedApiGroupResponseBody body;

    public static DescribePurchasedApiGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApiGroupResponse self = new DescribePurchasedApiGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApiGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePurchasedApiGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePurchasedApiGroupResponse setBody(DescribePurchasedApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePurchasedApiGroupResponseBody getBody() {
        return this.body;
    }

}
