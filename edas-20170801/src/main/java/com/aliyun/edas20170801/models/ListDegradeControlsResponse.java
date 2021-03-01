// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListDegradeControlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDegradeControlsResponseBody body;

    public static ListDegradeControlsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDegradeControlsResponse self = new ListDegradeControlsResponse();
        return TeaModel.build(map, self);
    }

    public ListDegradeControlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDegradeControlsResponse setBody(ListDegradeControlsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDegradeControlsResponseBody getBody() {
        return this.body;
    }

}
