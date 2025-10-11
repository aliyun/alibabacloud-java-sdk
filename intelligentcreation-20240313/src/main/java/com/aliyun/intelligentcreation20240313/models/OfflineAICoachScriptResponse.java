// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class OfflineAICoachScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineAICoachScriptResponseBody body;

    public static OfflineAICoachScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineAICoachScriptResponse self = new OfflineAICoachScriptResponse();
        return TeaModel.build(map, self);
    }

    public OfflineAICoachScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineAICoachScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineAICoachScriptResponse setBody(OfflineAICoachScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineAICoachScriptResponseBody getBody() {
        return this.body;
    }

}
