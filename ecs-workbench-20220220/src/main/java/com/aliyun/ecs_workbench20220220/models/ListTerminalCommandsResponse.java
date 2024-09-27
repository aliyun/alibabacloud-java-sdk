// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class ListTerminalCommandsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTerminalCommandsResponseBody body;

    public static ListTerminalCommandsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTerminalCommandsResponse self = new ListTerminalCommandsResponse();
        return TeaModel.build(map, self);
    }

    public ListTerminalCommandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTerminalCommandsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTerminalCommandsResponse setBody(ListTerminalCommandsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTerminalCommandsResponseBody getBody() {
        return this.body;
    }

}
