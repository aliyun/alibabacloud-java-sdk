// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAiAppRiskEventResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAiAppRiskEventResponseBodyData> data;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. This ID can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAiAppRiskEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAiAppRiskEventResponseBody self = new ListAiAppRiskEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAiAppRiskEventResponseBody setData(java.util.List<ListAiAppRiskEventResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAiAppRiskEventResponseBodyData> getData() {
        return this.data;
    }

    public ListAiAppRiskEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAiAppRiskEventResponseBodyData extends TeaModel {
        /**
         * <p>The end time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-25 10:22:02</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The event code that identifies the type or category of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>hit-xxxx</p>
         */
        @NameInMap("EventCode")
        public String eventCode;

        /**
         * <p>The event description that provides details about the risk event.</p>
         * 
         * <strong>example:</strong>
         * <p>desc-xxx</p>
         */
        @NameInMap("EventDesc")
        public String eventDesc;

        /**
         * <p>The event description in English.</p>
         * 
         * <strong>example:</strong>
         * <p>desc-xxx</p>
         */
        @NameInMap("EventDescEn")
        public String eventDescEn;

        /**
         * <p>The event ID that uniquely identifies a risk event.</p>
         * 
         * <strong>example:</strong>
         * <p>id-xxx</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The event name that briefly describes the risk event.</p>
         * 
         * <strong>example:</strong>
         * <p>name-xxx</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The label used to mark or categorize the event.</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The label description that provides details about the label.</p>
         * 
         * <strong>example:</strong>
         * <p>desc-xxx</p>
         */
        @NameInMap("LabelDesc")
        public String labelDesc;

        /**
         * <p>The risk level that indicates the severity of the event, such as high, medium, or low.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The effective period. Format: YYYY-MM-DD HH:mm:ss (default time zone: UTC+08:00).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-22 16:41:15</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The event status that indicates the current processing state of the event, such as pending or resolved.</p>
         * 
         * <strong>example:</strong>
         * <p>resovled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The event type that indicates the category of the risk event, such as security or performance.</p>
         * 
         * <strong>example:</strong>
         * <p>sensitiveData</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAiAppRiskEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAiAppRiskEventResponseBodyData self = new ListAiAppRiskEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAiAppRiskEventResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListAiAppRiskEventResponseBodyData setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public ListAiAppRiskEventResponseBodyData setEventDesc(String eventDesc) {
            this.eventDesc = eventDesc;
            return this;
        }
        public String getEventDesc() {
            return this.eventDesc;
        }

        public ListAiAppRiskEventResponseBodyData setEventDescEn(String eventDescEn) {
            this.eventDescEn = eventDescEn;
            return this;
        }
        public String getEventDescEn() {
            return this.eventDescEn;
        }

        public ListAiAppRiskEventResponseBodyData setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public ListAiAppRiskEventResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public ListAiAppRiskEventResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListAiAppRiskEventResponseBodyData setLabelDesc(String labelDesc) {
            this.labelDesc = labelDesc;
            return this;
        }
        public String getLabelDesc() {
            return this.labelDesc;
        }

        public ListAiAppRiskEventResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListAiAppRiskEventResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAiAppRiskEventResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAiAppRiskEventResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
