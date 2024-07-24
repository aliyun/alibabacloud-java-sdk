// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetSnapshotSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSnapshotSettingResponseBody body;

    public static GetSnapshotSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotSettingResponse self = new GetSnapshotSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetSnapshotSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSnapshotSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSnapshotSettingResponse setBody(GetSnapshotSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSnapshotSettingResponseBody getBody() {
        return this.body;
    }

}
