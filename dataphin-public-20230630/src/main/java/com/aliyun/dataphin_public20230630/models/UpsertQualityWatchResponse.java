// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityWatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpsertQualityWatchResponseBody body;

    public static UpsertQualityWatchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityWatchResponse self = new UpsertQualityWatchResponse();
        return TeaModel.build(map, self);
    }

    public UpsertQualityWatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertQualityWatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertQualityWatchResponse setBody(UpsertQualityWatchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertQualityWatchResponseBody getBody() {
        return this.body;
    }

}
