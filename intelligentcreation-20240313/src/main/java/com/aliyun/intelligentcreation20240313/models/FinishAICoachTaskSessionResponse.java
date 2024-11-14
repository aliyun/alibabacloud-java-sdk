// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class FinishAICoachTaskSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FinishAICoachTaskSessionResponseBody body;

    public static FinishAICoachTaskSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishAICoachTaskSessionResponse self = new FinishAICoachTaskSessionResponse();
        return TeaModel.build(map, self);
    }

    public FinishAICoachTaskSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishAICoachTaskSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FinishAICoachTaskSessionResponse setBody(FinishAICoachTaskSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishAICoachTaskSessionResponseBody getBody() {
        return this.body;
    }

}
