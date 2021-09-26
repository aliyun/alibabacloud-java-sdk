// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListScalingConfigItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListScalingConfigItemResponseBody body;

    public static ListScalingConfigItemResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScalingConfigItemResponse self = new ListScalingConfigItemResponse();
        return TeaModel.build(map, self);
    }

    public ListScalingConfigItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScalingConfigItemResponse setBody(ListScalingConfigItemResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScalingConfigItemResponseBody getBody() {
        return this.body;
    }

}
