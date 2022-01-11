// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class FinishDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FinishDemandResponseBody body;

    public static FinishDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishDemandResponse self = new FinishDemandResponse();
        return TeaModel.build(map, self);
    }

    public FinishDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishDemandResponse setBody(FinishDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishDemandResponseBody getBody() {
        return this.body;
    }

}
