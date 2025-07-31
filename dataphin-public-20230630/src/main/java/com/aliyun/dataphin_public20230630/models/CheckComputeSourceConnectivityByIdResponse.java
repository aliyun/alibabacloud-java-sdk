// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckComputeSourceConnectivityByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckComputeSourceConnectivityByIdResponseBody body;

    public static CheckComputeSourceConnectivityByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckComputeSourceConnectivityByIdResponse self = new CheckComputeSourceConnectivityByIdResponse();
        return TeaModel.build(map, self);
    }

    public CheckComputeSourceConnectivityByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckComputeSourceConnectivityByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckComputeSourceConnectivityByIdResponse setBody(CheckComputeSourceConnectivityByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckComputeSourceConnectivityByIdResponseBody getBody() {
        return this.body;
    }

}
