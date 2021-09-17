// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class UpdateInstanceUserSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceUserSaleResponseBody body;

    public static UpdateInstanceUserSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceUserSaleResponse self = new UpdateInstanceUserSaleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceUserSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceUserSaleResponse setBody(UpdateInstanceUserSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceUserSaleResponseBody getBody() {
        return this.body;
    }

}
