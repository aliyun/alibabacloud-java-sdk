// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncExecSqlDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStructSyncExecSqlDetailResponseBody body;

    public static GetStructSyncExecSqlDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncExecSqlDetailResponse self = new GetStructSyncExecSqlDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetStructSyncExecSqlDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStructSyncExecSqlDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStructSyncExecSqlDetailResponse setBody(GetStructSyncExecSqlDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStructSyncExecSqlDetailResponseBody getBody() {
        return this.body;
    }

}
