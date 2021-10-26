// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribePurchasedApiGroupResponse setBody(DescribePurchasedApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePurchasedApiGroupResponseBody getBody() {
        return this.body;
    }

}
