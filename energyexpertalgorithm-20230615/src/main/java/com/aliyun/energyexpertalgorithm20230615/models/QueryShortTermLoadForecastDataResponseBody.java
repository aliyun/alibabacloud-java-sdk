// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryShortTermLoadForecastDataResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<QueryShortTermLoadForecastDataResponseBodyData> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static QueryShortTermLoadForecastDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryShortTermLoadForecastDataResponseBody self = new QueryShortTermLoadForecastDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryShortTermLoadForecastDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryShortTermLoadForecastDataResponseBody setData(java.util.List<QueryShortTermLoadForecastDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryShortTermLoadForecastDataResponseBodyData> getData() {
        return this.data;
    }

    public QueryShortTermLoadForecastDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryShortTermLoadForecastDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryShortTermLoadForecastDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryShortTermLoadForecastDataResponseBodyDataRecordList extends TeaModel {
        @NameInMap("dataTime")
        public String dataTime;

        @NameInMap("ds")
        public String ds;

        @NameInMap("loadPower")
        public Double loadPower;

        public static QueryShortTermLoadForecastDataResponseBodyDataRecordList build(java.util.Map<String, ?> map) throws Exception {
            QueryShortTermLoadForecastDataResponseBodyDataRecordList self = new QueryShortTermLoadForecastDataResponseBodyDataRecordList();
            return TeaModel.build(map, self);
        }

        public QueryShortTermLoadForecastDataResponseBodyDataRecordList setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public QueryShortTermLoadForecastDataResponseBodyDataRecordList setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public QueryShortTermLoadForecastDataResponseBodyDataRecordList setLoadPower(Double loadPower) {
            this.loadPower = loadPower;
            return this;
        }
        public Double getLoadPower() {
            return this.loadPower;
        }

    }

    public static class QueryShortTermLoadForecastDataResponseBodyData extends TeaModel {
        @NameInMap("deviceSn")
        public String deviceSn;

        @NameInMap("recordList")
        public java.util.List<QueryShortTermLoadForecastDataResponseBodyDataRecordList> recordList;

        public static QueryShortTermLoadForecastDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryShortTermLoadForecastDataResponseBodyData self = new QueryShortTermLoadForecastDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryShortTermLoadForecastDataResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public QueryShortTermLoadForecastDataResponseBodyData setRecordList(java.util.List<QueryShortTermLoadForecastDataResponseBodyDataRecordList> recordList) {
            this.recordList = recordList;
            return this;
        }
        public java.util.List<QueryShortTermLoadForecastDataResponseBodyDataRecordList> getRecordList() {
            return this.recordList;
        }

    }

}
