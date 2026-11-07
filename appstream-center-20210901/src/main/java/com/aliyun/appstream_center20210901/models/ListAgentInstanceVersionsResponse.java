// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAgentInstanceVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentInstanceVersionsResponseBody body;

    public static ListAgentInstanceVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstanceVersionsResponse self = new ListAgentInstanceVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentInstanceVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentInstanceVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentInstanceVersionsResponse setBody(ListAgentInstanceVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentInstanceVersionsResponseBody getBody() {
        return this.body;
    }

}
