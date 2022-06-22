// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class PageableQueryUserExperimentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PageableQueryUserExperimentsResponseBody body;

    public static PageableQueryUserExperimentsResponse build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryUserExperimentsResponse self = new PageableQueryUserExperimentsResponse();
        return TeaModel.build(map, self);
    }

    public PageableQueryUserExperimentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageableQueryUserExperimentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageableQueryUserExperimentsResponse setBody(PageableQueryUserExperimentsResponseBody body) {
        this.body = body;
        return this;
    }
    public PageableQueryUserExperimentsResponseBody getBody() {
        return this.body;
    }

}
