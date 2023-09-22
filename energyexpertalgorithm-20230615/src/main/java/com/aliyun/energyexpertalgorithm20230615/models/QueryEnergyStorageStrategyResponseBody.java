// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryEnergyStorageStrategyResponseBody extends TeaModel {
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<QueryEnergyStorageStrategyResponseBodyData> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static QueryEnergyStorageStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEnergyStorageStrategyResponseBody self = new QueryEnergyStorageStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEnergyStorageStrategyResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryEnergyStorageStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEnergyStorageStrategyResponseBody setData(java.util.List<QueryEnergyStorageStrategyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryEnergyStorageStrategyResponseBodyData> getData() {
        return this.data;
    }

    public QueryEnergyStorageStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEnergyStorageStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEnergyStorageStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEnergyStorageStrategyResponseBodyDataRecordList extends TeaModel {
        @NameInMap("batteryDirection")
        public Integer batteryDirection;

        @NameInMap("batteryPower")
        public Double batteryPower;

        @NameInMap("dataTime")
        public String dataTime;

        @NameInMap("ds")
        public String ds;

        @NameInMap("workMode")
        public Integer workMode;

        public static QueryEnergyStorageStrategyResponseBodyDataRecordList build(java.util.Map<String, ?> map) throws Exception {
            QueryEnergyStorageStrategyResponseBodyDataRecordList self = new QueryEnergyStorageStrategyResponseBodyDataRecordList();
            return TeaModel.build(map, self);
        }

        public QueryEnergyStorageStrategyResponseBodyDataRecordList setBatteryDirection(Integer batteryDirection) {
            this.batteryDirection = batteryDirection;
            return this;
        }
        public Integer getBatteryDirection() {
            return this.batteryDirection;
        }

        public QueryEnergyStorageStrategyResponseBodyDataRecordList setBatteryPower(Double batteryPower) {
            this.batteryPower = batteryPower;
            return this;
        }
        public Double getBatteryPower() {
            return this.batteryPower;
        }

        public QueryEnergyStorageStrategyResponseBodyDataRecordList setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public QueryEnergyStorageStrategyResponseBodyDataRecordList setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public QueryEnergyStorageStrategyResponseBodyDataRecordList setWorkMode(Integer workMode) {
            this.workMode = workMode;
            return this;
        }
        public Integer getWorkMode() {
            return this.workMode;
        }

    }

    public static class QueryEnergyStorageStrategyResponseBodyData extends TeaModel {
        @NameInMap("deviceSn")
        public String deviceSn;

        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("recordList")
        public java.util.List<QueryEnergyStorageStrategyResponseBodyDataRecordList> recordList;

        public static QueryEnergyStorageStrategyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEnergyStorageStrategyResponseBodyData self = new QueryEnergyStorageStrategyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEnergyStorageStrategyResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public QueryEnergyStorageStrategyResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryEnergyStorageStrategyResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryEnergyStorageStrategyResponseBodyData setRecordList(java.util.List<QueryEnergyStorageStrategyResponseBodyDataRecordList> recordList) {
            this.recordList = recordList;
            return this;
        }
        public java.util.List<QueryEnergyStorageStrategyResponseBodyDataRecordList> getRecordList() {
            return this.recordList;
        }

    }

}
