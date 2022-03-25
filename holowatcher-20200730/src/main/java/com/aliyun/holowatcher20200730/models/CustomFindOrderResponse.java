// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CustomFindOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CustomFindOrderResponseBody body;

    public static CustomFindOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomFindOrderResponse self = new CustomFindOrderResponse();
        return TeaModel.build(map, self);
    }

    public CustomFindOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomFindOrderResponse setBody(CustomFindOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomFindOrderResponseBody getBody() {
        return this.body;
    }

}
