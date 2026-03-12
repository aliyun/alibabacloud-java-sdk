// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryContactTemplateRequest extends TeaModel {
    @NameInMap("AuditStatus")
    public String auditStatus;

    @NameInMap("CCompany")
    public String CCompany;

    @NameInMap("ContactTemplateId")
    public Long contactTemplateId;

    @NameInMap("DefaultTemplate")
    public Boolean defaultTemplate;

    @NameInMap("ECompany")
    public String ECompany;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegType")
    public String regType;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryContactTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContactTemplateRequest self = new QueryContactTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryContactTemplateRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public QueryContactTemplateRequest setCCompany(String CCompany) {
        this.CCompany = CCompany;
        return this;
    }
    public String getCCompany() {
        return this.CCompany;
    }

    public QueryContactTemplateRequest setContactTemplateId(Long contactTemplateId) {
        this.contactTemplateId = contactTemplateId;
        return this;
    }
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    public QueryContactTemplateRequest setDefaultTemplate(Boolean defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
        return this;
    }
    public Boolean getDefaultTemplate() {
        return this.defaultTemplate;
    }

    public QueryContactTemplateRequest setECompany(String ECompany) {
        this.ECompany = ECompany;
        return this;
    }
    public String getECompany() {
        return this.ECompany;
    }

    public QueryContactTemplateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryContactTemplateRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryContactTemplateRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryContactTemplateRequest setRegType(String regType) {
        this.regType = regType;
        return this;
    }
    public String getRegType() {
        return this.regType;
    }

    public QueryContactTemplateRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
