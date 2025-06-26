// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachTaskSessionResourceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAICoachTaskSessionResourceUsageResponseBody body;

    public static GetAICoachTaskSessionResourceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachTaskSessionResourceUsageResponse self = new GetAICoachTaskSessionResourceUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetAICoachTaskSessionResourceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAICoachTaskSessionResourceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAICoachTaskSessionResourceUsageResponse setBody(GetAICoachTaskSessionResourceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAICoachTaskSessionResourceUsageResponseBody getBody() {
        return this.body;
    }

}
