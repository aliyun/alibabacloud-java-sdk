// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ForcedFailoverForRPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ForcedFailoverForRPResponseBody body;

    public static ForcedFailoverForRPResponse build(java.util.Map<String, ?> map) throws Exception {
        ForcedFailoverForRPResponse self = new ForcedFailoverForRPResponse();
        return TeaModel.build(map, self);
    }

    public ForcedFailoverForRPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForcedFailoverForRPResponse setBody(ForcedFailoverForRPResponseBody body) {
        this.body = body;
        return this;
    }
    public ForcedFailoverForRPResponseBody getBody() {
        return this.body;
    }

}
