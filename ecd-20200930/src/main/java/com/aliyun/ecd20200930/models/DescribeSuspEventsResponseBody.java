// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the exceptions.</p>
     */
    @NameInMap("SuspEvents")
    public java.util.List<DescribeSuspEventsResponseBodySuspEvents> suspEvents;

    /**
     * <p>The total number of exceptions returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSuspEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsResponseBody self = new DescribeSuspEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventsResponseBody setSuspEvents(java.util.List<DescribeSuspEventsResponseBodySuspEvents> suspEvents) {
        this.suspEvents = suspEvents;
        return this;
    }
    public java.util.List<DescribeSuspEventsResponseBodySuspEvents> getSuspEvents() {
        return this.suspEvents;
    }

    public DescribeSuspEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSuspEventsResponseBodySuspEventsDetails extends TeaModel {
        /**
         * <p>The original property name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The property name that is displayed after the Name parameter was translated.</p>
         */
        @NameInMap("NameDisplay")
        public String nameDisplay;

        /**
         * <p>The format in which the property value is displayed. The property value can be a string or displayed in the HTML or Markdown format.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The property value.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The property value that is displayed after the Value parameter was translated.</p>
         */
        @NameInMap("ValueDisplay")
        public String valueDisplay;

        public static DescribeSuspEventsResponseBodySuspEventsDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodySuspEventsDetails self = new DescribeSuspEventsResponseBodySuspEventsDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setNameDisplay(String nameDisplay) {
            this.nameDisplay = nameDisplay;
            return this;
        }
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setValueDisplay(String valueDisplay) {
            this.valueDisplay = valueDisplay;
            return this;
        }
        public String getValueDisplay() {
            return this.valueDisplay;
        }

    }

    public static class DescribeSuspEventsResponseBodySuspEvents extends TeaModel {
        /**
         * <p>The name of the alert event to which the exception belongs.</p>
         */
        @NameInMap("AlarmEventName")
        public String alarmEventName;

        /**
         * <p>The description of the alert event with which the exception is associated.</p>
         */
        @NameInMap("AlarmEventNameDisplay")
        public String alarmEventNameDisplay;

        /**
         * <p>The type of the alert event to which the exception belongs.</p>
         */
        @NameInMap("AlarmEventType")
        public String alarmEventType;

        /**
         * <p>The description of the alert event to which the exception belongs.</p>
         */
        @NameInMap("AlarmEventTypeDisplay")
        public String alarmEventTypeDisplay;

        /**
         * <p>The ID of the alert event to which the exception belongs.</p>
         */
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        /**
         * <p>Indicates whether the exception can be processed online. Valid values:</p>
         * <br>
         * <p>*   true: The exception can be processed online.</p>
         * <p>*   false: The exception cannot be processed online.</p>
         */
        @NameInMap("CanBeDealOnLine")
        public String canBeDealOnLine;

        /**
         * <p>Indicates whether the exception can be ignored. Valid values:</p>
         * <br>
         * <p>*   true: The exception can be ignored.</p>
         * <p>*   false: The exception cannot be ignored.</p>
         */
        @NameInMap("CanCancelFault")
        public Boolean canCancelFault;

        /**
         * <p>The source of data. This parameter can be ignored.</p>
         */
        @NameInMap("DataSource")
        public String dataSource;

        /**
         * <p>The impact of the exception.</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The ID of the affected cloud desktop.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the affected cloud desktop.</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>Details of the exceptions.</p>
         */
        @NameInMap("Details")
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsDetails> details;

        /**
         * <p>The state of the exception. Valid values:</p>
         * <br>
         * <p>*   1: PENDING</p>
         * <p>*   2: IGNORE</p>
         * <p>*   4: HANDLED</p>
         * <p>*   8: FAULT</p>
         * <p>*   16: DEALING</p>
         * <p>*   32: DONE</p>
         * <p>*   64: EXPIRE</p>
         */
        @NameInMap("EventStatus")
        public Integer eventStatus;

        /**
         * <p>The name of the exception.</p>
         */
        @NameInMap("EventSubType")
        public String eventSubType;

        /**
         * <p>The ID of the exception.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The time when the last exception occurred.</p>
         */
        @NameInMap("LastTime")
        public String lastTime;

        /**
         * <p>The severity of the exception. Valid values:</p>
         * <br>
         * <p>*   serious: The exception is urgent.</p>
         * <p>*   suspicious: The exception is a warning</p>
         * <p>*   remind: The exception is a suggestion.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The full name of the exception.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the exception first occurred.</p>
         */
        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        /**
         * <p>The handling result code of the exception.</p>
         */
        @NameInMap("OperateErrorCode")
        public String operateErrorCode;

        /**
         * <p>The handling remarks on the exception.</p>
         */
        @NameInMap("OperateMsg")
        public String operateMsg;

        /**
         * <p>The ID of the exception.</p>
         */
        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        public static DescribeSuspEventsResponseBodySuspEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodySuspEvents self = new DescribeSuspEventsResponseBodySuspEvents();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmEventName(String alarmEventName) {
            this.alarmEventName = alarmEventName;
            return this;
        }
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmEventNameDisplay(String alarmEventNameDisplay) {
            this.alarmEventNameDisplay = alarmEventNameDisplay;
            return this;
        }
        public String getAlarmEventNameDisplay() {
            return this.alarmEventNameDisplay;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmEventType(String alarmEventType) {
            this.alarmEventType = alarmEventType;
            return this;
        }
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmEventTypeDisplay(String alarmEventTypeDisplay) {
            this.alarmEventTypeDisplay = alarmEventTypeDisplay;
            return this;
        }
        public String getAlarmEventTypeDisplay() {
            return this.alarmEventTypeDisplay;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public DescribeSuspEventsResponseBodySuspEvents setCanBeDealOnLine(String canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }
        public String getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        public DescribeSuspEventsResponseBodySuspEvents setCanCancelFault(Boolean canCancelFault) {
            this.canCancelFault = canCancelFault;
            return this;
        }
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDetails(java.util.List<DescribeSuspEventsResponseBodySuspEventsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsDetails> getDetails() {
            return this.details;
        }

        public DescribeSuspEventsResponseBodySuspEvents setEventStatus(Integer eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public Integer getEventStatus() {
            return this.eventStatus;
        }

        public DescribeSuspEventsResponseBodySuspEvents setEventSubType(String eventSubType) {
            this.eventSubType = eventSubType;
            return this;
        }
        public String getEventSubType() {
            return this.eventSubType;
        }

        public DescribeSuspEventsResponseBodySuspEvents setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSuspEventsResponseBodySuspEvents setLastTime(String lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public String getLastTime() {
            return this.lastTime;
        }

        public DescribeSuspEventsResponseBodySuspEvents setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeSuspEventsResponseBodySuspEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOperateErrorCode(String operateErrorCode) {
            this.operateErrorCode = operateErrorCode;
            return this;
        }
        public String getOperateErrorCode() {
            return this.operateErrorCode;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOperateMsg(String operateMsg) {
            this.operateMsg = operateMsg;
            return this;
        }
        public String getOperateMsg() {
            return this.operateMsg;
        }

        public DescribeSuspEventsResponseBodySuspEvents setUniqueInfo(String uniqueInfo) {
            this.uniqueInfo = uniqueInfo;
            return this;
        }
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

    }

}
