// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgGetVisitDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgGetVisitDetailResponseBody body;

    public static DsgGetVisitDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgGetVisitDetailResponse self = new DsgGetVisitDetailResponse();
        return TeaModel.build(map, self);
    }

    public DsgGetVisitDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgGetVisitDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgGetVisitDetailResponse setBody(DsgGetVisitDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgGetVisitDetailResponseBody getBody() {
        return this.body;
    }

}
