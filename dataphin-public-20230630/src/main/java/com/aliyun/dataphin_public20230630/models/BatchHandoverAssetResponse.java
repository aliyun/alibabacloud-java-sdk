// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class BatchHandoverAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchHandoverAssetResponseBody body;

    public static BatchHandoverAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchHandoverAssetResponse self = new BatchHandoverAssetResponse();
        return TeaModel.build(map, self);
    }

    public BatchHandoverAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchHandoverAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchHandoverAssetResponse setBody(BatchHandoverAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchHandoverAssetResponseBody getBody() {
        return this.body;
    }

}
