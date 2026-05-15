// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class PageQueryAgentListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageQueryAgentListNewResponseBody body;

    public static PageQueryAgentListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        PageQueryAgentListNewResponse self = new PageQueryAgentListNewResponse();
        return TeaModel.build(map, self);
    }

    public PageQueryAgentListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageQueryAgentListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageQueryAgentListNewResponse setBody(PageQueryAgentListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public PageQueryAgentListNewResponseBody getBody() {
        return this.body;
    }

}
