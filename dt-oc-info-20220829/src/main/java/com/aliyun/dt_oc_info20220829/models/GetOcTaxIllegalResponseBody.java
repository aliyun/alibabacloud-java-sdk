// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcTaxIllegalResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcTaxIllegalResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static GetOcTaxIllegalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcTaxIllegalResponseBody self = new GetOcTaxIllegalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcTaxIllegalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcTaxIllegalResponseBody setData(java.util.List<GetOcTaxIllegalResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcTaxIllegalResponseBodyData> getData() {
        return this.data;
    }

    public GetOcTaxIllegalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcTaxIllegalResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcTaxIllegalResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcTaxIllegalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcTaxIllegalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcTaxIllegalResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcTaxIllegalResponseBodyData extends TeaModel {
        @NameInMap("AgencyCardNum")
        public String agencyCardNum;

        @NameInMap("AgencyCardType")
        public String agencyCardType;

        @NameInMap("AgencyEnt")
        public String agencyEnt;

        @NameInMap("AgencyName")
        public String agencyName;

        @NameInMap("AgencySex")
        public String agencySex;

        @NameInMap("CaseType")
        public String caseType;

        @NameInMap("Department")
        public String department;

        @NameInMap("EntAddress")
        public String entAddress;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("FinancialCardNum")
        public String financialCardNum;

        @NameInMap("FinancialCardType")
        public String financialCardType;

        @NameInMap("FinancialName")
        public String financialName;

        @NameInMap("FinancialSex")
        public String financialSex;

        @NameInMap("IllegalTruth")
        public String illegalTruth;

        @NameInMap("LawBasis")
        public String lawBasis;

        @NameInMap("LegalCardNum")
        public String legalCardNum;

        @NameInMap("LegalCardType")
        public String legalCardType;

        @NameInMap("LegalName")
        public String legalName;

        @NameInMap("LegalSex")
        public String legalSex;

        @NameInMap("OrgCode")
        public String orgCode;

        @NameInMap("PublishDate")
        public String publishDate;

        @NameInMap("TaxpayerNum")
        public String taxpayerNum;

        public static GetOcTaxIllegalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcTaxIllegalResponseBodyData self = new GetOcTaxIllegalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcTaxIllegalResponseBodyData setAgencyCardNum(String agencyCardNum) {
            this.agencyCardNum = agencyCardNum;
            return this;
        }
        public String getAgencyCardNum() {
            return this.agencyCardNum;
        }

        public GetOcTaxIllegalResponseBodyData setAgencyCardType(String agencyCardType) {
            this.agencyCardType = agencyCardType;
            return this;
        }
        public String getAgencyCardType() {
            return this.agencyCardType;
        }

        public GetOcTaxIllegalResponseBodyData setAgencyEnt(String agencyEnt) {
            this.agencyEnt = agencyEnt;
            return this;
        }
        public String getAgencyEnt() {
            return this.agencyEnt;
        }

        public GetOcTaxIllegalResponseBodyData setAgencyName(String agencyName) {
            this.agencyName = agencyName;
            return this;
        }
        public String getAgencyName() {
            return this.agencyName;
        }

        public GetOcTaxIllegalResponseBodyData setAgencySex(String agencySex) {
            this.agencySex = agencySex;
            return this;
        }
        public String getAgencySex() {
            return this.agencySex;
        }

        public GetOcTaxIllegalResponseBodyData setCaseType(String caseType) {
            this.caseType = caseType;
            return this;
        }
        public String getCaseType() {
            return this.caseType;
        }

        public GetOcTaxIllegalResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcTaxIllegalResponseBodyData setEntAddress(String entAddress) {
            this.entAddress = entAddress;
            return this;
        }
        public String getEntAddress() {
            return this.entAddress;
        }

        public GetOcTaxIllegalResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcTaxIllegalResponseBodyData setFinancialCardNum(String financialCardNum) {
            this.financialCardNum = financialCardNum;
            return this;
        }
        public String getFinancialCardNum() {
            return this.financialCardNum;
        }

        public GetOcTaxIllegalResponseBodyData setFinancialCardType(String financialCardType) {
            this.financialCardType = financialCardType;
            return this;
        }
        public String getFinancialCardType() {
            return this.financialCardType;
        }

        public GetOcTaxIllegalResponseBodyData setFinancialName(String financialName) {
            this.financialName = financialName;
            return this;
        }
        public String getFinancialName() {
            return this.financialName;
        }

        public GetOcTaxIllegalResponseBodyData setFinancialSex(String financialSex) {
            this.financialSex = financialSex;
            return this;
        }
        public String getFinancialSex() {
            return this.financialSex;
        }

        public GetOcTaxIllegalResponseBodyData setIllegalTruth(String illegalTruth) {
            this.illegalTruth = illegalTruth;
            return this;
        }
        public String getIllegalTruth() {
            return this.illegalTruth;
        }

        public GetOcTaxIllegalResponseBodyData setLawBasis(String lawBasis) {
            this.lawBasis = lawBasis;
            return this;
        }
        public String getLawBasis() {
            return this.lawBasis;
        }

        public GetOcTaxIllegalResponseBodyData setLegalCardNum(String legalCardNum) {
            this.legalCardNum = legalCardNum;
            return this;
        }
        public String getLegalCardNum() {
            return this.legalCardNum;
        }

        public GetOcTaxIllegalResponseBodyData setLegalCardType(String legalCardType) {
            this.legalCardType = legalCardType;
            return this;
        }
        public String getLegalCardType() {
            return this.legalCardType;
        }

        public GetOcTaxIllegalResponseBodyData setLegalName(String legalName) {
            this.legalName = legalName;
            return this;
        }
        public String getLegalName() {
            return this.legalName;
        }

        public GetOcTaxIllegalResponseBodyData setLegalSex(String legalSex) {
            this.legalSex = legalSex;
            return this;
        }
        public String getLegalSex() {
            return this.legalSex;
        }

        public GetOcTaxIllegalResponseBodyData setOrgCode(String orgCode) {
            this.orgCode = orgCode;
            return this;
        }
        public String getOrgCode() {
            return this.orgCode;
        }

        public GetOcTaxIllegalResponseBodyData setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public GetOcTaxIllegalResponseBodyData setTaxpayerNum(String taxpayerNum) {
            this.taxpayerNum = taxpayerNum;
            return this;
        }
        public String getTaxpayerNum() {
            return this.taxpayerNum;
        }

    }

}
