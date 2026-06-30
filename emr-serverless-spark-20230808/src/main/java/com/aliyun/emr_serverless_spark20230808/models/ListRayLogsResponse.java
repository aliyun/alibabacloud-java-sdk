// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListRayLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRayLogsResponseBody body;

    public static ListRayLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRayLogsResponse self = new ListRayLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListRayLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRayLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRayLogsResponse setBody(ListRayLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRayLogsResponseBody getBody() {
        return this.body;
    }

}
