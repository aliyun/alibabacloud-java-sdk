// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CheckQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckQuotaResponseBody body;

    public static CheckQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckQuotaResponse self = new CheckQuotaResponse();
        return TeaModel.build(map, self);
    }

    public CheckQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckQuotaResponse setBody(CheckQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckQuotaResponseBody getBody() {
        return this.body;
    }

}
