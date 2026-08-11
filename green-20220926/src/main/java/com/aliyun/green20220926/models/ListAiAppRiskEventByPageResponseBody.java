// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAiAppRiskEventByPageResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListAiAppRiskEventByPageResponseBodyItems> items;

    /**
     * <p>The maximum number of results returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. An empty value indicates that no more pages exist.</p>
     * 
     * <strong>example:</strong>
     * <p>1a320d468c75e987f297484532c16e34d0ab6e7e43f8b73d</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAiAppRiskEventByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAiAppRiskEventByPageResponseBody self = new ListAiAppRiskEventByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAiAppRiskEventByPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAiAppRiskEventByPageResponseBody setItems(java.util.List<ListAiAppRiskEventByPageResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAiAppRiskEventByPageResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAiAppRiskEventByPageResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAiAppRiskEventByPageResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAiAppRiskEventByPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAiAppRiskEventByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAiAppRiskEventByPageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAiAppRiskEventByPageResponseBodyItems extends TeaModel {
        /**
         * <p>The unique ID of the AI application.</p>
         * 
         * <strong>example:</strong>
         * <p>id-xxx</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the AI application.</p>
         * 
         * <strong>example:</strong>
         * <p>name-xxx</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The channel source.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The end time that indicates when the event was resolved.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-10 11:42:31</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The event code that identifies the type or category of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>de_aamexg3015</p>
         */
        @NameInMap("EventCode")
        public String eventCode;

        /**
         * <p>The detailed description of the risk event.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("EventDesc")
        public String eventDesc;

        /**
         * <p>The detailed description of the risk event in English.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("EventDescEn")
        public String eventDescEn;

        /**
         * <p>The event ID that uniquely identifies a risk event.</p>
         * 
         * <strong>example:</strong>
         * <p>e-a7gvnv3vid536dfxj</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The brief name that describes the risk event.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The time when the event was handled.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-10 11:42:31</p>
         */
        @NameInMap("HandleTime")
        public String handleTime;

        /**
         * <p>The label used to mark or categorize the event.</p>
         * 
         * <strong>example:</strong>
         * <p>label-03</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The detailed description of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("LabelDesc")
        public String labelDesc;

        /**
         * <p>The risk level that indicates the severity of the event, such as high, medium, or low.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The start time that indicates when the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-21 15:30:19</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The event status that indicates the current processing state of the event, such as pending or resolved.</p>
         * 
         * <strong>example:</strong>
         * <p>resolved</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The event type that indicates the category of the risk event, such as security or performance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAiAppRiskEventByPageResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAiAppRiskEventByPageResponseBodyItems self = new ListAiAppRiskEventByPageResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAiAppRiskEventByPageResponseBodyItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setEventDesc(String eventDesc) {
            this.eventDesc = eventDesc;
            return this;
        }
        public String getEventDesc() {
            return this.eventDesc;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setEventDescEn(String eventDescEn) {
            this.eventDescEn = eventDescEn;
            return this;
        }
        public String getEventDescEn() {
            return this.eventDescEn;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setHandleTime(String handleTime) {
            this.handleTime = handleTime;
            return this;
        }
        public String getHandleTime() {
            return this.handleTime;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setLabelDesc(String labelDesc) {
            this.labelDesc = labelDesc;
            return this;
        }
        public String getLabelDesc() {
            return this.labelDesc;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAiAppRiskEventByPageResponseBodyItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
