// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateVmAndSaveStockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVmAndSaveStockResponseBody body;

    public static CreateVmAndSaveStockResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVmAndSaveStockResponse self = new CreateVmAndSaveStockResponse();
        return TeaModel.build(map, self);
    }

    public CreateVmAndSaveStockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVmAndSaveStockResponse setBody(CreateVmAndSaveStockResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVmAndSaveStockResponseBody getBody() {
        return this.body;
    }

}
