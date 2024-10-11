// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class OfflineFilteringAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineFilteringAlgorithmResponseBody body;

    public static OfflineFilteringAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineFilteringAlgorithmResponse self = new OfflineFilteringAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public OfflineFilteringAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineFilteringAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineFilteringAlgorithmResponse setBody(OfflineFilteringAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineFilteringAlgorithmResponseBody getBody() {
        return this.body;
    }

}
