// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RemoveScalingConfigItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveScalingConfigItemResponseBody body;

    public static RemoveScalingConfigItemResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveScalingConfigItemResponse self = new RemoveScalingConfigItemResponse();
        return TeaModel.build(map, self);
    }

    public RemoveScalingConfigItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveScalingConfigItemResponse setBody(RemoveScalingConfigItemResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveScalingConfigItemResponseBody getBody() {
        return this.body;
    }

}
