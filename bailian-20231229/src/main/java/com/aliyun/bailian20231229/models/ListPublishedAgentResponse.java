// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListPublishedAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublishedAgentResponseBody body;

    public static ListPublishedAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAgentResponse self = new ListPublishedAgentResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishedAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishedAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishedAgentResponse setBody(ListPublishedAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishedAgentResponseBody getBody() {
        return this.body;
    }

}
