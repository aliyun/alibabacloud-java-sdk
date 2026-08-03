// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAICoachTaskSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAICoachTaskSessionResponseBody body;

    public static ListAICoachTaskSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAICoachTaskSessionResponse self = new ListAICoachTaskSessionResponse();
        return TeaModel.build(map, self);
    }

    public ListAICoachTaskSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAICoachTaskSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAICoachTaskSessionResponse setBody(ListAICoachTaskSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAICoachTaskSessionResponseBody getBody() {
        return this.body;
    }

}
