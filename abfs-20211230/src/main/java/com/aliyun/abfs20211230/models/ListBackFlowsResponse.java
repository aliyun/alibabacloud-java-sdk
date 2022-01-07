// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class ListBackFlowsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBackFlowsResponseBody body;

    public static ListBackFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBackFlowsResponse self = new ListBackFlowsResponse();
        return TeaModel.build(map, self);
    }

    public ListBackFlowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBackFlowsResponse setBody(ListBackFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBackFlowsResponseBody getBody() {
        return this.body;
    }

}
