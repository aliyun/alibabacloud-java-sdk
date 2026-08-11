// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppTraceDetailResponseBody extends TeaModel {
    /**
     * <p>The AI analysis result.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Analysis")
    public String analysis;

    /**
     * <p>The application ID.</p>
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
     * <p>appxxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The application channel.</p>
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
    public java.util.List<GetAiAppTraceDetailResponseBodyLabels> labels;

    /**
     * <p>The backend-assigned ID that uniquely identifies a request. You can use this ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The trace ID used to correlate and track alert events.</p>
     * 
     * <strong>example:</strong>
     * <p>0abb7ee117615311812886711e0a15</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    /**
     * <p>The alert time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 16:08:38</p>
     */
    @NameInMap("WarningTime")
    public String warningTime;

    public static GetAiAppTraceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppTraceDetailResponseBody self = new GetAiAppTraceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiAppTraceDetailResponseBody setAnalysis(String analysis) {
        this.analysis = analysis;
        return this;
    }
    public String getAnalysis() {
        return this.analysis;
    }

    public GetAiAppTraceDetailResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAiAppTraceDetailResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAiAppTraceDetailResponseBody setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetAiAppTraceDetailResponseBody setLabels(java.util.List<GetAiAppTraceDetailResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<GetAiAppTraceDetailResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public GetAiAppTraceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiAppTraceDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public GetAiAppTraceDetailResponseBody setWarningTime(String warningTime) {
        this.warningTime = warningTime;
        return this;
    }
    public String getWarningTime() {
        return this.warningTime;
    }

    public static class GetAiAppTraceDetailResponseBodyLabels extends TeaModel {
        /**
         * <p>The count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Long count;

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

        public static GetAiAppTraceDetailResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetAiAppTraceDetailResponseBodyLabels self = new GetAiAppTraceDetailResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetAiAppTraceDetailResponseBodyLabels setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetAiAppTraceDetailResponseBodyLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAiAppTraceDetailResponseBodyLabels setLabelDesc(String labelDesc) {
            this.labelDesc = labelDesc;
            return this;
        }
        public String getLabelDesc() {
            return this.labelDesc;
        }

        public GetAiAppTraceDetailResponseBodyLabels setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
