// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class PageQueryAgentListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageQueryAgentListResponseBody body;

    public static PageQueryAgentListResponse build(java.util.Map<String, ?> map) throws Exception {
        PageQueryAgentListResponse self = new PageQueryAgentListResponse();
        return TeaModel.build(map, self);
    }

    public PageQueryAgentListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageQueryAgentListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageQueryAgentListResponse setBody(PageQueryAgentListResponseBody body) {
        this.body = body;
        return this;
    }
    public PageQueryAgentListResponseBody getBody() {
        return this.body;
    }

}
