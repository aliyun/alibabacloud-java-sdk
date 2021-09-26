// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowNodeSqlResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowNodeSqlResultResponseBody body;

    public static ListFlowNodeSqlResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodeSqlResultResponse self = new ListFlowNodeSqlResultResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowNodeSqlResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowNodeSqlResultResponse setBody(ListFlowNodeSqlResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowNodeSqlResultResponseBody getBody() {
        return this.body;
    }

}
