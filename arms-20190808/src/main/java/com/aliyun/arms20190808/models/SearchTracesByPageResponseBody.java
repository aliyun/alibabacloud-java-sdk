// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTracesByPageResponseBody extends TeaModel {
    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("PageBean")
    public SearchTracesByPageResponseBodyPageBean pageBean;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SearchTracesByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesByPageResponseBody self = new SearchTracesByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTracesByPageResponseBody setPageBean(SearchTracesByPageResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchTracesByPageResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public SearchTracesByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchTracesByPageResponseBodyPageBeanTraceInfos extends TeaModel {
        /**
         * <p>The amount of time consumed by the trace. Unit: milliseconds.</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The name of the traced span.</p>
         */
        @NameInMap("OperationName")
        public String operationName;

        /**
         * <p>The IP address of the host where the application resides.</p>
         */
        @NameInMap("ServiceIp")
        public String serviceIp;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The timestamp.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The trace ID.</p>
         */
        @NameInMap("TraceID")
        public String traceID;

        public static SearchTracesByPageResponseBodyPageBeanTraceInfos build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesByPageResponseBodyPageBeanTraceInfos self = new SearchTracesByPageResponseBodyPageBeanTraceInfos();
            return TeaModel.build(map, self);
        }

        public SearchTracesByPageResponseBodyPageBeanTraceInfos setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public SearchTracesByPageResponseBodyPageBeanTraceInfos setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public SearchTracesByPageResponseBodyPageBeanTraceInfos setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public SearchTracesByPageResponseBodyPageBeanTraceInfos setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public SearchTracesByPageResponseBodyPageBeanTraceInfos setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SearchTracesByPageResponseBodyPageBeanTraceInfos setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

    }

    public static class SearchTracesByPageResponseBodyPageBean extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>The details of the returned traces.</p>
         */
        @NameInMap("TraceInfos")
        public java.util.List<SearchTracesByPageResponseBodyPageBeanTraceInfos> traceInfos;

        public static SearchTracesByPageResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesByPageResponseBodyPageBean self = new SearchTracesByPageResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchTracesByPageResponseBodyPageBean setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchTracesByPageResponseBodyPageBean setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchTracesByPageResponseBodyPageBean setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public SearchTracesByPageResponseBodyPageBean setTraceInfos(java.util.List<SearchTracesByPageResponseBodyPageBeanTraceInfos> traceInfos) {
            this.traceInfos = traceInfos;
            return this;
        }
        public java.util.List<SearchTracesByPageResponseBodyPageBeanTraceInfos> getTraceInfos() {
            return this.traceInfos;
        }

    }

}
