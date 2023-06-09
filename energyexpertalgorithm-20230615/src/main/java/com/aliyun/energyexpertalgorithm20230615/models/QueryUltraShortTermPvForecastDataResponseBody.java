// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryUltraShortTermPvForecastDataResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<QueryUltraShortTermPvForecastDataResponseBodyData> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static QueryUltraShortTermPvForecastDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUltraShortTermPvForecastDataResponseBody self = new QueryUltraShortTermPvForecastDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUltraShortTermPvForecastDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUltraShortTermPvForecastDataResponseBody setData(java.util.List<QueryUltraShortTermPvForecastDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryUltraShortTermPvForecastDataResponseBodyData> getData() {
        return this.data;
    }

    public QueryUltraShortTermPvForecastDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUltraShortTermPvForecastDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUltraShortTermPvForecastDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUltraShortTermPvForecastDataResponseBodyDataRecordList extends TeaModel {
        @NameInMap("dataTime")
        public String dataTime;

        @NameInMap("ds")
        public String ds;

        @NameInMap("pvPower")
        public Double pvPower;

        public static QueryUltraShortTermPvForecastDataResponseBodyDataRecordList build(java.util.Map<String, ?> map) throws Exception {
            QueryUltraShortTermPvForecastDataResponseBodyDataRecordList self = new QueryUltraShortTermPvForecastDataResponseBodyDataRecordList();
            return TeaModel.build(map, self);
        }

        public QueryUltraShortTermPvForecastDataResponseBodyDataRecordList setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public QueryUltraShortTermPvForecastDataResponseBodyDataRecordList setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public QueryUltraShortTermPvForecastDataResponseBodyDataRecordList setPvPower(Double pvPower) {
            this.pvPower = pvPower;
            return this;
        }
        public Double getPvPower() {
            return this.pvPower;
        }

    }

    public static class QueryUltraShortTermPvForecastDataResponseBodyData extends TeaModel {
        @NameInMap("deviceSn")
        public String deviceSn;

        @NameInMap("recordList")
        public java.util.List<QueryUltraShortTermPvForecastDataResponseBodyDataRecordList> recordList;

        public static QueryUltraShortTermPvForecastDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryUltraShortTermPvForecastDataResponseBodyData self = new QueryUltraShortTermPvForecastDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryUltraShortTermPvForecastDataResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public QueryUltraShortTermPvForecastDataResponseBodyData setRecordList(java.util.List<QueryUltraShortTermPvForecastDataResponseBodyDataRecordList> recordList) {
            this.recordList = recordList;
            return this;
        }
        public java.util.List<QueryUltraShortTermPvForecastDataResponseBodyDataRecordList> getRecordList() {
            return this.recordList;
        }

    }

}
