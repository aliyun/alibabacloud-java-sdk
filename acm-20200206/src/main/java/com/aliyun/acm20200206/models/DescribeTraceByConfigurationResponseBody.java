// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeTraceByConfigurationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Traces")
    public java.util.List<DescribeTraceByConfigurationResponseBodyTraces> traces;

    @NameInMap("Code")
    public String code;

    public static DescribeTraceByConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceByConfigurationResponseBody self = new DescribeTraceByConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTraceByConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTraceByConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTraceByConfigurationResponseBody setTraces(java.util.List<DescribeTraceByConfigurationResponseBodyTraces> traces) {
        this.traces = traces;
        return this;
    }
    public java.util.List<DescribeTraceByConfigurationResponseBodyTraces> getTraces() {
        return this.traces;
    }

    public DescribeTraceByConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Delay")
        public String delay;

        @NameInMap("Ts")
        public String ts;

        @NameInMap("ResponseIp")
        public String responseIp;

        @NameInMap("Event")
        public String event;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("RequestIp")
        public String requestIp;

        @NameInMap("LogDate")
        public String logDate;

        @NameInMap("HandleIp")
        public String handleIp;

        @NameInMap("Group")
        public String group;

        public static DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails self = new DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails();
            return TeaModel.build(map, self);
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails setTs(String ts) {
            this.ts = ts;
            return this;
        }
        public String getTs() {
            return this.ts;
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails setResponseIp(String responseIp) {
            this.responseIp = responseIp;
            return this;
        }
        public String getResponseIp() {
            return this.responseIp;
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails setRequestIp(String requestIp) {
            this.requestIp = requestIp;
            return this;
        }
        public String getRequestIp() {
            return this.requestIp;
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails setLogDate(String logDate) {
            this.logDate = logDate;
            return this;
        }
        public String getLogDate() {
            return this.logDate;
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails setHandleIp(String handleIp) {
            this.handleIp = handleIp;
            return this;
        }
        public String getHandleIp() {
            return this.handleIp;
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class DescribeTraceByConfigurationResponseBodyTracesEventGroups extends TeaModel {
        @NameInMap("EventType")
        public String eventType;

        @NameInMap("EventDetails")
        public java.util.List<DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails> eventDetails;

        public static DescribeTraceByConfigurationResponseBodyTracesEventGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceByConfigurationResponseBodyTracesEventGroups self = new DescribeTraceByConfigurationResponseBodyTracesEventGroups();
            return TeaModel.build(map, self);
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroups setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeTraceByConfigurationResponseBodyTracesEventGroups setEventDetails(java.util.List<DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails> eventDetails) {
            this.eventDetails = eventDetails;
            return this;
        }
        public java.util.List<DescribeTraceByConfigurationResponseBodyTracesEventGroupsEventDetails> getEventDetails() {
            return this.eventDetails;
        }

    }

    public static class DescribeTraceByConfigurationResponseBodyTraces extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("EventGroups")
        public java.util.List<DescribeTraceByConfigurationResponseBodyTracesEventGroups> eventGroups;

        public static DescribeTraceByConfigurationResponseBodyTraces build(java.util.Map<String, ?> map) throws Exception {
            DescribeTraceByConfigurationResponseBodyTraces self = new DescribeTraceByConfigurationResponseBodyTraces();
            return TeaModel.build(map, self);
        }

        public DescribeTraceByConfigurationResponseBodyTraces setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeTraceByConfigurationResponseBodyTraces setEventGroups(java.util.List<DescribeTraceByConfigurationResponseBodyTracesEventGroups> eventGroups) {
            this.eventGroups = eventGroups;
            return this;
        }
        public java.util.List<DescribeTraceByConfigurationResponseBodyTracesEventGroups> getEventGroups() {
            return this.eventGroups;
        }

    }

}
