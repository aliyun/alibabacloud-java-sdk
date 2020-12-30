// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class AcknowledgeTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AcknowledgeTaskResultResponseBody body;

    public static AcknowledgeTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        AcknowledgeTaskResultResponse self = new AcknowledgeTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public AcknowledgeTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcknowledgeTaskResultResponse setBody(AcknowledgeTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public AcknowledgeTaskResultResponseBody getBody() {
        return this.body;
    }

}
