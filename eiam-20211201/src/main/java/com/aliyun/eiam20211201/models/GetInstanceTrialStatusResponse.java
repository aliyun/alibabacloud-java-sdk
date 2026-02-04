// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceTrialStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceTrialStatusResponseBody body;

    public static GetInstanceTrialStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTrialStatusResponse self = new GetInstanceTrialStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceTrialStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceTrialStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceTrialStatusResponse setBody(GetInstanceTrialStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceTrialStatusResponseBody getBody() {
        return this.body;
    }

}
