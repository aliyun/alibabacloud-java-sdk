// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CloneFlowJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloneFlowJobResponseBody body;

    public static CloneFlowJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneFlowJobResponse self = new CloneFlowJobResponse();
        return TeaModel.build(map, self);
    }

    public CloneFlowJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneFlowJobResponse setBody(CloneFlowJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneFlowJobResponseBody getBody() {
        return this.body;
    }

}
