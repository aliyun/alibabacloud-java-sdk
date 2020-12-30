// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class SetQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetQuotaResponseBody body;

    public static SetQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        SetQuotaResponse self = new SetQuotaResponse();
        return TeaModel.build(map, self);
    }

    public SetQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetQuotaResponse setBody(SetQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public SetQuotaResponseBody getBody() {
        return this.body;
    }

}
