// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GetTrialInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrialInfoResponseBody body;

    public static GetTrialInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrialInfoResponse self = new GetTrialInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetTrialInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrialInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrialInfoResponse setBody(GetTrialInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrialInfoResponseBody getBody() {
        return this.body;
    }

}
