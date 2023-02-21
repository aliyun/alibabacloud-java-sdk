// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcOperationCustomsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcOperationCustomsResponseBodyData> data;

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

    public static GetOcOperationCustomsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcOperationCustomsResponseBody self = new GetOcOperationCustomsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcOperationCustomsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcOperationCustomsResponseBody setData(java.util.List<GetOcOperationCustomsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcOperationCustomsResponseBodyData> getData() {
        return this.data;
    }

    public GetOcOperationCustomsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcOperationCustomsResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcOperationCustomsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcOperationCustomsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcOperationCustomsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcOperationCustomsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcOperationCustomsResponseBodyData extends TeaModel {
        @NameInMap("AdminRegionName")
        public String adminRegionName;

        @NameInMap("AnnualReport")
        public String annualReport;

        @NameInMap("BusinessCate")
        public String businessCate;

        @NameInMap("CancelFlag")
        public String cancelFlag;

        @NameInMap("CreditLevelsNew")
        public String creditLevelsNew;

        @NameInMap("CustomsNum")
        public String customsNum;

        @NameInMap("CustomsReg")
        public String customsReg;

        @NameInMap("EcoRegionName")
        public String ecoRegionName;

        @NameInMap("ElectType")
        public String electType;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("IdentCode")
        public String identCode;

        @NameInMap("IdentDate")
        public String identDate;

        @NameInMap("IndustryType")
        public String industryType;

        @NameInMap("RegDate")
        public String regDate;

        @NameInMap("SpecialArea")
        public String specialArea;

        @NameInMap("ValidDate")
        public String validDate;

        public static GetOcOperationCustomsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcOperationCustomsResponseBodyData self = new GetOcOperationCustomsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcOperationCustomsResponseBodyData setAdminRegionName(String adminRegionName) {
            this.adminRegionName = adminRegionName;
            return this;
        }
        public String getAdminRegionName() {
            return this.adminRegionName;
        }

        public GetOcOperationCustomsResponseBodyData setAnnualReport(String annualReport) {
            this.annualReport = annualReport;
            return this;
        }
        public String getAnnualReport() {
            return this.annualReport;
        }

        public GetOcOperationCustomsResponseBodyData setBusinessCate(String businessCate) {
            this.businessCate = businessCate;
            return this;
        }
        public String getBusinessCate() {
            return this.businessCate;
        }

        public GetOcOperationCustomsResponseBodyData setCancelFlag(String cancelFlag) {
            this.cancelFlag = cancelFlag;
            return this;
        }
        public String getCancelFlag() {
            return this.cancelFlag;
        }

        public GetOcOperationCustomsResponseBodyData setCreditLevelsNew(String creditLevelsNew) {
            this.creditLevelsNew = creditLevelsNew;
            return this;
        }
        public String getCreditLevelsNew() {
            return this.creditLevelsNew;
        }

        public GetOcOperationCustomsResponseBodyData setCustomsNum(String customsNum) {
            this.customsNum = customsNum;
            return this;
        }
        public String getCustomsNum() {
            return this.customsNum;
        }

        public GetOcOperationCustomsResponseBodyData setCustomsReg(String customsReg) {
            this.customsReg = customsReg;
            return this;
        }
        public String getCustomsReg() {
            return this.customsReg;
        }

        public GetOcOperationCustomsResponseBodyData setEcoRegionName(String ecoRegionName) {
            this.ecoRegionName = ecoRegionName;
            return this;
        }
        public String getEcoRegionName() {
            return this.ecoRegionName;
        }

        public GetOcOperationCustomsResponseBodyData setElectType(String electType) {
            this.electType = electType;
            return this;
        }
        public String getElectType() {
            return this.electType;
        }

        public GetOcOperationCustomsResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcOperationCustomsResponseBodyData setIdentCode(String identCode) {
            this.identCode = identCode;
            return this;
        }
        public String getIdentCode() {
            return this.identCode;
        }

        public GetOcOperationCustomsResponseBodyData setIdentDate(String identDate) {
            this.identDate = identDate;
            return this;
        }
        public String getIdentDate() {
            return this.identDate;
        }

        public GetOcOperationCustomsResponseBodyData setIndustryType(String industryType) {
            this.industryType = industryType;
            return this;
        }
        public String getIndustryType() {
            return this.industryType;
        }

        public GetOcOperationCustomsResponseBodyData setRegDate(String regDate) {
            this.regDate = regDate;
            return this;
        }
        public String getRegDate() {
            return this.regDate;
        }

        public GetOcOperationCustomsResponseBodyData setSpecialArea(String specialArea) {
            this.specialArea = specialArea;
            return this;
        }
        public String getSpecialArea() {
            return this.specialArea;
        }

        public GetOcOperationCustomsResponseBodyData setValidDate(String validDate) {
            this.validDate = validDate;
            return this;
        }
        public String getValidDate() {
            return this.validDate;
        }

    }

}
