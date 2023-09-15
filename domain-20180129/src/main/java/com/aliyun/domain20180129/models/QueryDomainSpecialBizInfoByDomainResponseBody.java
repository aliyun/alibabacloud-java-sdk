// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainSpecialBizInfoByDomainResponseBody extends TeaModel {
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Module")
    public QueryDomainSpecialBizInfoByDomainResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Synchro")
    public Boolean synchro;

    public static QueryDomainSpecialBizInfoByDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainSpecialBizInfoByDomainResponseBody self = new QueryDomainSpecialBizInfoByDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainSpecialBizInfoByDomainResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryDomainSpecialBizInfoByDomainResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryDomainSpecialBizInfoByDomainResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryDomainSpecialBizInfoByDomainResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryDomainSpecialBizInfoByDomainResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QueryDomainSpecialBizInfoByDomainResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryDomainSpecialBizInfoByDomainResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryDomainSpecialBizInfoByDomainResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryDomainSpecialBizInfoByDomainResponseBody setModule(QueryDomainSpecialBizInfoByDomainResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryDomainSpecialBizInfoByDomainResponseBodyModule getModule() {
        return this.module;
    }

    public QueryDomainSpecialBizInfoByDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainSpecialBizInfoByDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDomainSpecialBizInfoByDomainResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact extends TeaModel {
        @NameInMap("BizId")
        public Long bizId;

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

        @NameInMap("Extend")
        public String extend;

        @NameInMap("FaxArea")
        public String faxArea;

        @NameInMap("FaxExt")
        public String faxExt;

        @NameInMap("FaxMain")
        public String faxMain;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Postalcode")
        public String postalcode;

        @NameInMap("RegType")
        public Integer regType;

        @NameInMap("RegistrantId")
        public String registrantId;

        @NameInMap("TelArea")
        public String telArea;

        @NameInMap("TelExt")
        public String telExt;

        @NameInMap("TelMain")
        public String telMain;

        @NameInMap("VspContactId")
        public String vspContactId;

        public static QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact self = new QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact();
            return TeaModel.build(map, self);
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setCCity(String CCity) {
            this.CCity = CCity;
            return this;
        }
        public String getCCity() {
            return this.CCity;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setCCompany(String CCompany) {
            this.CCompany = CCompany;
            return this;
        }
        public String getCCompany() {
            return this.CCompany;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setCCountry(String CCountry) {
            this.CCountry = CCountry;
            return this;
        }
        public String getCCountry() {
            return this.CCountry;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setCName(String CName) {
            this.CName = CName;
            return this;
        }
        public String getCName() {
            return this.CName;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setCProvince(String CProvince) {
            this.CProvince = CProvince;
            return this;
        }
        public String getCProvince() {
            return this.CProvince;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setCVenu(String CVenu) {
            this.CVenu = CVenu;
            return this;
        }
        public String getCVenu() {
            return this.CVenu;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setECity(String ECity) {
            this.ECity = ECity;
            return this;
        }
        public String getECity() {
            return this.ECity;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setECompany(String ECompany) {
            this.ECompany = ECompany;
            return this;
        }
        public String getECompany() {
            return this.ECompany;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setEProvince(String EProvince) {
            this.EProvince = EProvince;
            return this;
        }
        public String getEProvince() {
            return this.EProvince;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setEVenu(String EVenu) {
            this.EVenu = EVenu;
            return this;
        }
        public String getEVenu() {
            return this.EVenu;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setFaxArea(String faxArea) {
            this.faxArea = faxArea;
            return this;
        }
        public String getFaxArea() {
            return this.faxArea;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setFaxExt(String faxExt) {
            this.faxExt = faxExt;
            return this;
        }
        public String getFaxExt() {
            return this.faxExt;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setFaxMain(String faxMain) {
            this.faxMain = faxMain;
            return this;
        }
        public String getFaxMain() {
            return this.faxMain;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setPostalcode(String postalcode) {
            this.postalcode = postalcode;
            return this;
        }
        public String getPostalcode() {
            return this.postalcode;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setRegType(Integer regType) {
            this.regType = regType;
            return this;
        }
        public Integer getRegType() {
            return this.regType;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setRegistrantId(String registrantId) {
            this.registrantId = registrantId;
            return this;
        }
        public String getRegistrantId() {
            return this.registrantId;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setTelArea(String telArea) {
            this.telArea = telArea;
            return this;
        }
        public String getTelArea() {
            return this.telArea;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setTelExt(String telExt) {
            this.telExt = telExt;
            return this;
        }
        public String getTelExt() {
            return this.telExt;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setTelMain(String telMain) {
            this.telMain = telMain;
            return this;
        }
        public String getTelMain() {
            return this.telMain;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact setVspContactId(String vspContactId) {
            this.vspContactId = vspContactId;
            return this;
        }
        public String getVspContactId() {
            return this.vspContactId;
        }

    }

    public static class QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials extends TeaModel {
        @NameInMap("BizId")
        public Long bizId;

        @NameInMap("CredentialNo")
        public String credentialNo;

        @NameInMap("CredentialType")
        public String credentialType;

        @NameInMap("CredentialUrl")
        public String credentialUrl;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("HolderCert")
        public Integer holderCert;

        @NameInMap("SaleId")
        public String saleId;

        public static QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials self = new QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials();
            return TeaModel.build(map, self);
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials setCredentialNo(String credentialNo) {
            this.credentialNo = credentialNo;
            return this;
        }
        public String getCredentialNo() {
            return this.credentialNo;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials setCredentialUrl(String credentialUrl) {
            this.credentialUrl = credentialUrl;
            return this;
        }
        public String getCredentialUrl() {
            return this.credentialUrl;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials setHolderCert(Integer holderCert) {
            this.holderCert = holderCert;
            return this;
        }
        public Integer getHolderCert() {
            return this.holderCert;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials setSaleId(String saleId) {
            this.saleId = saleId;
            return this;
        }
        public String getSaleId() {
            return this.saleId;
        }

    }

    public static class QueryDomainSpecialBizInfoByDomainResponseBodyModule extends TeaModel {
        @NameInMap("AuditMsg")
        public String auditMsg;

        @NameInMap("BizName")
        public String bizName;

        @NameInMap("BizNo")
        public String bizNo;

        @NameInMap("BizStatus")
        public String bizStatus;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainSpecialBizContact")
        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact domainSpecialBizContact;

        @NameInMap("DomainSpecialBizCredentials")
        public java.util.List<QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials> domainSpecialBizCredentials;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("SaleId")
        public String saleId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static QueryDomainSpecialBizInfoByDomainResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainSpecialBizInfoByDomainResponseBodyModule self = new QueryDomainSpecialBizInfoByDomainResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setAuditMsg(String auditMsg) {
            this.auditMsg = auditMsg;
            return this;
        }
        public String getAuditMsg() {
            return this.auditMsg;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setBizNo(String bizNo) {
            this.bizNo = bizNo;
            return this;
        }
        public String getBizNo() {
            return this.bizNo;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setBizStatus(String bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }
        public String getBizStatus() {
            return this.bizStatus;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setDomainSpecialBizContact(QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact domainSpecialBizContact) {
            this.domainSpecialBizContact = domainSpecialBizContact;
            return this;
        }
        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact getDomainSpecialBizContact() {
            return this.domainSpecialBizContact;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setDomainSpecialBizCredentials(java.util.List<QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials> domainSpecialBizCredentials) {
            this.domainSpecialBizCredentials = domainSpecialBizCredentials;
            return this;
        }
        public java.util.List<QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials> getDomainSpecialBizCredentials() {
            return this.domainSpecialBizCredentials;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setSaleId(String saleId) {
            this.saleId = saleId;
            return this;
        }
        public String getSaleId() {
            return this.saleId;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryDomainSpecialBizInfoByDomainResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
