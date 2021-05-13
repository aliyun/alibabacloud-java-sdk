// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DistApplicationDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DistApplicationDataResponseBody body;

    public static DistApplicationDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DistApplicationDataResponse self = new DistApplicationDataResponse();
        return TeaModel.build(map, self);
    }

    public DistApplicationDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DistApplicationDataResponse setBody(DistApplicationDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DistApplicationDataResponseBody getBody() {
        return this.body;
    }

}
