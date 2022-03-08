// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListEventsResponseBody extends TeaModel {
    // 事件列表
    @NameInMap("Events")
    public java.util.List<Event> events;

    // MaxResults本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 事件统计
    @NameInMap("Statistics")
    public java.util.List<ListEventsResponseBodyStatistics> statistics;

    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventsResponseBody self = new ListEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventsResponseBody setEvents(java.util.List<Event> events) {
        this.events = events;
        return this;
    }
    public java.util.List<Event> getEvents() {
        return this.events;
    }

    public ListEventsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventsResponseBody setStatistics(java.util.List<ListEventsResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }
    public java.util.List<ListEventsResponseBodyStatistics> getStatistics() {
        return this.statistics;
    }

    public ListEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEventsResponseBodyStatistics extends TeaModel {
        // 总量
        @NameInMap("Count")
        public Integer count;

        // 事件告警状态
        @NameInMap("Status")
        public String status;

        public static ListEventsResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyStatistics self = new ListEventsResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyStatistics setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListEventsResponseBodyStatistics setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
