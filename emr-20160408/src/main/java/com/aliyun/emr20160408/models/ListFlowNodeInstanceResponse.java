// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowNodeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowNodeInstanceResponseBody body;

    public static ListFlowNodeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodeInstanceResponse self = new ListFlowNodeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowNodeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowNodeInstanceResponse setBody(ListFlowNodeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowNodeInstanceResponseBody getBody() {
        return this.body;
    }

}
