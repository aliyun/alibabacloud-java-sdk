// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ListSopFlowsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSopFlowsResponseBody body;

    public static ListSopFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSopFlowsResponse self = new ListSopFlowsResponse();
        return TeaModel.build(map, self);
    }

    public ListSopFlowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSopFlowsResponse setBody(ListSopFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSopFlowsResponseBody getBody() {
        return this.body;
    }

}
