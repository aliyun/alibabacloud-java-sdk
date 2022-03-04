// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DeleteVirtualWareHouseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVirtualWareHouseResponseBody body;

    public static DeleteVirtualWareHouseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualWareHouseResponse self = new DeleteVirtualWareHouseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualWareHouseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVirtualWareHouseResponse setBody(DeleteVirtualWareHouseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVirtualWareHouseResponseBody getBody() {
        return this.body;
    }

}
