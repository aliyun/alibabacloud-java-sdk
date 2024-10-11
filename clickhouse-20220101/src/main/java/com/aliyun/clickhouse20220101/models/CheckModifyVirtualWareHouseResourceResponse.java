// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckModifyVirtualWareHouseResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckModifyVirtualWareHouseResourceResponseBody body;

    public static CheckModifyVirtualWareHouseResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckModifyVirtualWareHouseResourceResponse self = new CheckModifyVirtualWareHouseResourceResponse();
        return TeaModel.build(map, self);
    }

    public CheckModifyVirtualWareHouseResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckModifyVirtualWareHouseResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckModifyVirtualWareHouseResourceResponse setBody(CheckModifyVirtualWareHouseResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckModifyVirtualWareHouseResourceResponseBody getBody() {
        return this.body;
    }

}
