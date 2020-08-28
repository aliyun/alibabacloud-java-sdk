// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTracesByPageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageBean")
    @Validation(required = true)
    public SearchTracesByPageResponsePageBean pageBean;

    public static SearchTracesByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesByPageResponse self = new SearchTracesByPageResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchTracesByPageResponsePageBeanTraceInfos extends TeaModel {
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

        public static SearchTracesByPageResponsePageBeanTraceInfos build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesByPageResponsePageBeanTraceInfos self = new SearchTracesByPageResponsePageBeanTraceInfos();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchTracesByPageResponsePageBean extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TraceInfos")
        @Validation(required = true)
        public java.util.List<SearchTracesByPageResponsePageBeanTraceInfos> traceInfos;

        public static SearchTracesByPageResponsePageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesByPageResponsePageBean self = new SearchTracesByPageResponsePageBean();
            return TeaModel.build(map, self);
        }

    }

}
