// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ChangeProductSpecsOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeProductSpecsOrderResponseBody body;

    public static ChangeProductSpecsOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeProductSpecsOrderResponse self = new ChangeProductSpecsOrderResponse();
        return TeaModel.build(map, self);
    }

    public ChangeProductSpecsOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeProductSpecsOrderResponse setBody(ChangeProductSpecsOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeProductSpecsOrderResponseBody getBody() {
        return this.body;
    }

}
