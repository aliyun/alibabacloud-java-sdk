// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryCostCurveContrastResponseBody extends TeaModel {
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<QueryCostCurveContrastResponseBodyData> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static QueryCostCurveContrastResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCurveContrastResponseBody self = new QueryCostCurveContrastResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCostCurveContrastResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryCostCurveContrastResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCostCurveContrastResponseBody setData(java.util.List<QueryCostCurveContrastResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCostCurveContrastResponseBodyData> getData() {
        return this.data;
    }

    public QueryCostCurveContrastResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCostCurveContrastResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCostCurveContrastResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCostCurveContrastResponseBodyDataRecordList extends TeaModel {
        @NameInMap("dataTime")
        public String dataTime;

        @NameInMap("ds")
        public String ds;

        @NameInMap("elePrice")
        public Double elePrice;

        @NameInMap("realCost")
        public Double realCost;

        @NameInMap("realSoc")
        public Double realSoc;

        @NameInMap("selfUseBuy")
        public Double selfUseBuy;

        @NameInMap("selfUseCost")
        public Double selfUseCost;

        @NameInMap("selfUseSoc")
        public Double selfUseSoc;

        @NameInMap("strategyBuy")
        public Double strategyBuy;

        @NameInMap("strategyBuyCost")
        public Double strategyBuyCost;

        @NameInMap("strategySoc")
        public Double strategySoc;

        public static QueryCostCurveContrastResponseBodyDataRecordList build(java.util.Map<String, ?> map) throws Exception {
            QueryCostCurveContrastResponseBodyDataRecordList self = new QueryCostCurveContrastResponseBodyDataRecordList();
            return TeaModel.build(map, self);
        }

        public QueryCostCurveContrastResponseBodyDataRecordList setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public QueryCostCurveContrastResponseBodyDataRecordList setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public QueryCostCurveContrastResponseBodyDataRecordList setElePrice(Double elePrice) {
            this.elePrice = elePrice;
            return this;
        }
        public Double getElePrice() {
            return this.elePrice;
        }

        public QueryCostCurveContrastResponseBodyDataRecordList setRealCost(Double realCost) {
            this.realCost = realCost;
            return this;
        }
        public Double getRealCost() {
            return this.realCost;
        }

        public QueryCostCurveContrastResponseBodyDataRecordList setRealSoc(Double realSoc) {
            this.realSoc = realSoc;
            return this;
        }
        public Double getRealSoc() {
            return this.realSoc;
        }

        public QueryCostCurveContrastResponseBodyDataRecordList setSelfUseBuy(Double selfUseBuy) {
            this.selfUseBuy = selfUseBuy;
            return this;
        }
        public Double getSelfUseBuy() {
            return this.selfUseBuy;
        }

        public QueryCostCurveContrastResponseBodyDataRecordList setSelfUseCost(Double selfUseCost) {
            this.selfUseCost = selfUseCost;
            return this;
        }
        public Double getSelfUseCost() {
            return this.selfUseCost;
        }

        public QueryCostCurveContrastResponseBodyDataRecordList setSelfUseSoc(Double selfUseSoc) {
            this.selfUseSoc = selfUseSoc;
            return this;
        }
        public Double getSelfUseSoc() {
            return this.selfUseSoc;
        }

        public QueryCostCurveContrastResponseBodyDataRecordList setStrategyBuy(Double strategyBuy) {
            this.strategyBuy = strategyBuy;
            return this;
        }
        public Double getStrategyBuy() {
            return this.strategyBuy;
        }

        public QueryCostCurveContrastResponseBodyDataRecordList setStrategyBuyCost(Double strategyBuyCost) {
            this.strategyBuyCost = strategyBuyCost;
            return this;
        }
        public Double getStrategyBuyCost() {
            return this.strategyBuyCost;
        }

        public QueryCostCurveContrastResponseBodyDataRecordList setStrategySoc(Double strategySoc) {
            this.strategySoc = strategySoc;
            return this;
        }
        public Double getStrategySoc() {
            return this.strategySoc;
        }

    }

    public static class QueryCostCurveContrastResponseBodyData extends TeaModel {
        @NameInMap("deviceSn")
        public String deviceSn;

        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("recordList")
        public java.util.List<QueryCostCurveContrastResponseBodyDataRecordList> recordList;

        public static QueryCostCurveContrastResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCostCurveContrastResponseBodyData self = new QueryCostCurveContrastResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCostCurveContrastResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public QueryCostCurveContrastResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryCostCurveContrastResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryCostCurveContrastResponseBodyData setRecordList(java.util.List<QueryCostCurveContrastResponseBodyDataRecordList> recordList) {
            this.recordList = recordList;
            return this;
        }
        public java.util.List<QueryCostCurveContrastResponseBodyDataRecordList> getRecordList() {
            return this.recordList;
        }

    }

}
