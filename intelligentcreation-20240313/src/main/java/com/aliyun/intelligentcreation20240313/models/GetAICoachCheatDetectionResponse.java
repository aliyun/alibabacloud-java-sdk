// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachCheatDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAICoachCheatDetectionResponseBody body;

    public static GetAICoachCheatDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachCheatDetectionResponse self = new GetAICoachCheatDetectionResponse();
        return TeaModel.build(map, self);
    }

    public GetAICoachCheatDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAICoachCheatDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAICoachCheatDetectionResponse setBody(GetAICoachCheatDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAICoachCheatDetectionResponseBody getBody() {
        return this.body;
    }

}
