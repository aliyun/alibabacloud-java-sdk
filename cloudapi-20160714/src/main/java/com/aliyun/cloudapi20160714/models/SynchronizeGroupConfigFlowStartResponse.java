// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SynchronizeGroupConfigFlowStartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SynchronizeGroupConfigFlowStartResponseBody body;

    public static SynchronizeGroupConfigFlowStartResponse build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeGroupConfigFlowStartResponse self = new SynchronizeGroupConfigFlowStartResponse();
        return TeaModel.build(map, self);
    }

    public SynchronizeGroupConfigFlowStartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SynchronizeGroupConfigFlowStartResponse setBody(SynchronizeGroupConfigFlowStartResponseBody body) {
        this.body = body;
        return this;
    }
    public SynchronizeGroupConfigFlowStartResponseBody getBody() {
        return this.body;
    }

}
