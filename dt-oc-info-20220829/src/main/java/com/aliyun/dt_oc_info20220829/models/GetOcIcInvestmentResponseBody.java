// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcInvestmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcInvestmentResponseBodyData> data;

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

    public static GetOcIcInvestmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcInvestmentResponseBody self = new GetOcIcInvestmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcInvestmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcInvestmentResponseBody setData(java.util.List<GetOcIcInvestmentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcInvestmentResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcInvestmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcInvestmentResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcInvestmentResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcInvestmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcInvestmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcInvestmentResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcInvestmentResponseBodyData extends TeaModel {
        @NameInMap("EntName")
        public String entName;

        @NameInMap("InvestCreditCode")
        public String investCreditCode;

        @NameInMap("InvestEsDate")
        public String investEsDate;

        @NameInMap("InvestLegalName")
        public String investLegalName;

        @NameInMap("InvestLicenseNo")
        public String investLicenseNo;

        @NameInMap("InvestName")
        public String investName;

        @NameInMap("InvestRegCap")
        public String investRegCap;

        @NameInMap("InvestStatus")
        public String investStatus;

        @NameInMap("ShouldCap")
        public String shouldCap;

        @NameInMap("StockPercentage")
        public String stockPercentage;

        public static GetOcIcInvestmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcInvestmentResponseBodyData self = new GetOcIcInvestmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcInvestmentResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcIcInvestmentResponseBodyData setInvestCreditCode(String investCreditCode) {
            this.investCreditCode = investCreditCode;
            return this;
        }
        public String getInvestCreditCode() {
            return this.investCreditCode;
        }

        public GetOcIcInvestmentResponseBodyData setInvestEsDate(String investEsDate) {
            this.investEsDate = investEsDate;
            return this;
        }
        public String getInvestEsDate() {
            return this.investEsDate;
        }

        public GetOcIcInvestmentResponseBodyData setInvestLegalName(String investLegalName) {
            this.investLegalName = investLegalName;
            return this;
        }
        public String getInvestLegalName() {
            return this.investLegalName;
        }

        public GetOcIcInvestmentResponseBodyData setInvestLicenseNo(String investLicenseNo) {
            this.investLicenseNo = investLicenseNo;
            return this;
        }
        public String getInvestLicenseNo() {
            return this.investLicenseNo;
        }

        public GetOcIcInvestmentResponseBodyData setInvestName(String investName) {
            this.investName = investName;
            return this;
        }
        public String getInvestName() {
            return this.investName;
        }

        public GetOcIcInvestmentResponseBodyData setInvestRegCap(String investRegCap) {
            this.investRegCap = investRegCap;
            return this;
        }
        public String getInvestRegCap() {
            return this.investRegCap;
        }

        public GetOcIcInvestmentResponseBodyData setInvestStatus(String investStatus) {
            this.investStatus = investStatus;
            return this;
        }
        public String getInvestStatus() {
            return this.investStatus;
        }

        public GetOcIcInvestmentResponseBodyData setShouldCap(String shouldCap) {
            this.shouldCap = shouldCap;
            return this;
        }
        public String getShouldCap() {
            return this.shouldCap;
        }

        public GetOcIcInvestmentResponseBodyData setStockPercentage(String stockPercentage) {
            this.stockPercentage = stockPercentage;
            return this;
        }
        public String getStockPercentage() {
            return this.stockPercentage;
        }

    }

}
