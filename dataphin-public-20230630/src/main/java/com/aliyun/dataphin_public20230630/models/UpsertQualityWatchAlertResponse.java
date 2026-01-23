// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityWatchAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpsertQualityWatchAlertResponseBody body;

    public static UpsertQualityWatchAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityWatchAlertResponse self = new UpsertQualityWatchAlertResponse();
        return TeaModel.build(map, self);
    }

    public UpsertQualityWatchAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertQualityWatchAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertQualityWatchAlertResponse setBody(UpsertQualityWatchAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertQualityWatchAlertResponseBody getBody() {
        return this.body;
    }

}
