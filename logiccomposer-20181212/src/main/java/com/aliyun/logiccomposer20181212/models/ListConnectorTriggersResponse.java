// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListConnectorTriggersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConnectorTriggersResponseBody body;

    public static ListConnectorTriggersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConnectorTriggersResponse self = new ListConnectorTriggersResponse();
        return TeaModel.build(map, self);
    }

    public ListConnectorTriggersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConnectorTriggersResponse setBody(ListConnectorTriggersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConnectorTriggersResponseBody getBody() {
        return this.body;
    }

}
