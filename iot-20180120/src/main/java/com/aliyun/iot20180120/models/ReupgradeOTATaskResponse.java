// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReupgradeOTATaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReupgradeOTATaskResponseBody body;

    public static ReupgradeOTATaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReupgradeOTATaskResponse self = new ReupgradeOTATaskResponse();
        return TeaModel.build(map, self);
    }

    public ReupgradeOTATaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReupgradeOTATaskResponse setBody(ReupgradeOTATaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ReupgradeOTATaskResponseBody getBody() {
        return this.body;
    }

}
