// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncExecSqlDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetStructSyncExecSqlDetailResponse setBody(GetStructSyncExecSqlDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStructSyncExecSqlDetailResponseBody getBody() {
        return this.body;
    }

}
