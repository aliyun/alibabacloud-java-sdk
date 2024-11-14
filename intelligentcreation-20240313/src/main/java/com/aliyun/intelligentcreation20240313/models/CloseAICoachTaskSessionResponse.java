// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CloseAICoachTaskSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseAICoachTaskSessionResponseBody body;

    public static CloseAICoachTaskSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseAICoachTaskSessionResponse self = new CloseAICoachTaskSessionResponse();
        return TeaModel.build(map, self);
    }

    public CloseAICoachTaskSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseAICoachTaskSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseAICoachTaskSessionResponse setBody(CloseAICoachTaskSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseAICoachTaskSessionResponseBody getBody() {
        return this.body;
    }

}
