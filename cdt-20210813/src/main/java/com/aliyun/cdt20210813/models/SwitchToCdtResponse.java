// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class SwitchToCdtResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchToCdtResponseBody body;

    public static SwitchToCdtResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchToCdtResponse self = new SwitchToCdtResponse();
        return TeaModel.build(map, self);
    }

    public SwitchToCdtResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchToCdtResponse setBody(SwitchToCdtResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchToCdtResponseBody getBody() {
        return this.body;
    }

}
