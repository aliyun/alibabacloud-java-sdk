// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class TryRunTaskFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TryRunTaskFlowResponseBody body;

    public static TryRunTaskFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        TryRunTaskFlowResponse self = new TryRunTaskFlowResponse();
        return TeaModel.build(map, self);
    }

    public TryRunTaskFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TryRunTaskFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TryRunTaskFlowResponse setBody(TryRunTaskFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public TryRunTaskFlowResponseBody getBody() {
        return this.body;
    }

}
