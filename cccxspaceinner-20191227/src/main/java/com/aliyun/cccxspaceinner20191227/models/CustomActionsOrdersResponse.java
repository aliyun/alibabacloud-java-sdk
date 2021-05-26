// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CustomActionsOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CustomActionsOrdersResponseBody body;

    public static CustomActionsOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomActionsOrdersResponse self = new CustomActionsOrdersResponse();
        return TeaModel.build(map, self);
    }

    public CustomActionsOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomActionsOrdersResponse setBody(CustomActionsOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomActionsOrdersResponseBody getBody() {
        return this.body;
    }

}
