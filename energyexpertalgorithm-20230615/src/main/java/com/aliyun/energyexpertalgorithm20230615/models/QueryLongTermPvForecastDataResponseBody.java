// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertalgorithm20230615.models;

import com.aliyun.tea.*;

public class QueryLongTermPvForecastDataResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<QueryLongTermPvForecastDataResponseBodyData> data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static QueryLongTermPvForecastDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLongTermPvForecastDataResponseBody self = new QueryLongTermPvForecastDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLongTermPvForecastDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLongTermPvForecastDataResponseBody setData(java.util.List<QueryLongTermPvForecastDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLongTermPvForecastDataResponseBodyData> getData() {
        return this.data;
    }

    public QueryLongTermPvForecastDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLongTermPvForecastDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLongTermPvForecastDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryLongTermPvForecastDataResponseBodyDataRecordList extends TeaModel {
        @NameInMap("dataTime")
        public String dataTime;

        @NameInMap("ds")
        public String ds;

        @NameInMap("pvEnergy")
        public Double pvEnergy;

        public static QueryLongTermPvForecastDataResponseBodyDataRecordList build(java.util.Map<String, ?> map) throws Exception {
            QueryLongTermPvForecastDataResponseBodyDataRecordList self = new QueryLongTermPvForecastDataResponseBodyDataRecordList();
            return TeaModel.build(map, self);
        }

        public QueryLongTermPvForecastDataResponseBodyDataRecordList setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public QueryLongTermPvForecastDataResponseBodyDataRecordList setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public QueryLongTermPvForecastDataResponseBodyDataRecordList setPvEnergy(Double pvEnergy) {
            this.pvEnergy = pvEnergy;
            return this;
        }
        public Double getPvEnergy() {
            return this.pvEnergy;
        }

    }

    public static class QueryLongTermPvForecastDataResponseBodyData extends TeaModel {
        @NameInMap("deviceSn")
        public String deviceSn;

        @NameInMap("recordList")
        public java.util.List<QueryLongTermPvForecastDataResponseBodyDataRecordList> recordList;

        public static QueryLongTermPvForecastDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLongTermPvForecastDataResponseBodyData self = new QueryLongTermPvForecastDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLongTermPvForecastDataResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public QueryLongTermPvForecastDataResponseBodyData setRecordList(java.util.List<QueryLongTermPvForecastDataResponseBodyDataRecordList> recordList) {
            this.recordList = recordList;
            return this;
        }
        public java.util.List<QueryLongTermPvForecastDataResponseBodyDataRecordList> getRecordList() {
            return this.recordList;
        }

    }

}
