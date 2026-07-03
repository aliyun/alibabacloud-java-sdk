// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentAccuracyTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataAgentAccuracyTestResponseBody body;

    public static DeleteDataAgentAccuracyTestResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentAccuracyTestResponse self = new DeleteDataAgentAccuracyTestResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentAccuracyTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataAgentAccuracyTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataAgentAccuracyTestResponse setBody(DeleteDataAgentAccuracyTestResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataAgentAccuracyTestResponseBody getBody() {
        return this.body;
    }

}
