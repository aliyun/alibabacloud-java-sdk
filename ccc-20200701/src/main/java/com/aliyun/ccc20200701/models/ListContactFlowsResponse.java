// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListContactFlowsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListContactFlowsResponseBody body;

    public static ListContactFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContactFlowsResponse self = new ListContactFlowsResponse();
        return TeaModel.build(map, self);
    }

    public ListContactFlowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContactFlowsResponse setBody(ListContactFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContactFlowsResponseBody getBody() {
        return this.body;
    }

}
