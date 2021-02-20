// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEPInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEPInstanceResponseBody body;

    public static CreateEPInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEPInstanceResponse self = new CreateEPInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateEPInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEPInstanceResponse setBody(CreateEPInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEPInstanceResponseBody getBody() {
        return this.body;
    }

}
