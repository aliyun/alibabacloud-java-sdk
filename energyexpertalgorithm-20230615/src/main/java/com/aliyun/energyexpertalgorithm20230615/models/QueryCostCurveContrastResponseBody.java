// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryCostCurveContrastResponseBody extends TeaModel {
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

        @NameInMap("selfUseBuy")
        public Double selfUseBuy;

        @NameInMap("selfUseCost")
        public Double selfUseCost;

        @NameInMap("strategyBuy")
        public Double strategyBuy;

        @NameInMap("strategyBuyCost")
        public Double strategyBuyCost;

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

    }

    public static class QueryCostCurveContrastResponseBodyData extends TeaModel {
        @NameInMap("deviceSn")
        public String deviceSn;

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

        public QueryCostCurveContrastResponseBodyData setRecordList(java.util.List<QueryCostCurveContrastResponseBodyDataRecordList> recordList) {
            this.recordList = recordList;
            return this;
        }
        public java.util.List<QueryCostCurveContrastResponseBodyDataRecordList> getRecordList() {
            return this.recordList;
        }

    }

}
