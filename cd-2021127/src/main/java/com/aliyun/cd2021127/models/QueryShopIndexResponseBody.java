// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryShopIndexResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryShopIndexResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryShopIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryShopIndexResponseBody self = new QueryShopIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryShopIndexResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryShopIndexResponseBody setData(QueryShopIndexResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryShopIndexResponseBodyData getData() {
        return this.data;
    }

    public QueryShopIndexResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryShopIndexResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryShopIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryShopIndexResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryShopIndexResponseBodyDataShopIndex extends TeaModel {
        @NameInMap("FaultShopNum")
        public Integer faultShopNum;

        @NameInMap("HighFreqFaultShopNum")
        public Integer highFreqFaultShopNum;

        @NameInMap("InstalledShopNum")
        public Integer installedShopNum;

        @NameInMap("NetWorkShopNum")
        public Integer netWorkShopNum;

        @NameInMap("NormalShopNum")
        public Integer normalShopNum;

        @NameInMap("NotWorkShopNum")
        public Integer notWorkShopNum;

        @NameInMap("ShopTotal")
        public Integer shopTotal;

        @NameInMap("UpholdShopNum")
        public Integer upholdShopNum;

        public static QueryShopIndexResponseBodyDataShopIndex build(java.util.Map<String, ?> map) throws Exception {
            QueryShopIndexResponseBodyDataShopIndex self = new QueryShopIndexResponseBodyDataShopIndex();
            return TeaModel.build(map, self);
        }

        public QueryShopIndexResponseBodyDataShopIndex setFaultShopNum(Integer faultShopNum) {
            this.faultShopNum = faultShopNum;
            return this;
        }
        public Integer getFaultShopNum() {
            return this.faultShopNum;
        }

        public QueryShopIndexResponseBodyDataShopIndex setHighFreqFaultShopNum(Integer highFreqFaultShopNum) {
            this.highFreqFaultShopNum = highFreqFaultShopNum;
            return this;
        }
        public Integer getHighFreqFaultShopNum() {
            return this.highFreqFaultShopNum;
        }

        public QueryShopIndexResponseBodyDataShopIndex setInstalledShopNum(Integer installedShopNum) {
            this.installedShopNum = installedShopNum;
            return this;
        }
        public Integer getInstalledShopNum() {
            return this.installedShopNum;
        }

        public QueryShopIndexResponseBodyDataShopIndex setNetWorkShopNum(Integer netWorkShopNum) {
            this.netWorkShopNum = netWorkShopNum;
            return this;
        }
        public Integer getNetWorkShopNum() {
            return this.netWorkShopNum;
        }

        public QueryShopIndexResponseBodyDataShopIndex setNormalShopNum(Integer normalShopNum) {
            this.normalShopNum = normalShopNum;
            return this;
        }
        public Integer getNormalShopNum() {
            return this.normalShopNum;
        }

        public QueryShopIndexResponseBodyDataShopIndex setNotWorkShopNum(Integer notWorkShopNum) {
            this.notWorkShopNum = notWorkShopNum;
            return this;
        }
        public Integer getNotWorkShopNum() {
            return this.notWorkShopNum;
        }

        public QueryShopIndexResponseBodyDataShopIndex setShopTotal(Integer shopTotal) {
            this.shopTotal = shopTotal;
            return this;
        }
        public Integer getShopTotal() {
            return this.shopTotal;
        }

        public QueryShopIndexResponseBodyDataShopIndex setUpholdShopNum(Integer upholdShopNum) {
            this.upholdShopNum = upholdShopNum;
            return this;
        }
        public Integer getUpholdShopNum() {
            return this.upholdShopNum;
        }

    }

    public static class QueryShopIndexResponseBodyDataShopScheduleIndexFailShops extends TeaModel {
        @NameInMap("ShopId")
        public String shopId;

        @NameInMap("ShopName")
        public String shopName;

        public static QueryShopIndexResponseBodyDataShopScheduleIndexFailShops build(java.util.Map<String, ?> map) throws Exception {
            QueryShopIndexResponseBodyDataShopScheduleIndexFailShops self = new QueryShopIndexResponseBodyDataShopScheduleIndexFailShops();
            return TeaModel.build(map, self);
        }

        public QueryShopIndexResponseBodyDataShopScheduleIndexFailShops setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public QueryShopIndexResponseBodyDataShopScheduleIndexFailShops setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

    }

    public static class QueryShopIndexResponseBodyDataShopScheduleIndex extends TeaModel {
        @NameInMap("CostTime")
        public Double costTime;

        @NameInMap("FailShopNum")
        public Integer failShopNum;

        @NameInMap("FailShops")
        public java.util.List<QueryShopIndexResponseBodyDataShopScheduleIndexFailShops> failShops;

        @NameInMap("ScheduleNum")
        public Integer scheduleNum;

        @NameInMap("ScheduleShopNum")
        public Integer scheduleShopNum;

        @NameInMap("SuccessRate")
        public Float successRate;

        public static QueryShopIndexResponseBodyDataShopScheduleIndex build(java.util.Map<String, ?> map) throws Exception {
            QueryShopIndexResponseBodyDataShopScheduleIndex self = new QueryShopIndexResponseBodyDataShopScheduleIndex();
            return TeaModel.build(map, self);
        }

        public QueryShopIndexResponseBodyDataShopScheduleIndex setCostTime(Double costTime) {
            this.costTime = costTime;
            return this;
        }
        public Double getCostTime() {
            return this.costTime;
        }

        public QueryShopIndexResponseBodyDataShopScheduleIndex setFailShopNum(Integer failShopNum) {
            this.failShopNum = failShopNum;
            return this;
        }
        public Integer getFailShopNum() {
            return this.failShopNum;
        }

        public QueryShopIndexResponseBodyDataShopScheduleIndex setFailShops(java.util.List<QueryShopIndexResponseBodyDataShopScheduleIndexFailShops> failShops) {
            this.failShops = failShops;
            return this;
        }
        public java.util.List<QueryShopIndexResponseBodyDataShopScheduleIndexFailShops> getFailShops() {
            return this.failShops;
        }

        public QueryShopIndexResponseBodyDataShopScheduleIndex setScheduleNum(Integer scheduleNum) {
            this.scheduleNum = scheduleNum;
            return this;
        }
        public Integer getScheduleNum() {
            return this.scheduleNum;
        }

        public QueryShopIndexResponseBodyDataShopScheduleIndex setScheduleShopNum(Integer scheduleShopNum) {
            this.scheduleShopNum = scheduleShopNum;
            return this;
        }
        public Integer getScheduleShopNum() {
            return this.scheduleShopNum;
        }

        public QueryShopIndexResponseBodyDataShopScheduleIndex setSuccessRate(Float successRate) {
            this.successRate = successRate;
            return this;
        }
        public Float getSuccessRate() {
            return this.successRate;
        }

    }

    public static class QueryShopIndexResponseBodyData extends TeaModel {
        @NameInMap("ShopIndex")
        public QueryShopIndexResponseBodyDataShopIndex shopIndex;

        @NameInMap("ShopScheduleIndex")
        public QueryShopIndexResponseBodyDataShopScheduleIndex shopScheduleIndex;

        public static QueryShopIndexResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryShopIndexResponseBodyData self = new QueryShopIndexResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryShopIndexResponseBodyData setShopIndex(QueryShopIndexResponseBodyDataShopIndex shopIndex) {
            this.shopIndex = shopIndex;
            return this;
        }
        public QueryShopIndexResponseBodyDataShopIndex getShopIndex() {
            return this.shopIndex;
        }

        public QueryShopIndexResponseBodyData setShopScheduleIndex(QueryShopIndexResponseBodyDataShopScheduleIndex shopScheduleIndex) {
            this.shopScheduleIndex = shopScheduleIndex;
            return this;
        }
        public QueryShopIndexResponseBodyDataShopScheduleIndex getShopScheduleIndex() {
            return this.shopScheduleIndex;
        }

    }

}
