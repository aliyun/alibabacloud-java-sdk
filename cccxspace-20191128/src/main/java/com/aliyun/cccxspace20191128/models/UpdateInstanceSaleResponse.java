// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class UpdateInstanceSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceSaleResponseBody body;

    public static UpdateInstanceSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceSaleResponse self = new UpdateInstanceSaleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceSaleResponse setBody(UpdateInstanceSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceSaleResponseBody getBody() {
        return this.body;
    }

}
