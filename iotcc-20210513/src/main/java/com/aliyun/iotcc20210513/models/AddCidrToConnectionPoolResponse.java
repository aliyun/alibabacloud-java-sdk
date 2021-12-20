// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class AddCidrToConnectionPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCidrToConnectionPoolResponseBody body;

    public static AddCidrToConnectionPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCidrToConnectionPoolResponse self = new AddCidrToConnectionPoolResponse();
        return TeaModel.build(map, self);
    }

    public AddCidrToConnectionPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCidrToConnectionPoolResponse setBody(AddCidrToConnectionPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCidrToConnectionPoolResponseBody getBody() {
        return this.body;
    }

}
