// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody body;

    public static VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponse self = new VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponse setBody(VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponseBody getBody() {
        return this.body;
    }

}
