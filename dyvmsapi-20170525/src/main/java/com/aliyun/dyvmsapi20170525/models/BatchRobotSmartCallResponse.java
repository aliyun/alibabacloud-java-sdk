// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class BatchRobotSmartCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchRobotSmartCallResponseBody body;

    public static BatchRobotSmartCallResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRobotSmartCallResponse self = new BatchRobotSmartCallResponse();
        return TeaModel.build(map, self);
    }

    public BatchRobotSmartCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRobotSmartCallResponse setBody(BatchRobotSmartCallResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRobotSmartCallResponseBody getBody() {
        return this.body;
    }

}
