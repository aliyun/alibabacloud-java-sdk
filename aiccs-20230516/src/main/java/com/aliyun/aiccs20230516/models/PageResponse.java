// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class PageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageResponseBody body;

    public static PageResponse build(java.util.Map<String, ?> map) throws Exception {
        PageResponse self = new PageResponse();
        return TeaModel.build(map, self);
    }

    public PageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageResponse setBody(PageResponseBody body) {
        this.body = body;
        return this;
    }
    public PageResponseBody getBody() {
        return this.body;
    }

}
