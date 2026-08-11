// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAiAppByPageResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data on the current page.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListAiAppByPageResponseBodyItems> items;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAiAppByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAiAppByPageResponseBody self = new ListAiAppByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAiAppByPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAiAppByPageResponseBody setItems(java.util.List<ListAiAppByPageResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAiAppByPageResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAiAppByPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAiAppByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAiAppByPageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAiAppByPageResponseBodyItemsRiskEventsLabels extends TeaModel {
        /**
         * <p>The label name.</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The label description.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("LabelDesc")
        public String labelDesc;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>sensitiveData</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAiAppByPageResponseBodyItemsRiskEventsLabels build(java.util.Map<String, ?> map) throws Exception {
            ListAiAppByPageResponseBodyItemsRiskEventsLabels self = new ListAiAppByPageResponseBodyItemsRiskEventsLabels();
            return TeaModel.build(map, self);
        }

        public ListAiAppByPageResponseBodyItemsRiskEventsLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListAiAppByPageResponseBodyItemsRiskEventsLabels setLabelDesc(String labelDesc) {
            this.labelDesc = labelDesc;
            return this;
        }
        public String getLabelDesc() {
            return this.labelDesc;
        }

        public ListAiAppByPageResponseBodyItemsRiskEventsLabels setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListAiAppByPageResponseBodyItemsRiskEvents extends TeaModel {
        /**
         * <p>The risk event code.</p>
         * 
         * <strong>example:</strong>
         * <p>hit-xxx</p>
         */
        @NameInMap("EventCode")
        public String eventCode;

        /**
         * <p>The number of events.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EventCount")
        public Long eventCount;

        /**
         * <p>The event descriptions.</p>
         */
        @NameInMap("EventDescs")
        public java.util.List<String> eventDescs;

        /**
         * <p>The list of risk event IDs.</p>
         */
        @NameInMap("EventIds")
        public java.util.List<String> eventIds;

        /**
         * <p>The risk event name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li><strong>unhandled</strong>: Not handled.</li>
         * <li><strong>resolved</strong>: Handled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>resolved</p>
         */
        @NameInMap("EventStatus")
        public String eventStatus;

        /**
         * <p>The list of label items.</p>
         */
        @NameInMap("Labels")
        public java.util.List<ListAiAppByPageResponseBodyItemsRiskEventsLabels> labels;

        public static ListAiAppByPageResponseBodyItemsRiskEvents build(java.util.Map<String, ?> map) throws Exception {
            ListAiAppByPageResponseBodyItemsRiskEvents self = new ListAiAppByPageResponseBodyItemsRiskEvents();
            return TeaModel.build(map, self);
        }

        public ListAiAppByPageResponseBodyItemsRiskEvents setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public ListAiAppByPageResponseBodyItemsRiskEvents setEventCount(Long eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Long getEventCount() {
            return this.eventCount;
        }

        public ListAiAppByPageResponseBodyItemsRiskEvents setEventDescs(java.util.List<String> eventDescs) {
            this.eventDescs = eventDescs;
            return this;
        }
        public java.util.List<String> getEventDescs() {
            return this.eventDescs;
        }

        public ListAiAppByPageResponseBodyItemsRiskEvents setEventIds(java.util.List<String> eventIds) {
            this.eventIds = eventIds;
            return this;
        }
        public java.util.List<String> getEventIds() {
            return this.eventIds;
        }

        public ListAiAppByPageResponseBodyItemsRiskEvents setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public ListAiAppByPageResponseBodyItemsRiskEvents setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public String getEventStatus() {
            return this.eventStatus;
        }

        public ListAiAppByPageResponseBodyItemsRiskEvents setLabels(java.util.List<ListAiAppByPageResponseBodyItemsRiskEventsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListAiAppByPageResponseBodyItemsRiskEventsLabels> getLabels() {
            return this.labels;
        }

    }

    public static class ListAiAppByPageResponseBodyItems extends TeaModel {
        /**
         * <p>appId。</p>
         * 
         * <strong>example:</strong>
         * <p>id-xxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>name-xxx</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The application status.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("AppStatus")
        public String appStatus;

        /**
         * <p>The channel.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The last active time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 00:00:00</p>
         */
        @NameInMap("LastTraceTime")
        public String lastTraceTime;

        /**
         * <p>The risk events.</p>
         */
        @NameInMap("RiskEvents")
        public java.util.List<ListAiAppByPageResponseBodyItemsRiskEvents> riskEvents;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The Tracing Analysis status.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("TraceStatus")
        public String traceStatus;

        /**
         * <p>UID。</p>
         * 
         * <strong>example:</strong>
         * <p>104813*****2399</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WarningCount")
        public Integer warningCount;

        public static ListAiAppByPageResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAiAppByPageResponseBodyItems self = new ListAiAppByPageResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAiAppByPageResponseBodyItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAiAppByPageResponseBodyItems setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAiAppByPageResponseBodyItems setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public ListAiAppByPageResponseBodyItems setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListAiAppByPageResponseBodyItems setLastTraceTime(String lastTraceTime) {
            this.lastTraceTime = lastTraceTime;
            return this;
        }
        public String getLastTraceTime() {
            return this.lastTraceTime;
        }

        public ListAiAppByPageResponseBodyItems setRiskEvents(java.util.List<ListAiAppByPageResponseBodyItemsRiskEvents> riskEvents) {
            this.riskEvents = riskEvents;
            return this;
        }
        public java.util.List<ListAiAppByPageResponseBodyItemsRiskEvents> getRiskEvents() {
            return this.riskEvents;
        }

        public ListAiAppByPageResponseBodyItems setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListAiAppByPageResponseBodyItems setTraceStatus(String traceStatus) {
            this.traceStatus = traceStatus;
            return this;
        }
        public String getTraceStatus() {
            return this.traceStatus;
        }

        public ListAiAppByPageResponseBodyItems setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListAiAppByPageResponseBodyItems setWarningCount(Integer warningCount) {
            this.warningCount = warningCount;
            return this;
        }
        public Integer getWarningCount() {
            return this.warningCount;
        }

    }

}
