// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListFlowVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowVersionResponseBody body;

    public static ListFlowVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowVersionResponse self = new ListFlowVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowVersionResponse setBody(ListFlowVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowVersionResponseBody getBody() {
        return this.body;
    }

}
