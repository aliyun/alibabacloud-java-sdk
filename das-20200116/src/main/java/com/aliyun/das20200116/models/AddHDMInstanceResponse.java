// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class AddHDMInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddHDMInstanceResponseBody body;

    public static AddHDMInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddHDMInstanceResponse self = new AddHDMInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AddHDMInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddHDMInstanceResponse setBody(AddHDMInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddHDMInstanceResponseBody getBody() {
        return this.body;
    }

}
