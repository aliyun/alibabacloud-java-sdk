// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanQueryListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgDesensPlanQueryListResponseBody body;

    public static DsgDesensPlanQueryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanQueryListResponse self = new DsgDesensPlanQueryListResponse();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanQueryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgDesensPlanQueryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgDesensPlanQueryListResponse setBody(DsgDesensPlanQueryListResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgDesensPlanQueryListResponseBody getBody() {
        return this.body;
    }

}
