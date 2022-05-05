// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ExploreTraceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpanVOs")
    public java.util.List<ExploreTraceResponseBodySpanVOs> spanVOs;

    public static ExploreTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExploreTraceResponseBody self = new ExploreTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public ExploreTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExploreTraceResponseBody setSpanVOs(java.util.List<ExploreTraceResponseBodySpanVOs> spanVOs) {
        this.spanVOs = spanVOs;
        return this;
    }
    public java.util.List<ExploreTraceResponseBodySpanVOs> getSpanVOs() {
        return this.spanVOs;
    }

    public static class ExploreTraceResponseBodySpanVOs extends TeaModel {
        @NameInMap("Attributes")
        public java.util.Map<String, String> attributes;

        @NameInMap("Children")
        public java.util.List<String> children;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Events")
        public String events;

        @NameInMap("HiddenAttributes")
        public java.util.Map<String, String> hiddenAttributes;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Kind")
        public String kind;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("Links")
        public String links;

        @NameInMap("Meta")
        public java.util.Map<String, String> meta;

        @NameInMap("ParentSpanId")
        public String parentSpanId;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Resource")
        public java.util.Map<String, String> resource;

        @NameInMap("SampleIds")
        public String sampleIds;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("SpanId")
        public String spanId;

        @NameInMap("SpanName")
        public String spanName;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("StatusCode")
        public Integer statusCode;

        @NameInMap("StatusMessage")
        public String statusMessage;

        @NameInMap("TraceId")
        public String traceId;

        public static ExploreTraceResponseBodySpanVOs build(java.util.Map<String, ?> map) throws Exception {
            ExploreTraceResponseBodySpanVOs self = new ExploreTraceResponseBodySpanVOs();
            return TeaModel.build(map, self);
        }

        public ExploreTraceResponseBodySpanVOs setAttributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, String> getAttributes() {
            return this.attributes;
        }

        public ExploreTraceResponseBodySpanVOs setChildren(java.util.List<String> children) {
            this.children = children;
            return this;
        }
        public java.util.List<String> getChildren() {
            return this.children;
        }

        public ExploreTraceResponseBodySpanVOs setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ExploreTraceResponseBodySpanVOs setEvents(String events) {
            this.events = events;
            return this;
        }
        public String getEvents() {
            return this.events;
        }

        public ExploreTraceResponseBodySpanVOs setHiddenAttributes(java.util.Map<String, String> hiddenAttributes) {
            this.hiddenAttributes = hiddenAttributes;
            return this;
        }
        public java.util.Map<String, String> getHiddenAttributes() {
            return this.hiddenAttributes;
        }

        public ExploreTraceResponseBodySpanVOs setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ExploreTraceResponseBodySpanVOs setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ExploreTraceResponseBodySpanVOs setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ExploreTraceResponseBodySpanVOs setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public ExploreTraceResponseBodySpanVOs setLinks(String links) {
            this.links = links;
            return this;
        }
        public String getLinks() {
            return this.links;
        }

        public ExploreTraceResponseBodySpanVOs setMeta(java.util.Map<String, String> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, String> getMeta() {
            return this.meta;
        }

        public ExploreTraceResponseBodySpanVOs setParentSpanId(String parentSpanId) {
            this.parentSpanId = parentSpanId;
            return this;
        }
        public String getParentSpanId() {
            return this.parentSpanId;
        }

        public ExploreTraceResponseBodySpanVOs setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public ExploreTraceResponseBodySpanVOs setResource(java.util.Map<String, String> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.Map<String, String> getResource() {
            return this.resource;
        }

        public ExploreTraceResponseBodySpanVOs setSampleIds(String sampleIds) {
            this.sampleIds = sampleIds;
            return this;
        }
        public String getSampleIds() {
            return this.sampleIds;
        }

        public ExploreTraceResponseBodySpanVOs setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ExploreTraceResponseBodySpanVOs setSpanId(String spanId) {
            this.spanId = spanId;
            return this;
        }
        public String getSpanId() {
            return this.spanId;
        }

        public ExploreTraceResponseBodySpanVOs setSpanName(String spanName) {
            this.spanName = spanName;
            return this;
        }
        public String getSpanName() {
            return this.spanName;
        }

        public ExploreTraceResponseBodySpanVOs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ExploreTraceResponseBodySpanVOs setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public ExploreTraceResponseBodySpanVOs setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public ExploreTraceResponseBodySpanVOs setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
