// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStructSyncOrderDetailResponseBody body;

    public static GetStructSyncOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncOrderDetailResponse self = new GetStructSyncOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetStructSyncOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStructSyncOrderDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStructSyncOrderDetailResponse setBody(GetStructSyncOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStructSyncOrderDetailResponseBody getBody() {
        return this.body;
    }

}
