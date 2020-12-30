// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAgentDevicesResponseBody body;

    public static ListAgentDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentDevicesResponse self = new ListAgentDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentDevicesResponse setBody(ListAgentDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentDevicesResponseBody getBody() {
        return this.body;
    }

}
