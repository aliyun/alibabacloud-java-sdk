// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReclaimRecoveryPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReclaimRecoveryPointResponseBody body;

    public static ReclaimRecoveryPointResponse build(java.util.Map<String, ?> map) throws Exception {
        ReclaimRecoveryPointResponse self = new ReclaimRecoveryPointResponse();
        return TeaModel.build(map, self);
    }

    public ReclaimRecoveryPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReclaimRecoveryPointResponse setBody(ReclaimRecoveryPointResponseBody body) {
        this.body = body;
        return this;
    }
    public ReclaimRecoveryPointResponseBody getBody() {
        return this.body;
    }

}
