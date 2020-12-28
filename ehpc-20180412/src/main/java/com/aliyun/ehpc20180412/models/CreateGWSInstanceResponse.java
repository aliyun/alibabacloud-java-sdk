// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateGWSInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGWSInstanceResponseBody body;

    public static CreateGWSInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGWSInstanceResponse self = new CreateGWSInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGWSInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGWSInstanceResponse setBody(CreateGWSInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGWSInstanceResponseBody getBody() {
        return this.body;
    }

}
