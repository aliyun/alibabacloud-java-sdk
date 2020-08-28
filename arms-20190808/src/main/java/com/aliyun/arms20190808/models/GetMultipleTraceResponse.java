// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetMultipleTraceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MultiCallChainInfos")
    @Validation(required = true)
    public java.util.List<GetMultipleTraceResponseMultiCallChainInfos> multiCallChainInfos;

    public static GetMultipleTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultipleTraceResponse self = new GetMultipleTraceResponse();
        return TeaModel.build(map, self);
    }

    public static class GetMultipleTraceResponseMultiCallChainInfosSpansTagEntryList extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static GetMultipleTraceResponseMultiCallChainInfosSpansTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetMultipleTraceResponseMultiCallChainInfosSpansTagEntryList self = new GetMultipleTraceResponseMultiCallChainInfosSpansTagEntryList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMultipleTraceResponseMultiCallChainInfosSpansLogEventListTagEntryList extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static GetMultipleTraceResponseMultiCallChainInfosSpansLogEventListTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetMultipleTraceResponseMultiCallChainInfosSpansLogEventListTagEntryList self = new GetMultipleTraceResponseMultiCallChainInfosSpansLogEventListTagEntryList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMultipleTraceResponseMultiCallChainInfosSpansLogEventList extends TeaModel {
        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        @NameInMap("TagEntryList")
        @Validation(required = true)
        public java.util.List<GetMultipleTraceResponseMultiCallChainInfosSpansLogEventListTagEntryList> tagEntryList;

        public static GetMultipleTraceResponseMultiCallChainInfosSpansLogEventList build(java.util.Map<String, ?> map) throws Exception {
            GetMultipleTraceResponseMultiCallChainInfosSpansLogEventList self = new GetMultipleTraceResponseMultiCallChainInfosSpansLogEventList();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMultipleTraceResponseMultiCallChainInfosSpans extends TeaModel {
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
        public java.util.List<GetMultipleTraceResponseMultiCallChainInfosSpansTagEntryList> tagEntryList;

        @NameInMap("LogEventList")
        @Validation(required = true)
        public java.util.List<GetMultipleTraceResponseMultiCallChainInfosSpansLogEventList> logEventList;

        public static GetMultipleTraceResponseMultiCallChainInfosSpans build(java.util.Map<String, ?> map) throws Exception {
            GetMultipleTraceResponseMultiCallChainInfosSpans self = new GetMultipleTraceResponseMultiCallChainInfosSpans();
            return TeaModel.build(map, self);
        }

    }

    public static class GetMultipleTraceResponseMultiCallChainInfos extends TeaModel {
        @NameInMap("TraceID")
        @Validation(required = true)
        public String traceID;

        @NameInMap("Spans")
        @Validation(required = true)
        public java.util.List<GetMultipleTraceResponseMultiCallChainInfosSpans> spans;

        public static GetMultipleTraceResponseMultiCallChainInfos build(java.util.Map<String, ?> map) throws Exception {
            GetMultipleTraceResponseMultiCallChainInfos self = new GetMultipleTraceResponseMultiCallChainInfos();
            return TeaModel.build(map, self);
        }

    }

}
