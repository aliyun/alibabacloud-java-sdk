// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListAgentDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentDevicesResponse setBody(ListAgentDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentDevicesResponseBody getBody() {
        return this.body;
    }

}
