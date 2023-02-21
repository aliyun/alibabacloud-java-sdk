// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcBasicResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetOcIcBasicResponseBodyData data;

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

    public static GetOcIcBasicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcBasicResponseBody self = new GetOcIcBasicResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcBasicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcBasicResponseBody setData(GetOcIcBasicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOcIcBasicResponseBodyData getData() {
        return this.data;
    }

    public GetOcIcBasicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcBasicResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcBasicResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcBasicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcBasicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcBasicResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcBasicResponseBodyData extends TeaModel {
        @NameInMap("CheckDate")
        public String checkDate;

        @NameInMap("EntAddress")
        public String entAddress;

        @NameInMap("EntBrief")
        public String entBrief;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("EntNameEng")
        public String entNameEng;

        @NameInMap("EntStatus")
        public String entStatus;

        @NameInMap("EntType")
        public String entType;

        @NameInMap("EsDate")
        public String esDate;

        @NameInMap("FormerNames")
        public String formerNames;

        @NameInMap("IndustryNameLv1")
        public String industryNameLv1;

        @NameInMap("IndustryNameLv2")
        public String industryNameLv2;

        @NameInMap("InsuredNum")
        public String insuredNum;

        @NameInMap("LegalName")
        public String legalName;

        @NameInMap("LicenseNumber")
        public String licenseNumber;

        @NameInMap("OpFrom")
        public String opFrom;

        @NameInMap("OpScope")
        public String opScope;

        @NameInMap("OpTo")
        public String opTo;

        @NameInMap("OrgNo")
        public String orgNo;

        @NameInMap("RecCap")
        public String recCap;

        @NameInMap("RegCap")
        public String regCap;

        @NameInMap("RegOrg")
        public String regOrg;

        @NameInMap("RegOrgCity")
        public String regOrgCity;

        @NameInMap("RegOrgDistrict")
        public String regOrgDistrict;

        @NameInMap("RegOrgProvince")
        public String regOrgProvince;

        @NameInMap("SocialCreditCode")
        public String socialCreditCode;

        @NameInMap("StaffNum")
        public String staffNum;

        @NameInMap("TaxNum")
        public String taxNum;

        public static GetOcIcBasicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcBasicResponseBodyData self = new GetOcIcBasicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcBasicResponseBodyData setCheckDate(String checkDate) {
            this.checkDate = checkDate;
            return this;
        }
        public String getCheckDate() {
            return this.checkDate;
        }

        public GetOcIcBasicResponseBodyData setEntAddress(String entAddress) {
            this.entAddress = entAddress;
            return this;
        }
        public String getEntAddress() {
            return this.entAddress;
        }

        public GetOcIcBasicResponseBodyData setEntBrief(String entBrief) {
            this.entBrief = entBrief;
            return this;
        }
        public String getEntBrief() {
            return this.entBrief;
        }

        public GetOcIcBasicResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcIcBasicResponseBodyData setEntNameEng(String entNameEng) {
            this.entNameEng = entNameEng;
            return this;
        }
        public String getEntNameEng() {
            return this.entNameEng;
        }

        public GetOcIcBasicResponseBodyData setEntStatus(String entStatus) {
            this.entStatus = entStatus;
            return this;
        }
        public String getEntStatus() {
            return this.entStatus;
        }

        public GetOcIcBasicResponseBodyData setEntType(String entType) {
            this.entType = entType;
            return this;
        }
        public String getEntType() {
            return this.entType;
        }

        public GetOcIcBasicResponseBodyData setEsDate(String esDate) {
            this.esDate = esDate;
            return this;
        }
        public String getEsDate() {
            return this.esDate;
        }

        public GetOcIcBasicResponseBodyData setFormerNames(String formerNames) {
            this.formerNames = formerNames;
            return this;
        }
        public String getFormerNames() {
            return this.formerNames;
        }

        public GetOcIcBasicResponseBodyData setIndustryNameLv1(String industryNameLv1) {
            this.industryNameLv1 = industryNameLv1;
            return this;
        }
        public String getIndustryNameLv1() {
            return this.industryNameLv1;
        }

        public GetOcIcBasicResponseBodyData setIndustryNameLv2(String industryNameLv2) {
            this.industryNameLv2 = industryNameLv2;
            return this;
        }
        public String getIndustryNameLv2() {
            return this.industryNameLv2;
        }

        public GetOcIcBasicResponseBodyData setInsuredNum(String insuredNum) {
            this.insuredNum = insuredNum;
            return this;
        }
        public String getInsuredNum() {
            return this.insuredNum;
        }

        public GetOcIcBasicResponseBodyData setLegalName(String legalName) {
            this.legalName = legalName;
            return this;
        }
        public String getLegalName() {
            return this.legalName;
        }

        public GetOcIcBasicResponseBodyData setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        public GetOcIcBasicResponseBodyData setOpFrom(String opFrom) {
            this.opFrom = opFrom;
            return this;
        }
        public String getOpFrom() {
            return this.opFrom;
        }

        public GetOcIcBasicResponseBodyData setOpScope(String opScope) {
            this.opScope = opScope;
            return this;
        }
        public String getOpScope() {
            return this.opScope;
        }

        public GetOcIcBasicResponseBodyData setOpTo(String opTo) {
            this.opTo = opTo;
            return this;
        }
        public String getOpTo() {
            return this.opTo;
        }

        public GetOcIcBasicResponseBodyData setOrgNo(String orgNo) {
            this.orgNo = orgNo;
            return this;
        }
        public String getOrgNo() {
            return this.orgNo;
        }

        public GetOcIcBasicResponseBodyData setRecCap(String recCap) {
            this.recCap = recCap;
            return this;
        }
        public String getRecCap() {
            return this.recCap;
        }

        public GetOcIcBasicResponseBodyData setRegCap(String regCap) {
            this.regCap = regCap;
            return this;
        }
        public String getRegCap() {
            return this.regCap;
        }

        public GetOcIcBasicResponseBodyData setRegOrg(String regOrg) {
            this.regOrg = regOrg;
            return this;
        }
        public String getRegOrg() {
            return this.regOrg;
        }

        public GetOcIcBasicResponseBodyData setRegOrgCity(String regOrgCity) {
            this.regOrgCity = regOrgCity;
            return this;
        }
        public String getRegOrgCity() {
            return this.regOrgCity;
        }

        public GetOcIcBasicResponseBodyData setRegOrgDistrict(String regOrgDistrict) {
            this.regOrgDistrict = regOrgDistrict;
            return this;
        }
        public String getRegOrgDistrict() {
            return this.regOrgDistrict;
        }

        public GetOcIcBasicResponseBodyData setRegOrgProvince(String regOrgProvince) {
            this.regOrgProvince = regOrgProvince;
            return this;
        }
        public String getRegOrgProvince() {
            return this.regOrgProvince;
        }

        public GetOcIcBasicResponseBodyData setSocialCreditCode(String socialCreditCode) {
            this.socialCreditCode = socialCreditCode;
            return this;
        }
        public String getSocialCreditCode() {
            return this.socialCreditCode;
        }

        public GetOcIcBasicResponseBodyData setStaffNum(String staffNum) {
            this.staffNum = staffNum;
            return this;
        }
        public String getStaffNum() {
            return this.staffNum;
        }

        public GetOcIcBasicResponseBodyData setTaxNum(String taxNum) {
            this.taxNum = taxNum;
            return this;
        }
        public String getTaxNum() {
            return this.taxNum;
        }

    }

}
