// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class PageQueryProjectAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PageQueryProjectAppsResponseBody body;

    public static PageQueryProjectAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        PageQueryProjectAppsResponse self = new PageQueryProjectAppsResponse();
        return TeaModel.build(map, self);
    }

    public PageQueryProjectAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageQueryProjectAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageQueryProjectAppsResponse setBody(PageQueryProjectAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public PageQueryProjectAppsResponseBody getBody() {
        return this.body;
    }

}
