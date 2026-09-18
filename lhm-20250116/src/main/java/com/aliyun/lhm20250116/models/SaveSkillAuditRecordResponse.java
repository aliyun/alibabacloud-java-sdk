// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class SaveSkillAuditRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSkillAuditRecordResponseBody body;

    public static SaveSkillAuditRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSkillAuditRecordResponse self = new SaveSkillAuditRecordResponse();
        return TeaModel.build(map, self);
    }

    public SaveSkillAuditRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSkillAuditRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSkillAuditRecordResponse setBody(SaveSkillAuditRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSkillAuditRecordResponseBody getBody() {
        return this.body;
    }

}
