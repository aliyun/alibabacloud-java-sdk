// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("SuspEvents")
    @Validation(required = true)
    public java.util.List<DescribeSuspEventsResponseSuspEvents> suspEvents;

    public static DescribeSuspEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsResponse self = new DescribeSuspEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventsResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventsResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSuspEventsResponse setSuspEvents(java.util.List<DescribeSuspEventsResponseSuspEvents> suspEvents) {
        this.suspEvents = suspEvents;
        return this;
    }
    public java.util.List<DescribeSuspEventsResponseSuspEvents> getSuspEvents() {
        return this.suspEvents;
    }

    public static class DescribeSuspEventsResponseSuspEventsDetails extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("NameDisplay")
        @Validation(required = true)
        public String nameDisplay;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("ValueDisplay")
        @Validation(required = true)
        public String valueDisplay;

        public static DescribeSuspEventsResponseSuspEventsDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseSuspEventsDetails self = new DescribeSuspEventsResponseSuspEventsDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseSuspEventsDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventsResponseSuspEventsDetails setNameDisplay(String nameDisplay) {
            this.nameDisplay = nameDisplay;
            return this;
        }
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        public DescribeSuspEventsResponseSuspEventsDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSuspEventsResponseSuspEventsDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeSuspEventsResponseSuspEventsDetails setValueDisplay(String valueDisplay) {
            this.valueDisplay = valueDisplay;
            return this;
        }
        public String getValueDisplay() {
            return this.valueDisplay;
        }

    }

    public static class DescribeSuspEventsResponseSuspEvents extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        @NameInMap("DesktopName")
        @Validation(required = true)
        public String desktopName;

        @NameInMap("LastTime")
        @Validation(required = true)
        public String lastTime;

        @NameInMap("OccurrenceTime")
        @Validation(required = true)
        public String occurrenceTime;

        @NameInMap("UniqueInfo")
        @Validation(required = true)
        public String uniqueInfo;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("EventSubType")
        @Validation(required = true)
        public String eventSubType;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("EventStatus")
        @Validation(required = true)
        public Integer eventStatus;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        @NameInMap("OperateMsg")
        @Validation(required = true)
        public String operateMsg;

        @NameInMap("DataSource")
        @Validation(required = true)
        public String dataSource;

        @NameInMap("OperateErrorCode")
        @Validation(required = true)
        public String operateErrorCode;

        @NameInMap("CanCancelFault")
        @Validation(required = true)
        public Boolean canCancelFault;

        @NameInMap("CanBeDealOnLine")
        @Validation(required = true)
        public String canBeDealOnLine;

        @NameInMap("AlarmEventType")
        @Validation(required = true)
        public String alarmEventType;

        @NameInMap("AlarmEventName")
        @Validation(required = true)
        public String alarmEventName;

        @NameInMap("AlarmUniqueInfo")
        @Validation(required = true)
        public String alarmUniqueInfo;

        @NameInMap("AlarmEventNameDisplay")
        @Validation(required = true)
        public String alarmEventNameDisplay;

        @NameInMap("AlarmEventTypeDisplay")
        @Validation(required = true)
        public String alarmEventTypeDisplay;

        @NameInMap("Details")
        @Validation(required = true)
        public java.util.List<DescribeSuspEventsResponseSuspEventsDetails> details;

        public static DescribeSuspEventsResponseSuspEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseSuspEvents self = new DescribeSuspEventsResponseSuspEvents();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseSuspEvents setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSuspEventsResponseSuspEvents setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeSuspEventsResponseSuspEvents setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeSuspEventsResponseSuspEvents setLastTime(String lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public String getLastTime() {
            return this.lastTime;
        }

        public DescribeSuspEventsResponseSuspEvents setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeSuspEventsResponseSuspEvents setUniqueInfo(String uniqueInfo) {
            this.uniqueInfo = uniqueInfo;
            return this;
        }
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

        public DescribeSuspEventsResponseSuspEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventsResponseSuspEvents setEventSubType(String eventSubType) {
            this.eventSubType = eventSubType;
            return this;
        }
        public String getEventSubType() {
            return this.eventSubType;
        }

        public DescribeSuspEventsResponseSuspEvents setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeSuspEventsResponseSuspEvents setEventStatus(Integer eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public Integer getEventStatus() {
            return this.eventStatus;
        }

        public DescribeSuspEventsResponseSuspEvents setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeSuspEventsResponseSuspEvents setOperateMsg(String operateMsg) {
            this.operateMsg = operateMsg;
            return this;
        }
        public String getOperateMsg() {
            return this.operateMsg;
        }

        public DescribeSuspEventsResponseSuspEvents setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public DescribeSuspEventsResponseSuspEvents setOperateErrorCode(String operateErrorCode) {
            this.operateErrorCode = operateErrorCode;
            return this;
        }
        public String getOperateErrorCode() {
            return this.operateErrorCode;
        }

        public DescribeSuspEventsResponseSuspEvents setCanCancelFault(Boolean canCancelFault) {
            this.canCancelFault = canCancelFault;
            return this;
        }
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        public DescribeSuspEventsResponseSuspEvents setCanBeDealOnLine(String canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }
        public String getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        public DescribeSuspEventsResponseSuspEvents setAlarmEventType(String alarmEventType) {
            this.alarmEventType = alarmEventType;
            return this;
        }
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        public DescribeSuspEventsResponseSuspEvents setAlarmEventName(String alarmEventName) {
            this.alarmEventName = alarmEventName;
            return this;
        }
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        public DescribeSuspEventsResponseSuspEvents setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public DescribeSuspEventsResponseSuspEvents setAlarmEventNameDisplay(String alarmEventNameDisplay) {
            this.alarmEventNameDisplay = alarmEventNameDisplay;
            return this;
        }
        public String getAlarmEventNameDisplay() {
            return this.alarmEventNameDisplay;
        }

        public DescribeSuspEventsResponseSuspEvents setAlarmEventTypeDisplay(String alarmEventTypeDisplay) {
            this.alarmEventTypeDisplay = alarmEventTypeDisplay;
            return this;
        }
        public String getAlarmEventTypeDisplay() {
            return this.alarmEventTypeDisplay;
        }

        public DescribeSuspEventsResponseSuspEvents setDetails(java.util.List<DescribeSuspEventsResponseSuspEventsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<DescribeSuspEventsResponseSuspEventsDetails> getDetails() {
            return this.details;
        }

    }

}
