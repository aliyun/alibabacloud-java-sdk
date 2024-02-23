// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVoiceFileAuditInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryVoiceFileAuditInfoResponseBody body;

    public static QueryVoiceFileAuditInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceFileAuditInfoResponse self = new QueryVoiceFileAuditInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryVoiceFileAuditInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVoiceFileAuditInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVoiceFileAuditInfoResponse setBody(QueryVoiceFileAuditInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVoiceFileAuditInfoResponseBody getBody() {
        return this.body;
    }

}
