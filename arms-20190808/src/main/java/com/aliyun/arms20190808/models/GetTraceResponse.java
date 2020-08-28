// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Spans")
    @Validation(required = true)
    public java.util.List<GetTraceResponseSpans> spans;

    public static GetTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraceResponse self = new GetTraceResponse();
        return TeaModel.build(map, self);
    }

    public static class GetTraceResponseSpansTagEntryList extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static GetTraceResponseSpansTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseSpansTagEntryList self = new GetTraceResponseSpansTagEntryList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTraceResponseSpansLogEventListTagEntryList extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static GetTraceResponseSpansLogEventListTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseSpansLogEventListTagEntryList self = new GetTraceResponseSpansLogEventListTagEntryList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTraceResponseSpansLogEventList extends TeaModel {
        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        @NameInMap("TagEntryList")
        @Validation(required = true)
        public java.util.List<GetTraceResponseSpansLogEventListTagEntryList> tagEntryList;

        public static GetTraceResponseSpansLogEventList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseSpansLogEventList self = new GetTraceResponseSpansLogEventList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetTraceResponseSpans extends TeaModel {
        @NameInMap("TraceID")
        @Validation(required = true)
        public String traceID;

        @NameInMap("OperationName")
        @Validation(required = true)
        public String operationName;

        @NameInMap("Duration")
        @Validation(required = true)
        public Long duration;

        @NameInMap("ServiceName")
        @Validation(required = true)
        public String serviceName;

        @NameInMap("ServiceIp")
        @Validation(required = true)
        public String serviceIp;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        @NameInMap("RpcId")
        @Validation(required = true)
        public String rpcId;

        @NameInMap("ResultCode")
        @Validation(required = true)
        public String resultCode;

        @NameInMap("HaveStack")
        @Validation(required = true)
        public Boolean haveStack;

        @NameInMap("RpcType")
        @Validation(required = true)
        public Integer rpcType;

        @NameInMap("TagEntryList")
        @Validation(required = true)
        public java.util.List<GetTraceResponseSpansTagEntryList> tagEntryList;

        @NameInMap("LogEventList")
        @Validation(required = true)
        public java.util.List<GetTraceResponseSpansLogEventList> logEventList;

        public static GetTraceResponseSpans build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseSpans self = new GetTraceResponseSpans();
            return TeaModel.build(map, self);
        }

    }

}
