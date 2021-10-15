// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class ConfirmServerLocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmServerLocationResponseBody body;

    public static ConfirmServerLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmServerLocationResponse self = new ConfirmServerLocationResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmServerLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmServerLocationResponse setBody(ConfirmServerLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmServerLocationResponseBody getBody() {
        return this.body;
    }

}
