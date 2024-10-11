// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class AllocateVirtualWareHousePublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateVirtualWareHousePublicConnectionResponseBody body;

    public static AllocateVirtualWareHousePublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateVirtualWareHousePublicConnectionResponse self = new AllocateVirtualWareHousePublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateVirtualWareHousePublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateVirtualWareHousePublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateVirtualWareHousePublicConnectionResponse setBody(AllocateVirtualWareHousePublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateVirtualWareHousePublicConnectionResponseBody getBody() {
        return this.body;
    }

}
