// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryTracesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceLists")
    public java.util.List<QueryTracesResponseBodyTraceLists> traceLists;

    public static QueryTracesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTracesResponseBody self = new QueryTracesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTracesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTracesResponseBody setTraceLists(java.util.List<QueryTracesResponseBodyTraceLists> traceLists) {
        this.traceLists = traceLists;
        return this;
    }
    public java.util.List<QueryTracesResponseBodyTraceLists> getTraceLists() {
        return this.traceLists;
    }

    public static class QueryTracesResponseBodyTraceLists extends TeaModel {
        @NameInMap("Attributes")
        public java.util.Map<String, String> attributes;

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

        @NameInMap("Links")
        public String links;

        @NameInMap("ParentSpanId")
        public String parentSpanId;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Resources")
        public java.util.Map<String, String> resources;

        @NameInMap("SampleIds")
        public String sampleIds;

        @NameInMap("ServiceName")
        public Long serviceName;

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

        public static QueryTracesResponseBodyTraceLists build(java.util.Map<String, ?> map) throws Exception {
            QueryTracesResponseBodyTraceLists self = new QueryTracesResponseBodyTraceLists();
            return TeaModel.build(map, self);
        }

        public QueryTracesResponseBodyTraceLists setAttributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.Map<String, String> getAttributes() {
            return this.attributes;
        }

        public QueryTracesResponseBodyTraceLists setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryTracesResponseBodyTraceLists setEvents(String events) {
            this.events = events;
            return this;
        }
        public String getEvents() {
            return this.events;
        }

        public QueryTracesResponseBodyTraceLists setHiddenAttributes(java.util.Map<String, String> hiddenAttributes) {
            this.hiddenAttributes = hiddenAttributes;
            return this;
        }
        public java.util.Map<String, String> getHiddenAttributes() {
            return this.hiddenAttributes;
        }

        public QueryTracesResponseBodyTraceLists setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public QueryTracesResponseBodyTraceLists setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryTracesResponseBodyTraceLists setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public QueryTracesResponseBodyTraceLists setLinks(String links) {
            this.links = links;
            return this;
        }
        public String getLinks() {
            return this.links;
        }

        public QueryTracesResponseBodyTraceLists setParentSpanId(String parentSpanId) {
            this.parentSpanId = parentSpanId;
            return this;
        }
        public String getParentSpanId() {
            return this.parentSpanId;
        }

        public QueryTracesResponseBodyTraceLists setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public QueryTracesResponseBodyTraceLists setResources(java.util.Map<String, String> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.Map<String, String> getResources() {
            return this.resources;
        }

        public QueryTracesResponseBodyTraceLists setSampleIds(String sampleIds) {
            this.sampleIds = sampleIds;
            return this;
        }
        public String getSampleIds() {
            return this.sampleIds;
        }

        public QueryTracesResponseBodyTraceLists setServiceName(Long serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Long getServiceName() {
            return this.serviceName;
        }

        public QueryTracesResponseBodyTraceLists setSpanId(String spanId) {
            this.spanId = spanId;
            return this;
        }
        public String getSpanId() {
            return this.spanId;
        }

        public QueryTracesResponseBodyTraceLists setSpanName(String spanName) {
            this.spanName = spanName;
            return this;
        }
        public String getSpanName() {
            return this.spanName;
        }

        public QueryTracesResponseBodyTraceLists setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryTracesResponseBodyTraceLists setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public QueryTracesResponseBodyTraceLists setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public QueryTracesResponseBodyTraceLists setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
