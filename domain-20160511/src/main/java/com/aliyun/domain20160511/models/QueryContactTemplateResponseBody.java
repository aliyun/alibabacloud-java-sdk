// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryContactTemplateResponseBody extends TeaModel {
    @NameInMap("ContactTemplates")
    public QueryContactTemplateResponseBodyContactTemplates contactTemplates;

    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("NextPage")
    public Boolean nextPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryContactTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryContactTemplateResponseBody self = new QueryContactTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryContactTemplateResponseBody setContactTemplates(QueryContactTemplateResponseBodyContactTemplates contactTemplates) {
        this.contactTemplates = contactTemplates;
        return this;
    }
    public QueryContactTemplateResponseBodyContactTemplates getContactTemplates() {
        return this.contactTemplates;
    }

    public QueryContactTemplateResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryContactTemplateResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryContactTemplateResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryContactTemplateResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryContactTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryContactTemplateResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryContactTemplateResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryContactTemplateResponseBodyContactTemplatesContactTemplate extends TeaModel {
        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("CCity")
        public String CCity;

        @NameInMap("CCompany")
        public String CCompany;

        @NameInMap("CCountry")
        public String CCountry;

        @NameInMap("CName")
        public String CName;

        @NameInMap("CProvince")
        public String CProvince;

        @NameInMap("CVenu")
        public String CVenu;

        @NameInMap("ContactTemplateId")
        public Long contactTemplateId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DefaultTemplate")
        public Boolean defaultTemplate;

        @NameInMap("ECity")
        public String ECity;

        @NameInMap("ECompany")
        public String ECompany;

        @NameInMap("EName")
        public String EName;

        @NameInMap("EProvince")
        public String EProvince;

        @NameInMap("EVenu")
        public String EVenu;

        @NameInMap("Email")
        public String email;

        @NameInMap("EmailVerificationStatus")
        public Integer emailVerificationStatus;

        @NameInMap("PostalCode")
        public String postalCode;

        @NameInMap("RegType")
        public String regType;

        @NameInMap("TelArea")
        public String telArea;

        @NameInMap("TelExt")
        public String telExt;

        @NameInMap("TelMain")
        public String telMain;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public String userId;

        public static QueryContactTemplateResponseBodyContactTemplatesContactTemplate build(java.util.Map<String, ?> map) throws Exception {
            QueryContactTemplateResponseBodyContactTemplatesContactTemplate self = new QueryContactTemplateResponseBodyContactTemplatesContactTemplate();
            return TeaModel.build(map, self);
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setCCity(String CCity) {
            this.CCity = CCity;
            return this;
        }
        public String getCCity() {
            return this.CCity;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setCCompany(String CCompany) {
            this.CCompany = CCompany;
            return this;
        }
        public String getCCompany() {
            return this.CCompany;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setCCountry(String CCountry) {
            this.CCountry = CCountry;
            return this;
        }
        public String getCCountry() {
            return this.CCountry;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setCName(String CName) {
            this.CName = CName;
            return this;
        }
        public String getCName() {
            return this.CName;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setCProvince(String CProvince) {
            this.CProvince = CProvince;
            return this;
        }
        public String getCProvince() {
            return this.CProvince;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setCVenu(String CVenu) {
            this.CVenu = CVenu;
            return this;
        }
        public String getCVenu() {
            return this.CVenu;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setContactTemplateId(Long contactTemplateId) {
            this.contactTemplateId = contactTemplateId;
            return this;
        }
        public Long getContactTemplateId() {
            return this.contactTemplateId;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setDefaultTemplate(Boolean defaultTemplate) {
            this.defaultTemplate = defaultTemplate;
            return this;
        }
        public Boolean getDefaultTemplate() {
            return this.defaultTemplate;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setECity(String ECity) {
            this.ECity = ECity;
            return this;
        }
        public String getECity() {
            return this.ECity;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setECompany(String ECompany) {
            this.ECompany = ECompany;
            return this;
        }
        public String getECompany() {
            return this.ECompany;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setEProvince(String EProvince) {
            this.EProvince = EProvince;
            return this;
        }
        public String getEProvince() {
            return this.EProvince;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setEVenu(String EVenu) {
            this.EVenu = EVenu;
            return this;
        }
        public String getEVenu() {
            return this.EVenu;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setEmailVerificationStatus(Integer emailVerificationStatus) {
            this.emailVerificationStatus = emailVerificationStatus;
            return this;
        }
        public Integer getEmailVerificationStatus() {
            return this.emailVerificationStatus;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public String getPostalCode() {
            return this.postalCode;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setRegType(String regType) {
            this.regType = regType;
            return this;
        }
        public String getRegType() {
            return this.regType;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setTelArea(String telArea) {
            this.telArea = telArea;
            return this;
        }
        public String getTelArea() {
            return this.telArea;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setTelExt(String telExt) {
            this.telExt = telExt;
            return this;
        }
        public String getTelExt() {
            return this.telExt;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setTelMain(String telMain) {
            this.telMain = telMain;
            return this;
        }
        public String getTelMain() {
            return this.telMain;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryContactTemplateResponseBodyContactTemplatesContactTemplate setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryContactTemplateResponseBodyContactTemplates extends TeaModel {
        @NameInMap("ContactTemplate")
        public java.util.List<QueryContactTemplateResponseBodyContactTemplatesContactTemplate> contactTemplate;

        public static QueryContactTemplateResponseBodyContactTemplates build(java.util.Map<String, ?> map) throws Exception {
            QueryContactTemplateResponseBodyContactTemplates self = new QueryContactTemplateResponseBodyContactTemplates();
            return TeaModel.build(map, self);
        }

        public QueryContactTemplateResponseBodyContactTemplates setContactTemplate(java.util.List<QueryContactTemplateResponseBodyContactTemplatesContactTemplate> contactTemplate) {
            this.contactTemplate = contactTemplate;
            return this;
        }
        public java.util.List<QueryContactTemplateResponseBodyContactTemplatesContactTemplate> getContactTemplate() {
            return this.contactTemplate;
        }

    }

}
