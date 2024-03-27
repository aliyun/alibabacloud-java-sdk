// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncJobDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStructSyncJobDetailResponseBody body;

    public static GetStructSyncJobDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncJobDetailResponse self = new GetStructSyncJobDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetStructSyncJobDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStructSyncJobDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStructSyncJobDetailResponse setBody(GetStructSyncJobDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStructSyncJobDetailResponseBody getBody() {
        return this.body;
    }

}
