// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchDescribeCdnIpInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDescribeCdnIpInfoResponseBody body;

    public static BatchDescribeCdnIpInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDescribeCdnIpInfoResponse self = new BatchDescribeCdnIpInfoResponse();
        return TeaModel.build(map, self);
    }

    public BatchDescribeCdnIpInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDescribeCdnIpInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDescribeCdnIpInfoResponse setBody(BatchDescribeCdnIpInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDescribeCdnIpInfoResponseBody getBody() {
        return this.body;
    }

}
