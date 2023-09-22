// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryShortTermPvForecastDataResponseBody extends TeaModel {
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<QueryShortTermPvForecastDataResponseBodyData> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static QueryShortTermPvForecastDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryShortTermPvForecastDataResponseBody self = new QueryShortTermPvForecastDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryShortTermPvForecastDataResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryShortTermPvForecastDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryShortTermPvForecastDataResponseBody setData(java.util.List<QueryShortTermPvForecastDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryShortTermPvForecastDataResponseBodyData> getData() {
        return this.data;
    }

    public QueryShortTermPvForecastDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryShortTermPvForecastDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryShortTermPvForecastDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryShortTermPvForecastDataResponseBodyDataRecordList extends TeaModel {
        @NameInMap("dataTime")
        public String dataTime;

        @NameInMap("ds")
        public String ds;

        @NameInMap("pvPower")
        public Double pvPower;

        public static QueryShortTermPvForecastDataResponseBodyDataRecordList build(java.util.Map<String, ?> map) throws Exception {
            QueryShortTermPvForecastDataResponseBodyDataRecordList self = new QueryShortTermPvForecastDataResponseBodyDataRecordList();
            return TeaModel.build(map, self);
        }

        public QueryShortTermPvForecastDataResponseBodyDataRecordList setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public QueryShortTermPvForecastDataResponseBodyDataRecordList setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public QueryShortTermPvForecastDataResponseBodyDataRecordList setPvPower(Double pvPower) {
            this.pvPower = pvPower;
            return this;
        }
        public Double getPvPower() {
            return this.pvPower;
        }

    }

    public static class QueryShortTermPvForecastDataResponseBodyData extends TeaModel {
        @NameInMap("deviceSn")
        public String deviceSn;

        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("recordList")
        public java.util.List<QueryShortTermPvForecastDataResponseBodyDataRecordList> recordList;

        public static QueryShortTermPvForecastDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryShortTermPvForecastDataResponseBodyData self = new QueryShortTermPvForecastDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryShortTermPvForecastDataResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public QueryShortTermPvForecastDataResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryShortTermPvForecastDataResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryShortTermPvForecastDataResponseBodyData setRecordList(java.util.List<QueryShortTermPvForecastDataResponseBodyDataRecordList> recordList) {
            this.recordList = recordList;
            return this;
        }
        public java.util.List<QueryShortTermPvForecastDataResponseBodyDataRecordList> getRecordList() {
            return this.recordList;
        }

    }

}
