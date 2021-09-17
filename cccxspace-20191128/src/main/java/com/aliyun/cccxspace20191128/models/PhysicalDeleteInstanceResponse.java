// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class PhysicalDeleteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PhysicalDeleteInstanceResponseBody body;

    public static PhysicalDeleteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        PhysicalDeleteInstanceResponse self = new PhysicalDeleteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public PhysicalDeleteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PhysicalDeleteInstanceResponse setBody(PhysicalDeleteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public PhysicalDeleteInstanceResponseBody getBody() {
        return this.body;
    }

}
