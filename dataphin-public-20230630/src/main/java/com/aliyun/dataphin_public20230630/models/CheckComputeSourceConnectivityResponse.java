// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckComputeSourceConnectivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckComputeSourceConnectivityResponseBody body;

    public static CheckComputeSourceConnectivityResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckComputeSourceConnectivityResponse self = new CheckComputeSourceConnectivityResponse();
        return TeaModel.build(map, self);
    }

    public CheckComputeSourceConnectivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckComputeSourceConnectivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckComputeSourceConnectivityResponse setBody(CheckComputeSourceConnectivityResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckComputeSourceConnectivityResponseBody getBody() {
        return this.body;
    }

}
