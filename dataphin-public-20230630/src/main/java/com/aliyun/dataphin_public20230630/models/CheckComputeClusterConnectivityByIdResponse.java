// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckComputeClusterConnectivityByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckComputeClusterConnectivityByIdResponseBody body;

    public static CheckComputeClusterConnectivityByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckComputeClusterConnectivityByIdResponse self = new CheckComputeClusterConnectivityByIdResponse();
        return TeaModel.build(map, self);
    }

    public CheckComputeClusterConnectivityByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckComputeClusterConnectivityByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckComputeClusterConnectivityByIdResponse setBody(CheckComputeClusterConnectivityByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckComputeClusterConnectivityByIdResponseBody getBody() {
        return this.body;
    }

}
