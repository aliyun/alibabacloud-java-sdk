// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class AccessHDMInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AccessHDMInstanceResponseBody body;

    public static AccessHDMInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AccessHDMInstanceResponse self = new AccessHDMInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AccessHDMInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccessHDMInstanceResponse setBody(AccessHDMInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AccessHDMInstanceResponseBody getBody() {
        return this.body;
    }

}
