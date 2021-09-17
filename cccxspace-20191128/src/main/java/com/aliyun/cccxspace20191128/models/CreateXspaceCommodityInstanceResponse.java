// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateXspaceCommodityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateXspaceCommodityInstanceResponseBody body;

    public static CreateXspaceCommodityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateXspaceCommodityInstanceResponse self = new CreateXspaceCommodityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateXspaceCommodityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateXspaceCommodityInstanceResponse setBody(CreateXspaceCommodityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateXspaceCommodityInstanceResponseBody getBody() {
        return this.body;
    }

}
