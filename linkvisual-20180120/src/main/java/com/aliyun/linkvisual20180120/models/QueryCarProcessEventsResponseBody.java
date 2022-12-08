// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryCarProcessEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryCarProcessEventsResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCarProcessEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCarProcessEventsResponseBody self = new QueryCarProcessEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCarProcessEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCarProcessEventsResponseBody setData(QueryCarProcessEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCarProcessEventsResponseBodyData getData() {
        return this.data;
    }

    public QueryCarProcessEventsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryCarProcessEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCarProcessEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCarProcessEventsResponseBodyDataPageData extends TeaModel {
        @NameInMap("ActionType")
        public Integer actionType;

        @NameInMap("AreaIndex")
        public Integer areaIndex;

        @NameInMap("Confidence")
        public Integer confidence;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventPicId")
        public String eventPicId;

        @NameInMap("EventPicUrl")
        public String eventPicUrl;

        @NameInMap("EventTime")
        public Long eventTime;

        @NameInMap("EventType")
        public Integer eventType;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("PlateNo")
        public String plateNo;

        @NameInMap("SubDeviceName")
        public String subDeviceName;

        @NameInMap("SubDeviceNickName")
        public String subDeviceNickName;

        @NameInMap("SubIotId")
        public String subIotId;

        @NameInMap("SubProductKey")
        public String subProductKey;

        @NameInMap("TaskId")
        public String taskId;

        public static QueryCarProcessEventsResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryCarProcessEventsResponseBodyDataPageData self = new QueryCarProcessEventsResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryCarProcessEventsResponseBodyDataPageData setActionType(Integer actionType) {
            this.actionType = actionType;
            return this;
        }
        public Integer getActionType() {
            return this.actionType;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setAreaIndex(Integer areaIndex) {
            this.areaIndex = areaIndex;
            return this;
        }
        public Integer getAreaIndex() {
            return this.areaIndex;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setConfidence(Integer confidence) {
            this.confidence = confidence;
            return this;
        }
        public Integer getConfidence() {
            return this.confidence;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setEventPicId(String eventPicId) {
            this.eventPicId = eventPicId;
            return this;
        }
        public String getEventPicId() {
            return this.eventPicId;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setEventPicUrl(String eventPicUrl) {
            this.eventPicUrl = eventPicUrl;
            return this;
        }
        public String getEventPicUrl() {
            return this.eventPicUrl;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setEventType(Integer eventType) {
            this.eventType = eventType;
            return this;
        }
        public Integer getEventType() {
            return this.eventType;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setSubDeviceName(String subDeviceName) {
            this.subDeviceName = subDeviceName;
            return this;
        }
        public String getSubDeviceName() {
            return this.subDeviceName;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setSubDeviceNickName(String subDeviceNickName) {
            this.subDeviceNickName = subDeviceNickName;
            return this;
        }
        public String getSubDeviceNickName() {
            return this.subDeviceNickName;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setSubIotId(String subIotId) {
            this.subIotId = subIotId;
            return this;
        }
        public String getSubIotId() {
            return this.subIotId;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setSubProductKey(String subProductKey) {
            this.subProductKey = subProductKey;
            return this;
        }
        public String getSubProductKey() {
            return this.subProductKey;
        }

        public QueryCarProcessEventsResponseBodyDataPageData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class QueryCarProcessEventsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageData")
        public java.util.List<QueryCarProcessEventsResponseBodyDataPageData> pageData;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryCarProcessEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCarProcessEventsResponseBodyData self = new QueryCarProcessEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCarProcessEventsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryCarProcessEventsResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryCarProcessEventsResponseBodyData setPageData(java.util.List<QueryCarProcessEventsResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryCarProcessEventsResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public QueryCarProcessEventsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryCarProcessEventsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
