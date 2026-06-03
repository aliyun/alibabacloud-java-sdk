// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetEnterpriseInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetEnterpriseInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetEnterpriseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseInfoResponseBody self = new GetEnterpriseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnterpriseInfoResponseBody setData(GetEnterpriseInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnterpriseInfoResponseBodyData getData() {
        return this.data;
    }

    public GetEnterpriseInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEnterpriseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEnterpriseInfoResponseBodyData extends TeaModel {
        @NameInMap("AuditDesc")
        public String auditDesc;

        @NameInMap("AuditTime")
        public String auditTime;

        @NameInMap("BusinessLicenseAddress")
        public String businessLicenseAddress;

        @NameInMap("BusinessLicensePicture")
        public String businessLicensePicture;

        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        @NameInMap("EnterpriseName")
        public String enterpriseName;

        @NameInMap("LegalPersonCertNumber")
        public String legalPersonCertNumber;

        @NameInMap("LegalPersonCertPicture")
        public String legalPersonCertPicture;

        @NameInMap("LegalPersonName")
        public String legalPersonName;

        @NameInMap("ManagerCertNumber")
        public String managerCertNumber;

        @NameInMap("ManagerCertPicture")
        public String managerCertPicture;

        @NameInMap("ManagerContactNumber")
        public String managerContactNumber;

        @NameInMap("ManagerName")
        public String managerName;

        @NameInMap("NumberApplicationLetterPicture")
        public String numberApplicationLetterPicture;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("OrganizationCode")
        public String organizationCode;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UndertakingPicture")
        public String undertakingPicture;

        public static GetEnterpriseInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnterpriseInfoResponseBodyData self = new GetEnterpriseInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnterpriseInfoResponseBodyData setAuditDesc(String auditDesc) {
            this.auditDesc = auditDesc;
            return this;
        }
        public String getAuditDesc() {
            return this.auditDesc;
        }

        public GetEnterpriseInfoResponseBodyData setAuditTime(String auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public String getAuditTime() {
            return this.auditTime;
        }

        public GetEnterpriseInfoResponseBodyData setBusinessLicenseAddress(String businessLicenseAddress) {
            this.businessLicenseAddress = businessLicenseAddress;
            return this;
        }
        public String getBusinessLicenseAddress() {
            return this.businessLicenseAddress;
        }

        public GetEnterpriseInfoResponseBodyData setBusinessLicensePicture(String businessLicensePicture) {
            this.businessLicensePicture = businessLicensePicture;
            return this;
        }
        public String getBusinessLicensePicture() {
            return this.businessLicensePicture;
        }

        public GetEnterpriseInfoResponseBodyData setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public GetEnterpriseInfoResponseBodyData setEnterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
            return this;
        }
        public String getEnterpriseName() {
            return this.enterpriseName;
        }

        public GetEnterpriseInfoResponseBodyData setLegalPersonCertNumber(String legalPersonCertNumber) {
            this.legalPersonCertNumber = legalPersonCertNumber;
            return this;
        }
        public String getLegalPersonCertNumber() {
            return this.legalPersonCertNumber;
        }

        public GetEnterpriseInfoResponseBodyData setLegalPersonCertPicture(String legalPersonCertPicture) {
            this.legalPersonCertPicture = legalPersonCertPicture;
            return this;
        }
        public String getLegalPersonCertPicture() {
            return this.legalPersonCertPicture;
        }

        public GetEnterpriseInfoResponseBodyData setLegalPersonName(String legalPersonName) {
            this.legalPersonName = legalPersonName;
            return this;
        }
        public String getLegalPersonName() {
            return this.legalPersonName;
        }

        public GetEnterpriseInfoResponseBodyData setManagerCertNumber(String managerCertNumber) {
            this.managerCertNumber = managerCertNumber;
            return this;
        }
        public String getManagerCertNumber() {
            return this.managerCertNumber;
        }

        public GetEnterpriseInfoResponseBodyData setManagerCertPicture(String managerCertPicture) {
            this.managerCertPicture = managerCertPicture;
            return this;
        }
        public String getManagerCertPicture() {
            return this.managerCertPicture;
        }

        public GetEnterpriseInfoResponseBodyData setManagerContactNumber(String managerContactNumber) {
            this.managerContactNumber = managerContactNumber;
            return this;
        }
        public String getManagerContactNumber() {
            return this.managerContactNumber;
        }

        public GetEnterpriseInfoResponseBodyData setManagerName(String managerName) {
            this.managerName = managerName;
            return this;
        }
        public String getManagerName() {
            return this.managerName;
        }

        public GetEnterpriseInfoResponseBodyData setNumberApplicationLetterPicture(String numberApplicationLetterPicture) {
            this.numberApplicationLetterPicture = numberApplicationLetterPicture;
            return this;
        }
        public String getNumberApplicationLetterPicture() {
            return this.numberApplicationLetterPicture;
        }

        public GetEnterpriseInfoResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetEnterpriseInfoResponseBodyData setOrganizationCode(String organizationCode) {
            this.organizationCode = organizationCode;
            return this;
        }
        public String getOrganizationCode() {
            return this.organizationCode;
        }

        public GetEnterpriseInfoResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetEnterpriseInfoResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetEnterpriseInfoResponseBodyData setUndertakingPicture(String undertakingPicture) {
            this.undertakingPicture = undertakingPicture;
            return this;
        }
        public String getUndertakingPicture() {
            return this.undertakingPicture;
        }

    }

}
