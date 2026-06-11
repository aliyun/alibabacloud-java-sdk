// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListRayJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRayJobResponseBody body;

    public static ListRayJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRayJobResponse self = new ListRayJobResponse();
        return TeaModel.build(map, self);
    }

    public ListRayJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRayJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRayJobResponse setBody(ListRayJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRayJobResponseBody getBody() {
        return this.body;
    }

}
