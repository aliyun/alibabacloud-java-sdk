// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class AddScalingConfigItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddScalingConfigItemResponseBody body;

    public static AddScalingConfigItemResponse build(java.util.Map<String, ?> map) throws Exception {
        AddScalingConfigItemResponse self = new AddScalingConfigItemResponse();
        return TeaModel.build(map, self);
    }

    public AddScalingConfigItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddScalingConfigItemResponse setBody(AddScalingConfigItemResponseBody body) {
        this.body = body;
        return this;
    }
    public AddScalingConfigItemResponseBody getBody() {
        return this.body;
    }

}
