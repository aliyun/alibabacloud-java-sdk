// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcOperationPurchaseLandResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcOperationPurchaseLandResponseBodyData> data;

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

    public static GetOcOperationPurchaseLandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcOperationPurchaseLandResponseBody self = new GetOcOperationPurchaseLandResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcOperationPurchaseLandResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcOperationPurchaseLandResponseBody setData(java.util.List<GetOcOperationPurchaseLandResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcOperationPurchaseLandResponseBodyData> getData() {
        return this.data;
    }

    public GetOcOperationPurchaseLandResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcOperationPurchaseLandResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcOperationPurchaseLandResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcOperationPurchaseLandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcOperationPurchaseLandResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcOperationPurchaseLandResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcOperationPurchaseLandResponseBodyData extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("Department")
        public String department;

        @NameInMap("ElectronicNo")
        public String electronicNo;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("Industry")
        public String industry;

        @NameInMap("LandLevel")
        public String landLevel;

        @NameInMap("LandSource")
        public String landSource;

        @NameInMap("LandUse")
        public String landUse;

        @NameInMap("Location")
        public String location;

        @NameInMap("Price")
        public String price;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("PromiseDeliveryDate")
        public String promiseDeliveryDate;

        @NameInMap("PromiseEndDate")
        public String promiseEndDate;

        @NameInMap("PromiseStartDate")
        public String promiseStartDate;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("ReleaseDate")
        public String releaseDate;

        @NameInMap("SigningMode")
        public String signingMode;

        @NameInMap("UseYear")
        public String useYear;

        @NameInMap("VolumeFractionLowerBound")
        public String volumeFractionLowerBound;

        @NameInMap("VolumeFractionUpperBound")
        public String volumeFractionUpperBound;

        public static GetOcOperationPurchaseLandResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcOperationPurchaseLandResponseBodyData self = new GetOcOperationPurchaseLandResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcOperationPurchaseLandResponseBodyData setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public GetOcOperationPurchaseLandResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcOperationPurchaseLandResponseBodyData setElectronicNo(String electronicNo) {
            this.electronicNo = electronicNo;
            return this;
        }
        public String getElectronicNo() {
            return this.electronicNo;
        }

        public GetOcOperationPurchaseLandResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcOperationPurchaseLandResponseBodyData setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public GetOcOperationPurchaseLandResponseBodyData setLandLevel(String landLevel) {
            this.landLevel = landLevel;
            return this;
        }
        public String getLandLevel() {
            return this.landLevel;
        }

        public GetOcOperationPurchaseLandResponseBodyData setLandSource(String landSource) {
            this.landSource = landSource;
            return this;
        }
        public String getLandSource() {
            return this.landSource;
        }

        public GetOcOperationPurchaseLandResponseBodyData setLandUse(String landUse) {
            this.landUse = landUse;
            return this;
        }
        public String getLandUse() {
            return this.landUse;
        }

        public GetOcOperationPurchaseLandResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetOcOperationPurchaseLandResponseBodyData setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public GetOcOperationPurchaseLandResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetOcOperationPurchaseLandResponseBodyData setPromiseDeliveryDate(String promiseDeliveryDate) {
            this.promiseDeliveryDate = promiseDeliveryDate;
            return this;
        }
        public String getPromiseDeliveryDate() {
            return this.promiseDeliveryDate;
        }

        public GetOcOperationPurchaseLandResponseBodyData setPromiseEndDate(String promiseEndDate) {
            this.promiseEndDate = promiseEndDate;
            return this;
        }
        public String getPromiseEndDate() {
            return this.promiseEndDate;
        }

        public GetOcOperationPurchaseLandResponseBodyData setPromiseStartDate(String promiseStartDate) {
            this.promiseStartDate = promiseStartDate;
            return this;
        }
        public String getPromiseStartDate() {
            return this.promiseStartDate;
        }

        public GetOcOperationPurchaseLandResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public GetOcOperationPurchaseLandResponseBodyData setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public String getReleaseDate() {
            return this.releaseDate;
        }

        public GetOcOperationPurchaseLandResponseBodyData setSigningMode(String signingMode) {
            this.signingMode = signingMode;
            return this;
        }
        public String getSigningMode() {
            return this.signingMode;
        }

        public GetOcOperationPurchaseLandResponseBodyData setUseYear(String useYear) {
            this.useYear = useYear;
            return this;
        }
        public String getUseYear() {
            return this.useYear;
        }

        public GetOcOperationPurchaseLandResponseBodyData setVolumeFractionLowerBound(String volumeFractionLowerBound) {
            this.volumeFractionLowerBound = volumeFractionLowerBound;
            return this;
        }
        public String getVolumeFractionLowerBound() {
            return this.volumeFractionLowerBound;
        }

        public GetOcOperationPurchaseLandResponseBodyData setVolumeFractionUpperBound(String volumeFractionUpperBound) {
            this.volumeFractionUpperBound = volumeFractionUpperBound;
            return this;
        }
        public String getVolumeFractionUpperBound() {
            return this.volumeFractionUpperBound;
        }

    }

}
