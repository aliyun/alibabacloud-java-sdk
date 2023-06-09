// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryLongTermLoadForecastDataResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<QueryLongTermLoadForecastDataResponseBodyData> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static QueryLongTermLoadForecastDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLongTermLoadForecastDataResponseBody self = new QueryLongTermLoadForecastDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLongTermLoadForecastDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLongTermLoadForecastDataResponseBody setData(java.util.List<QueryLongTermLoadForecastDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLongTermLoadForecastDataResponseBodyData> getData() {
        return this.data;
    }

    public QueryLongTermLoadForecastDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLongTermLoadForecastDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLongTermLoadForecastDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryLongTermLoadForecastDataResponseBodyDataRecordList extends TeaModel {
        @NameInMap("dataTime")
        public String dataTime;

        @NameInMap("ds")
        public String ds;

        @NameInMap("loadEnergy")
        public String loadEnergy;

        public static QueryLongTermLoadForecastDataResponseBodyDataRecordList build(java.util.Map<String, ?> map) throws Exception {
            QueryLongTermLoadForecastDataResponseBodyDataRecordList self = new QueryLongTermLoadForecastDataResponseBodyDataRecordList();
            return TeaModel.build(map, self);
        }

        public QueryLongTermLoadForecastDataResponseBodyDataRecordList setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public QueryLongTermLoadForecastDataResponseBodyDataRecordList setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public QueryLongTermLoadForecastDataResponseBodyDataRecordList setLoadEnergy(String loadEnergy) {
            this.loadEnergy = loadEnergy;
            return this;
        }
        public String getLoadEnergy() {
            return this.loadEnergy;
        }

    }

    public static class QueryLongTermLoadForecastDataResponseBodyData extends TeaModel {
        @NameInMap("deviceSn")
        public String deviceSn;

        @NameInMap("recordList")
        public java.util.List<QueryLongTermLoadForecastDataResponseBodyDataRecordList> recordList;

        public static QueryLongTermLoadForecastDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLongTermLoadForecastDataResponseBodyData self = new QueryLongTermLoadForecastDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLongTermLoadForecastDataResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public QueryLongTermLoadForecastDataResponseBodyData setRecordList(java.util.List<QueryLongTermLoadForecastDataResponseBodyDataRecordList> recordList) {
            this.recordList = recordList;
            return this;
        }
        public java.util.List<QueryLongTermLoadForecastDataResponseBodyDataRecordList> getRecordList() {
            return this.recordList;
        }

    }

}
