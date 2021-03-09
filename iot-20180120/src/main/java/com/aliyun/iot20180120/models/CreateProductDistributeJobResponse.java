// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductDistributeJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProductDistributeJobResponseBody body;

    public static CreateProductDistributeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductDistributeJobResponse self = new CreateProductDistributeJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductDistributeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductDistributeJobResponse setBody(CreateProductDistributeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductDistributeJobResponseBody getBody() {
        return this.body;
    }

}
