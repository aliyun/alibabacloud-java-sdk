// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTracesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TraceInfos")
    @Validation(required = true)
    public java.util.List<SearchTracesResponseTraceInfos> traceInfos;

    public static SearchTracesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesResponse self = new SearchTracesResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchTracesResponseTraceInfos extends TeaModel {
        @NameInMap("TraceID")
        @Validation(required = true)
        public String traceID;

        @NameInMap("OperationName")
        @Validation(required = true)
        public String operationName;

        @NameInMap("ServiceName")
        @Validation(required = true)
        public String serviceName;

        @NameInMap("ServiceIp")
        @Validation(required = true)
        public String serviceIp;

        @NameInMap("Duration")
        @Validation(required = true)
        public Long duration;

        @NameInMap("Timestamp")
        @Validation(required = true)
        public Long timestamp;

        public static SearchTracesResponseTraceInfos build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesResponseTraceInfos self = new SearchTracesResponseTraceInfos();
            return TeaModel.build(map, self);
        }

    }

}
