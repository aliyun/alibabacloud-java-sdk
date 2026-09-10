// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetStepResultOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStepResultOverviewResponseBody body;

    public static GetStepResultOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStepResultOverviewResponse self = new GetStepResultOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetStepResultOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStepResultOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStepResultOverviewResponse setBody(GetStepResultOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStepResultOverviewResponseBody getBody() {
        return this.body;
    }

}
