// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgGetVisitStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgGetVisitStatResponseBody body;

    public static DsgGetVisitStatResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgGetVisitStatResponse self = new DsgGetVisitStatResponse();
        return TeaModel.build(map, self);
    }

    public DsgGetVisitStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgGetVisitStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgGetVisitStatResponse setBody(DsgGetVisitStatResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgGetVisitStatResponseBody getBody() {
        return this.body;
    }

}
