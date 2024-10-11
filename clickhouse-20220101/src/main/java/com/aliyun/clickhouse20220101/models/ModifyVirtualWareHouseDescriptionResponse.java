// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyVirtualWareHouseDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVirtualWareHouseDescriptionResponseBody body;

    public static ModifyVirtualWareHouseDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualWareHouseDescriptionResponse self = new ModifyVirtualWareHouseDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualWareHouseDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVirtualWareHouseDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVirtualWareHouseDescriptionResponse setBody(ModifyVirtualWareHouseDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVirtualWareHouseDescriptionResponseBody getBody() {
        return this.body;
    }

}
