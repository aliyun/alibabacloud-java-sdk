// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_csm_succ20210527.models;

import com.aliyun.tea.*;

public class AccessClueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AccessClueResponseBody body;

    public static AccessClueResponse build(java.util.Map<String, ?> map) throws Exception {
        AccessClueResponse self = new AccessClueResponse();
        return TeaModel.build(map, self);
    }

    public AccessClueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccessClueResponse setBody(AccessClueResponseBody body) {
        this.body = body;
        return this;
    }
    public AccessClueResponseBody getBody() {
        return this.body;
    }

}
