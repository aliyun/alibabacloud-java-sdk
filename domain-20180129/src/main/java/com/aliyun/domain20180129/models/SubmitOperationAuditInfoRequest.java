// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitOperationAuditInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("AuditType")
    public Integer auditType;

    @NameInMap("AuditInfo")
    public String auditInfo;

    @NameInMap("Id")
    public Long id;

    public static SubmitOperationAuditInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitOperationAuditInfoRequest self = new SubmitOperationAuditInfoRequest();
        return TeaModel.build(map, self);
    }

    public SubmitOperationAuditInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SubmitOperationAuditInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SubmitOperationAuditInfoRequest setAuditType(Integer auditType) {
        this.auditType = auditType;
        return this;
    }
    public Integer getAuditType() {
        return this.auditType;
    }

    public SubmitOperationAuditInfoRequest setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public String getAuditInfo() {
        return this.auditInfo;
    }

    public SubmitOperationAuditInfoRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
