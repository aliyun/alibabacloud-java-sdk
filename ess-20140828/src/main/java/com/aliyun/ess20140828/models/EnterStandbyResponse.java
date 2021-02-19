// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class EnterStandbyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnterStandbyResponseBody body;

    public static EnterStandbyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnterStandbyResponse self = new EnterStandbyResponse();
        return TeaModel.build(map, self);
    }

    public EnterStandbyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnterStandbyResponse setBody(EnterStandbyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnterStandbyResponseBody getBody() {
        return this.body;
    }

}
