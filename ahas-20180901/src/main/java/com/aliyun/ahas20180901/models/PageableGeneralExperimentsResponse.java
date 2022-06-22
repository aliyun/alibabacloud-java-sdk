// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class PageableGeneralExperimentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PageableGeneralExperimentsResponseBody body;

    public static PageableGeneralExperimentsResponse build(java.util.Map<String, ?> map) throws Exception {
        PageableGeneralExperimentsResponse self = new PageableGeneralExperimentsResponse();
        return TeaModel.build(map, self);
    }

    public PageableGeneralExperimentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageableGeneralExperimentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageableGeneralExperimentsResponse setBody(PageableGeneralExperimentsResponseBody body) {
        this.body = body;
        return this;
    }
    public PageableGeneralExperimentsResponseBody getBody() {
        return this.body;
    }

}
