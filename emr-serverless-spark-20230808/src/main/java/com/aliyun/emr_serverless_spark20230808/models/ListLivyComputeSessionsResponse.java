// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListLivyComputeSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLivyComputeSessionsResponseBody body;

    public static ListLivyComputeSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLivyComputeSessionsResponse self = new ListLivyComputeSessionsResponse();
        return TeaModel.build(map, self);
    }

    public ListLivyComputeSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLivyComputeSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLivyComputeSessionsResponse setBody(ListLivyComputeSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLivyComputeSessionsResponseBody getBody() {
        return this.body;
    }

}
