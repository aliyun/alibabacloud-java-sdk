// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListReleaseVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListReleaseVersionsResponseBody body;

    public static ListReleaseVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReleaseVersionsResponse self = new ListReleaseVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListReleaseVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReleaseVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReleaseVersionsResponse setBody(ListReleaseVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReleaseVersionsResponseBody getBody() {
        return this.body;
    }

}
