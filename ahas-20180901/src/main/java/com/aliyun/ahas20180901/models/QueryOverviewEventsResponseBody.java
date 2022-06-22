// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryOverviewEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryOverviewEventsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOverviewEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOverviewEventsResponseBody self = new QueryOverviewEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOverviewEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOverviewEventsResponseBody setData(java.util.List<QueryOverviewEventsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOverviewEventsResponseBodyData> getData() {
        return this.data;
    }

    public QueryOverviewEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOverviewEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOverviewEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOverviewEventsResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("description")
        public String description;

        @NameInMap("deviceConfigurationId")
        public String deviceConfigurationId;

        @NameInMap("deviceId")
        public String deviceId;

        @NameInMap("deviceIp")
        public String deviceIp;

        @NameInMap("end")
        public Long end;

        @NameInMap("eventType")
        public String eventType;

        @NameInMap("level")
        public String level;

        @NameInMap("occurTime")
        public Long occurTime;

        @NameInMap("optType")
        public String optType;

        @NameInMap("result")
        public String result;

        @NameInMap("start")
        public Long start;

        public static QueryOverviewEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOverviewEventsResponseBodyData self = new QueryOverviewEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOverviewEventsResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryOverviewEventsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryOverviewEventsResponseBodyData setDeviceConfigurationId(String deviceConfigurationId) {
            this.deviceConfigurationId = deviceConfigurationId;
            return this;
        }
        public String getDeviceConfigurationId() {
            return this.deviceConfigurationId;
        }

        public QueryOverviewEventsResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryOverviewEventsResponseBodyData setDeviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }
        public String getDeviceIp() {
            return this.deviceIp;
        }

        public QueryOverviewEventsResponseBodyData setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public QueryOverviewEventsResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public QueryOverviewEventsResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryOverviewEventsResponseBodyData setOccurTime(Long occurTime) {
            this.occurTime = occurTime;
            return this;
        }
        public Long getOccurTime() {
            return this.occurTime;
        }

        public QueryOverviewEventsResponseBodyData setOptType(String optType) {
            this.optType = optType;
            return this;
        }
        public String getOptType() {
            return this.optType;
        }

        public QueryOverviewEventsResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryOverviewEventsResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

    }

}
