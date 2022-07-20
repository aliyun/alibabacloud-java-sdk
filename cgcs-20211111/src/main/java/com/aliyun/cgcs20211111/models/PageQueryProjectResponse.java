// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class PageQueryProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PageQueryProjectResponseBody body;

    public static PageQueryProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PageQueryProjectResponse self = new PageQueryProjectResponse();
        return TeaModel.build(map, self);
    }

    public PageQueryProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageQueryProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageQueryProjectResponse setBody(PageQueryProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PageQueryProjectResponseBody getBody() {
        return this.body;
    }

}
