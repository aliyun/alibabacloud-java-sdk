// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class AddInstanceUserSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddInstanceUserSaleResponseBody body;

    public static AddInstanceUserSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceUserSaleResponse self = new AddInstanceUserSaleResponse();
        return TeaModel.build(map, self);
    }

    public AddInstanceUserSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddInstanceUserSaleResponse setBody(AddInstanceUserSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddInstanceUserSaleResponseBody getBody() {
        return this.body;
    }

}
