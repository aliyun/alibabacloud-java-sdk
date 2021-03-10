// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDataAPIServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataAPIServiceResponseBody body;

    public static CreateDataAPIServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAPIServiceResponse self = new CreateDataAPIServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataAPIServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataAPIServiceResponse setBody(CreateDataAPIServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataAPIServiceResponseBody getBody() {
        return this.body;
    }

}
