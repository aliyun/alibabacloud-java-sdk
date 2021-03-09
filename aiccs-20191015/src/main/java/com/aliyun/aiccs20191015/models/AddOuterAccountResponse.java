// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddOuterAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddOuterAccountResponseBody body;

    public static AddOuterAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOuterAccountResponse self = new AddOuterAccountResponse();
        return TeaModel.build(map, self);
    }

    public AddOuterAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOuterAccountResponse setBody(AddOuterAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOuterAccountResponseBody getBody() {
        return this.body;
    }

}
