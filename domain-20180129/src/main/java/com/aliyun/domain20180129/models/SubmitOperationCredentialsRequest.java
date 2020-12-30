// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitOperationCredentialsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("AuditRecordId")
    public Long auditRecordId;

    @NameInMap("RegType")
    public Integer regType;

    @NameInMap("AuditType")
    public Integer auditType;

    @NameInMap("Credentials")
    public String credentials;

    public static SubmitOperationCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitOperationCredentialsRequest self = new SubmitOperationCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitOperationCredentialsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SubmitOperationCredentialsRequest setAuditRecordId(Long auditRecordId) {
        this.auditRecordId = auditRecordId;
        return this;
    }
    public Long getAuditRecordId() {
        return this.auditRecordId;
    }

    public SubmitOperationCredentialsRequest setRegType(Integer regType) {
        this.regType = regType;
        return this;
    }
    public Integer getRegType() {
        return this.regType;
    }

    public SubmitOperationCredentialsRequest setAuditType(Integer auditType) {
        this.auditType = auditType;
        return this;
    }
    public Integer getAuditType() {
        return this.auditType;
    }

    public SubmitOperationCredentialsRequest setCredentials(String credentials) {
        this.credentials = credentials;
        return this;
    }
    public String getCredentials() {
        return this.credentials;
    }

}
