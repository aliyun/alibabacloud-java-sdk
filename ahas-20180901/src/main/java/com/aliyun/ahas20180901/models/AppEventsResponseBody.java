// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AppEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AppEventsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AppEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppEventsResponseBody self = new AppEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public AppEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppEventsResponseBody setData(AppEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppEventsResponseBodyData getData() {
        return this.data;
    }

    public AppEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AppEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AppEventsResponseBodyDataAlarmEvents extends TeaModel {
        @NameInMap("Event")
        public String event;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Timestamp")
        public String timestamp;

        public static AppEventsResponseBodyDataAlarmEvents build(java.util.Map<String, ?> map) throws Exception {
            AppEventsResponseBodyDataAlarmEvents self = new AppEventsResponseBodyDataAlarmEvents();
            return TeaModel.build(map, self);
        }

        public AppEventsResponseBodyDataAlarmEvents setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public AppEventsResponseBodyDataAlarmEvents setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public AppEventsResponseBodyDataAlarmEvents setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class AppEventsResponseBodyDataProtectEvents extends TeaModel {
        @NameInMap("Event")
        public String event;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Timestamp")
        public String timestamp;

        public static AppEventsResponseBodyDataProtectEvents build(java.util.Map<String, ?> map) throws Exception {
            AppEventsResponseBodyDataProtectEvents self = new AppEventsResponseBodyDataProtectEvents();
            return TeaModel.build(map, self);
        }

        public AppEventsResponseBodyDataProtectEvents setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public AppEventsResponseBodyDataProtectEvents setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public AppEventsResponseBodyDataProtectEvents setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class AppEventsResponseBodyData extends TeaModel {
        @NameInMap("AlarmEvents")
        public java.util.List<AppEventsResponseBodyDataAlarmEvents> alarmEvents;

        @NameInMap("AlarmRuleCount")
        public Integer alarmRuleCount;

        @NameInMap("AppEventCount")
        public java.util.Map<String, ?> appEventCount;

        @NameInMap("EventCount")
        public Integer eventCount;

        @NameInMap("ProtectEvents")
        public java.util.List<AppEventsResponseBodyDataProtectEvents> protectEvents;

        public static AppEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppEventsResponseBodyData self = new AppEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppEventsResponseBodyData setAlarmEvents(java.util.List<AppEventsResponseBodyDataAlarmEvents> alarmEvents) {
            this.alarmEvents = alarmEvents;
            return this;
        }
        public java.util.List<AppEventsResponseBodyDataAlarmEvents> getAlarmEvents() {
            return this.alarmEvents;
        }

        public AppEventsResponseBodyData setAlarmRuleCount(Integer alarmRuleCount) {
            this.alarmRuleCount = alarmRuleCount;
            return this;
        }
        public Integer getAlarmRuleCount() {
            return this.alarmRuleCount;
        }

        public AppEventsResponseBodyData setAppEventCount(java.util.Map<String, ?> appEventCount) {
            this.appEventCount = appEventCount;
            return this;
        }
        public java.util.Map<String, ?> getAppEventCount() {
            return this.appEventCount;
        }

        public AppEventsResponseBodyData setEventCount(Integer eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Integer getEventCount() {
            return this.eventCount;
        }

        public AppEventsResponseBodyData setProtectEvents(java.util.List<AppEventsResponseBodyDataProtectEvents> protectEvents) {
            this.protectEvents = protectEvents;
            return this;
        }
        public java.util.List<AppEventsResponseBodyDataProtectEvents> getProtectEvents() {
            return this.protectEvents;
        }

    }

    public static class QueryAppEventsResponseBodyDataAlarmEvents extends TeaModel {
        @NameInMap("Event")
        public String event;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Timestamp")
        public String timestamp;

        public static QueryAppEventsResponseBodyDataAlarmEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryAppEventsResponseBodyDataAlarmEvents self = new QueryAppEventsResponseBodyDataAlarmEvents();
            return TeaModel.build(map, self);
        }

        public QueryAppEventsResponseBodyDataAlarmEvents setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public QueryAppEventsResponseBodyDataAlarmEvents setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryAppEventsResponseBodyDataAlarmEvents setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QueryAppEventsResponseBodyDataProtectEvents extends TeaModel {
        @NameInMap("Event")
        public String event;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Timestamp")
        public String timestamp;

        public static QueryAppEventsResponseBodyDataProtectEvents build(java.util.Map<String, ?> map) throws Exception {
            QueryAppEventsResponseBodyDataProtectEvents self = new QueryAppEventsResponseBodyDataProtectEvents();
            return TeaModel.build(map, self);
        }

        public QueryAppEventsResponseBodyDataProtectEvents setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public QueryAppEventsResponseBodyDataProtectEvents setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryAppEventsResponseBodyDataProtectEvents setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QueryAppEventsResponseBodyData extends TeaModel {
        @NameInMap("AlarmEvents")
        public java.util.List<QueryAppEventsResponseBodyDataAlarmEvents> alarmEvents;

        @NameInMap("AlarmRuleCount")
        public Integer alarmRuleCount;

        @NameInMap("AppEventCount")
        public java.util.Map<String, ?> appEventCount;

        @NameInMap("EventCount")
        public Integer eventCount;

        @NameInMap("ProtectEvents")
        public java.util.List<QueryAppEventsResponseBodyDataProtectEvents> protectEvents;

        public static QueryAppEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppEventsResponseBodyData self = new QueryAppEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAppEventsResponseBodyData setAlarmEvents(java.util.List<QueryAppEventsResponseBodyDataAlarmEvents> alarmEvents) {
            this.alarmEvents = alarmEvents;
            return this;
        }
        public java.util.List<QueryAppEventsResponseBodyDataAlarmEvents> getAlarmEvents() {
            return this.alarmEvents;
        }

        public QueryAppEventsResponseBodyData setAlarmRuleCount(Integer alarmRuleCount) {
            this.alarmRuleCount = alarmRuleCount;
            return this;
        }
        public Integer getAlarmRuleCount() {
            return this.alarmRuleCount;
        }

        public QueryAppEventsResponseBodyData setAppEventCount(java.util.Map<String, ?> appEventCount) {
            this.appEventCount = appEventCount;
            return this;
        }
        public java.util.Map<String, ?> getAppEventCount() {
            return this.appEventCount;
        }

        public QueryAppEventsResponseBodyData setEventCount(Integer eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Integer getEventCount() {
            return this.eventCount;
        }

        public QueryAppEventsResponseBodyData setProtectEvents(java.util.List<QueryAppEventsResponseBodyDataProtectEvents> protectEvents) {
            this.protectEvents = protectEvents;
            return this;
        }
        public java.util.List<QueryAppEventsResponseBodyDataProtectEvents> getProtectEvents() {
            return this.protectEvents;
        }

    }

    public static class SentinelAppEventsResponseBodyDataDatas extends TeaModel {
        @NameInMap("app")
        public String app;

        @NameInMap("eventDetails")
        public String eventDetails;

        @NameInMap("eventLevel")
        public Integer eventLevel;

        @NameInMap("eventMsg")
        public String eventMsg;

        @NameInMap("eventType")
        public Integer eventType;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("resource")
        public String resource;

        @NameInMap("ruleIds")
        public String ruleIds;

        @NameInMap("userId")
        public String userId;

        public static SentinelAppEventsResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppEventsResponseBodyDataDatas self = new SentinelAppEventsResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public SentinelAppEventsResponseBodyDataDatas setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public SentinelAppEventsResponseBodyDataDatas setEventDetails(String eventDetails) {
            this.eventDetails = eventDetails;
            return this;
        }
        public String getEventDetails() {
            return this.eventDetails;
        }

        public SentinelAppEventsResponseBodyDataDatas setEventLevel(Integer eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public Integer getEventLevel() {
            return this.eventLevel;
        }

        public SentinelAppEventsResponseBodyDataDatas setEventMsg(String eventMsg) {
            this.eventMsg = eventMsg;
            return this;
        }
        public String getEventMsg() {
            return this.eventMsg;
        }

        public SentinelAppEventsResponseBodyDataDatas setEventType(Integer eventType) {
            this.eventType = eventType;
            return this;
        }
        public Integer getEventType() {
            return this.eventType;
        }

        public SentinelAppEventsResponseBodyDataDatas setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SentinelAppEventsResponseBodyDataDatas setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SentinelAppEventsResponseBodyDataDatas setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelAppEventsResponseBodyDataDatas setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelAppEventsResponseBodyDataDatas setRuleIds(String ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public String getRuleIds() {
            return this.ruleIds;
        }

        public SentinelAppEventsResponseBodyDataDatas setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SentinelAppEventsResponseBodyData extends TeaModel {
        @NameInMap("datas")
        public java.util.List<SentinelAppEventsResponseBodyDataDatas> datas;

        @NameInMap("pageIndex")
        public Long pageIndex;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("totalCount")
        public Long totalCount;

        @NameInMap("totalPage")
        public Long totalPage;

        public static SentinelAppEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelAppEventsResponseBodyData self = new SentinelAppEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelAppEventsResponseBodyData setDatas(java.util.List<SentinelAppEventsResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<SentinelAppEventsResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public SentinelAppEventsResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public SentinelAppEventsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SentinelAppEventsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SentinelAppEventsResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
