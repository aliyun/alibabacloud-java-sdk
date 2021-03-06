// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class SearchTracesByPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageBean")
    public SearchTracesByPageResponseBodyPageBean pageBean;

    public static SearchTracesByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesByPageResponseBody self = new SearchTracesByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTracesByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTracesByPageResponseBody setPageBean(SearchTracesByPageResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchTracesByPageResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public static class SearchTracesByPageResponseBodyPageBeanTraceInfos extends TeaModel {
        @NameInMap("OperationName")
        public String operationName;

        @NameInMap("ServiceIp")
        public String serviceIp;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("TraceID")
        public String traceID;

        public static SearchTracesByPageResponseBodyPageBeanTraceInfos build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesByPageResponseBodyPageBeanTraceInfos self = new SearchTracesByPageResponseBodyPageBeanTraceInfos();
            return TeaModel.build(map, self);
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

        public SearchTracesByPageResponseBodyPageBeanTraceInfos setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public SearchTracesByPageResponseBodyPageBeanTraceInfos setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SearchTracesByPageResponseBodyPageBeanTraceInfos setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
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
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

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
