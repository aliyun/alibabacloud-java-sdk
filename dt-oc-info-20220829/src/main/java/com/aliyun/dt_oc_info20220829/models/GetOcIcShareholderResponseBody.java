// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcShareholderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcShareholderResponseBodyData> data;

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

    public static GetOcIcShareholderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcShareholderResponseBody self = new GetOcIcShareholderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcShareholderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcShareholderResponseBody setData(java.util.List<GetOcIcShareholderResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcShareholderResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcShareholderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcShareholderResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcShareholderResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcShareholderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcShareholderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcShareholderResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcShareholderResponseBodyData extends TeaModel {
        @NameInMap("ShouldCap")
        public String shouldCap;

        @NameInMap("ShouldCapTime")
        public String shouldCapTime;

        @NameInMap("StockName")
        public String stockName;

        @NameInMap("StockPercent")
        public String stockPercent;

        @NameInMap("StockType")
        public String stockType;

        public static GetOcIcShareholderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcShareholderResponseBodyData self = new GetOcIcShareholderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcShareholderResponseBodyData setShouldCap(String shouldCap) {
            this.shouldCap = shouldCap;
            return this;
        }
        public String getShouldCap() {
            return this.shouldCap;
        }

        public GetOcIcShareholderResponseBodyData setShouldCapTime(String shouldCapTime) {
            this.shouldCapTime = shouldCapTime;
            return this;
        }
        public String getShouldCapTime() {
            return this.shouldCapTime;
        }

        public GetOcIcShareholderResponseBodyData setStockName(String stockName) {
            this.stockName = stockName;
            return this;
        }
        public String getStockName() {
            return this.stockName;
        }

        public GetOcIcShareholderResponseBodyData setStockPercent(String stockPercent) {
            this.stockPercent = stockPercent;
            return this;
        }
        public String getStockPercent() {
            return this.stockPercent;
        }

        public GetOcIcShareholderResponseBodyData setStockType(String stockType) {
            this.stockType = stockType;
            return this;
        }
        public String getStockType() {
            return this.stockType;
        }

    }

}
