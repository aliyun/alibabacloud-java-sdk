// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class PushCertDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushCertDataResponseBody body;

    public static PushCertDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PushCertDataResponse self = new PushCertDataResponse();
        return TeaModel.build(map, self);
    }

    public PushCertDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushCertDataResponse setBody(PushCertDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PushCertDataResponseBody getBody() {
        return this.body;
    }

}
