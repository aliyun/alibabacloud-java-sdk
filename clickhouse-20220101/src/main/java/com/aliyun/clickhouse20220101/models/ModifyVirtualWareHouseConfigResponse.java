// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyVirtualWareHouseConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVirtualWareHouseConfigResponseBody body;

    public static ModifyVirtualWareHouseConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualWareHouseConfigResponse self = new ModifyVirtualWareHouseConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualWareHouseConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVirtualWareHouseConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVirtualWareHouseConfigResponse setBody(ModifyVirtualWareHouseConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVirtualWareHouseConfigResponseBody getBody() {
        return this.body;
    }

}
