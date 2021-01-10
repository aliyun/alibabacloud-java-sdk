// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListFlowTriggersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowTriggersResponseBody body;

    public static ListFlowTriggersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowTriggersResponse self = new ListFlowTriggersResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowTriggersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowTriggersResponse setBody(ListFlowTriggersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowTriggersResponseBody getBody() {
        return this.body;
    }

}
