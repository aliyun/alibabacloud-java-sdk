// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMqttMessageLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Traces")
    public ListMqttMessageLogsResponseBodyTraces traces;

    public static ListMqttMessageLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqttMessageLogsResponseBody self = new ListMqttMessageLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqttMessageLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqttMessageLogsResponseBody setTraces(ListMqttMessageLogsResponseBodyTraces traces) {
        this.traces = traces;
        return this;
    }
    public ListMqttMessageLogsResponseBodyTraces getTraces() {
        return this.traces;
    }

    public static class ListMqttMessageLogsResponseBodyTracesPagination extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMqttMessageLogsResponseBodyTracesPagination build(java.util.Map<String, ?> map) throws Exception {
            ListMqttMessageLogsResponseBodyTracesPagination self = new ListMqttMessageLogsResponseBodyTracesPagination();
            return TeaModel.build(map, self);
        }

        public ListMqttMessageLogsResponseBodyTracesPagination setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListMqttMessageLogsResponseBodyTracesPagination setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public ListMqttMessageLogsResponseBodyTracesPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMqttMessageLogsResponseBodyTracesPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListMqttMessageLogsResponseBodyTracesList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Action")
        public String action;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("Mid")
        public String mid;

        @NameInMap("ClientMid")
        public String clientMid;

        @NameInMap("ClientId")
        public String clientId;

        public static ListMqttMessageLogsResponseBodyTracesList build(java.util.Map<String, ?> map) throws Exception {
            ListMqttMessageLogsResponseBodyTracesList self = new ListMqttMessageLogsResponseBodyTracesList();
            return TeaModel.build(map, self);
        }

        public ListMqttMessageLogsResponseBodyTracesList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMqttMessageLogsResponseBodyTracesList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public ListMqttMessageLogsResponseBodyTracesList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListMqttMessageLogsResponseBodyTracesList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListMqttMessageLogsResponseBodyTracesList setMid(String mid) {
            this.mid = mid;
            return this;
        }
        public String getMid() {
            return this.mid;
        }

        public ListMqttMessageLogsResponseBodyTracesList setClientMid(String clientMid) {
            this.clientMid = clientMid;
            return this;
        }
        public String getClientMid() {
            return this.clientMid;
        }

        public ListMqttMessageLogsResponseBodyTracesList setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

    public static class ListMqttMessageLogsResponseBodyTraces extends TeaModel {
        @NameInMap("Pagination")
        public ListMqttMessageLogsResponseBodyTracesPagination pagination;

        @NameInMap("List")
        public java.util.List<ListMqttMessageLogsResponseBodyTracesList> list;

        public static ListMqttMessageLogsResponseBodyTraces build(java.util.Map<String, ?> map) throws Exception {
            ListMqttMessageLogsResponseBodyTraces self = new ListMqttMessageLogsResponseBodyTraces();
            return TeaModel.build(map, self);
        }

        public ListMqttMessageLogsResponseBodyTraces setPagination(ListMqttMessageLogsResponseBodyTracesPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ListMqttMessageLogsResponseBodyTracesPagination getPagination() {
            return this.pagination;
        }

        public ListMqttMessageLogsResponseBodyTraces setList(java.util.List<ListMqttMessageLogsResponseBodyTracesList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListMqttMessageLogsResponseBodyTracesList> getList() {
            return this.list;
        }

    }

}
