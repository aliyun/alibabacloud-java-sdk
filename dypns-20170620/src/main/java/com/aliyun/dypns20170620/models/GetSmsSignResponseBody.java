// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetSmsSignResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetSmsSignResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmsSignResponseBody self = new GetSmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmsSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmsSignResponseBody setData(java.util.List<GetSmsSignResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSmsSignResponseBodyData> getData() {
        return this.data;
    }

    public GetSmsSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmsSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSmsSignResponseBodyData extends TeaModel {
        @NameInMap("AppUrl")
        public String appUrl;

        @NameInMap("AuditResult")
        public String auditResult;

        @NameInMap("BusinessLicenseCert")
        public String businessLicenseCert;

        @NameInMap("BusinessLicenseCertId")
        public String businessLicenseCertId;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("CreateDate")
        public Long createDate;

        @NameInMap("DefaultFlag")
        public Boolean defaultFlag;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrganizationCodeCert")
        public String organizationCodeCert;

        @NameInMap("OrganizationCodeCertId")
        public String organizationCodeCertId;

        @NameInMap("SmsSignName")
        public String smsSignName;

        @NameInMap("SmsSignRemark")
        public String smsSignRemark;

        @NameInMap("SmsSignSource")
        public String smsSignSource;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaxRegistrationCert")
        public String taxRegistrationCert;

        @NameInMap("TaxRegistrationCertId")
        public String taxRegistrationCertId;

        @NameInMap("TestFlag")
        public Boolean testFlag;

        public static GetSmsSignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSmsSignResponseBodyData self = new GetSmsSignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSmsSignResponseBodyData setAppUrl(String appUrl) {
            this.appUrl = appUrl;
            return this;
        }
        public String getAppUrl() {
            return this.appUrl;
        }

        public GetSmsSignResponseBodyData setAuditResult(String auditResult) {
            this.auditResult = auditResult;
            return this;
        }
        public String getAuditResult() {
            return this.auditResult;
        }

        public GetSmsSignResponseBodyData setBusinessLicenseCert(String businessLicenseCert) {
            this.businessLicenseCert = businessLicenseCert;
            return this;
        }
        public String getBusinessLicenseCert() {
            return this.businessLicenseCert;
        }

        public GetSmsSignResponseBodyData setBusinessLicenseCertId(String businessLicenseCertId) {
            this.businessLicenseCertId = businessLicenseCertId;
            return this;
        }
        public String getBusinessLicenseCertId() {
            return this.businessLicenseCertId;
        }

        public GetSmsSignResponseBodyData setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public GetSmsSignResponseBodyData setCreateDate(Long createDate) {
            this.createDate = createDate;
            return this;
        }
        public Long getCreateDate() {
            return this.createDate;
        }

        public GetSmsSignResponseBodyData setDefaultFlag(Boolean defaultFlag) {
            this.defaultFlag = defaultFlag;
            return this;
        }
        public Boolean getDefaultFlag() {
            return this.defaultFlag;
        }

        public GetSmsSignResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetSmsSignResponseBodyData setOrganizationCodeCert(String organizationCodeCert) {
            this.organizationCodeCert = organizationCodeCert;
            return this;
        }
        public String getOrganizationCodeCert() {
            return this.organizationCodeCert;
        }

        public GetSmsSignResponseBodyData setOrganizationCodeCertId(String organizationCodeCertId) {
            this.organizationCodeCertId = organizationCodeCertId;
            return this;
        }
        public String getOrganizationCodeCertId() {
            return this.organizationCodeCertId;
        }

        public GetSmsSignResponseBodyData setSmsSignName(String smsSignName) {
            this.smsSignName = smsSignName;
            return this;
        }
        public String getSmsSignName() {
            return this.smsSignName;
        }

        public GetSmsSignResponseBodyData setSmsSignRemark(String smsSignRemark) {
            this.smsSignRemark = smsSignRemark;
            return this;
        }
        public String getSmsSignRemark() {
            return this.smsSignRemark;
        }

        public GetSmsSignResponseBodyData setSmsSignSource(String smsSignSource) {
            this.smsSignSource = smsSignSource;
            return this;
        }
        public String getSmsSignSource() {
            return this.smsSignSource;
        }

        public GetSmsSignResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSmsSignResponseBodyData setTaxRegistrationCert(String taxRegistrationCert) {
            this.taxRegistrationCert = taxRegistrationCert;
            return this;
        }
        public String getTaxRegistrationCert() {
            return this.taxRegistrationCert;
        }

        public GetSmsSignResponseBodyData setTaxRegistrationCertId(String taxRegistrationCertId) {
            this.taxRegistrationCertId = taxRegistrationCertId;
            return this;
        }
        public String getTaxRegistrationCertId() {
            return this.taxRegistrationCertId;
        }

        public GetSmsSignResponseBodyData setTestFlag(Boolean testFlag) {
            this.testFlag = testFlag;
            return this;
        }
        public Boolean getTestFlag() {
            return this.testFlag;
        }

    }

}
