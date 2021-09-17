// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateAliyunInstanceNewSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAliyunInstanceNewSaleResponseBody body;

    public static CreateAliyunInstanceNewSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunInstanceNewSaleResponse self = new CreateAliyunInstanceNewSaleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAliyunInstanceNewSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAliyunInstanceNewSaleResponse setBody(CreateAliyunInstanceNewSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAliyunInstanceNewSaleResponseBody getBody() {
        return this.body;
    }

}
