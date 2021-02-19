// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ExitStandbyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExitStandbyResponseBody body;

    public static ExitStandbyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExitStandbyResponse self = new ExitStandbyResponse();
        return TeaModel.build(map, self);
    }

    public ExitStandbyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExitStandbyResponse setBody(ExitStandbyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExitStandbyResponseBody getBody() {
        return this.body;
    }

}
