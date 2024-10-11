// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyVirtualWareHouseResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVirtualWareHouseResourceResponseBody body;

    public static ModifyVirtualWareHouseResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualWareHouseResourceResponse self = new ModifyVirtualWareHouseResourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualWareHouseResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVirtualWareHouseResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVirtualWareHouseResourceResponse setBody(ModifyVirtualWareHouseResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVirtualWareHouseResourceResponseBody getBody() {
        return this.body;
    }

}
