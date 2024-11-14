// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAICoachTaskPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAICoachTaskPageResponseBody body;

    public static ListAICoachTaskPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAICoachTaskPageResponse self = new ListAICoachTaskPageResponse();
        return TeaModel.build(map, self);
    }

    public ListAICoachTaskPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAICoachTaskPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAICoachTaskPageResponse setBody(ListAICoachTaskPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAICoachTaskPageResponseBody getBody() {
        return this.body;
    }

}
