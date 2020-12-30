// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowInstanceResponseBody body;

    public static ListFlowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowInstanceResponse self = new ListFlowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowInstanceResponse setBody(ListFlowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowInstanceResponseBody getBody() {
        return this.body;
    }

}
