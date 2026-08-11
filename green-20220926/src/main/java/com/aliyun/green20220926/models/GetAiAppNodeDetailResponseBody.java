// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppNodeDetailResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>id-xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The channel information.</p>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The list of event data.</p>
     */
    @NameInMap("EventData")
    public java.util.List<GetAiAppNodeDetailResponseBodyEventData> eventData;

    /**
     * <p>The node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>node-xxx</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The node name.</p>
     * 
     * <strong>example:</strong>
     * <p>namexxx</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The node type.</p>
     * 
     * <strong>example:</strong>
     * <p>TOOL</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The risk level.</p>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    public static GetAiAppNodeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppNodeDetailResponseBody self = new GetAiAppNodeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiAppNodeDetailResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAiAppNodeDetailResponseBody setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetAiAppNodeDetailResponseBody setEventData(java.util.List<GetAiAppNodeDetailResponseBodyEventData> eventData) {
        this.eventData = eventData;
        return this;
    }
    public java.util.List<GetAiAppNodeDetailResponseBodyEventData> getEventData() {
        return this.eventData;
    }

    public GetAiAppNodeDetailResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetAiAppNodeDetailResponseBody setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public GetAiAppNodeDetailResponseBody setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public GetAiAppNodeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiAppNodeDetailResponseBody setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public static class GetAiAppNodeDetailResponseBodyEventDataLabels extends TeaModel {
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
         * <p>porn desc</p>
         */
        @NameInMap("LabelDesc")
        public String labelDesc;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static GetAiAppNodeDetailResponseBodyEventDataLabels build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppNodeDetailResponseBodyEventDataLabels self = new GetAiAppNodeDetailResponseBodyEventDataLabels();
            return TeaModel.build(map, self);
        }

        public GetAiAppNodeDetailResponseBodyEventDataLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAiAppNodeDetailResponseBodyEventDataLabels setLabelDesc(String labelDesc) {
            this.labelDesc = labelDesc;
            return this;
        }
        public String getLabelDesc() {
            return this.labelDesc;
        }

        public GetAiAppNodeDetailResponseBodyEventDataLabels setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetAiAppNodeDetailResponseBodyEventData extends TeaModel {
        /**
         * <p>The channel.</p>
         * 
         * <strong>example:</strong>
         * <p>bailian</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The list of labels.</p>
         */
        @NameInMap("Labels")
        public java.util.List<GetAiAppNodeDetailResponseBodyEventDataLabels> labels;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The time when the event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 16:08:38</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The trace ID, which is used to query the exact call information.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>hit_sensitive_data</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetAiAppNodeDetailResponseBodyEventData build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppNodeDetailResponseBodyEventData self = new GetAiAppNodeDetailResponseBodyEventData();
            return TeaModel.build(map, self);
        }

        public GetAiAppNodeDetailResponseBodyEventData setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public GetAiAppNodeDetailResponseBodyEventData setLabels(java.util.List<GetAiAppNodeDetailResponseBodyEventDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<GetAiAppNodeDetailResponseBodyEventDataLabels> getLabels() {
            return this.labels;
        }

        public GetAiAppNodeDetailResponseBodyEventData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAiAppNodeDetailResponseBodyEventData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetAiAppNodeDetailResponseBodyEventData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public GetAiAppNodeDetailResponseBodyEventData setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetAiAppNodeDetailResponseBodyEventData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
