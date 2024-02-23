// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class BatchRobotSmartCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchRobotSmartCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchRobotSmartCallResponse setBody(BatchRobotSmartCallResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRobotSmartCallResponseBody getBody() {
        return this.body;
    }

}
