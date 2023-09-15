// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainSpecialBizDetailResponseBody extends TeaModel {
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
    public QueryDomainSpecialBizDetailResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Synchro")
    public Boolean synchro;

    public static QueryDomainSpecialBizDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainSpecialBizDetailResponseBody self = new QueryDomainSpecialBizDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainSpecialBizDetailResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryDomainSpecialBizDetailResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryDomainSpecialBizDetailResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryDomainSpecialBizDetailResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryDomainSpecialBizDetailResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QueryDomainSpecialBizDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryDomainSpecialBizDetailResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryDomainSpecialBizDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryDomainSpecialBizDetailResponseBody setModule(QueryDomainSpecialBizDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryDomainSpecialBizDetailResponseBodyModule getModule() {
        return this.module;
    }

    public QueryDomainSpecialBizDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainSpecialBizDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDomainSpecialBizDetailResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact extends TeaModel {
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

        public static QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact self = new QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact();
            return TeaModel.build(map, self);
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setCCity(String CCity) {
            this.CCity = CCity;
            return this;
        }
        public String getCCity() {
            return this.CCity;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setCCompany(String CCompany) {
            this.CCompany = CCompany;
            return this;
        }
        public String getCCompany() {
            return this.CCompany;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setCCountry(String CCountry) {
            this.CCountry = CCountry;
            return this;
        }
        public String getCCountry() {
            return this.CCountry;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setCName(String CName) {
            this.CName = CName;
            return this;
        }
        public String getCName() {
            return this.CName;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setCProvince(String CProvince) {
            this.CProvince = CProvince;
            return this;
        }
        public String getCProvince() {
            return this.CProvince;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setCVenu(String CVenu) {
            this.CVenu = CVenu;
            return this;
        }
        public String getCVenu() {
            return this.CVenu;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setECity(String ECity) {
            this.ECity = ECity;
            return this;
        }
        public String getECity() {
            return this.ECity;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setECompany(String ECompany) {
            this.ECompany = ECompany;
            return this;
        }
        public String getECompany() {
            return this.ECompany;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setEName(String EName) {
            this.EName = EName;
            return this;
        }
        public String getEName() {
            return this.EName;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setEProvince(String EProvince) {
            this.EProvince = EProvince;
            return this;
        }
        public String getEProvince() {
            return this.EProvince;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setEVenu(String EVenu) {
            this.EVenu = EVenu;
            return this;
        }
        public String getEVenu() {
            return this.EVenu;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setFaxArea(String faxArea) {
            this.faxArea = faxArea;
            return this;
        }
        public String getFaxArea() {
            return this.faxArea;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setFaxExt(String faxExt) {
            this.faxExt = faxExt;
            return this;
        }
        public String getFaxExt() {
            return this.faxExt;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setFaxMain(String faxMain) {
            this.faxMain = faxMain;
            return this;
        }
        public String getFaxMain() {
            return this.faxMain;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setPostalcode(String postalcode) {
            this.postalcode = postalcode;
            return this;
        }
        public String getPostalcode() {
            return this.postalcode;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setRegType(Integer regType) {
            this.regType = regType;
            return this;
        }
        public Integer getRegType() {
            return this.regType;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setRegistrantId(String registrantId) {
            this.registrantId = registrantId;
            return this;
        }
        public String getRegistrantId() {
            return this.registrantId;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setTelArea(String telArea) {
            this.telArea = telArea;
            return this;
        }
        public String getTelArea() {
            return this.telArea;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setTelExt(String telExt) {
            this.telExt = telExt;
            return this;
        }
        public String getTelExt() {
            return this.telExt;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setTelMain(String telMain) {
            this.telMain = telMain;
            return this;
        }
        public String getTelMain() {
            return this.telMain;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact setVspContactId(String vspContactId) {
            this.vspContactId = vspContactId;
            return this;
        }
        public String getVspContactId() {
            return this.vspContactId;
        }

    }

    public static class QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials extends TeaModel {
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

        public static QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials self = new QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials();
            return TeaModel.build(map, self);
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials setCredentialNo(String credentialNo) {
            this.credentialNo = credentialNo;
            return this;
        }
        public String getCredentialNo() {
            return this.credentialNo;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials setCredentialUrl(String credentialUrl) {
            this.credentialUrl = credentialUrl;
            return this;
        }
        public String getCredentialUrl() {
            return this.credentialUrl;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials setHolderCert(Integer holderCert) {
            this.holderCert = holderCert;
            return this;
        }
        public Integer getHolderCert() {
            return this.holderCert;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials setSaleId(String saleId) {
            this.saleId = saleId;
            return this;
        }
        public String getSaleId() {
            return this.saleId;
        }

    }

    public static class QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult extends TeaModel {
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("OrderAmount")
        public Double orderAmount;

        @NameInMap("OrderCurrency")
        public String orderCurrency;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderStatus")
        public String orderStatus;

        @NameInMap("OrderTime")
        public String orderTime;

        @NameInMap("OrderYear")
        public Integer orderYear;

        @NameInMap("SaleId")
        public String saleId;

        @NameInMap("SubOrderId")
        public String subOrderId;

        public static QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult self = new QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult();
            return TeaModel.build(map, self);
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult setOrderAmount(Double orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public Double getOrderAmount() {
            return this.orderAmount;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult setOrderCurrency(String orderCurrency) {
            this.orderCurrency = orderCurrency;
            return this;
        }
        public String getOrderCurrency() {
            return this.orderCurrency;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult setOrderTime(String orderTime) {
            this.orderTime = orderTime;
            return this;
        }
        public String getOrderTime() {
            return this.orderTime;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult setOrderYear(Integer orderYear) {
            this.orderYear = orderYear;
            return this;
        }
        public Integer getOrderYear() {
            return this.orderYear;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult setSaleId(String saleId) {
            this.saleId = saleId;
            return this;
        }
        public String getSaleId() {
            return this.saleId;
        }

        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

    }

    public static class QueryDomainSpecialBizDetailResponseBodyModule extends TeaModel {
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
        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact domainSpecialBizContact;

        @NameInMap("DomainSpecialBizCredentials")
        public java.util.List<QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials> domainSpecialBizCredentials;

        @NameInMap("DomainSpecialOrderResult")
        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult domainSpecialOrderResult;

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

        public static QueryDomainSpecialBizDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainSpecialBizDetailResponseBodyModule self = new QueryDomainSpecialBizDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setAuditMsg(String auditMsg) {
            this.auditMsg = auditMsg;
            return this;
        }
        public String getAuditMsg() {
            return this.auditMsg;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setBizNo(String bizNo) {
            this.bizNo = bizNo;
            return this;
        }
        public String getBizNo() {
            return this.bizNo;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setBizStatus(String bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }
        public String getBizStatus() {
            return this.bizStatus;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setDomainSpecialBizContact(QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact domainSpecialBizContact) {
            this.domainSpecialBizContact = domainSpecialBizContact;
            return this;
        }
        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizContact getDomainSpecialBizContact() {
            return this.domainSpecialBizContact;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setDomainSpecialBizCredentials(java.util.List<QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials> domainSpecialBizCredentials) {
            this.domainSpecialBizCredentials = domainSpecialBizCredentials;
            return this;
        }
        public java.util.List<QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialBizCredentials> getDomainSpecialBizCredentials() {
            return this.domainSpecialBizCredentials;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setDomainSpecialOrderResult(QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult domainSpecialOrderResult) {
            this.domainSpecialOrderResult = domainSpecialOrderResult;
            return this;
        }
        public QueryDomainSpecialBizDetailResponseBodyModuleDomainSpecialOrderResult getDomainSpecialOrderResult() {
            return this.domainSpecialOrderResult;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setSaleId(String saleId) {
            this.saleId = saleId;
            return this;
        }
        public String getSaleId() {
            return this.saleId;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryDomainSpecialBizDetailResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
