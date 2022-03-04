// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ReleaseVirtualWareHousePublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseVirtualWareHousePublicConnectionResponseBody body;

    public static ReleaseVirtualWareHousePublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseVirtualWareHousePublicConnectionResponse self = new ReleaseVirtualWareHousePublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseVirtualWareHousePublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseVirtualWareHousePublicConnectionResponse setBody(ReleaseVirtualWareHousePublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseVirtualWareHousePublicConnectionResponseBody getBody() {
        return this.body;
    }

}
