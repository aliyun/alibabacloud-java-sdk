// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListQualificationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<ListQualificationResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListQualificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualificationResponseBody self = new ListQualificationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQualificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListQualificationResponseBody setList(java.util.List<ListQualificationResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListQualificationResponseBodyList> getList() {
        return this.list;
    }

    public ListQualificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQualificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualificationResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListQualificationResponseBodyList extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("AuditRemark")
        public String auditRemark;

        @NameInMap("AuditTs")
        public String auditTs;

        @NameInMap("BusinessLicenseFileKey")
        public String businessLicenseFileKey;

        @NameInMap("CommitTs")
        public String commitTs;

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("ContactEmail")
        public String contactEmail;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("ContactPhone")
        public String contactPhone;

        @NameInMap("CountryId")
        public String countryId;

        @NameInMap("LegalId")
        public String legalId;

        @NameInMap("LegalLicenseFileKey")
        public String legalLicenseFileKey;

        @NameInMap("LegalName")
        public String legalName;

        @NameInMap("NetworkAccessFileKey")
        public String networkAccessFileKey;

        @NameInMap("QualificationId")
        public String qualificationId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("UnifiedCode")
        public String unifiedCode;

        @NameInMap("UpdateTs")
        public String updateTs;

        public static ListQualificationResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListQualificationResponseBodyList self = new ListQualificationResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListQualificationResponseBodyList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListQualificationResponseBodyList setAuditRemark(String auditRemark) {
            this.auditRemark = auditRemark;
            return this;
        }
        public String getAuditRemark() {
            return this.auditRemark;
        }

        public ListQualificationResponseBodyList setAuditTs(String auditTs) {
            this.auditTs = auditTs;
            return this;
        }
        public String getAuditTs() {
            return this.auditTs;
        }

        public ListQualificationResponseBodyList setBusinessLicenseFileKey(String businessLicenseFileKey) {
            this.businessLicenseFileKey = businessLicenseFileKey;
            return this;
        }
        public String getBusinessLicenseFileKey() {
            return this.businessLicenseFileKey;
        }

        public ListQualificationResponseBodyList setCommitTs(String commitTs) {
            this.commitTs = commitTs;
            return this;
        }
        public String getCommitTs() {
            return this.commitTs;
        }

        public ListQualificationResponseBodyList setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public ListQualificationResponseBodyList setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public ListQualificationResponseBodyList setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListQualificationResponseBodyList setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public ListQualificationResponseBodyList setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public ListQualificationResponseBodyList setLegalId(String legalId) {
            this.legalId = legalId;
            return this;
        }
        public String getLegalId() {
            return this.legalId;
        }

        public ListQualificationResponseBodyList setLegalLicenseFileKey(String legalLicenseFileKey) {
            this.legalLicenseFileKey = legalLicenseFileKey;
            return this;
        }
        public String getLegalLicenseFileKey() {
            return this.legalLicenseFileKey;
        }

        public ListQualificationResponseBodyList setLegalName(String legalName) {
            this.legalName = legalName;
            return this;
        }
        public String getLegalName() {
            return this.legalName;
        }

        public ListQualificationResponseBodyList setNetworkAccessFileKey(String networkAccessFileKey) {
            this.networkAccessFileKey = networkAccessFileKey;
            return this;
        }
        public String getNetworkAccessFileKey() {
            return this.networkAccessFileKey;
        }

        public ListQualificationResponseBodyList setQualificationId(String qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }
        public String getQualificationId() {
            return this.qualificationId;
        }

        public ListQualificationResponseBodyList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListQualificationResponseBodyList setUnifiedCode(String unifiedCode) {
            this.unifiedCode = unifiedCode;
            return this;
        }
        public String getUnifiedCode() {
            return this.unifiedCode;
        }

        public ListQualificationResponseBodyList setUpdateTs(String updateTs) {
            this.updateTs = updateTs;
            return this;
        }
        public String getUpdateTs() {
            return this.updateTs;
        }

    }

}
