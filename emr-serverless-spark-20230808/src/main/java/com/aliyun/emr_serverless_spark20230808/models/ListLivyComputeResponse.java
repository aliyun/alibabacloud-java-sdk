// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListLivyComputeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLivyComputeResponseBody body;

    public static ListLivyComputeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLivyComputeResponse self = new ListLivyComputeResponse();
        return TeaModel.build(map, self);
    }

    public ListLivyComputeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLivyComputeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLivyComputeResponse setBody(ListLivyComputeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLivyComputeResponseBody getBody() {
        return this.body;
    }

}
