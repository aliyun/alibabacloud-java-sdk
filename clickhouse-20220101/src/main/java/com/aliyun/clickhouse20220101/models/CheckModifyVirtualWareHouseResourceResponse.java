// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckModifyVirtualWareHouseResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CheckModifyVirtualWareHouseResourceResponse setBody(CheckModifyVirtualWareHouseResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckModifyVirtualWareHouseResourceResponseBody getBody() {
        return this.body;
    }

}
