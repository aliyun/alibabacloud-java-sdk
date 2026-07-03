// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateDataAgentAccuracyTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataAgentAccuracyTestResponseBody body;

    public static UpdateDataAgentAccuracyTestResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAgentAccuracyTestResponse self = new UpdateDataAgentAccuracyTestResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataAgentAccuracyTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataAgentAccuracyTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataAgentAccuracyTestResponse setBody(UpdateDataAgentAccuracyTestResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataAgentAccuracyTestResponseBody getBody() {
        return this.body;
    }

}
