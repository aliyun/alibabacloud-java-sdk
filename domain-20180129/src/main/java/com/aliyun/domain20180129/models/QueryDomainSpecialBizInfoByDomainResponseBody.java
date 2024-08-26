// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainSpecialBizInfoByDomainResponseBody extends TeaModel {
    /**
     * <p>Indicates whether retries are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The name of the application for which the error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>test-com</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The array of error parameters that are returned.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>110001</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code that is directly returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Module")
    public QueryDomainSpecialBizInfoByDomainResponseBodyModule module;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>97663DFF-D24D-55AE-A577-6CC5AF20B732</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values: true and false</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Indicates whether to perform synchronous processing.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>258</p>
         */
        @NameInMap("BizId")
        public Long bizId;

        /**
         * <p>The city.</p>
         */
        @NameInMap("CCity")
        public String CCity;

        /**
         * <p>The organization name.</p>
         */
        @NameInMap("CCompany")
        public String CCompany;

        /**
         * <p>The country code.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CCountry")
        public String CCountry;

        /**
         * <p>The contact name.</p>
         */
        @NameInMap("CName")
        public String CName;

        /**
         * <p>The province.</p>
         */
        @NameInMap("CProvince")
        public String CProvince;

        /**
         * <p>The address.</p>
         */
        @NameInMap("CVenu")
        public String CVenu;

        /**
         * <p>The city in English.</p>
         * 
         * <strong>example:</strong>
         * <p>an shan Shi</p>
         */
        @NameInMap("ECity")
        public String ECity;

        /**
         * <p>The organization name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>hebeihuiheguandaozhizaoyouxiangongsi</p>
         */
        @NameInMap("ECompany")
        public String ECompany;

        /**
         * <p>The contact name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>tong da wei</p>
         */
        @NameInMap("EName")
        public String EName;

        /**
         * <p>The province in English.</p>
         * 
         * <strong>example:</strong>
         * <p>liao ning</p>
         */
        @NameInMap("EProvince")
        public String EProvince;

        /**
         * <p>The address in English.</p>
         * 
         * <strong>example:</strong>
         * <p>tie xi qu xin kai jie 59-4 hao</p>
         */
        @NameInMap("EVenu")
        public String EVenu;

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The fax country code.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("FaxArea")
        public String faxArea;

        /**
         * <p>The fax extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>61284565</p>
         */
        @NameInMap("FaxExt")
        public String faxExt;

        /**
         * <p>The fax number with an area code or mobile number.</p>
         * 
         * <strong>example:</strong>
         * <p>16604121234</p>
         */
        @NameInMap("FaxMain")
        public String faxMain;

        /**
         * <p>The mobile number.</p>
         * 
         * <strong>example:</strong>
         * <p>156********</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The zip code.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("Postalcode")
        public String postalcode;

        /**
         * <p>The contact type. Valid values: 1: individual. 2: enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RegType")
        public Integer regType;

        /**
         * <p>The registrant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>121000002****</p>
         */
        @NameInMap("RegistrantId")
        public String registrantId;

        /**
         * <p>The calling code of the country or region where the domain name contact is located.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("TelArea")
        public String telArea;

        /**
         * <p>The telephone extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>2756</p>
         */
        @NameInMap("TelExt")
        public String telExt;

        /**
         * <p>The landline number with an area code or mobile number.</p>
         * 
         * <strong>example:</strong>
         * <p>16604121234</p>
         */
        @NameInMap("TelMain")
        public String telMain;

        /**
         * <p>The VSP contact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>121000001****</p>
         */
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
        /**
         * <p>The ID of the associated workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>T20220831150014000001</p>
         */
        @NameInMap("BizId")
        public Long bizId;

        /**
         * <p>The certificate number.</p>
         * 
         * <strong>example:</strong>
         * <p>4111111111111110**</p>
         */
        @NameInMap("CredentialNo")
        public String credentialNo;

        /**
         * <p>The certificate type.</p>
         * 
         * <strong>example:</strong>
         * <p>SFZ</p>
         */
        @NameInMap("CredentialType")
        public String credentialType;

        /**
         * <p>The certificate URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test.oss-cn-hangzhou.aliyuncs.com/20170522/1219541161213057_070445190.jpg">http://test.oss-cn-hangzhou.aliyuncs.com/20170522/1219541161213057_070445190.jpg</a></p>
         */
        @NameInMap("CredentialUrl")
        public String credentialUrl;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test003.cn</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>Indicates whether the certificate belongs to the registrant.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HolderCert")
        public Integer holderCert;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S20172315BJ37809</p>
         */
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
        /**
         * <p>The review information.</p>
         */
        @NameInMap("AuditMsg")
        public String auditMsg;

        /**
         * <p>The business name.</p>
         */
        @NameInMap("BizName")
        public String bizName;

        /**
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A83E1D74-E46B-505C-947A-8C6B7E41C012</p>
         */
        @NameInMap("BizNo")
        public String bizNo;

        /**
         * <p>The business status.</p>
         * 
         * <strong>example:</strong>
         * <p>REGISTRANT_VSP_AUDIT_SUCCESS</p>
         */
        @NameInMap("BizStatus")
        public String bizStatus;

        /**
         * <p>The business type.</p>
         * 
         * <strong>example:</strong>
         * <p>govRegister</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The time when the business was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-17 11:31:10</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test003.cn</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The contact information.</p>
         */
        @NameInMap("DomainSpecialBizContact")
        public QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizContact domainSpecialBizContact;

        /**
         * <p>The certificate information.</p>
         */
        @NameInMap("DomainSpecialBizCredentials")
        public java.util.List<QueryDomainSpecialBizInfoByDomainResponseBodyModuleDomainSpecialBizCredentials> domainSpecialBizCredentials;

        /**
         * <p>The time when the business was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-21 15:10:04.0</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the business was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-21 15:10:04.0</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>34083</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S20172315BJ37809</p>
         */
        @NameInMap("SaleId")
        public String saleId;

        /**
         * <p>The business status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The description of business status.</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The time when the business was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-17 18:11:15</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>121000000****</p>
         */
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
