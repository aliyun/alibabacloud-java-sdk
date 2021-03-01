// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceGroupResponseBody body;

    public static ListResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupResponse self = new ListResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceGroupResponse setBody(ListResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceGroupResponseBody getBody() {
        return this.body;
    }

}
