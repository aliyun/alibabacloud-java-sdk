// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryUltraShortTermLoadForecastDataResponseBody extends TeaModel {
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<QueryUltraShortTermLoadForecastDataResponseBodyData> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static QueryUltraShortTermLoadForecastDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUltraShortTermLoadForecastDataResponseBody self = new QueryUltraShortTermLoadForecastDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUltraShortTermLoadForecastDataResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryUltraShortTermLoadForecastDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUltraShortTermLoadForecastDataResponseBody setData(java.util.List<QueryUltraShortTermLoadForecastDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryUltraShortTermLoadForecastDataResponseBodyData> getData() {
        return this.data;
    }

    public QueryUltraShortTermLoadForecastDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUltraShortTermLoadForecastDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUltraShortTermLoadForecastDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUltraShortTermLoadForecastDataResponseBodyDataRecordList extends TeaModel {
        @NameInMap("dataTime")
        public String dataTime;

        @NameInMap("ds")
        public String ds;

        @NameInMap("loadPower")
        public Double loadPower;

        public static QueryUltraShortTermLoadForecastDataResponseBodyDataRecordList build(java.util.Map<String, ?> map) throws Exception {
            QueryUltraShortTermLoadForecastDataResponseBodyDataRecordList self = new QueryUltraShortTermLoadForecastDataResponseBodyDataRecordList();
            return TeaModel.build(map, self);
        }

        public QueryUltraShortTermLoadForecastDataResponseBodyDataRecordList setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public QueryUltraShortTermLoadForecastDataResponseBodyDataRecordList setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public QueryUltraShortTermLoadForecastDataResponseBodyDataRecordList setLoadPower(Double loadPower) {
            this.loadPower = loadPower;
            return this;
        }
        public Double getLoadPower() {
            return this.loadPower;
        }

    }

    public static class QueryUltraShortTermLoadForecastDataResponseBodyData extends TeaModel {
        @NameInMap("deviceSn")
        public String deviceSn;

        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("recordList")
        public java.util.List<QueryUltraShortTermLoadForecastDataResponseBodyDataRecordList> recordList;

        public static QueryUltraShortTermLoadForecastDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryUltraShortTermLoadForecastDataResponseBodyData self = new QueryUltraShortTermLoadForecastDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryUltraShortTermLoadForecastDataResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public QueryUltraShortTermLoadForecastDataResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryUltraShortTermLoadForecastDataResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryUltraShortTermLoadForecastDataResponseBodyData setRecordList(java.util.List<QueryUltraShortTermLoadForecastDataResponseBodyDataRecordList> recordList) {
            this.recordList = recordList;
            return this;
        }
        public java.util.List<QueryUltraShortTermLoadForecastDataResponseBodyDataRecordList> getRecordList() {
            return this.recordList;
        }

    }

}
