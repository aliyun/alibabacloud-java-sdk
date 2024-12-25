// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAICoachScriptPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAICoachScriptPageResponseBody body;

    public static ListAICoachScriptPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAICoachScriptPageResponse self = new ListAICoachScriptPageResponse();
        return TeaModel.build(map, self);
    }

    public ListAICoachScriptPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAICoachScriptPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAICoachScriptPageResponse setBody(ListAICoachScriptPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAICoachScriptPageResponseBody getBody() {
        return this.body;
    }

}
