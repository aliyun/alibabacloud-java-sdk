// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetStructSyncOrderDetailResponse setBody(GetStructSyncOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStructSyncOrderDetailResponseBody getBody() {
        return this.body;
    }

}
