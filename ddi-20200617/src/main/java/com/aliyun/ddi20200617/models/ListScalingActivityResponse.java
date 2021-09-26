// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListScalingActivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListScalingActivityResponseBody body;

    public static ListScalingActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScalingActivityResponse self = new ListScalingActivityResponse();
        return TeaModel.build(map, self);
    }

    public ListScalingActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScalingActivityResponse setBody(ListScalingActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScalingActivityResponseBody getBody() {
        return this.body;
    }

}
