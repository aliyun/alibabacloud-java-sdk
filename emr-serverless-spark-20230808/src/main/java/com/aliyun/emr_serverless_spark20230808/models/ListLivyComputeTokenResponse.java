// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListLivyComputeTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLivyComputeTokenResponseBody body;

    public static ListLivyComputeTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLivyComputeTokenResponse self = new ListLivyComputeTokenResponse();
        return TeaModel.build(map, self);
    }

    public ListLivyComputeTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLivyComputeTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLivyComputeTokenResponse setBody(ListLivyComputeTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLivyComputeTokenResponseBody getBody() {
        return this.body;
    }

}
