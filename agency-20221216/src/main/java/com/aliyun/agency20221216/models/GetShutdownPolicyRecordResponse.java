// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetShutdownPolicyRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetShutdownPolicyRecordResponseBody body;

    public static GetShutdownPolicyRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShutdownPolicyRecordResponse self = new GetShutdownPolicyRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetShutdownPolicyRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShutdownPolicyRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetShutdownPolicyRecordResponse setBody(GetShutdownPolicyRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShutdownPolicyRecordResponseBody getBody() {
        return this.body;
    }

}
