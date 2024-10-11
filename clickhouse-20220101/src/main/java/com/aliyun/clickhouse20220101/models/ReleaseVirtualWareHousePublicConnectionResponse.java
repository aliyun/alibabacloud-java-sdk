// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ReleaseVirtualWareHousePublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ReleaseVirtualWareHousePublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseVirtualWareHousePublicConnectionResponse setBody(ReleaseVirtualWareHousePublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseVirtualWareHousePublicConnectionResponseBody getBody() {
        return this.body;
    }

}
