// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachTaskSessionHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAICoachTaskSessionHistoryResponseBody body;

    public static GetAICoachTaskSessionHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachTaskSessionHistoryResponse self = new GetAICoachTaskSessionHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetAICoachTaskSessionHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAICoachTaskSessionHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAICoachTaskSessionHistoryResponse setBody(GetAICoachTaskSessionHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAICoachTaskSessionHistoryResponseBody getBody() {
        return this.body;
    }

}
