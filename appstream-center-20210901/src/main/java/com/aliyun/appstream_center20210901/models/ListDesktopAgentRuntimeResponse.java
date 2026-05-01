// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListDesktopAgentRuntimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDesktopAgentRuntimeResponseBody body;

    public static ListDesktopAgentRuntimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDesktopAgentRuntimeResponse self = new ListDesktopAgentRuntimeResponse();
        return TeaModel.build(map, self);
    }

    public ListDesktopAgentRuntimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDesktopAgentRuntimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDesktopAgentRuntimeResponse setBody(ListDesktopAgentRuntimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDesktopAgentRuntimeResponseBody getBody() {
        return this.body;
    }

}
