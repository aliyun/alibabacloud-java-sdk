// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentAccuracyTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataAgentAccuracyTestResponseBody body;

    public static CreateDataAgentAccuracyTestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentAccuracyTestResponse self = new CreateDataAgentAccuracyTestResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentAccuracyTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataAgentAccuracyTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataAgentAccuracyTestResponse setBody(CreateDataAgentAccuracyTestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataAgentAccuracyTestResponseBody getBody() {
        return this.body;
    }

}
