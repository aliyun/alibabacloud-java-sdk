// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppDetailResponseBody extends TeaModel {
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
     * <p>app-xxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The chart.</p>
     */
    @NameInMap("Chart")
    public GetAiAppDetailResponseBodyChart chart;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The risk events.</p>
     */
    @NameInMap("RiskEvents")
    public java.util.List<GetAiAppDetailResponseBodyRiskEvents> riskEvents;

    /**
     * <p>The score.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Score")
    public Integer score;

    /**
     * <p>UID。</p>
     * 
     * <strong>example:</strong>
     * <p>17726*****370735</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static GetAiAppDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppDetailResponseBody self = new GetAiAppDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiAppDetailResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAiAppDetailResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAiAppDetailResponseBody setChart(GetAiAppDetailResponseBodyChart chart) {
        this.chart = chart;
        return this;
    }
    public GetAiAppDetailResponseBodyChart getChart() {
        return this.chart;
    }

    public GetAiAppDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiAppDetailResponseBody setRiskEvents(java.util.List<GetAiAppDetailResponseBodyRiskEvents> riskEvents) {
        this.riskEvents = riskEvents;
        return this;
    }
    public java.util.List<GetAiAppDetailResponseBodyRiskEvents> getRiskEvents() {
        return this.riskEvents;
    }

    public GetAiAppDetailResponseBody setScore(Integer score) {
        this.score = score;
        return this;
    }
    public Integer getScore() {
        return this.score;
    }

    public GetAiAppDetailResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class GetAiAppDetailResponseBodyChartY extends TeaModel {
        /**
         * <p>The returned collection.</p>
         */
        @NameInMap("Data")
        public java.util.List<Long> data;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>score</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetAiAppDetailResponseBodyChartY build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppDetailResponseBodyChartY self = new GetAiAppDetailResponseBodyChartY();
            return TeaModel.build(map, self);
        }

        public GetAiAppDetailResponseBodyChartY setData(java.util.List<Long> data) {
            this.data = data;
            return this;
        }
        public java.util.List<Long> getData() {
            return this.data;
        }

        public GetAiAppDetailResponseBodyChartY setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAiAppDetailResponseBodyChart extends TeaModel {
        /**
         * <p>The X value of the coordinate point.</p>
         */
        @NameInMap("X")
        public java.util.List<String> x;

        /**
         * <p>The Y value of the coordinate point.</p>
         */
        @NameInMap("Y")
        public java.util.List<GetAiAppDetailResponseBodyChartY> y;

        public static GetAiAppDetailResponseBodyChart build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppDetailResponseBodyChart self = new GetAiAppDetailResponseBodyChart();
            return TeaModel.build(map, self);
        }

        public GetAiAppDetailResponseBodyChart setX(java.util.List<String> x) {
            this.x = x;
            return this;
        }
        public java.util.List<String> getX() {
            return this.x;
        }

        public GetAiAppDetailResponseBodyChart setY(java.util.List<GetAiAppDetailResponseBodyChartY> y) {
            this.y = y;
            return this;
        }
        public java.util.List<GetAiAppDetailResponseBodyChartY> getY() {
            return this.y;
        }

    }

    public static class GetAiAppDetailResponseBodyRiskEventsLabels extends TeaModel {
        /**
         * <p>The labels.</p>
         * 
         * <strong>example:</strong>
         * <p>inappropriate_profanity</p>
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
         * <p>contentModeration</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetAiAppDetailResponseBodyRiskEventsLabels build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppDetailResponseBodyRiskEventsLabels self = new GetAiAppDetailResponseBodyRiskEventsLabels();
            return TeaModel.build(map, self);
        }

        public GetAiAppDetailResponseBodyRiskEventsLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAiAppDetailResponseBodyRiskEventsLabels setLabelDesc(String labelDesc) {
            this.labelDesc = labelDesc;
            return this;
        }
        public String getLabelDesc() {
            return this.labelDesc;
        }

        public GetAiAppDetailResponseBodyRiskEventsLabels setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetAiAppDetailResponseBodyRiskEvents extends TeaModel {
        /**
         * <p>The risk event code.</p>
         * 
         * <strong>example:</strong>
         * <p>hit_xxx</p>
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
         * <p>The labels.</p>
         */
        @NameInMap("Labels")
        public java.util.List<GetAiAppDetailResponseBodyRiskEventsLabels> labels;

        public static GetAiAppDetailResponseBodyRiskEvents build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppDetailResponseBodyRiskEvents self = new GetAiAppDetailResponseBodyRiskEvents();
            return TeaModel.build(map, self);
        }

        public GetAiAppDetailResponseBodyRiskEvents setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public GetAiAppDetailResponseBodyRiskEvents setEventCount(Long eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Long getEventCount() {
            return this.eventCount;
        }

        public GetAiAppDetailResponseBodyRiskEvents setEventIds(java.util.List<String> eventIds) {
            this.eventIds = eventIds;
            return this;
        }
        public java.util.List<String> getEventIds() {
            return this.eventIds;
        }

        public GetAiAppDetailResponseBodyRiskEvents setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public GetAiAppDetailResponseBodyRiskEvents setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public String getEventStatus() {
            return this.eventStatus;
        }

        public GetAiAppDetailResponseBodyRiskEvents setLabels(java.util.List<GetAiAppDetailResponseBodyRiskEventsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<GetAiAppDetailResponseBodyRiskEventsLabels> getLabels() {
            return this.labels;
        }

    }

}
